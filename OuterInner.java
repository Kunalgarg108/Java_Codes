class Outer{
    private int num;
    Outer(){
        num=18;
        System.out.println("Original::  My name is Kunal and my age is:"+num);
    }
    private void display(){
        System.out.println("After Changing Value Using Inner Class::  My name is Kunal and my age is:"+num);
    }
    private class Inner{
        private int val=30;
        public void modify(){
            num=20;
            display();
        }
    }
    public void useInner(){
        Inner I=new Inner();
        I.modify();
        System.out.println("After creating object we can access inner class private attribute:"+I.val);
    }
    // public void Display2(){
    //     System.out.println(val);
    // }
}

class OuterInner{
    public static void main(String args[]){
        Outer o=new Outer();
        o.useInner();
        // o.Display2(); 
    }
}