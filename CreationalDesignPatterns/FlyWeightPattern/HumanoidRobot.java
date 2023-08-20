package CreationalDesignPatterns.FlyWeightPattern;

public class HumanoidRobot implements IRobot{
    private String type;
    private Sprites sprite;

    public String getType() {
        return type;
    }

    public Sprites getSprite() {
        return sprite;
    }

    HumanoidRobot(String type, Sprites sprite){
        this.type = type;
        this.sprite = sprite;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Humanoid: " + x + " ," + y );
    }
}
