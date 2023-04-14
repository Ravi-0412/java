// Creating custom Exception
class AgeInvalidException extends Exception {
    // This wil run after catch block according the exception we have caught.
    AgeInvalidException() {
        super("Invalid Age");
    }
    AgeInvalidException(String message) {
        super(message);
    }
}

class Example {
    public static void main(String[] args) {
        System.out.println("Started....");
        try {
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);
        if(n2 < 10) {
            // throw new AgeInvalidException("my age is invalid");
            throw new AgeInvalidException();
        }

        System.out.println("we have got two number "+n1+ " "+n2);
        int result= n1/n2;
        System.out.println("Division is "+result);
        }
        catch(ArithmeticException e) {
            System.out.println("n2 can't be zero !!");
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid input. Number must be integer only !!");
            System.out.println(e.getMessage());
        }
        // catch(IndexOutOfBoundsException e) {
        //     System.out.println("Enter numbers in exact quantity not less or more !!");
        //     System.out.println(e.getMessage());
        // }
        catch(AgeInvalidException e) {
            System.out.println("n2 is not a valid Age !!");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error!! ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am in finally block !!!");
            System.out.println("Closing all the resources...");
        }

        System.out.println("Terminated.....");
    }
}





