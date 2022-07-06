package com.oreo.friendYOL.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreatedDate
    private Date dateCreated;

    @OneToOne()
    @JoinColumn(name = "customer_id")
    private CustomerModel customerModel;

    @OneToOne()
    @JoinColumn(name = "product_id")
    private ProductModel productModel;


}
