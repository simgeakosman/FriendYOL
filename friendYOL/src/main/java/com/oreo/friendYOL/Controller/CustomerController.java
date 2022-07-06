package com.oreo.friendYOL.Controller;

import com.oreo.friendYOL.Model.CustomerModel;
import com.oreo.friendYOL.Service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customers")
@AllArgsConstructor

public class CustomerController {
    private CustomerService customerService;

    @PostMapping()
    public ResponseEntity<CustomerModel> createCustomer(@RequestBody CustomerModel customer){
        return new ResponseEntity<>(customerService.createCustomer(customer),HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<CustomerModel>> getAllCustomer() {
        return new ResponseEntity<>(customerService.getCustomer(), HttpStatus.OK);
    }

}
