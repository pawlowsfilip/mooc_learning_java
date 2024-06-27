import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messagingService;

    public MessagingService(){
        this.messagingService = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280){
            this.messagingService.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messagingService;
    }
}
