class Mobile{
    int price;
    String name;
    static String type;
    Mobile(int price,String name){
        this.price=price;
        this.name=name;
        System.out.println("Price of "+this.name +" Mobile:"+this.price);    
    }
    static{
        type="Smartphone";
    }
}
public class Lab1{
    static int sumprice(Mobile m1,Mobile m2){
        return (m1.price+m2.price);
    }
    public static void main(String a[]){
        Mobile obj1=new Mobile(12000,"Samsung");
        Mobile obj2=new Mobile(23000,"Apple");
        System.out.println("Sum of Price:"+sumprice(obj1,obj2));
        System.out.println(Mobile.type);
    }
}