import java.util.Scanner;

public class fibonacci {
    static void fib(int[] arr,int size){
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<size;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        fib(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}