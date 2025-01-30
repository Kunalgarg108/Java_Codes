class Part_Except extends Exception{
    String message;
    public Part_Except(String s){
        message=s;
    }
    public void Display(){
        System.out.println(message); 
    }
}

class Except2{
    public static void main(String args[]){
        try{
            System.out.println("Program Started");
            throw new Part_Except("Exception occured int the program");
        }
        catch(Part_Except e){
            e.Display();
        }
        finally{
            System.out.println("Program ended");  
        }
    }
}