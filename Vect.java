import java.util.Scanner;
import java.util.Vector;

public class Vect{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        Vector<Integer> v = new Vector<>(size);
        for(int i=0;i<size;i++){
            int num=sc.nextInt();
            v.addElement(num);
        }
        for(int i:v){
            System.out.print(i+" "); 
        }
    }
}