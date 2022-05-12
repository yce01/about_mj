package com.company.teams;

import com.company.model.Food;
import com.company.model.FoodIngredient;
import com.company.things_they_do.IClean;
import com.company.things_they_do.IPray;

import java.util.List;

public class Kitchen implements IClean, IPray {
    private List<FoodIngredient> ingredients;
    private List<Food> foods;

    public void setIngredients(List<FoodIngredient> ingredients) {
        this.ingredients = ingredients;
    }
    public List<FoodIngredient> getIngredients() {
        return ingredients;
    }
    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
    public List<Food> getFoods() {
        return foods;
    }

    @Override
    public void clean() {
        System.out.println("팜키친 청소");
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    public List<FoodIngredient> buyFoodIngredient(){
        return ingredients;
    }
    public List<Food> cook(List<FoodIngredient> ingredients){
        return foods;
    }
    public void doTheDish(){
        System.out.println("설거지 하기");
    }
}
