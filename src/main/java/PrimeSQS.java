import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.*;

import java.util.List;
import java.util.Map;

public class PrimeSQS implements AmazonSQS {

    private String endpoint;
    private Region region;

    public void setEndpoint(String s) {
        this.endpoint = s;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest) {
        return null;
    }

    public AddPermissionResult addPermission(String s, String s1, List<String> list, List<String> list1) {
        return null;
    }

    public ChangeMessageVisibilityResult changeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {
        return null;
    }

    public ChangeMessageVisibilityResult changeMessageVisibility(String s, String s1, Integer integer) {
        return null;
    }

    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {
        return null;
    }

    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(String s, List<ChangeMessageVisibilityBatchRequestEntry> list) {
        return null;
    }

    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest) {
        return null;
    }

    public CreateQueueResult createQueue(String s) {
        return null;
    }

    public DeleteMessageResult deleteMessage(DeleteMessageRequest deleteMessageRequest) {
        return null;
    }

    public DeleteMessageResult deleteMessage(String s, String s1) {
        return null;
    }

    public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest) {
        return null;
    }

    public DeleteMessageBatchResult deleteMessageBatch(String s, List<DeleteMessageBatchRequestEntry> list) {
        return null;
    }

    public DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest) {
        return null;
    }

    public DeleteQueueResult deleteQueue(String s) {
        return null;
    }

    public GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest) {
        return null;
    }

    public GetQueueAttributesResult getQueueAttributes(String s, List<String> list) {
        return null;
    }

    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) {
        return null;
    }

    public GetQueueUrlResult getQueueUrl(String s) {
        return null;
    }

    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) {
        return null;
    }

    public ListQueueTagsResult listQueueTags(ListQueueTagsRequest listQueueTagsRequest) {
        return null;
    }

    public ListQueueTagsResult listQueueTags(String s) {
        return null;
    }

    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) {
        return null;
    }

    public ListQueuesResult listQueues() {
        return null;
    }

    public ListQueuesResult listQueues(String s) {
        return null;
    }

    public PurgeQueueResult purgeQueue(PurgeQueueRequest purgeQueueRequest) {
        return null;
    }

    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest) {
        return null;
    }

    public ReceiveMessageResult receiveMessage(String s) {
        return null;
    }

    public RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest) {
        return null;
    }

    public RemovePermissionResult removePermission(String s, String s1) {
        return null;
    }

    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest) {
        return null;
    }

    public SendMessageResult sendMessage(String s, String s1) {
        return null;
    }

    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) {
        return null;
    }

    public SendMessageBatchResult sendMessageBatch(String s, List<SendMessageBatchRequestEntry> list) {
        return null;
    }

    public SetQueueAttributesResult setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest) {
        return null;
    }

    public SetQueueAttributesResult setQueueAttributes(String s, Map<String, String> map) {
        return null;
    }

    public TagQueueResult tagQueue(TagQueueRequest tagQueueRequest) {
        return null;
    }

    public TagQueueResult tagQueue(String s, Map<String, String> map) {
        return null;
    }

    public UntagQueueResult untagQueue(UntagQueueRequest untagQueueRequest) {
        return null;
    }

    public UntagQueueResult untagQueue(String s, List<String> list) {
        return null;
    }

    public void shutdown() {

    }

    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }
}
