package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.domain.RestaDTO;
import util.DBUtil;

public class RestaDAO {

	// ���˻�
	// select * from Resta
	public static ArrayList<RestaDTO> getAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<RestaDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from RESTA");// �Ϻ��ϰ� ����� �޾ƿ� �� ��ü������� ���� ���� Ŀ�ؼ� �Ϸ���

			datas = new ArrayList<RestaDTO>();
			while (rs.next()) {
				datas.add(new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}

		return datas;// ��ü �� ����ž� ,static���� �Ұž�
	}

	// address �� �ش� ���� �ּ� �˻�
	public static RestaDTO getAddcat(String address, String category) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RestaDTO datas = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from RESTA where ADDRESS like ? and CATEGORY like ? ");// �Ϻ��ϰ� ����� �޾ƿ� �� ��ü������� ���� ���� Ŀ�ؼ� �Ϸ���
			pstmt.setString(1, "%"+address+"%");
			pstmt.setString(2, "%"+category+"%");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				datas = new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt, rs);
		}

		return datas;// ��ü �� ����ž� ,static���� �Ұž�
	}

	public static RestaDTO getCategory(String category) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RestaDTO datas = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from RESTA where CATEGORY  like '%' || ? || '%'");// �Ϻ��ϰ� ����� �޾ƿ� �� ��ü������� ���� ���� Ŀ�ؼ� �Ϸ���
			pstmt.setString(1, category);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				datas = new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt, rs);
		}

		return datas;// ��ü �� ����ž� ,static���� �Ұž�
	}


	// ���ο� �ּ� ���� ����
	// insert into dept values(?,?,?)
	// insert into dept values(50, '�ѹ���', '����')

	public static boolean insert(RestaDTO newAddress) throws SQLException {
		Connection con = null;
		// �� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// ������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("insert into RESTA values(?,?,?,?,?,?,?,?,?)");
			// ?�� �����Ͱ� ���������� ����
			pstmt.setString(1, newAddress.getName());
			pstmt.setString(2, newAddress.getCategory());
			pstmt.setString(3, newAddress.getSignatureMenu());
			pstmt.setString(4, newAddress.getAddress());
			pstmt.setString(5, newAddress.getBusinessHour());
			pstmt.setString(6, newAddress.getHoliday());
			pstmt.setString(7, newAddress.getTell());
			pstmt.setString(8, newAddress.getParking());
			pstmt.setString(9, newAddress.getDiscount());
			
			// db�� ���� ����
			int result = pstmt.executeUpdate();// insert/update/delete ���� �޼ҵ�
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}

		return true;

	}

	// Address �� ����
	public static boolean update(String address, String newCategory) throws SQLException {
		Connection con = null;
		// �� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// ������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("update RESTA set CATEGORY= ? where ADDRESS=?");
			// ?�� �����Ͱ� ���������� ����
			pstmt.setString(2, newCategory);
			pstmt.setString(4, address);

			// db�� ���� ����
			int result = pstmt.executeUpdate(); // insert/update/delete ���� �޼ҵ�
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		return true;
	}


	// Address�� �ش� �μ� ����
	public static boolean delete(String address) throws SQLException {

		Connection con = null;
		// �� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// ������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("delete from RESTA where ADDRESS = ?");
			// ?�� �����Ͱ� ���������� ����
			pstmt.setString(1, address);

			// db�� ���� ����
			int result = pstmt.executeUpdate();// insert/update/delete ���� �޼ҵ�

			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}

		return true;
	}
}
