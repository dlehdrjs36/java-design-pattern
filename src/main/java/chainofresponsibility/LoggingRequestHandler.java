package chainofresponsibility;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("로깅");
        super.handleRequest(request);
    }
}
