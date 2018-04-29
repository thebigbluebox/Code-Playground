package Command;

public class ToggleCommand implements Command
{
  private Light light;

  //client issues the command
  public ToggleCommand(Light light)
  {
    this.light = light;
  }
  // Client never says to light on directly
  @Override public void execute()
  {
    light.toggle();
  }
}
