package com.oreo.friendYOL.Service;

import com.oreo.friendYOL.Model.CustomerModel;
import com.oreo.friendYOL.Repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerModel createCustomer(CustomerModel newCustomer) {
        return customerRepository.save(newCustomer);
    }

    public List<CustomerModel> getCustomer() {
        return customerRepository.findAll();
    }

    public CustomerModel getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer Not Found"));
    }

}
