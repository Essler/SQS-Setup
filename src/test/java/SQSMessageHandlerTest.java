import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.Message;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SQSMessageHandlerTest {

    @Test
    public void testSendMessage_3Params() {
        AmazonSQS sqs = new PrimeSQS();
        SQSMessageHandler sqsMessageHandler = new SQSMessageHandler();
        sqsMessageHandler.sendMessage(sqs, "https://url.com", "This is a test message.");
    }

    @Test
    public void testSendMessage_4Params() {
        AmazonSQS sqs = new PrimeSQS();
        SQSMessageHandler sqsMessageHandler = new SQSMessageHandler();
        sqsMessageHandler.sendMessage(sqs, "https://url.com", "This is a test message.", 5);
    }

    @Test
    public void testReceiveMessages() {
        AmazonSQS sqs = new PrimeSQS();
        SQSMessageHandler sqsMessageHandler = new SQSMessageHandler();
        sqsMessageHandler.receiveMessage(sqs, "https://url.com");
    }

    @Test
    public void testDeleteMessageAfterReceipt_Single() {
        AmazonSQS sqs = new PrimeSQS();
        SQSMessageHandler sqsMessageHandler = new SQSMessageHandler();

        List<Message> messages = new ArrayList<>();
        Message message = new Message();
        message.setBody("This is the body of a single test message.");
        messages.add(message);

        sqsMessageHandler.deleteMessageAfterReceipt(sqs, "https://url.com", messages);
    }

    @Test
    public void testDeleteMessageAfterReceipt_Multi() {
        AmazonSQS sqs = new PrimeSQS();
        SQSMessageHandler sqsMessageHandler = new SQSMessageHandler();

        List<Message> messages = new ArrayList<>();
        Message message = new Message();
        message.setBody("This is the body of the first test message.");
        messages.add(message);

        message.setBody("This is the body of the second test message.");
        messages.add(message);

        sqsMessageHandler.deleteMessageAfterReceipt(sqs, "https://url.com", messages);
    }
}
