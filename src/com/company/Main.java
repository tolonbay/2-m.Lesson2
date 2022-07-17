package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Круг",14);
        Triangle  triangle = new Triangle("Треуголник",12,12,12);
        Square square = new Square("Квадрат", 3);
        Dog dog = new Dog("Рекс");
        Cat cat =new Cat("Багира");

        Drawble[] drawables = {circle,triangle,square, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            //является ли instanceOf
            if (drawables[i] instanceof Figure){
                System.out.println(
                        ((Figure) drawables[i]).getName() + " Периметр -> " +
                                ((Figure)drawables[i]).getPerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }
//        System.out.println(circle.getName()+ "пЕРИМЕТР" + circle.getPerimeter());
//        System.out.println(triangle.getName()+ "пЕРИМЕТР" + circle.getPerimeter());
//        System.out.println(square.getName()+ "пЕРИМЕТР" + circle.getPerimeter());

    }
}
