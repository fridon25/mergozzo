package gest_op.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import gest_op.bean.CompanyBean;

public class SaveMySQL {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/1000prod";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	
	private static Connection getDBConnection() throws Exception
	{
		System.out.println("--------mysql jdbc connection---------");
		Connection dbConnection = null;
		try
		{
			Class.forName(DB_DRIVER);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Errore driver JDBC non trovato");
			throw new Exception(e.getMessage());
		}
		try
		{
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			
		}
		catch(SQLException e) 
		{
			System.out.println("SQL connection al database fallita");
			throw new Exception(e.getMessage());
		}
		return dbConnection;
	}
	
	public void insertArticolo(CompanyBean articolo) throws Exception
	{
		Statement stmt = null;
		Connection conn = null;
		try
		{
			
			conn = getDBConnection();
			// Impostare autocommit a fals significa che è il programmatore a decidere se e quando committare
			conn.setAutoCommit(false);
			
			stmt = conn.createStatement();
//			String insertArticolo = "INSERT INTO COMPANY(idarticolo,nomearticolo,fasearticolo) VALUES('" 
//			fare get per maschera.
		}
		catch (Exception e) 
		{
			if(conn!=null)
			{
				conn.rollback();
			}
			throw new Exception (e.getMessage());
		}
		finally
		{
			if(stmt!=null)
			{
				stmt.close();
			}
			if (conn!=null)
			{
				conn.close();
			}
			
			
		}
		
	}
	
	
	
	
}
