package db.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/***
 * 
 * @author steven
 * http://www.lifeba.org
 */
public class TestServerH2 {
	public static void main(String[] a)
    throws Exception {
	  Class.forName("org.h2.Driver");
	  Connection conn = DriverManager.
	      getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
	  // add application code here
	  Statement stmt = conn.createStatement();
	  ResultSet rs = stmt.executeQuery("SELECT * FROM TEST ");    
    while(rs.next()) {    
  	  System.out.println(rs.getInt("ID")+","+rs.getString("NAME"));
    } 
	  conn.close();
	}
}
