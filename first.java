class A{
    String s;
    A(String newS){
        s=newS;
    }
    public void print(){
        System.out.println(s);
        
    }
}

public class first {
    static int sum(int ...arr){
        int res=0;
        for(int a:arr){
            res+=a;
        }
        return res;
    }
    public static int m(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    boolean x;
    public static void main(String[] a) {
        // System.out.println(6);
        // int c=7;
        // int b=9;
        // int r1=c+b;
        // System.out.println(r1);
        // int d=6;
        // int e=12;
        // int r2=d*e;
        // System.out.println(r2);
        // double q=5.6;
        // System.out.println(q);
        // byte var1=5;
        // int var2=6;
        // System.out.println(var1);
        // System.out.println(var2);
        // var1=(byte)var2;
        // var2=var1;
        // System.out.println(var1);
        // System.out.println(var2);
        // if(c>6){
        //     System.out.println("Greater"); 
        // }
        // else{
        //     System.out.println("Smaller");  
        // }
        // while(c>0){
        //     System.out.println(c);
        //     c-=2;  
        // }
        // do{
        //     c++;
        //     System.out.println(c);   
        // }
        // while(c<5);
        // for(int i=0;i<=5;i++){
        //     System.out.println(i);
        // }
        // int x=4;
        // switch(x){
        //     case 1:{
        //         System.out.println("First");
        //         //break;   
        //     }
        //     case 2:{
        //         System.out.println("Second");
        //         //break;
        //     }
        //     case 4:{
        //         System.out.println("Fourth");
        //         //break;
        //     }
        //     case 9:{
        //         System.out.println("Nineth");
        //         //break;
        //     }
        //     default:{
        //         System.out.println("Default");
        //     }
        // }
        // for(int i=2;i<=20;i++){
        //     boolean prime=true;
        //     for(int j=2;j<=i/2;j++){
        //         if(i%j==0){
        //             prime=false;
        //             break;
        //         }
        //     }
        //     if(prime){
        //         System.out.println(i);
        //     }
        // }
        // for(int i=1;i<=10;i++){
        //     System.out.println("3X"+i+"="+(3*i));   
        // }
        //System.out.println(sum(2,3,4,5,6,7));
        // Integer i=Integer.parseInt("23",5);
        // System.out.println(i);
        // String d=(Double.valueOf("23.45")).toString();
        // java.math.Integer x=new java.math.Integer(3);
        // System.out.println(x.intValue());
        // System.out.println(Integer.parseInt("10"));
        // System.out.println(Integer.parseInt("10",10));
        // System.out.println(Integer.parseInt("124",16));
        // java.math.BigInteger x=new java.math.BigInteger("3");
        // java.math.BigInteger y=new java.math.BigInteger("7");
        // java.math.BigInteger z=x.add(y);
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);
        
        // String s1="Welcome";
        // String s2=s1;
        // String s3=new String("Welcome");
        // String s4="Welcome";
        // System.out.println(s1==s2);
        // System.out.println(s1==s4);
        // System.out.println(s1.equals(s4));
        // System.out.println(s1.replace("e","abc"));
        
        
        // String s1="Wel";
        // String s2=s1.replace("e","abc");
        // System.out.println(s1);
        // System.out.println(s2);
    
        // String s="Hi, Good Morning";
        // System.out.println(m(s));
        // first ar=new first();
        // System.out.println(ar.x);
        A ar=new A();
        ar.print();
        
        
        
        
    }
}
