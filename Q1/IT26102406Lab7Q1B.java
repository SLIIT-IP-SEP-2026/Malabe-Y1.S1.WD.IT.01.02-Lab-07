import java.util.Scanner; 
public class IT26102406Lab7Q1B
{ 
    public static void main(String[] args)
	{ 
        Scanner input = new Scanner(System.in); 
         
        for (int i = 1; i <= 3; i++) { 
            System.out.println("Student " + i); 
            System.out.print("Enter marks: "); 

            double m1 = input.nextDouble(); 
            double m2 = input.nextDouble(); 
            double m3 = input.nextDouble(); 
            double m4 = input.nextDouble(); 
             
            double avg = (m1 + m2 + m3 + m4) / 4.0; 
            System.out.println("Average is: " + avg); 
             
            String grade; 
            if (avg >= 75 && avg <= 100) { 
                grade = "Distinction"; 
            } else if (avg >= 50 && avg <= 74) { 
                grade = "Credit"; 
            } else { 
                grade = "Fail"; 
            } 
             
            System.out.println("Overall Grade is: " + grade); 
        } 
    } 
} 