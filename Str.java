class ExamStr{
    static String field1="My name is Kunal Garg.";
    static String field2;
    static{
        field2="My branch is CSE.";
    }
    static void Display(){
        System.out.println(field1);
        System.out.println(field2);    
    }
}

public class Str{
    public static void main(String arg[]){
        ExamStr.Display();
    }
}