package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    //15.5

    private final boolean bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;


    public static class BigmacBuilder{
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            this.ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }


    }

    private Bigmac(boolean bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }



    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
