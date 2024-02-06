package util;

import java.sql.Connection;

public class DBConnection {
    static Connection connection = null;

	public static Connection getConnection()
	{
		String propstr=DBUtil.getConnectionString("C:\\Users\\HP\\Downloads\\ghg-main\\Assignment-2-Student-Information-System-SIS-main\\Assignment 2\\src\\util\\db.properties");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
