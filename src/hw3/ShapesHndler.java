package hw3;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ShapesHndler {

    public static void main(String[] args) {

        Rectangle rec=new Rectangle(4,5);
        Traingle traingle=new Traingle(6.5,6.5,5);
        Prism prism=new Prism(rec,8);
        Pyramid pyramid= new Pyramid(traingle,5);

        System.out.println(prism);
        System.out.println(pyramid);

        Scanner sc=new Scanner(new File(shapesln.txt));
    }

}
