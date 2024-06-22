package vaibhav.systemdesign.designpattern.facadedesignpattern;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeFacade employeeFacade = new EmployeeFacade(new EmployeeDaoImpl());
        employeeFacade.get("client", 1);
    }
}
