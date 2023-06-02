public class FanLowCommand implements Command{

    private Fan fan;
    private int previousSpeed;

    public FanLowCommand(Fan fan){
        previousSpeed = fan.getSpeed();
        this.fan = fan;
    }

    @Override
    public void execute(){
        fan.low();
    }

    @Override
    public void unexecute(){
        fan.setSpeed(previousSpeed);
    }

    

}