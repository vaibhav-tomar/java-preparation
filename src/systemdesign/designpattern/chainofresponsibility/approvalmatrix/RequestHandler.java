package systemdesign.designpattern.chainofresponsibility.approvalmatrix;

public abstract class RequestHandler {

    RequestHandler nextRequestHandler;

    abstract void setNext(RequestHandler nextRequestHandler);

    void approveRequest(int id) {
        if (nextRequestHandler != null) {
            nextRequestHandler.approveRequest(id);
        } else {
            System.out.println("This request cant be approved");
        }
    }
}
