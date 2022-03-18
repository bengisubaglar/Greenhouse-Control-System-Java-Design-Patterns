public class StartCoolingSystemCommand implements Command{
    /**
     * @author Bengisu Baglar 20180808061
     */
    CoolingSystem alarm;

    public StartCoolingSystemCommand(CoolingSystem alarm){
        super();
        this.alarm= alarm;
    }

    public void execute(){
        System.out.println("Starting the Cooling System...");
        alarm.start();
    }
}
