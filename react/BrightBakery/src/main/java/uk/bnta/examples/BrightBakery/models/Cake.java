package uk.bnta.examples.BrightBakery.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cakes")
public class Cake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cakeName")
    private String cakeName;

    @ManyToMany
    @JsonIgnoreProperties({"cakes"})
    @JoinTable(
            name = "cake_ingredients",
            joinColumns = @JoinColumn(name = "cake_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> ingredients;

    @Column(name = "rating")
    private int rating;

    public Cake(String cakeName, int rating) {
        this.cakeName = cakeName;
        this.rating = rating;
        this.ingredients = new ArrayList<>();
    }

    public Cake() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void addIngredient(Ingredient newIngredient){
        this.ingredients.add(newIngredient);
    }
}
