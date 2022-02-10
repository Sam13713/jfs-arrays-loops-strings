package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    private final ArrayList<String> students = new ArrayList<String>();
    private final ArrayList<Integer> math = new ArrayList<Integer>();
    private final ArrayList<Integer> science = new ArrayList<Integer>();
    private final ArrayList<Integer> english = new ArrayList<Integer>();



    public MSGrades(){
        // Add some students and their grades to the array lists
        students.add("Kaseem");
        students.add("Samra");
        math.add(98);
        math.add(95);
        science.add(85);
        science.add(100);
        english.add(98);
        english.add(83);


    }

    public void printStudents(){
        for (String student : students) {
            System.out.print(" " + student);

        }
      System.out.println("");
    }

    public void printGrades(int index) {
        System.out.println(students.get(index) + " Math:" + math.get(index));
        System.out.println(students.get(index) + " Science:" + science.get(index));
        System.out.println(students.get(index) + " English:" + english.get(index));
    }
            

    public static void main(String[] args) {
        // write your code here
        MSGrades GenerationHigh =new MSGrades();

        System.out.println("Middle School Roster");
        System.out.println("===================");



        GenerationHigh.printStudents();
        System.out.print("============");
        GenerationHigh.printGrades(1);

        for (int i = 0; i < GenerationHigh.teachers.length; i++) {
            String teachersName = GenerationHigh.teachers[i];
            System.out.println(teachersName);


          }
        System.out.println("==============");
        System.out.println("\nStudent Grades:\n");
        System.out.println("==============");
        for (int i = 0; i < GenerationHigh.students.size(); i++){
            GenerationHigh.printGrades(i);
        }



        
    }
}
