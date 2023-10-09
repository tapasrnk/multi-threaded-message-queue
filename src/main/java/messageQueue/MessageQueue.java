package messageQueue;

public class MessageQueue implements IMessageQueue{
    private ITopic topics;

    @Override
    public String addTopic(Integer numberOfPartitions) {
        return null;
    }

    @Override
    public Boolean publish(IMessage message) {
        return null;
    }
}
