class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
}

public class custom_class{
    public static void main(String[] args){
        System.out.println("This is our custom class");
        Employee harry= new Employee();
        harry.id= 12;
        harry.name= "Ravi";
        harry.printDetails();

    }
}