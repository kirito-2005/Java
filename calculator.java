
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        // to get it
        System.out.println("Welome to the calculator");
        int i=1;
        Scanner obj =new Scanner(System.in);
        while(i==1){
            System.out.println("choose the operation to be done");
            System.out.println("1.Addition\n2.subtraction\n3.division\n4.exponent\n5.multiplication");
            int no=obj.nextInt();
            if(no==1){
                // Addition
                System.out.println("enter the first and second no");
                int n1= obj.nextInt();
                int n2=obj.nextInt();
                System.out.printf("Addition of %d and %d id %d ",n1,n2,n1+n2);
            } 
            else if(no==2){
                System.out.println("enter the first and second no");
                int n1=obj.nextInt();
                int n2=obj.nextInt();
                System.out.println(n1-n2);


            }
            else if(no==3){
                System.out.println("enter the first and second no");
                int n1=obj.nextInt();
                int n2=obj.nextInt();
                System.out.println(n1/n2);

            }
            else if(no==4){
                System.out.println("enter the first and second no");
                int n1=obj.nextInt();
                int n2=obj.nextInt();
                System.out.println(Math.pow(n1,n2));

            }
            else if(no==5){
                System.out.println("enter the first and second no");
                int n1=obj.nextInt();
                int n2=obj.nextInt();
                System.out.println(n1*n2);

            }
            System.out.println("\nwould you like to continue");
            i = obj.nextInt();
            if(i==0){
                System.out.println("Thank you for choosing us");
                break;

            }



        }
    }
    
}
