package com.oreo.friendYOL.Repository;

import com.oreo.friendYOL.Model.CustomerModel;
import com.oreo.friendYOL.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Integer> {

    List<OrderRepository> findByCustomerModel(Integer customerId);
}
