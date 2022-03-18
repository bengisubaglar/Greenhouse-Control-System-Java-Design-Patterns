public class HumidityMessageAdapter implements Message{
    /**
     * @author Bengisu Baglar 20180808061
     */


    private HumidityMessage adaptee;

    public HumidityMessageAdapter(HumidityMessage humMessage){
        this.adaptee = humMessage;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from Humidity Adapter : " + message);
    }
}
