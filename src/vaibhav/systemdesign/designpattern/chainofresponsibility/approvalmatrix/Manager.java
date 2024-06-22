package vaibhav.systemdesign.designpattern.chainofresponsibility.approvalmatrix;

public class Manager extends RequestHandler {
    @Override
    void approveRequest(int id) {
        if (id < 10) {
            System.out.println("Request approved by manager.");
        } else {
            super.approveRequest(id);
        }
    }

    @Override
    void setNext(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

}
