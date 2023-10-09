package consumer;

import messageQueue.IMessage;

public interface IConsumer {
    Boolean consume(IMessage message);
}
