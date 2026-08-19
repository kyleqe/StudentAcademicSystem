import java.util.Scanner,
public class StudentAcademicSystem {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        //getting student infor
        
        System.out.print("ENTER STUDENT NAME: ");
        String name = input.nextLine();
        System.out.print("ENTER STUDENT AGE: ");
        int age = input.nextInt();
        System.out.print("ENTER STUDENT MARK (0-100): ");
        double mark = input.nextDouble();
        System.out.print("ENTER STUDENT ATTENDENCE (%): ");
        double attendence = input.nextDouble();
      
    }
}


