package arrays;
import java.util.Scanner;
public class fistArrays {

	public static void main(String[] args) {
		
		// arrays code building
		

	String fullName = "";
	String lineVariable = "---------------------------";
	Scanner sc = new Scanner(System.in);

	System.out.println("Grade Book Example");
	System.out.println("Name of Course:");
	String courseName = sc.nextLine();
	System.out.println("How many students are in this class:");
	int numOfStudents = sc.nextInt();
		
	Student[] programmingStudents = new Student[numOfStudents];
	System.out.println("How many grades do you have per student?");
	int numOfGrades = sc.nextInt();
	sc.nextLine();

	for (int i = 0; i < programmingStudents.length; i++) {
	int[] grades = new int[numOfGrades];
	System.out.print("Enter Student's Full Name: ");
	fullName = sc.nextLine();
	for (int j = 0; j < grades.length; j++) {
	System.out.print("Enter a grade: ");
	grades[j] = sc.nextInt();
	}
	programmingStudents[i] = new Student(fullName, grades);
	sc.nextLine();
		}

	System.out.println("\n\n"+lineVariable+"\n " 
	 + courseName + " Grade Book \n"+lineVariable); 
	for (Student student : programmingStudents) { 
	student.describe(); 
		    } 
	System.out.println(lineVariable+"\n");

	sc.close();
		//
		
		
		//String studentName1 = "Bruce Wayne";
		//String studentName2 = "Barry Allen";
		//String studentName3 = "Dick Grayson";
		
		//String[] students = new String[3];
		
		//students[0] = "Bruce Wayne";
		//students[1] = "Barry Allen";
		//students[2] = "Dick Grayson";
		
		//System.out.println(students[0]);
		//System.out.println(students[1]);
		//System.out.println(students[2]);
	}


