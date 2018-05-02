package hw3;

public class Pyramid extends PrismPyramid{

    private Shape base;
    private double height;
    public static final int DEFUALT_SIZE=1;

    public Pyramid(Shape base,double height)
    {
        if (height>0)
        {
            this.height=height;
            this.base=base;
        } else {
            this.height = DEFUALT_SIZE;
        }

    }

    public double volume()
    {
        return (base.area()*height)/3;
    }

    public double getHeight() {
        return height;
    }

    String getBaseType()
    {
        return base.toString();
    }

    public String toString()
    {
        return "pyramid: " + super.toString();
    }

}
