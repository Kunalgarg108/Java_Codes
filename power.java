import java.util.Scanner;

public class power {
    static int pow(int num,int exp){
        if(exp==1){
            return num;
        }
        if(num==0){
            return 0;
        }
        if(exp%2!=0){
            return num*pow(num,exp-1);
        }
        else{
            return pow(num*num, exp/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        System.out.println("Enter the power:");
        int exp=sc.nextInt();
        System.out.println(pow(num,exp));
        sc.close();
    }
}
