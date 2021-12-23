package com.example.designPattern.chainOfResponsibility.after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    /*클라이언트는 본인이 어떤 핸들러를 사용하는지 구체적으로 알 필요가 없다.*/
    public void doWork(){
        Request request = new Request("요청을 부탁합니다.:인증OK");
        requestHandler.handle(request);
    }

    /*외부에서 chain을 조립한다.*/
    public static void main(String[] args) {
        // 1.Auth  2.Logging  3.Print
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
