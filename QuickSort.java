import java.util.Scanner;

public class QuickSort {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr,int p,int r){
        int pivot=arr[r];
        int j=p-1;
        for(int i=p;i<r;i++){
            if(arr[i]<pivot){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j+1,r);
        return j+1;
    }
    static void Quicksort(int[] arr,int p,int r){
        if(p<r){
            int q= partition(arr,p,r);
            Quicksort(arr,p,q-1);
            Quicksort(arr,q+1,r);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Quicksort(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
