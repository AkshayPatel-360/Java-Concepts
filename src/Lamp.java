public class Lamp {

    boolean isOn = false;
    float intensity = 0f;
    String colour = "White";
    final float voltage ;
    int life = 100;

    public Lamp(float voltage)
    {
        this.voltage = voltage;


    }


    public void  turnOn()
    {
        isOn = true;
    }

    public  void  turnOf()
    {
        isOn = false;
    }

    public  void  changeIntensity(float intensity)
    {
        this.intensity = intensity;
    }

    public static void main(String[] args) {
        Lamp lampObjCanada = new Lamp(10);
        lampObjCanada.turnOn();
        Lamp lampObjIndia = new Lamp(20);


    }

}
