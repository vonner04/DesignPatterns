public class FanHighCommand implements Command{

    private Fan fan;
    private int previousSpeed;

    public FanHighCommand(Fan fan){
        previousSpeed = fan.getSpeed();
        this.fan = fan;
    }

    @Override
    public void execute(){
        fan.high();
    }

    @Override
    public void unexecute(){
        fan.setSpeed(previousSpeed);
    }

}