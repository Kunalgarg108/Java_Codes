import java.util.Scanner;

class Plane{
    boolean arr[]=new boolean[10];
    int i;
    int j;
    public Plane(){
        for(int i=0;i<10;i++){
            arr[i]=false;
        }
        i=0;
        j=5;
    }
    public void setterseat(int type){
        if(type==1){
            if(i==5){
                System.out.println("FirstClass is full");
                return;
            }
            arr[i]=true;
            System.out.println("Your seat Number is:"+(i+1)+" and your class is FirstClass");
            i++;
        }
        else if(type==2){
            if(j==10){
                System.out.println("Economy is Full");
                return;
            }
            arr[j]=true;
            System.out.println("Your seat Number is:"+(j+1)+" and your class is EconomyClass");
            j++;
        }
    }
}

public class Aeroplane{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); 
       Plane p1=new Plane();
       System.out.println("Please Type 1 for FirstClass and Type 2 for Economy");
       
       int person1=sc.nextInt();  
       p1.setterseat(person1);
       int person2=sc.nextInt();
       p1.setterseat(person2);
       int person3=sc.nextInt();  
       p1.setterseat(person3);
       int person4=sc.nextInt();
       p1.setterseat(person4);
        int person5=sc.nextInt();  
       p1.setterseat(person5);
       int person6=sc.nextInt();
       p1.setterseat(person6);
    }
}