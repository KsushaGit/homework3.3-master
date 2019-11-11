package com.company;

import java.util.Random;

class Girl extends Human {

    boolean gender = false;


    public Girl(String name, String surname, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }


    @Override
    boolean talk(Human human) {
//        if (human.gender==true){
//            return true;
//        }else{
//            return true;
//        }
        return true;
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
        return true;
    }

    @Override
    public String toString() {
        return "Girl " + super.toString();
    }


    public Human giveBirth() {
        Random random = new Random();
        boolean childGender = random.nextBoolean();
        if (childGender) return new Man("  dfsdhg", "surname", 4358,545);
        else return  new Girl("name", "surname", 45,67);
    }

}
