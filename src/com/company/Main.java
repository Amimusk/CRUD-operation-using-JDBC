package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Exp1 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest", "root", "12345678");
            Statement stmt = con.createStatement();
            stmt.execute("insert into student values(101,'Salim','1998-02-05','2021-01-05')");
            stmt.execute("insert into student values(102,'Vahid','1998-02-10','2021-01-10')");
            stmt.execute("insert into student values(103,'Salik','1998-03-15','2021-01-15')");
            stmt.execute("insert into student values(104,'Sahil','1998-04-20','2021-01-20')");
            stmt.execute("insert into student values(105,'Amir','1998-05-25','2021-01-25')");
            System.out.println("Data Inserted");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
  class Exp3 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest", "root", "12345678");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from student");

            while (rs.next())
                System.out.println("student_no : " + rs.getInt(1) + "  student_name : " + rs.getString(2) +"student_dob date:" +rs.getDate(3)+"student_doj date:" +rs.getDate(4));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

 class Exp {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest", "root", "12345678");
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("delete from student where student_name='Muskan'");
            System.out.println(result + " records affected");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
 class Exp4 {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest", "root", "12345678");
            Statement stmt = con.createStatement();
            String query="Update student set student_name='Muskan' where student_name='Salik'";
            Statement st=con.createStatement();
            int result=st.executeUpdate(query);

            System.out.println(result + " records affected");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
 class Exp5 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest", "root", "12345678");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from student where student_no='103'");

            while (rs.next())
                System.out.println("student_no : " + rs.getInt(1) + "  student_name : " + rs.getString(2) + "student_dob date:" + rs.getDate(3) + "student_doj date:" + rs.getDate(4));
            con.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}








