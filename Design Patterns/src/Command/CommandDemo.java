package Command;

// Client

import java.util.ArrayList;
import java.util.List;

/**
 * So in this we will try to turn on and off a light
 */
public class CommandDemo
{
  public static void main(String args[]){
    Light bedroomLight = new Light();
    Light kitchenLight = new Light();
    Switch lightSwitch = new Switch();

    // This will delgate instead of the user
    Command toggleCommand = new ToggleCommand(bedroomLight);

    lightSwitch.storeAndExecute(toggleCommand);
//    lightSwitch.storeAndExecute(toggleCommand);
//    lightSwitch.storeAndExecute(toggleCommand);
    List<Light> lights = new ArrayList<>();
    lights.add(bedroomLight);
    lights.add(kitchenLight);
    Command allLightsCommand = new AllLightsCommand(lights);

    lightSwitch.storeAndExecute(allLightsCommand);
  }
}
