package CreationalDesignPatterns.FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        RoboticFactory factory = new RoboticFactory();
        IRobot robot1 = factory.createRobot("HUMANOID");
        robot1.display(10 ,20);

        IRobot robot2 = factory.createRobot("DOG");
        robot2.display(1, 2);

        IRobot robot3 = factory.createRobot("HUMANOID");
        robot3.display(5, 6);
    }
}
