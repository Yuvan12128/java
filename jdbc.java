import java.sql.*;
class jdbc{

public static void main (String[]args) throws SQLException{
	
		
	//Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shankar12128@");
	//System.out.println("connected");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from employee");
	while(rs.next()){
	System.out.print(rs.getInt(1)+" ");
	System.out.print(rs.getString(2)+" ");
	System.out.print(rs.getInt(3)+" ");
	System.out.println();
	}
}
}


