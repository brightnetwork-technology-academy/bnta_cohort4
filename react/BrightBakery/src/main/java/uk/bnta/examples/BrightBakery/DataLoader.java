package uk.bnta.examples.BrightBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import uk.bnta.examples.BrightBakery.models.Cake;
import uk.bnta.examples.BrightBakery.models.Ingredient;
import uk.bnta.examples.BrightBakery.repositories.CakeRepository;
import uk.bnta.examples.BrightBakery.repositories.IngredientRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CakeRepository cakeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    public void run(ApplicationArguments args){

        Ingredient eggs = new Ingredient("eggs");
        ingredientRepository.save(eggs);

        Ingredient butter = new Ingredient("butter");
        ingredientRepository.save(butter);

        Ingredient lemonZest = new Ingredient("lemon zest");
        ingredientRepository.save(lemonZest);

        Ingredient sugar = new Ingredient("sugar");
        ingredientRepository.save(sugar);

        Ingredient selfRaising = new Ingredient("self-raising flour");
        ingredientRepository.save(selfRaising);

        Ingredient oil = new Ingredient("oil");
        ingredientRepository.save(oil);

        Ingredient fruit = new Ingredient("dried fruit");
        ingredientRepository.save(fruit);

        Ingredient chocolate = new Ingredient("chocolate");
        ingredientRepository.save(chocolate);

        Ingredient carrots = new Ingredient("carrots");
        ingredientRepository.save(carrots);

        Ingredient walnuts = new Ingredient("walnuts");
        ingredientRepository.save(walnuts);

        Ingredient creamCheese = new Ingredient("cream cheese");
        ingredientRepository.save(creamCheese);

        Ingredient tea = new Ingredient("strong tea");
        ingredientRepository.save(tea);

        Ingredient flour = new Ingredient("flour");
        ingredientRepository.save(flour);

        Cake lemonDrizzle = new Cake("Lemon Drizzle", 5);
        lemonDrizzle.addIngredient(eggs);
        lemonDrizzle.addIngredient(butter);
        lemonDrizzle.addIngredient(lemonZest);
        lemonDrizzle.addIngredient(sugar);
        lemonDrizzle.addIngredient(selfRaising);
        cakeRepository.save(lemonDrizzle);

        Cake teaLoaf = new Cake("Tea Loaf", 3);
        teaLoaf.addIngredient(eggs);
        teaLoaf.addIngredient(oil);
        teaLoaf.addIngredient(fruit);
        teaLoaf.addIngredient(sugar);
        teaLoaf.addIngredient(selfRaising);
        teaLoaf.addIngredient(tea);
        cakeRepository.save(teaLoaf);

        Cake brownie = new Cake("brownie", 4);
        brownie.addIngredient(chocolate);
        brownie.addIngredient(eggs);
        brownie.addIngredient(flour);
        brownie.addIngredient(butter);
        brownie.addIngredient(walnuts);
        cakeRepository.save(brownie);

       Cake carrotCake = new Cake("Carrot Cake", 5);
       carrotCake.addIngredient(carrots);
       carrotCake.addIngredient(walnuts);
       carrotCake.addIngredient(oil);
       carrotCake.addIngredient(creamCheese);
       carrotCake.addIngredient(flour);
       carrotCake.addIngredient(sugar);
       cakeRepository.save(carrotCake);

    }

}
