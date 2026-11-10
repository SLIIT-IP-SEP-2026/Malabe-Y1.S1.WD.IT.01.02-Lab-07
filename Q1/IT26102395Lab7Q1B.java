import java.util.Scanner;
public class IT26102395Lab7Q1B{
    public static void main(String[] args) {

        Scanner ok=new Scanner(System.in);
        System.out.println("Enter marks for four subjects:");


        int i=0;
        while (i<3) {
            
        

         System.out.println("Enter subject mark 1:");
         double mark1=ok.nextDouble();

         System.out.println("Enter subject mark 2:");
         double mark2=ok.nextDouble();

         System.out.println("Enter subject mark 3:");
         double mark3=ok.nextDouble();

         
         System.out.println("Enter subject mark 4:");
         double mark4=ok.nextDouble();

         double total=mark1+mark2+mark3+mark4;
         double avg=total/4;

         System.out.println("Average is "+ avg);

         if(avg>=75){
            System.out.println("Overall grade is Distinction");
         }
         else if(avg>=50){
            System.out.println("Overall grade is Credit");

         }
         else{
            System.out.println("Overall grade is Fail");
         }
        
         i++;
        } 

        
        




        



        
    }
}
