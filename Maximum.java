import java.util.Scanner;

public class Maximum {
    public static int findMax(int[] arr,int p,int r){
        if(p>r){
            return Integer.MIN_VALUE;
        }
        if(p==r){
            return arr[p];
        }
        int mid=(r+p)/2;
        int left=findMax(arr,p,mid);
        int right=findMax(arr,mid+1,r);
        return Math.max(left, right);    
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMax(arr,0,size-1));
        sc.close();
    }
}
