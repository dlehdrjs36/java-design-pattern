package chainofresponsibility;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println(request.getBody());
        super.handleRequest(request);
    }
}
