package repository;

import domain.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository extends  DataBaseConnection{


    public List<Student> getAllStudents(){

        List<Student> studentList = new ArrayList<>();

        try {
            Connection con = getConnection();
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next()){

                Long id =  Long.valueOf(rs.getString("id"));
                String name =  rs.getString("name");
                Integer age = Integer.valueOf(rs.getString("age"));
                String gender = rs.getString("gender");

                Student student = new Student(id,name,age,gender);

                studentList.add(student);
            }

        // Step 6 # close connection
        con.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
