package com.company;

import java.util.Random;

public class Man extends Human {

    Boolean gender = true;


    public Man(String name, String surname, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    boolean talk(Human human) {
        if (human.gender == false) {
            return true;
        } else {
            Random random = new Random();
            return random.nextBoolean();
        }
    }

    @Override
    boolean tolerate(Human human) {
        if (human.gender==false){
            Random random = new Random();//todo replace random.nextBoolean with random from int
            return random.nextBoolean();
        } else {
            Random random = new Random();//todo replace random.nextBoolean with random from int
            return random.nextBoolean();
        }
    }

    @Override
    boolean togeter(Human human) {
        return false;
    }

    @Override
    public String toString() {
        return "Man " + super.toString();
    }


//  Man man = new Man (name: "Boris", String surname, float height, float weight, gender:true){
    // super(); // ыызываем констурктор из Human

}



