package messageQueue;

import consumer.IConsumer;

import java.util.List;

public class Partition {
    private String id;
    private List<IMessage> messages;
    private Integer offset;
    private List<IConsumer> consumers;
}
