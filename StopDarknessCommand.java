public class StopDarknessCommand implements Command{
    /**
     * @author Bengisu Baglar 20180808061
     */
    DarknessSystem alarm;
    public StopDarknessCommand(DarknessSystem alarm){
        super();
        this.alarm= alarm;
    }
    public void execute(){
        System.out.println("Stopping  darkness over the greeenhouse...");
        alarm.stop();
    }
}
