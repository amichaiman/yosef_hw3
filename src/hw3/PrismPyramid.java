package hw3;

public abstract class PrismPyramid
{
    abstract public double volume();
    abstract public double getHeight();
    abstract String getBaseType();

    public String toString()
    {
     return "(base shape = " +getBaseType()+ " and (‫‪height = "+getHeight()+")";
    }
}