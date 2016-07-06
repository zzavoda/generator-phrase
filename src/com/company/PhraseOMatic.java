package com.company;

public class PhraseOMatic {

    public static void main(String[] args) {

        String[] wordListOne = {"самый", "супер", "очень", "слишком", "офигительно", "невероятно", "фантастически", "удивительно"};
        String[] worldListTwo = {"смелый", "талантливый", "крутой", "сильный", "красивый", "умный", "чокнутый", "гениальный"};
        String[] worldListThree = {"мужик", "чувак", "программист", "челоловек", "хрен", "перец", "кодер"};

        int oneLength = wordListOne.length;
        int twoLenght = worldListTwo.length;
        int threeLenght = worldListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];

        System.out.println("Вадя - " + phrase);

    }
}
