package observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("userA");
        User user2 = new User("userB");

        //구독
        chatServer.register("블랙리스트", user1);
        chatServer.register("블랙리스트", user2);

        //구독
        chatServer.register("디자인패턴", user1);
        chatServer.register("디자인패턴", user2);

        chatServer.sendMessage(user1, "블랙리스트", "스튜메이커");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");

        chatServer.unregister("디자인패턴", user2);

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 장, 단점 보는 중");
    }
}
