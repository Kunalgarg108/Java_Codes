import java.util.Scanner;

class CustomException extends Exception{
    private String s;
    CustomException(String msg){
        s=msg;
    }
    void Display(){
        System.out.println(s);
    }
}

public class Practical_2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        try{
            if(b==0){
                throw new CustomException("Divided by zero");
            }
            else{
                System.out.println("Division of numbers are:"+(a/b));
            }
        }
        catch(CustomException e){
            System.out.println("Exception Occured");
            System.out.print("Reason For Exception: ");
            e.Display();
        }
    }
}
