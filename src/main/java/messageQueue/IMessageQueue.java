package messageQueue;
public interface IMessageQueue {
    String addTopic(Integer numberOfPartitions);
    Boolean publish(IMessage message);
}
