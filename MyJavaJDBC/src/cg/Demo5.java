package cg;
import java.sql.*;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;
public class Demo5 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement updateSt=null;
		PreparedStatement selectSt=null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
		    con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false);
			sc = new Scanner(System.in);
			System.out.println("Enter Account ID");
			int id=sc.nextInt();
			selectSt=con.prepareStatement("select * from account where aid=?");
			selectSt.setInt(1, id);
			ResultSet rs1=selectSt.executeQuery();
            double bal1=0.0;
            if(rs1!=null) {
            	if(rs1.next()) {
            		System.out.println(rs1.getString(3));
            		bal1=rs1.getDouble("balance");
            		System.out.println("Your balance is "+bal1);
            	}
            }
         
            /*
        	PreparedStatement st=con.prepareStatement(sqlQuery);
        	st.setInt(1,id);
        	st.setLong(2,mb);
        	st.setString(3,ah);
        	st.setDouble(4,bal);
        	
        int insertedRec=st.executeUpdate();
       
		System.out.println(+insertedRec);
        	
        con.commit();
        con.close()	;
        }*/}
        	catch(SQLException e)
        	{
             System.out.println(e.getMessage()+""+e.getErrorCode()+""+e.getSQLState());
             e.printStackTrace();
        }
		
	}
}
