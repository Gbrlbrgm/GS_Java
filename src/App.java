import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import Controller.DBRepositoryController;
import javax.swing.JFrame;

import Controller.RegisterController;
import Model.*;
import Model.Enums.*;
import View.Home;

public class App {

	private static Connection connection;
	private static DBRepositoryController repository;
	
	public static void main(String[] args) {
		try {
			connection = DriverManager.getConnection("jdbc:h2:mem:gerenciadorpostosdb");
			System.out.println("------------------------");
			System.out.println("Connected to h2 database.");
			System.out.println("------------------------\n\n\n");
			repository = new DBRepositoryController(connection);
			repository.init();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home(new RegisterController(), repository);
					window.home.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}