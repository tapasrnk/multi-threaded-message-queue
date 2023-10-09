package consumer;

import messageQueue.IMessage;

public class Consumer implements IConsumer {
    private String id;
    @Override
    public Boolean consume(IMessage message) {
        return null;
    }
}
