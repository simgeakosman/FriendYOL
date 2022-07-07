package com.oreo.friendYOL.Service;


import com.oreo.friendYOL.DataTransferObjects.CreateProductRequest;
import com.oreo.friendYOL.Model.ProductModel;
import com.oreo.friendYOL.Model.SellerModel;
import com.oreo.friendYOL.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final SellerService sellerService;

    public ProductModel createProduct(CreateProductRequest newProduct) {
        SellerModel seller = sellerService.getSellerbyId(newProduct.getSellerId());
        ProductModel product = new ProductModel();
        product.setName(newProduct.getName());
        product.setBrand(newProduct.getBrand());
        product.setDescription(newProduct.getDescription());
        product.setPrice(newProduct.getPrice());
        product.setPictureUrl(newProduct.getPictureUrl());
        seller.getProductList().add(product);
        return productRepository.save(product);
    }

    public List<ProductModel> getProducts() {
        return productRepository.findAll();
    }

    public ProductModel getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
    }

    public void updateProduct(Integer id, ProductModel newProduct) {
      /*  ProductModel oldProduct=getProductById(id);
        oldProduct.setName(newProduct.getName());
        oldProduct.setBrand(newProduct.getBrand());
        oldProduct.setDescription(newProduct.getDescription());
        oldProduct.setPrice(newProduct.getPrice());
        oldProduct.setPictureUrl(newProduct.getPictureUrl());
        productRepository.(oldProduct);*/
        newProduct.setId(id);
        productRepository.save(newProduct);
    }
}
