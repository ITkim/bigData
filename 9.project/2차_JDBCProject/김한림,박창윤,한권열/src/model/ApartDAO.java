package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.ApartDTO;
import util.DBUtil;

public class ApartDAO {

	// ���˻�
	// select * from apart
	public static ArrayList<ApartDTO> getAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<ApartDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart");// �Ϻ��ϰ� ����� �޾ƿ� �� ��ü������� ���� ���� Ŀ�ؼ� �Ϸ���

			datas = new ArrayList<ApartDTO>();
			while (rs.next()) {
				datas.add(new ApartDTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getInt(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return datas;// ��ü �� ����ž� , static���� �Ұž�
	}

	// area_name���� area_size, year, month, price �˻�
	// select * from apart where area_name = ?
	public static ArrayList<ApartDTO> getApt(String area_name) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<ApartDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart where area_name =" +"'"+ area_name+"'");
			
			datas = new ArrayList<ApartDTO>();
			while (rs.next()) {
				datas.add(new ApartDTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}

		return datas;// ��ü �� ����ž� , static���� �Ұž�
	}
	// ���ο� �μ� ���� ���� 
	// ex. insert into apart values (?,?,?,?,?) 
	// ex. insert into apart values ('����', '������� 60������',2018,7,5000)
	public static boolean insert(ApartDTO newApt) throws SQLException {
		Connection con = null;
		//�� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null; //Alt + Shift + R �� refactor
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("insert into apart values(?,?,?,?,?)");
			
			//? �� �����Ͱ� ���������� ����
			pstmt.setString(1, newApt.getArea_name());
			pstmt.setString(2, newApt.getArea_size());
			pstmt.setInt(3, newApt.getYear_date());
			pstmt.setInt(4, newApt.getMonth_date());
			pstmt.setInt(5, newApt.getPrice_per_m_2());
			
			//db�� ���� ����
			int result = pstmt.executeUpdate(); //insert/update/delete ���� �޼ҵ�
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch ������ throw �ؾ߸� end user���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	// price ����
	public static boolean update(int price, String area_name) throws SQLException {
		Connection con = null;
		//�� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null; //Alt + Shift + R �� refactor
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("update apart set price_per_m_2 =? where area_name=? and area_size = '��ü'");
			
			//? �� �����Ͱ� ���������� ����
			pstmt.setInt(1, price);
			pstmt.setString(2, area_name);
			
			//db�� ���� ����
			int result = pstmt.executeUpdate();
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch ������ throw �ؾ߸� end user���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}

	// area_name���� ������ ����
	public static boolean delete(String area_name) throws SQLException {
		Connection con = null;
		//�� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null; //Alt + Shift + R �� refactor
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("delete from apart where area_name = ?");
			
			//? �� �����Ͱ� ���������� ����
			pstmt.setString(1, area_name);
			
			//DB�� ���� ����
			int result = pstmt.executeUpdate(); //insert/update/delete ���� �޼ҵ�
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch ������ throw �ؾ߸� end user���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	// ���� �˻� �� �� ���ÿ� �󸶳� �ɸ���?
	public static double getMyHome_month(double paid_in, double house_price, double interest) {
		return Math.log(paid_in/(paid_in - house_price * interest/1200))/Math.log(1+interest/1200);
	}
	public static double getMyHome(String area, int area_size, int pay, int savings, double interest) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		double data = 0;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart where area_name = '" + area + "'" );
			//������ rs = stmt.executeQuery("select price_per_m_2 from apart where area_name = '" + area + "'");
			while (rs.next()) {
				//data.add(rs.getInt(5));
				data = 7252;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		//return data * area_size / (pay * savings / 100) ; // ��ü �� ����ž� , static���� �Ұž�
		return ApartDAO.getMyHome_month(pay*savings/100, data*area_size, interest);
	}
	public static double getMyInterest(String bank) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		double data = 30;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select price_per_m_2 from apart");
			//������ rs = stmt.executeQuery("select rate from apart where bank = ? ");
			while (rs.next()) {
				data = 3.55;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch ������ throw �ؾ߸� end user ���� ��Ȳ ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return data; // ��ü �� ����ž� , static���� �Ұž�
	}
}