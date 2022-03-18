public class StartDarknessCommand implements Command{
    /**
     * @author Bengisu Baglar 20180808061
     */

    DarknessSystem alarm;
    public StartDarknessCommand(DarknessSystem alarm){
        super();
        this.alarm = alarm;
    }

    public void execute(){
        System.out.println("Starting the darkness over the greenhouse...");
        alarm.start();
    }
}
