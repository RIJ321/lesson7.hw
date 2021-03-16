package com.company;

public class Main {

    class Animal {
    }

    static class Fish extends Animal {
        void swim() {
            System.out.println("Swim");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("Fly");
        }
    }

    static class Kangaroo extends Animal {
        void jump() {
            System.out.println("Jump");
        }
    }


        public static void main(String[] args) {
            makeItMove(new Fish());
            makeItMove(new Bird());
            makeItMove(new Kangaroo());
        }

        public static void makeItMove(Animal animal) {
            if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                fish.swim();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            } else if (animal instanceof Kangaroo) {
                Kangaroo kangaroo = (Kangaroo) animal;
                kangaroo.jump();
            }
        }
    }
}
