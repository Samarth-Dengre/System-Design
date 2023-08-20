package CreationalDesignPatterns.AdapterPattern;

import java.math.RoundingMode;

public class RoundHole {
    private int radius;
    RoundHole(int radius){
        this.radius = radius;
    }
    int getRadius(){
        return this.radius;
    }

    boolean fits(RoundPeg peg){
        if(peg.getRadius() <= this.radius)  return true;
        return false;
    }
}
