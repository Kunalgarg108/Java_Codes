import java.util.Scanner;
public class Lab2{
    static boolean method(String arg1,String arg2){
        if(arg1.equals(arg2)){
            System.out.println("Strings are Equal");     
        }
        else{
            System.out.println("Strings are not Equal");  
        }
        if(arg1==arg2){
            System.out.println("Strings are Equal");  
        }
        else{
            System.out.println("Strings are not Equal");  
        }
        if(arg1!=arg2){
            System.out.println("Strings are not Equal");  
        }
        else{
            System.out.println("Strings are equal");
        }
        return true;
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1");
        String arg1=sc.nextLine();
        System.out.println("Enter the string 2");
        String arg2=sc.nextLine();
        boolean b=method(arg1,arg2);
    }
}