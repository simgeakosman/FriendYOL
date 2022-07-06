package com.oreo.friendYOL.Service;

import com.oreo.friendYOL.DataTransferObjects.CreateOrderRequest;
import com.oreo.friendYOL.Model.OrderModel;
import com.oreo.friendYOL.Repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerService customerService;

    private final ProductService productService;

    public OrderModel createOrder(CreateOrderRequest order) {

        OrderModel newOrder = new OrderModel();
        newOrder.setCustomerModel(customerService.getCustomerById(order.getCustomerId()));
        newOrder.setProductModel(productService.getProductById(order.getProductId()));
        return orderRepository.save(newOrder);
    }

    public List<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<OrderModel> getOrderByCustomerId(Integer id) {
        return orderRepository.findAll()
                .stream().filter(p -> p.getCustomerModel().getId().equals(id))
                .collect(Collectors.toList());
    }
}
