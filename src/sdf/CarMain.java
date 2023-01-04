package sdf;

public class CarMain {

    public static void main(String[] args) {

        Car c = new Car();
        c.setColour("grey");
        c.setRegistration("sdf12345sh");
        c.start();
        System.out.printf("Is the car started? %b\n" , c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car();
        //d.setColour("red");
        System.out.printf("My car colour is %s\n" , d.getColour());
   

        Car e = new Car("black", "sdf987651");
        System.out.printf("My car colour is %s\n" , e.getColour());
        System.out.printf("My car number is %s\n" , e.getRegistration());

    }

    
}
