import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Car {

    private int wheels;
    private int doors;
    private int engine;
    private int windows;
    private String colour;

    public Car(int wheels, int doors, int engine, int windows, String colour) {
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
        this.windows = windows;
        this.colour = colour;
    }

    public void startEngine(){

    }
    private void accelerate(){

    }
    protected void stopCar(){

    }
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

public class AnotherMethodFinder {

    public static void main(String[] args) {

        getMethodCount();

    }

    private static int getMethodCount(){
        int allMethodsCount = 0;
        Method[] allMethods = Car.class.getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                allMethodsCount++;
            }
            if (Modifier.isPrivate(method.getModifiers())){
                allMethodsCount++;
            }
            if (Modifier.isProtected(method.getModifiers())){
                allMethodsCount++;
            }

        }
        System.out.println("Method count in class Car: " + allMethodsCount);
     return allMethodsCount;
    }
}