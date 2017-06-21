package com.quinua.ws.rest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionPostgre {

	public static void conexion(String user, String psw, String server, String db) throws ClassNotFoundException {
				
		String url = "jdbc:postgresql://"+server+"/"+db;
		Properties props = new Properties();
		props.setProperty("user",user);
		props.setProperty("password",psw);
		props.setProperty("ssl","true");
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error: " + e);
		} catch (ClassNotFoundException ex){
			ex.printStackTrace();
			System.out.println("Error en el driver" + ex);
		}

	}

}
