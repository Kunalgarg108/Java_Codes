class MyInteger{
    int value;
    public MyInteger(int v){
        value=v;
    }
    public int getter(){
        return value;
    }
    public Boolean isEven(){
        return value%2==0;
    }
    static Boolean isEven(int v){
        return v%2==0;
    }
    static Boolean isEven(MyInteger obj){
        return obj.value%2==0;
    }
    public Boolean equals(int v){
        return (v==value);
    }
    public Boolean equals(MyInteger obj){
        return (obj.value==this.value);
    }
}

public class Lab4{
    public static void main(String arg[]){
        MyInteger num=new MyInteger(6);
        MyInteger num2=new MyInteger(10);
        System.out.println("Number is:"+num.getter());
        System.out.println(num.isEven());
        System.out.println(num.isEven(8));
        System.out.println(num.isEven(num));
        System.out.println(num.equals(6));
        System.out.println(num.equals(num2));
    } 
}