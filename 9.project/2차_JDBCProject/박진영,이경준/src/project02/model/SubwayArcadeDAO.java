package project02.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;
import util.DBUtil;

public class SubwayArcadeDAO {
	//////////////////////////////////////////////R
	// ��� �˻�
	// select * from Table_name
	public static SubwayArcadeDTO getAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		StationArcadeDTO stationInfo = new StationArcadeDTO();
		LineArcadeDTO lineInfo = new LineArcadeDTO();
		SubwayArcadeDTO subwayInfo = new SubwayArcadeDTO();
		
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from subwayarcade");
			
			ContractDTO contractInfo =null;
			ArcadeInfoDTO arcadeInfo = null;
			
			stationInfo.setStationArcade(new ArrayList<ArcadeInfoDTO>());
			lineInfo.setLineArcade(new HashMap<String,StationArcadeDTO>());
			subwayInfo.setSubwayArcade(new ArrayList<LineArcadeDTO>());
			
			while(rs.next()) {
				//contractInfo.setNote(rs.getString(10));*/		// ���� set�޼ҵ��� ȣ�⺸�� ���ο� �����ڸ� ����� ���� ȿ�����̶�� �Ǵ�
				contractInfo = new ContractDTO(rs.getString(1), rs.getString(4), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10));
			
				//arcadeInfo.setArea(rs.getDouble(4));*/				//set �޼ҵ� ȣ�⺸�� ���ο� �����ڸ� ����� ���� ȿ�����̶�� �Ǵ�
				arcadeInfo = new ArcadeInfoDTO(contractInfo, rs.getString(2), rs.getString(3), rs.getDouble(5));
				
				stationInfo.setStationID(rs.getString(3));
				stationInfo.getStationArcade().add(arcadeInfo);
				//new stationArcadeDTO(rs.getString(3), arcadeInfo);	//���е� ID�� �����Ƿ� �ϳ��� ��ü���� �����ϴ� ���� Ÿ��
				
				lineInfo.setLineID(rs.getString(3));
				lineInfo.getLineArcade().put(lineInfo.getLineID(), stationInfo);
				//new lineArcadeDTO(rs.getString(3), stationInfo);		//���е� ID�� �����Ƿ� �ϳ��� ��ü���� �����ϴ� ���� Ÿ��
				
				subwayInfo.getSubwayArcade().add(lineInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return subwayInfo;
	}
	// ȣ���� �˻�
	public static LineArcadeDTO getLineInfo(String lineID) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ContractDTO contractInfo = null;
		ArcadeInfoDTO arcadeInfo = null;
		
		StationArcadeDTO stationInfo = new StationArcadeDTO();
		LineArcadeDTO data = new LineArcadeDTO();
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from subwayarcade where lineid = ?");
			pstmt.setString(1, lineID);
			
			rs = pstmt.executeQuery();
			
			stationInfo.setStationArcade(new ArrayList<ArcadeInfoDTO>());
			data.setLineArcade(new HashMap<String,StationArcadeDTO>());
			
			while(rs.next()) {
				contractInfo = new ContractDTO(rs.getString(1), rs.getString(4), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10));
				
				arcadeInfo = new ArcadeInfoDTO(contractInfo, rs.getString(2), rs.getString(3), rs.getDouble(5));
				
				stationInfo.setStationID(rs.getString(3));
				stationInfo.getStationArcade().add(arcadeInfo);
				
				data.getLineArcade().put(rs.getString(3), stationInfo);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return data;
	}
	// ���� �˻�
	public static StationArcadeDTO getStationInfo(String stationID) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ContractDTO contractInfo = null;
		ArcadeInfoDTO arcadeInfo = null;
		StationArcadeDTO data = new StationArcadeDTO();
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from subwayarcade where stationid = ?");
			pstmt.setString(1, stationID);
			
			rs = pstmt.executeQuery();
			
			data.setStationArcade(new ArrayList<ArcadeInfoDTO>());
			
			while(rs.next()) {
				contractInfo = new ContractDTO(rs.getString(1), rs.getString(4), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10));
				
				arcadeInfo = new ArcadeInfoDTO(contractInfo, rs.getString(2), rs.getString(3), rs.getDouble(5));
				
				data.setStationID(rs.getString(3));
				data.getStationArcade().add(arcadeInfo);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(con, pstmt);
		}
		return data;
	}
	
	// ���� �˻�
	public static StationArcadeDTO getEmptySpace() throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ContractDTO contractInfo= null;
		ArcadeInfoDTO arcadeInfo= null;
		StationArcadeDTO datas = new StationArcadeDTO();
		
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from subwayarcade where arcadetype = '����'");
			
			datas.setStationArcade(new ArrayList<ArcadeInfoDTO>());
			
			while(rs.next()) {
				contractInfo = new ContractDTO(rs.getString(1), rs.getString(4), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10));
				
				arcadeInfo = new ArcadeInfoDTO(contractInfo, rs.getString(2), rs.getString(3), rs.getDouble(5));
				
				datas.getStationArcade().add(arcadeInfo);
				//stationInfo�� id���� �׻� �ٲ��, arcadeInfo�ȿ� ����ֱ� ������ set�� ������ ����
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return datas;
	}
	
	//C
	//���ο� ��� ����
	//insert into tablename values (?,?,?,~~~)
	public static boolean insert(ArcadeInfoDTO arcadeInfo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt =null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into subwayarcade values(?,?,?,?,?,?,?,?,?,?)");	// ContractDTO �־������
			pstmt.setString(1, arcadeInfo.getContractInfo().getArcadeType());
			pstmt.setString(2, arcadeInfo.getLine());
			pstmt.setString(3, arcadeInfo.getStation());
			pstmt.setString(4, arcadeInfo.getContractInfo().getArcadeID());
			pstmt.setDouble(5, arcadeInfo.getArea());
			pstmt.setString(6, arcadeInfo.getContractInfo().getBusinessType());
			pstmt.setString(7, arcadeInfo.getContractInfo().getContractStartDate());
			pstmt.setString(8, arcadeInfo.getContractInfo().getContractEndDate());
			pstmt.setInt(9, arcadeInfo.getContractInfo().getRental());
			pstmt.setString(10, arcadeInfo.getContractInfo().getNote());
			
			int result = pstmt.executeUpdate();
			
			if(result ==0) {
				return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}
		return true;
	}
	
	//U
	//���Ⱓ ����( ���� )
	public static boolean update(String arcadeID, ContractDTO contractInfo) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update subwayarcade set arcadetype =?, arcadeid =?, businesstype =?, contractstartdate =?, contractenddate =?, rental =?, note =? Where arcadeid = ? ");
			pstmt.setString(1, contractInfo.getArcadeType());
			pstmt.setString(2, contractInfo.getArcadeID());
			pstmt.setString(3, contractInfo.getBusinessType());
			pstmt.setString(4, contractInfo.getContractStartDate());
			pstmt.setString(5, contractInfo.getContractEndDate());
			pstmt.setInt(6, contractInfo.getRental());
			pstmt.setString(7, contractInfo.getNote());
			pstmt.setString(8, arcadeID);
			
			int result = pstmt.executeUpdate();
			if(result ==0) {
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return true;
	}
	//D
	public static boolean delete(String arcadeID) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from subwayarcade where arcadeID = ?");
			pstmt.setString(1, arcadeID);
			
			int result = pstmt.executeUpdate();
			if(result ==0) {
				return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(con, pstmt);
		}
		return true;
	}
}