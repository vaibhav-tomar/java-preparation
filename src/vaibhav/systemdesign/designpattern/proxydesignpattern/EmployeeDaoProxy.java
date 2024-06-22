package vaibhav.systemdesign.designpattern.proxydesignpattern;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDao;

    EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {

        if (client.equals("ADMIN")) {
            employeeDao.create(client, new Employee());
        } else {
            throw new Exception("Access denied");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, employeeId);
        } else {
            throw new Exception("Access denied");
        }
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            employeeDao.get(client, employeeId);
        } else {
            throw new Exception("Access denied");
        }
        return null;
    }
}
