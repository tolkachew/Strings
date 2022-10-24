package com.company;

public class Strings {
    public static void main(String[] args) {
        String s1 = "first", s2 = "first";
        StringBuilder sb = new StringBuilder("first");
        String s3 = sb.toString();
        System.out.println(s1.compareTo(s2));

        System.out.println(s1.equals(s3));

        String left = s1.substring(2,4);
        System.out.println(left);

        // собрать строку из символов
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String s4 = ""+c1+c2+c3+c4+c5+c6+c7+c8; //добавить кавычки для сложения
        System.out.println(s4);

        System.out.printf("Symbol:%c, number:%d%n", c2, (int) c2);

        // String s5 = s1+s2;
        StringBuilder sb2 = new StringBuilder(s1);
        sb2.append(s2);
        String s5 = sb.toString();

        // String s5 = s1.concat(s4);
        System.out.println(sb2);

        //Содержит ли строка только цифры
        System.out.println(isOnlyDigits("123"));

        //Хеш код строки
        System.out.println(s1.hashCode());

        //Заменить сомвол в строке
        String s6 = "machine.";
        String s7 = s6.replace('.','!');
        System.out.println(s7);

        //Удалить все символы из выражения
        String s8 = "{w}{{sdf}}";
        String s9 = s8.replaceAll("[{ }]","");
        System.out.println(s9);

        s8 = "   word   ";
        System.out.println(s8);
        s8 = s8.trim();
        System.out.println(s8);


    }
    static boolean isOnlyDigits(String s){
        boolean result = true;
        for (int i = 0;i<s.length();i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
            return true;
    }
}
