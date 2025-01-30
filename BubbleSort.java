import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
