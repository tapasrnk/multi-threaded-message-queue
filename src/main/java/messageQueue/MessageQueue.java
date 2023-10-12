package messageQueue;

public class MessageQueue implements IMessageQueue{
    private static MessageQueue instance;
    private ITopic topics;
    private MessageQueue() {}
    public static MessageQueue getInstance() {
        if (instance == null) {
            instance = new MessageQueue();
        }
        return instance;
    }
    @Override
    public String addTopic(Integer numberOfPartitions) {
        return null;
    }

    @Override
    public Boolean publish(IMessage message) {
        return null;
    }
}
