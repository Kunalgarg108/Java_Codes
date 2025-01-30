class Dog1{
    public void Bark(int a){
        System.out.println("Howling");
    } 
    public void Bark(double a){
        System.out.println("Barking");
    } 
    public void Bark(char a){
        System.out.println("Wuff");
    } 
    public void Bark(String a){
        System.out.println("Ruff");
    } 
}


class Dog2{
    String name;
    public Dog2(){
        System.out.println("Constructor is automatically synthesized");
    }
    public Dog2(String n){
        this();
        name=n;
        System.out.println("Parameterised Constructor");
        System.out.println("Dog name is:"+name);
    }
    public void Bark(int a){
        System.out.println("Howling");
    } 
    public void Bark(double a){
        System.out.println("Barking");
    } 
    public void Bark(char a){
        System.out.println("Wuff");
    } 
    public void Bark(String a){
        System.out.println("Ruff");
    } 
}

public class Lab5{
    public static void main(String arg[]){
        System.out.println("Class without constructor");
        Dog1 obj=new Dog1();
        obj.Bark(6);
        obj.Bark(2.90);
        obj.Bark('a');
        obj.Bark("My name");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Class with constructor");
        Dog2 obj2=new Dog2();
        Dog2 obj3=new Dog2("spot");
        obj2.Bark(6);
        obj2.Bark(2.90);
        obj2.Bark('a');
        obj2.Bark("My name");
    }
}