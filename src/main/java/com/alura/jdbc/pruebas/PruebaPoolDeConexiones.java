package com.alura.jdbc.pruebas;

import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolDeConexiones {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();
		
		for (int i = 0; i < 20; i++) {
			con.recuperaConexión();
			System.out.println("Abriendo la conexión número " + (i+1));
			
		}
	}

}
