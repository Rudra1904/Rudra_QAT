package Test;

import java.sql.*;

public class JDBCEg {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		String url ="jdbc:oracle:thin:@localhost:1521/XE";
		String username ="system";
		String password ="admin";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement stmt = con.createStatement();
		
		String updateQuery = "UPDATE DAY8 SET NAME='RAGHU',SUBJECT='JAVA',MARKS=80 WHERE ID=3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM DAY8");
		System.out.println("query execution" + rs);

 	while(rs.next()) {
		
		System.out.println(rs.getString("id") + ":" +  rs.getString("name") + ":" +  rs.getString("subject") + ":" + rs.getString("marks"));
	}
	con.close();

}
}
