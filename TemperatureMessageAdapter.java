public class TemperatureMessageAdapter implements Message{
    /**
     * @author Bengisu Baglar 20180808061
     */
    private TemperatureMessage adaptee;
    public TemperatureMessageAdapter(TemperatureMessage tempMessage){
        this.adaptee= tempMessage;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from Temperature Adapter : " +message);
    }
}
