import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import java.util.List;

public class SQSMessageHandler {

    public void sendMessage(AmazonSQS sqs, String queueUrl, String message) {
        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(message)
                .withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
    }

    public void sendMessage(AmazonSQS sqs, String queueUrl, String message, int delaySeconds) {
        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(message)
                .withDelaySeconds(delaySeconds);
        sqs.sendMessage(send_msg_request);
    }

    public List<Message> receiveMessage(AmazonSQS sqs, String queueUrl) {
        return sqs.receiveMessage(queueUrl).getMessages();
    }

    public void deleteMessageAfterReceipt(AmazonSQS sqs, String queueUrl, List<Message> messages) {
        for (Message m : messages) {
            sqs.deleteMessage(queueUrl, m.getReceiptHandle());
        }
    }
}
