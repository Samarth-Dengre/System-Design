package CreationalDesignPatterns.AdapterPattern;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
