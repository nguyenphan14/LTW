package com.nguyenph.taco.repository;

import com.nguyenph.taco.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
