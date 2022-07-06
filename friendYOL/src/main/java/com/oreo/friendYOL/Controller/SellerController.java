package com.oreo.friendYOL.Controller;

import com.oreo.friendYOL.Model.SellerModel;
import com.oreo.friendYOL.Service.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sellers")
public class SellerController {
    private SellerService sellerService;

    @GetMapping()
    public ResponseEntity<List<SellerModel>> getSeller() {
        return new ResponseEntity<>(sellerService.getSellers(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<SellerModel> createSeller(@RequestBody SellerModel newSeller) {
        return new ResponseEntity<>(sellerService.createSeller(newSeller), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SellerModel> getSellerById(@PathVariable Integer id) {
        return new ResponseEntity<>(sellerService.getSellerbyId(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeller(@PathVariable Integer id) {
        sellerService.deleteSeller(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSeller(@PathVariable Integer id, SellerModel newSeller) {
        sellerService.updateSeller(id, newSeller);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
