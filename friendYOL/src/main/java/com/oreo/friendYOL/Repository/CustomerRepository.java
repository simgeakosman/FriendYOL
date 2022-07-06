package com.oreo.friendYOL.Repository;

import com.oreo.friendYOL.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {

}
