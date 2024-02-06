package util;
/*import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    static Connection connection;
    public static Connection getDBConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String filePath = "C:\\Users\\HP\\Downloads\\Assignment-2-Student-Information-System-SIS-main\\Assignment 2\\src\\util\\db.properties";
            FileInputStream fis = new FileInputStream(filePath);
            Properties properties = new Properties(); 
            properties.load(fis);
            String url = properties.getProperty("url");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");

	        connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (ClassNotFoundException | IOException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBUtil {
    public static String getConnectionString(String propertyFileName) {
        Properties properties = new Properties();
        String connectionString = null;

        try (FileInputStream fis = new FileInputStream(propertyFileName)) {
            properties.load(fis);
            String url = properties.getProperty("url");
            String password = properties.getProperty("password");
            String username = properties.getProperty("username");
            String driver = properties.getProperty("driver");
            connectionString = String.join(" ", url,username,password,driver);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connectionString;
    }
}