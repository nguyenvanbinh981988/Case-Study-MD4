package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Drink;
import com.example.md4_case_study.repository.DrinkRepo;
import com.example.md4_case_study.service.IDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrinkService implements IDrinkService {
    @Autowired
    DrinkRepo drinkRepo;
    @Override
    public List<Drink> listDrink() {
      return drinkRepo.listDrink();
    }
}
