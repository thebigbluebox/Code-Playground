package Command;

// Concrete command
public class OnCommand implements Command
{
  private Light light;

  //client issues the command
  public OnCommand(Light light)
  {
    this.light = light;
  }
  // Client never says to light on directly
  @Override public void execute()
  {
    light.on();
  }
}
