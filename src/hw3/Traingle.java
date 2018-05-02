package hw3;

import java.util.Arrays;

public class Traingle extends Shape{

    private double side_a;
    private double side_b;
    private double side_c;
    public static final int DEFUALT_SIZE=0;

    public Traingle(double side_a, double side_b, double side_c) {

        if(valuesAreLegal(side_a,side_b,side_c))
        {
            setValuesBySize(side_a,side_b,side_c);
        }
        else
             setDefualtValues();

    }

    @Override
    public double area() {

        return 0.25*Math.sqrt((side_a+(side_b+side_c))*(side_c-(side_a-side_b))*(side_c+(side_a-side_b))*(side_a+(side_b-side_c)));
    }

    @Override
    public double perimeter() {
        return (side_a+side_b+side_c);
    }

    @Override
    public String getType() {
        return "traingle";
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    private void setValuesBySize(double side_a, double side_b, double side_c)
    {
        double[] arr={side_a,side_b,side_c};

        Arrays.sort(arr);

        this.side_a=arr[2];
        this.side_b=arr[1];
        this.side_c=arr[0];
    }

    private boolean valuesAreLegal(double side_a, double side_b, double side_c)
    {
        if(side_a<=0||side_b<=0||side_c<=0)
            return false;

        if ((side_a+side_b<=side_c)||(side_a+side_c<=side_b)||(side_b+side_c<=side_a))
            return false;

        return true;
    }

    private void setDefualtValues() {

        side_a=DEFUALT_SIZE;
        side_b=DEFUALT_SIZE;
        side_c=DEFUALT_SIZE;
    }

}