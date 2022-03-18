public class GreenhouseControlRemote {
    /**
     * @author Bengisu Baglar 20180808061
     */

    Command command;

    public void setCommand(Command command){
        this.command= command;
    }

    public void buttonPressed(){
        command.execute();
    }
}
