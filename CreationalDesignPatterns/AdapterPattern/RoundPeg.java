package CreationalDesignPatterns.AdapterPattern;

public class RoundPeg {
    private int radius;

    RoundPeg(int radius){
        this.radius = radius;
    }

    RoundPeg(){}
    double getRadius(){
        return this.radius;
    }
}
