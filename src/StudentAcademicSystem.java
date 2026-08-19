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
        
        // Mark validation
        if (mark >= 0 && mark <= 100){
            System.out.println("MARK VALIDATION: Valid mark");
        }
        
        // determine Academic result
        String academicResult;
        if (mark >= 90){
            academicResult = "Exellent";
        }
        else if (mark >= 75){
            academicResult = "Very good";
        }
        else if (mark >= 60){
            academicResult = "Good";
        }
        else if (mark >= 50){
            academicResult = "Pass";
        }    
        else{
            academicResult = "Fail";
        }
        System.out.println("ACADEMIC RESULT: " + academicResult);
        
        //Examination eligility
        boolean examEligible = (mark >= 50 && attendence >= 75 );
        if (examEligible){
            System.out.println("EXAMINATION ELIGILITY: Eligible for examination");
        
          //cheacking to see if you qualify for special category
          if (category = "Special"){
            System.out.println("Eligible for examination for special category");
          }
          else{
            System.out.println("Eligible for examination for stantard category");
          }
        }
        else{
            System.out.println("EXAMINATION ELIGILITY: Not eligible for examination");
            if (mark < 50){
                System.out.println("REASON: Mark is below pass requirement");
            }
            if (attendence < 75){
                System.out.println("REASON: Attendence is below 75%");
            }
        }
        
        //free discount(re-do)
        int discount;
        if (category = "Special"){
            discount = 20;
        }
        else{
            discount = 5;
        }
        System.out.println("free discount: " + discount + "%");
        
        //Admission condition
        boolean admitted = (age >= 18 && mark >= 50 && attendance >= 75);
        if (admitted){
            System.out.println("ADMISSION STATUS: Admitted");
        }
        else{
            System.out.println("ADMISSION STATUS: Not admitted");
        }
        
        // Emergency Academic support
        boolean supportNeeded = (mark <= 40 || attendance <= 50 );
        if (supportNeeded){
            System.out.println("Academic support needed");
        }
        else{
            System.out.println("No emergency academic support needed");
        }
        
        //Service Menu
        System.out.println();
        System.out.println("STUDENT SERVICES");
        System.out.println("1. ACADEMIC RESULT");
        System.out.println("2. ATTENDANCE");
        System.out.println("3. FEES");
        System.out.println("4. STUDENT SUPPORT");
        System.out.println("5. EXIT");
        System.out.println("SELECT A CHOICE: ");
        int choice = input.nextInt();
        
        
        
        
        
     
    }
}

