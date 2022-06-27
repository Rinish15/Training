import java.sql.*;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;

public class MovieDetails {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:mulesoftAsst.db");
			System.out.println("Database Connection opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table movieData(movieName varchar(20),actor varchar(20),actress varchar(20),release varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('Bhool Bhulaiya 2','Karthik','Kiara','2022','Anees')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('A Quiet Place','John Krasinski','Emily Blunt','2018','John Krasinski')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('A Quiet Place 2','Cillian Murphy','Emily Blunt','2020','John Krasinski')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('Love & Monsters','Dylan O'Brien','Jessica Henwick','2020','Micheal Matthews')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('JJK Vol 0','Gojo Satoru','Utahime','2022','Sunghoo Park')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('RRR','NTR','Alia Bhatt','2022','Rajamouli')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('The Adam Project','Ryan Reynolds','Laura Shane','2022','Shawn Levy')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,relesae,director) VALUES ('Batman','Robert Pattinson','Zoe Kravitz','2022','Matt Reeves')");
			
			
			ResultSet rs = st.executeQuery("select * from movieData");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : " +(rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+" : "+rs.getString(5)));
			}
			
			con.close();
			System.out.println("Connection closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
