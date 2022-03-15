package chainofresponsibility;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("인증이 되었는지 확인");
        super.handleRequest(request);
    }
}
