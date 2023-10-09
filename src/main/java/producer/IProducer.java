package producer;

import messageQueue.IMessage;

public interface IProducer {
    Boolean produce(IMessage message);
}
