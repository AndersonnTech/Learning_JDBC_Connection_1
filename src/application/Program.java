package application;

import java.sql.Connection;

import db.DB;


//ACESSANDO O BANCO DE DADOS
public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		System.out.print("DB ACESSADO");
		
		
		
		
		DB.closeConnection();
		

	}

}
