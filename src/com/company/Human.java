package com.company;
//import java.util.Objects;

public abstract class Human {

    public String name;
    public String surname;
    public float height;
    public float weight;
    boolean gender; //true - man, false - woman


    abstract boolean talk(Human human);

    abstract boolean tolerate(Human human);

    abstract boolean togeter(Human human);

    public Human haveRelationship(Human human) {
        if (talk(human) && tolerate(human) && togeter(human)) {
            if (this.gender == human.gender) {
                return null;
            } else {
                if (this.gender==false){
                    ((Girl)this).giveBirth();
                }else {
                    ((Girl)human).giveBirth();
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }
}
