import java.util.*;

public class StudentMain {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Student's Id: ");
        int studentId = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter Student's Name: ");
        String studentName=keyboard.nextLine();

        System.out.println("Enter Student's address: ");
        String studentAddress=keyboard.nextLine();

        while(true){
            System.out.println("Is student from NIT(Yes/No): ");
            String answer=keyboard.nextLine();

            if(answer.equalsIgnoreCase("yes")){
                Student obj = new Student(studentId, studentName, studentAddress);
                System.out.println("Student Id:" + obj.getStudentId());
                System.out.println("Student Name:" + obj.getStudentName());
                System.out.println("Address:" + obj.getStudentAddress());
                System.out.println("College Name:" + obj.getCollegeName());
                break;
            }
            else if(answer.equalsIgnoreCase("no")){
                System.out.println("Enter College Name:");
                String otherCollege = keyboard.nextLine();

                Student obj = new Student(studentId, studentName, studentAddress, otherCollege);
                System.out.println("Student id:"+obj.getStudentId());
                System.out.println("Student name:"+obj.getStudentName());
                System.out.println("Address:"+obj.getStudentAddress());
                System.out.println("College name:"+obj.getCollegeName());
                break;


            }
            else {
                System.out.println("Wrong Input");
            }
        }
    }
    
}
