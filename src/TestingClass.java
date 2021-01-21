import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestingClass {



    public static void main(String[] args)
    {
        Colors colors ;
        Colors MyFavColour = Colors.Red;
        System.out.println( MyFavColour);
        System.out.println( Colors.valueOf("Red"));
        System.out.println(Colors.Red.ordinal());
        System.out.println(Arrays.toString(Colors.values()));
    }





}


