package customerUI;

import dto.CustomerDTO;
import manager.CustomerManager;

public class RegisterCustomerCommand implements CustomerCommand {

    //Attributes
    private final CustomerDTO customerDTO;
    private final CustomerManager customerManager;

    //Methods
    public RegisterCustomerCommand(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
        customerManager = new CustomerManager();
    }

    //Overide method
    @Override
    public Object execute() {
        return customerManager.registerCustomer(customerDTO);
    }

}
