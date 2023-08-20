package CreationalDesignPatterns.AdapterPattern;

public class SquarePeg {
    private int width;

    SquarePeg(int width){
        this.width = width;
    }

    double getWidth(){
        return this.width;
    }
}
