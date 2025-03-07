public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        chatService.send("Zhadyra", "Hello, world!");
    }
}

