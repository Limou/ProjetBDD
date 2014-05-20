package networking;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleConnection;

public class DatabaseInterface {
	private OracleConnection con;
	
	public DatabaseInterface(String url, String user, String password) throws SQLException {
    	// TODO Auto-generated method stub
    	System.setProperty("jdbc.drivers", "oracle.jdbc.driver.OracleDriver");
    	try {
    	    this.con = (OracleConnection) DriverManager.getConnection(url, user, password);
    	} catch (SQLException e) {
    	    System.out.println(e);
    	}
    }
	
	public void executeCommand(String sqlCommand) throws SQLException {
    	java.sql.Statement stmt = null;
    	try{
    		stmt = this.con.createStatement();
    		stmt.executeUpdate("drop table BANK_ACCOUNTS");
    	} catch (SQLException e){
    		e.printStackTrace();
    	} finally{
    		if(stmt != null){ stmt.close(); }
    	}
    }
	
	public ResultSet readDb(String sqlRequest) throws SQLException {
    	Statement stmt = null;
    	ResultSet rs = null;
    	try{
    		stmt = this.con.createStatement();
    		rs = stmt.executeQuery(sqlRequest);
    	} catch(SQLException e){
    		e.printStackTrace();
    	} finally{
    		if(stmt != null){ stmt.close(); }
    	}
    	return rs;
    }
}
