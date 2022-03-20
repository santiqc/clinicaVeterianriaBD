package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private String nombreBd="bd_clinica";
	private String usuario="root";
	private String password="password";
	private String url="jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=tru&use"
			+ "JDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&"
			+ "serverTimezone=UTC";

		Connection conn=null;	
	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,usuario,password);
			if(conn!=null) {
				System.out.println("Conexion Exitosa a la BD: "+nombreBd);
				
			}else {
				System.out.println("**************************NO SE PUDO CONECTAR");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ocurre una ClassNotFoundException :"+e.getMessage());
	
		}catch (SQLException e) {
			System.out.println("Ocurre una SQLException: "+e.getMessage());
			System.out.println("verifique que Mysql este encendido");
		}
	}
	public Connection getConnection() {
		return conn;
	}
	public void desconectar() {
		conn=null;
		
	}
}
