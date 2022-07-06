package com.oreo.friendYOL.Service;

import com.oreo.friendYOL.Model.ProductModel;
import com.oreo.friendYOL.Model.SellerModel;
import com.oreo.friendYOL.Repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;

    public SellerModel createSeller(SellerModel newProduct) {
        return sellerRepository.save(newProduct);
    }

    public List<SellerModel> getSellers() {
        return sellerRepository.findAll();
    }

    public SellerModel getSellerbyId(Integer id) {
        return sellerRepository.findById(id).orElseThrow(() -> new RuntimeException("Seller not found!"));
    }

    public void deleteSeller(Integer id) {
        sellerRepository.deleteById(id);
    }

    public void updateSeller(Integer id, SellerModel newSeller) {
        newSeller.setId(id);
        sellerRepository.save(newSeller);
    }
}
