class Printchar implements Runnable{
   int times;
   char sym;
   Printchar(char s,int t){
      times=t;
      sym=s;
   }
   public void run(){
      for(int i=0;i<times;i++){
         System.out.println(sym + " ");
      }
   } 
}
public class Example{
   public static void main(String[] args) {
      Printchar obj1=new Printchar('c', 100);
      Thread t1=new Thread(obj1);
      t1.start();
      try{
         for(int i=0;i<=100;i++){
            System.out.println(i + " ");
            if(i==50){
               t1.join();
            }
         }
      }
      catch(InterruptedException e){
         System.out.println(e.getMessage());
      }
   }
}