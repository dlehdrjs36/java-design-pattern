package chainofresponsibility;

//필드가 필요하기 때문에 추상 클래스로 만든다.
public abstract class RequestHandler {
    private final RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
