package service;

import domain.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentService {



    public String[][] getAllStudentsForJTable(int columnLength){
        List<Student> students = new StudentRepository().getAllStudents();

        String data[][] = new String[students.size()][columnLength];

        for(int row = 0 ; row < students.size() ; row++){
            data[row][0] = students.get(row).getId().toString();
            data[row][1] = students.get(row).getName();
            data[row][2] = students.get(row).getAge().toString();
            data[row][3] = students.get(row).getGender();

        }

        return data;

    }


}
