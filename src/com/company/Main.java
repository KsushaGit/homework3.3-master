package com.company;

public class Main {

    public static void main(String[] args) {

        Girl girl1 = new Girl(" sdfjsfh", "gfhf", 34, 45);
        Man man1 = new Man("ïtra  ", "bhvh", 66, 77);

        System.out.println(girl1);
        System.out.println(man1);
        checkConcate(girl1, man1);

        // write your ode here


    }

    private static Human checkConcate(Human human1, Human human2) {

        if (human1 == null || human2 == null || human1 == human2) return null;
        Human result = human1.haveRelationship(human2);
        System.out.println("Result  :"+result);
        return result;

    }


}
