package com.oreo.friendYOL.Repository;

import com.oreo.friendYOL.Model.SellerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerModel, Integer> {
}
