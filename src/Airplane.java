/*
package Airplane;

import AirplaneException.*;
import Observer.AirplaneAbstarct;
import Observer.AirplaneObserver;


public class Airplane extends AirplaneAbstarct {
    private boolean crashed = false;
    static  Airplane airplane = new Airplane();
    private Airplane() {

    }
    public static Airplane IuseSingleton()
    {
        return airplane;

    }

    private int altitude = 1;
//private int fuel = 2000; //assume that fuel is 2000 liter for every stock plane loose 100liter fuel;

    public void startingTheEngine() throws AirplaneStartedException, AirplaneCrashed, AirplaneEngineAlreadyStarted {
        crashed(altitude >= 12000);
        engineIsAlreadyStarted(altitude > 1 && altitude < 12000);
        startTheEngine(1, 0);
    }

    private void startTheEngine(int i, int i2) throws AirplaneStartedException {
        if (altitude == i) {
            altitude = i2;
            Notify("start_the_engine");
            throw new AirplaneStartedException();
        }
    }

    private void engineIsAlreadyStarted(boolean b) throws AirplaneEngineAlreadyStarted {
        if (b) {
            Notify("engine_already_started");
            throw new AirplaneEngineAlreadyStarted();
        }
    }

    public void stopMotor() throws AirplaneCrashed, AirplaneCantBestoppedInMidAir, AirplaneStartedException, MotorIsAlreadyStoppedException {
        crashed(altitude >= 12000);
        cantBeStoppedInTheAir(altitude > 1 && altitude < 12000);
        startTheEngine(1);

        if (altitude == 0) {
            altitude = 1;
            Notify("motor_is_stopped");
            throw new MotorIsAlreadyStoppedException();
        }


    }

    private void cantBeStoppedInTheAir(boolean b) throws AirplaneCantBestoppedInMidAir {
        if (b) {
            Notify("cant_stop_in_mid_way");
            throw new AirplaneCantBestoppedInMidAir();
        }
    }

    private void startTheEngine(int i) throws AirplaneStartedException {
        if (altitude == i) {
            Notify("start_the_engine");
            throw new AirplaneStartedException();
        }
    }

    public void takeOff() throws AirplaneCrashed, AirplaneStartedException, AirplaneIsAlreadyInAir, AirplaneIsReadyToTakeOff {
        crashed(altitude >= 12000);
        CantTakeOffMidWay(altitude > 1 && altitude < 12000);
        startTheEngine(1);
        if (altitude == 0)
        {

            altitude = altitude + 1000;
            Notify("take_off");
            throw new AirplaneIsReadyToTakeOff(altitude);
            //System.out.println("Ready to Take Off");
            //System.out.println("New Altitude is: "+altitude);
        }


    }

    private void CantTakeOffMidWay(boolean b) throws AirplaneIsAlreadyInAir {
        if (b) {
            Notify("airplane_is_already_in_air");
            throw new AirplaneIsAlreadyInAir();
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public void increaseAltitude() throws AirplaneCrashed, AirplaneStartedException, AirplaneAtDangerAltitude, AirplaneNotTakeOffYet, IncreasingTheAirplaneAltitude {

        crashed(altitude > 12000);
        increasingTheAltitude(altitude + 1000);
        if (altitude > 1 && altitude < 10000) {
            altitude = altitude + 1000;
            Notify("increasing_the_altitude");
            throw new IncreasingTheAirplaneAltitude(altitude);
        }
        startTheEngine(1);
        firstTakeOff(altitude);


    }


    private void firstTakeOff(int i) throws AirplaneNotTakeOffYet {
        if (i == 0) {
            Notify("first_take_off");
            throw new AirplaneNotTakeOffYet();
        }

    }


    private void increasingTheAltitude(int i2) throws AirplaneAtDangerAltitude, AirplaneCrashed {
        if (altitude == 12000) {
            crashed = true;
            Notify("crashed");
            throw new AirplaneCrashed();

        }
        if (altitude >= 10000 && altitude <= 12000) {
            altitude = i2;
            Notify("airplane_at_danger_altitude");
            throw new AirplaneAtDangerAltitude(i2);
        }
    }



















    public void decreaseAltitude() throws AirplaneCrashed, AirplaneStartedException, AirplaneIsOnTheLand, DecreasingTheAirplaneAltitude {
        crashed(altitude > 12000);
        decreasingTheAltitude(altitude - 1000);
        startTheEngine(1);//first start the engine
        if (altitude == 0) {
            Notify("airplane_landed");
            throw new AirplaneIsOnTheLand();
        } //airplane landed successfully
    }

    // logic error
    private void decreasingTheAltitude(int i2) throws DecreasingTheAirplaneAltitude, AirplaneCrashed {
        if (crashed) {
            Notify("crashed");
            throw new AirplaneCrashed();
        }
        if (altitude >= 1000 && altitude <= 12000) {
            altitude = i2;
            Notify("decreasing_the_altitude");
            throw new DecreasingTheAirplaneAltitude(i2);
        }
    }

    private void crashed(boolean b) throws AirplaneCrashed {
        if (b) {
            Notify("crashed");
            throw new AirplaneCrashed();
        }
    }


    @Override
    public void Notify(String action) {
        for (AirplaneObserver observer : observers)
        {
            observer.update(action);
        }
    }
}
*/
