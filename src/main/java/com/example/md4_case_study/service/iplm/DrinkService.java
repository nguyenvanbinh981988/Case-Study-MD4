package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Drink;
import com.example.md4_case_study.repository.DrinkRepo;
import com.example.md4_case_study.service.IDrinkServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkService implements IDrinkServiceService {
    @Autowired
    DrinkRepo drinkRepo;
    @Override
    public List<Drink> listDrink() {
      return drinkRepo.listDrink();
    }

    @Override
    public int quantityDrink(int id) {
       return drinkRepo.quantityExist(id);
    }

    @Override
    public void updateQuantity(int id,int quantity) {
        drinkRepo.updateQuantity(id, quantity);
    }

    @Override
    public Optional<Drink> findDrinkById(int id) {
        return drinkRepo.findById(id);
    }
}
