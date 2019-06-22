package cg;
import java.sql.*;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account ID");
			int id=sc.nextInt();
			System.out.println("Enter Mobile No");
			long mb=sc.nextLong();
			System.out.println("Enter AccountHolder");
			String ah=sc.next();
			System.out.println("Enter Initial Balance");
			double bal=sc.nextDouble();
        		
        	String sqlQuery="insert into account values(?,?,?,?)";
             
        	PreparedStatement st=con.prepareStatement(sqlQuery);
        	st.setInt(1,id);
        	st.setLong(2,mb);
        	st.setString(3,ah);
        	st.setDouble(4,bal);
        	
        int insertedRec=st.executeUpdate();
       
		System.out.println(+insertedRec);
        	
        con.commit();
        con.close()	;
        }
        	catch(SQLException e)
        	{
             System.out.println(e.getMessage()+""+e.getErrorCode()+""+e.getSQLState());
             e.printStackTrace();
        }
        }
}
