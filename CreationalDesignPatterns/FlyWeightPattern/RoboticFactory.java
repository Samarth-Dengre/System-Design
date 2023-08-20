package CreationalDesignPatterns.FlyWeightPattern;

import javax.annotation.processing.ProcessingEnvironment;
import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private Map<String, IRobot> robotCache = new HashMap<String, IRobot>();
    public IRobot createRobot(String type){
        if(robotCache.containsKey(type))    return robotCache.get(type);
        else{
            if(type.equalsIgnoreCase("HUMANOID")){
                IRobot h = new HumanoidRobot("HUMANOID", new Sprites());
                robotCache.put(type, h);
                return h;
            }else if(type.equalsIgnoreCase("DOG")){
                IRobot h = new DogRobot("DOG", new Sprites());
                robotCache.put(type, h);
                return h;
            }
        }
        return null;
    }
}
