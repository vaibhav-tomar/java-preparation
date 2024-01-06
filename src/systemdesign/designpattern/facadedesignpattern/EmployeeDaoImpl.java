package systemdesign.designpattern.facadedesignpattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("creating new employee");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleting employee with id " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("fetching employee with id " + employeeId);
        return new Employee();

    }
}
