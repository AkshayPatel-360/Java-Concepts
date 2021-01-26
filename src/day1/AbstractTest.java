package day1;

abstract class AbstractTest {
    int a ;
    String message;
    public abstract void myAbstractMethod();
    public void sleep()
    {
        System.out.println("I'm Sleeping here in abstractTest");
    }

    public void sleep(int hours)
    {
        System.out.println("Mah boy is sleeping for : " + hours + " hours");
    }

    public void sleep(String hours)
    {
        System.out.println("Mah boy is sleeping for : " + hours + " hours");
    }

    public void sleepMY() {}


}
