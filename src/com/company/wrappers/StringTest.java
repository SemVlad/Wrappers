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
        String str1 = "Апельсин,Яблоко,Гранат,Груша";
        String[] str2 = str1.split(",");      // Делим строку по признаку и создаем масив строк
        int[] num = new int[str2.length];           // Массив с количеством символов в каждом слове
        for (int i = 0; i < str2.length; i++) {
            num[i] = str2[i].length();
            System.out.println(num[i]);
        }

        // Ищем самое длинное слово по количеству символов в нем
        int max = num[3];
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
                System.out.println("Максимальная длинна слова в массиве под индексом = " + j);
                System.out.println("Этому индексу соответствует слово - " + str2[j].toLowerCase()); // нижний регистр

                // Выводим "обрезанную" строку)
                System.out.println(str2[j].substring(0, 3));
            }
        }

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
                System.out.println("ще на підльоті...");
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
        bd.append(str1);

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
