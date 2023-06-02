public class FanMediumCommand implements Command{

    private Fan fan;
    private int previousSpeed;

    public FanMediumCommand(Fan fan){
        previousSpeed = fan.getSpeed();
        this.fan = fan;
    }

    @Override
    public void execute(){
        fan.medium();
    }
    
    @Override
    public void unexecute(){
        fan.setSpeed(previousSpeed);
    }

}