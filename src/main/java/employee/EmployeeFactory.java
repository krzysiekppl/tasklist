package employee;

public class EmployeeFactory {

    public Employee create (EmployeeType employeeType,int id, String fullName, String externalId){

        if (EmployeeType.Technican.equals(employeeType)){
            return new Technican(id,fullName,externalId,employeeType);
        }
        else if(EmployeeType.Dispatcher.equals(employeeType)){
            return new Dispatcher(id,fullName,externalId,employeeType);
        }
     return null;
    }
}
