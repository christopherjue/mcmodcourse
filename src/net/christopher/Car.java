package net.christopher;

public class Car {
    int doors =4;
    int tires = 4;
    String color;
    boolean engine_started;
    //Constructor
    public Car(String paint_color){
        color = paint_color;
        engine_started =false;
    }

    public boolean start_engine(){
        engine_started=true;
        //everything worked as we wanted
        return true;
    }

    private void move_pistons(){
        //pretend we move some pistons here
    }
}
