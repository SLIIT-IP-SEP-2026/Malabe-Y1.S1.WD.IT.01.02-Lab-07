import java.util.Scanner; 
public class IT26102406Lab7Q1A 
{ 
    public static void main(String[] args) 
	{ 
        Scanner input= new Scanner(System.in);          

        System.out.println("Enter marks for four subjects:"); 
        System.out.print("Enter Subject Mark 1: "); 
        double m1 = input.nextDouble(); 

        System.out.print("Enter Subject Mark 2: "); 
        double m2 = input.nextDouble(); 

        System.out.print("Enter Subject Mark 3: "); 
        double m3 = input.nextDouble(); 

        System.out.print("Enter Subject Mark 4: "); 
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