import java.util.Scanner;

public class MergeSort {
    public void Mergesort(int[] arr,int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] arr1=new int[n1+1];
        int[] arr2=new int[n2+1];
        arr1[n1]=Integer.MAX_VALUE;
        arr2[n2]=Integer.MAX_VALUE;
        for(int i=0;i<n1;i++){
            arr1[i]=arr[p+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[q+i+1];
        }
        int x=0;
        int y=0;
        for(int i=p;i<=r;i++){
            if(arr1[x]>arr2[y]){
                arr[i]=arr2[y++];
            }
            else{
                arr[i]=arr1[x++];
            }
        } 

    }
    public void Merge(int[] arr,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            Merge(arr,p,q);
            Merge(arr,q+1,r);
            Mergesort(arr,p,q,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        MergeSort ms=new MergeSort();
        ms.Merge(arr,0,size-1);
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
