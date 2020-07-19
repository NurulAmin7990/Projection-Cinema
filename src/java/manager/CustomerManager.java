package manager;

import dto.CustomerDTO;
import gateway.CustomerGateway;
import javax.faces.context.FacesContext;

public class CustomerManager {

    //Attributes
    private CustomerGateway customerGateway = new CustomerGateway();

    //Methods
    public boolean registerCustomer(CustomerDTO customerDTO) {
        return customerGateway.registerCustomer(customerDTO);
    }
    
}
