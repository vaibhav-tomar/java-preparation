package vaibhav.systemdesign.designpattern.chainofresponsibility.approvalmatrix;

public class Director extends RequestHandler {

    @Override
    void setNext(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    @Override
    void approveRequest(int id) {
        if (id > 20 & id < 30) {
            System.out.println("Request approved by director");
        } else {
            super.approveRequest(id);
        }
    }
}
