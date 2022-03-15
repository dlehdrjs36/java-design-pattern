package chainofresponsibility;

public class Client {

    //클라이언트 코드 영역
    private final RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handleRequest(request);
    }
    //클라이언트 코드 영역 종료
    //main 위에까지만 클라이언트라고 생각하자.
    public static void main(String[] args) {
        //체인 조립, 이 작업은 외부에서 해도된다.
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        //클라이언트에서 처리 요청
        Client client = new Client(chain);
        client.doWork();
    }
}
