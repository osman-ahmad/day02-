package sdf;

public class Porche extends Car {
    private int accelerate = 0;
    private String turbo = "off";

    public Porche() {
        super.setColour("red");
        
    }
    
    public Porche(String Colour, String registration){
        setColour(Colour);
        setRegistration(registration);
    }

    public String getTurbo(){
        return turbo;
    }

    @Override
    public void setColour(String C){

    }

    public void accelerate(){
        this.accelerate++;
        if (this.accelerate > 4 ){
            this.turbo = "on";
        }
    }

    public void decelerate(){
        this.accelerate++;
        if (this.accelerate <= 4 ){
            this.turbo = "off";
        }
    }
}
