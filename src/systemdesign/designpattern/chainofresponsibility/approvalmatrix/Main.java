package systemdesign.designpattern.chainofresponsibility.approvalmatrix;

public class Main {
    public static void main(String[] args) {
        RequestHandler manager = new Manager();
        RequestHandler seniorManger = new SeniorManger();
        RequestHandler director = new Director();
        manager.setNext(seniorManger);
        seniorManger.setNext(director);
        manager.approveRequest(25);
    }
}
