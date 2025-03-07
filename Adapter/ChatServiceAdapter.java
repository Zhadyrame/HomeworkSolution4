public class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void send(String user, String message) {
        String formattedMessage = user + ": " + message;
        legacyChatService.sendMessage(formattedMessage);
    }
}
