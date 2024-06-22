package vaibhav.systemdesign.designpattern.chainofresponsibility.approvalmatrix;

public class SeniorManger extends RequestHandler {
    @Override
    void setNext(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    @Override
    void approveRequest(int id) {
        if (id > 10 && id < 20) {
            System.out.println("Request approved by senior manager");
        } else {
            super.approveRequest(id);
        }
    }
}
