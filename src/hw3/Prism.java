package hw3;

public class Prism extends PrismPyramid{

    private Shape base;
    private double height;
    public static final int DEFUALT_SIZE=1;

    public Prism(Shape base,double height)
    {
        if (height>0)
        {
            this.height=height;
            this.base=base;
        }
        else
        {
            this.height=DEFUALT_SIZE;
        }
    }

    public double volume()
    {
        return (base.area()*height);
    }

    public double getHeight() {
        return height;
    }

    public String getBaseType()
    {
        return base.toString();
    }

    public String toString()
    {
        return "prism: " + super.toString();
    }




}
