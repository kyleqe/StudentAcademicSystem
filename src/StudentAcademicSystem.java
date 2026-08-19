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
        
         // Display student infor
        System.out.println();
        System.out.println("  STUDENT INFORMATION  ");
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("MARK: " + mark);
        System.out.println("ATTENDENCE: " + attendence);
        
        // Age decsion
        if (age >= 18){
            System.out.println("AGE GROUP: Adult");
        }
        else{
            System.out.println("AGE GROUP: Minor");
        }
        
        // Special category
        if (age < 18 || age > 60){
            System.out.println("STUDENT CATEGORY: Special");
        }
        else{
            System.out.println("STUDENT CATEGORY: Standard");
        }
        
     
    }
}

