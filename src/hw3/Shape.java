package hw3;

public abstract class Shape {

    abstract public double area();

    abstract public double perimeter();

    abstract public String getType();

    public String toString(){

        return getType()+" with area = "+String.format("%.2f",area())+" and perimeter = "+String.format("%.2f",perimeter())+")";
    }

}
