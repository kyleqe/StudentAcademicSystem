import java.util.Scanner,
public class StudentAcademicSystem {
    
    // student fields
    String name;
    int age;
    double mark;
    double attendence;
    String category;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentAcademicSystem student = new StudentAcademicSystem();
        
        //getting student infor
        System.out.println(" STUDENT ACADEMIC SYSTEM");
        System.out.println("ENTER STUDENT NAME: ");
        student.name = sc.nextLine();
    }
}


