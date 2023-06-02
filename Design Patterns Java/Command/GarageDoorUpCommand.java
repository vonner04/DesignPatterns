public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute(){
        garageDoor.up();
        garageDoor.lightOn();
    }
    
    @Override
    public void unexecute(){
        garageDoor.down();
        garageDoor.lightOff();
    }
}
