import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class FirstDay extends AbstractTest implements InterfaceTest  {

    public  static  int b = 5;

    public static void main(String[] args) {


        int age  = -1;
        float money = 23.34f;
        int[] marks = new int[10];
        char[] name = {'A','K','s','h','a','y'};
        Scanner scanner = new Scanner(System.in);
        //InterfaceTest iTest = new InterfaceTest();
        FirstDay fd = new FirstDay();
        AbstractTest ab = new AbstractTest() {
            @Override
            public void myAbstractMethod() {

            }
        };
        //iTest.myAbstractMethod();
        //iTest.sleep();
       // iTest.message = scanner.nextLine();
       // System.out.println(iTest.a = scanner.nextInt());
        //System.out.println((iTest.message));


        fd.myAbstractMethod();
        fd.sleep();
        fd.sleep(10);
        fd.WhyWhyInterface();
        fd.WTFInterface();


        System.out.println(numInterface);



        //System.out.print("helo ");
      //  System.out.print( "marri \n" );
       // System.out.println(  "AK :" +( money + age )); // implicit casting
        //System.out.println(age  + (int) money);



        /*if (true || false )
        {
            System.out.println("Line 1");
        }
        if(false)
        {
            System.out.println("Line 2");
        }

        else if (true)
        {
            System.out.println("L 3");
        }

        System.out.println("\n");*/
       /* switch (age)

        {
            case  1:
            {
                System.out.println( 1);
                break;
            }

            case 5:
            {
                System.out.println("Victory");
                break;
            }

            case 2:
            {
                System.out.println("Som");
            }
        }


       while (age >=0)
       {

           System.out.println(age);
           age--;
       }*/
      /* for (int i = 0 ; i<8 ; i++)
       {
           if (i == age)
           {

               break;
           }

           System.out.println(i);


       }*/
       /*for (int i = 0 ; i<10 ; i++)
       {
           marks[i] = i;

       }



       for (int mark : marks)
       {
           System.out.println(mark);
       }*/
       /* while (age < 2 || age > 10)
        {
            age = scanner.nextInt();
            System.out.println("Enter Your Age : ");


        }*/
        /*do {

            System.out.println("Hey : ");
            age = scanner.nextInt();
        }while (age<0 || age > 100);

        System.out.println("Good Age : " + age);*/
       /* while (true)
        {
            System.out.print("Type Q to exit the game : ");
            char choice = scanner.next().charAt(0);

            if (choice == 'Q')
            {
                break;
            }
        }*/
        //MyContinueCheck();



    }

  /*  public static void MyContinueCheck() {
        for (int i = 0 ; i < 10 ; i++)
        {
            if(i % 2 !=0)
                continue;
            System.out.println(i);
        }
    }*/


   /* @Override
    public void sleep() {
        System.out.println("sleeping in FD");
    }*/

    public void myAbstractMethod() {

        System.out.println("Running from FirstDay");
    }

    @Override
    public void WTFInterface() {
        System.out.println("Runnig Wtf");
    }

    @Override
    public void WhyWhyInterface() {

        System.out.println("Running WhyWHy");
    }
}
