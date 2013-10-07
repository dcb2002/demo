package db.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/***
 * 
 * @author steven
 * 
ttp://www.lifeba.org
 */
public class TestH2 {
	  public static void main(String[] a)
      throws Exception {
	  Class.forName("org.h2.Driver");
	  Connection conn = DriverManager.
	      getConnection("jdbc:h2:file:/home/dcb/workspace-sts-3.3.0.RELEASE/H2Test/db/test", "sa", "");
	  // add application code here
	  Statement stmt = conn.createStatement();
	  ResultSet rs = stmt.executeQuery("SELECT * FROM test ");    
      while(rs.next()) {    
    	  System.out.println(rs.getInt("ID")+","+rs.getString("NAME"));
      } 
	  conn.close();
	}
}
