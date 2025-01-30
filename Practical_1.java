import java.util.Scanner;

class Matrix{
    int n;
    int[][] arr=new int[100][100];
    int[][] brr=new int[100][100];
    public void add_method(){
        System.out.println("Adding two matrices");
        add();
    }
    private void add(){
        int[][] err=new int[100][100];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                err[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(err[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void Transpose(int a){
        if(a==1){
            int[][] crr=new int[100][100];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    crr[i][j]=arr[j][i];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else{
            int[][] crr=new int[100][100];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    crr[i][j]=brr[j][i];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}

public class Practical_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Matrix obj=new Matrix();
        System.out.println("Enter the size");
        obj.n=sc.nextInt();
        System.out.println("Enter the first matrix");
        for(int i=0;i<obj.n;i++){
            for(int j=0;j<obj.n;j++){
                obj.arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Second matrix");
        for(int i=0;i<obj.n;i++){
            for(int j=0;j<obj.n;j++){
                obj.brr[i][j]=sc.nextInt();
            }
        }
        obj.add_method();
        System.out.println("Choose the matrix for transpose(1 or 2)");
        int choose=sc.nextInt();
        obj.Transpose(choose);
    }
}
