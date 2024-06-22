package vaibhav.systemdesign.designpattern.facadedesignpattern;


// this facade class hides the delete functionality and only get and create functionality is provided to the client;
public class EmployeeFacade {

    EmployeeDao employeeDaoImpl;

    EmployeeFacade(EmployeeDao employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    public Employee get(String client, int employeeId) throws Exception {
        return employeeDaoImpl.get(client, employeeId);

    }

    public void create(String client, Employee obj) throws Exception {
        employeeDaoImpl.create(client, obj);
    }
}
