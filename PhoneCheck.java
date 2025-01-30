class Phone{
    String make;
    String model;
    int year;
    public Phone(String ma,String mo,int y){
        make=ma;
        model=mo;
        year=y;
    }
    public void settermake(String m){
        make=m;
    }
    public void settermodel(String m){
        model=m;
    }
    public void setteryear(int m){
        year=m;
    }
    public String gettermake(){
        return make;
    }
    public String gettermodel(){
        return model;
    }
    public int getteryear(){
        return year;
    }
    public String tostring(){
        return "Company of Phone is "+make+" ,its model is "+model+" and its manufactoring year is "+year;    
    }
    public Boolean isObsolete(int curryear){
        if(curryear-year>10){
            return true;
        }
        else{
            return false;
        }
    }
}

public class PhoneCheck{
    public static void main(String args[]){
        Phone obj=new Phone("Samsung","A26",2015);
        System.out.println("Before using Setter");  
        System.out.println( obj.gettermake());
        System.out.println( obj.gettermodel());
        System.out.println( obj.getteryear());
        System.out.println("After using setter");
        obj.settermake("Apple");
        obj.settermodel("i16");
        obj.setteryear(2012);
        System.out.println( obj.gettermake());
        System.out.println( obj.gettermodel());
        System.out.println( obj.getteryear());
        System.out.println( obj.tostring());
        System.out.println("Phone becomes obsolete:"+obj.isObsolete(2024));


        System.out.println("----------------------------------------------------------------------");
        


        Phone obj2=new Phone("Samsung","A10",2012);
        System.out.println("Before using Setter");  
        System.out.println( obj2.gettermake());
        System.out.println( obj2.gettermodel());
        System.out.println( obj2.getteryear());
        System.out.println("After using setter");
        obj2.settermake("Mi");
        obj2.settermodel("11 Pro");
        obj2.setteryear(2020);
        System.out.println( obj2.gettermake());
        System.out.println( obj2.gettermodel());
        System.out.println( obj2.getteryear());
        System.out.println( obj2.tostring());
        System.out.println("Phone becomes obsolete:"+obj2.isObsolete(2024));
    }
}