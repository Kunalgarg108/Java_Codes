class Dog{
    String name;
    String says;
    Dog(String name,String says){
        this.name=name;
        this.says=says;
    }
    void show(){
        System.out.println("Name of Dog is "+this.name+" and says "+this.says);   
    }
}

public class Lab3{
    public static void main(String a[]){
        Dog obj1=new Dog("spot","Ruff");
        Dog obj2=new Dog("scruffy","Wuff");
        obj1.show();
        obj2.show();
        Dog obj3=obj1;
        System.out.println(obj1==obj2);
        System.out.println(obj1==obj3);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));       
    }
}