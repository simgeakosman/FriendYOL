package com.oreo.friendYOL.Controller;

import com.oreo.friendYOL.DataTransferObjects.CreateOrderRequest;
import com.oreo.friendYOL.Model.OrderModel;
import com.oreo.friendYOL.Service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    @PostMapping()
    public ResponseEntity<OrderModel> createOrder(@RequestBody CreateOrderRequest order) {
        return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<OrderModel>> getAllOrders(){

        return new ResponseEntity<>(orderService.getAllOrders(),HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public List<OrderModel> getOrderByCustomerId(@PathVariable Integer id){
        return orderService.getOrderByCustomerId(id);
    }
}
