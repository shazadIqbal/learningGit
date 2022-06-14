package ui;

import service.StudentService;

import javax.swing.*;

public class ViewStudent {

    public ViewStudent(){
        JFrame frame = new JFrame();

        String column[]={"ID","NAME","AGE","GENDER"};

        String data[][]= new StudentService().getAllStudentsForJTable(column.length);

        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        frame.add(sp);

        // frame.add(helloworld);
        // frame.add(btn);

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        //frame.setLayout(null);
        frame.setVisible(true);

    }
}
