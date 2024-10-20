package core.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAcess {
  public Connection getDB() throws SQLException, ClassNotFoundException {
    String url = "jdbc:mysql://localhost:3306/irap";
    String user = "root";
    String password = "";

    Class.forName("com.mysql.cj.jdbc.Driver");

    return DriverManager.getConnection(url, user, password);
  }

  public void query() throws SQLException, ClassNotFoundException {
    var conn = getDB();
    conn.prepareStatement("").execute();
  }
}
