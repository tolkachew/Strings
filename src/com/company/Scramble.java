package com.company;

//Проверить, можно ли из символов одной строки собрать путем их перестановки другую строку
//Пример: rkqodlw -> world

public class Scramble {
    public static void main(String[] args) {
        String first = "rkqodlw";
        String second = "world";
        String s = "русскийё";
        System.out.println(s.toUpperCase());
        StringBuilder sb = new StringBuilder(first);
        int index2 = sb.toString().indexOf('a');
        boolean flag = true;
        for (int i = 0; i < second.length(); i++) {
            int index1 = sb.toString().indexOf(second.charAt(i));
            if (index1 == -1) flag = false;
            // else sb.delete(index1, index1 + 1);
            else sb.setCharAt(index1, ((Character) second.charAt(i)).toString().toUpperCase().charAt(0));
        }
        System.out.println(flag);
        System.out.println(sb);
    }
}
