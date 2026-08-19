import java.util.Scanner,
public class StudentAcademicSystem {
    
    // student fields
    String name;
    int age;
    double mark;
    double attendence;
    String category;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentAcademicSystem student = new StudentAcademicSystem();
        
        //getting student infor
        
        System.out.print("ENTER STUDENT NAME: ");
        student.name = input.nextLine();
        System.out.print("ENTER STUDENT AGE: ");
        student.age = input.nextInt();
        System.out.print("ENTER STUDENT MARK (0-100): ");
        student.mark = input.nextDouble();
        System.out.print("ENTER STUDENT ATTENDENCE (%): ");
        student.attendence = input.nextDouble();
      
    }
}


