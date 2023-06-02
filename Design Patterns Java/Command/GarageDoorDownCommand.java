public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute(){
        garageDoor.down();
        garageDoor.lightOff();
    }

    @Override
    public void unexecute(){
        garageDoor.up();
        garageDoor.lightOn();
    }
}