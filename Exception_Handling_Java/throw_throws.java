// custom class to handle negative radius
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be negative";
    }
    @Override
    public String getMessage() {
        return "message: Radius can not be negative!!";

    }
}

public class throw_throws {
    public static int divide(int a , int b) throws ArithmeticException{
        int result= a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r < 0) {
            throw new NegativeRadiusException();
        }
        double res= Math.PI *r*r;
        return res;
    }
    public static void main(String[] args) {
        try {
            // float c= divide(2, 0);
            // System.out.println("division is: "+c);
            double ar= area(2);
            System.out.println("Area: "+ar);

        }
        catch(Exception e) {
            System.out.println("Denominator can't be zero !!");
            System.out.println(e.getLocalizedMessage());
        }

        // double ar= area(2);  # will give error. we must have to handle the exception first
    }
}

