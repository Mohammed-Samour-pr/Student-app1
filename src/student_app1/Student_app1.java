/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_app1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
public class Student_app1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student std[] = {
            new ArtStudent(120181466, "Mohammed", "IT", 50, 60, 80),
            new ItStudent(120181204, "Ali", "IT", 100, 90, 88)

        };

        for (Student student : std) {
            System.out.println(student);

        }

    }

}
