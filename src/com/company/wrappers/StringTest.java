package com.company.wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        // Создаем строки разными способами
        String st1 = "Привет";
        String st2 = new String("Байрактар");

        // Массив символов
        char[] st3 = {'d', 'd', 't'};
        String st4 = new String(st3);

        // Из байта
        String st5 = "dfa";
        String st6 = new String(st5.getBytes());

        // С помощью StringBuilder
        StringBuilder st7 = new StringBuilder("fdasf");
        String st8 = st7.toString();

        // Работа со строкой
        // Ищем самое длинное слово
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitNames = fruits.split(",");      // Делим строку по признаку и создаем масив строк
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < fruitNames.length; i++) {
            if (fruitNames[i].length() > maxLength) {
                maxLength = fruitNames[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное название фрукта: " + fruitNames[index].toLowerCase());
        System.out.println(fruitNames[index].substring(0,3));   // "Обрезанный" фрукт )

        // Играемся со строкой
        String newStr = "  Я_новая_строка   ";
        System.out.println(newStr.trim().replace("_", " "));

        // Работаем со сканером
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        System.out.println("Вы ввели: " + text);

        // В смысл вводимой фразы заложен запуск "чего-то" на мордовию)
        String[] arrText = text.split(" ");         // Разбиваем на масив для дальнейшей проверки
        String wordStart = "Запуск";
        String wordEnd = "завершен";
        String wordErr = "ошибка";
        if (arrText[0].equals(wordStart)) {             // Начало проверок
            System.out.println("Запускаем процесс");
        } else {
            System.out.println("може москалям повезло?");
            if (arrText[arrText.length - 1].equals(wordEnd)) {
                System.out.println("Процесс завершен... не повезло)");
            } else {
                System.out.println("ще на підльоті?...");
            }
            for (String s : arrText) {
                if (s.equalsIgnoreCase(wordErr)) {
                    System.out.println("Произошла ошибка " + "какая досада...");
                }
            }
            System.out.println(".....");
        }

        // Работа с StringBuilder
        StringBuilder bd = new StringBuilder();
        bd.append(st1).append(st2).append(st3).append('\n');
        bd.append(st4).append(st5).append(st6).append('\n');
        bd.append(st7).append(st8).append(newStr).append('\n');
        bd.append(wordEnd).append(wordErr).append(wordStart).append('\n');
        bd.append(fruits);

        bd.reverse();   // Разворачиваем все задом на перед

        // Делаем все в одну строчку
        for (int i = 0; i < bd.length(); i++) {
            if (String.valueOf(bd.charAt(i)).equals("\n")) {
                bd.deleteCharAt(i);
            }
        }
        System.out.println(bd);
    }
}
