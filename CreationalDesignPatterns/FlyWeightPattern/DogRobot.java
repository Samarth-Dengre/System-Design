package CreationalDesignPatterns.FlyWeightPattern;

public class DogRobot implements IRobot{
    private String type;
    private Sprites sprite;

    DogRobot(String type, Sprites sprite){
        this.type = type;
        this.sprite = sprite;
    }
    public Sprites getSprite() {
        return sprite;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Dog: " + x + " ," + y);
    }
}
