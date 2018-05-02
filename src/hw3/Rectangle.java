package hw3;

public class Rectangle extends Shape{

    private double  width;
    private double height;
    public static final int DEFUALT_SIZE=0;

    public Rectangle(double width, double height) {

        if(width>0&&height>0)
        {
            this.width = width;
            this.height = height;
        }
        else
            setDefualtValues();
    }


    private void setDefualtValues() {

        width=DEFUALT_SIZE;
        height=DEFUALT_SIZE;
    }

    @Override
    public double area() {

        return width*height;
    }

    @Override
    public double perimeter() {
        return (width*2+height*2);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getType(){
        return "rectangle";
    }



}
