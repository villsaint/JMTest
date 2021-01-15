package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();


        while (stroka.contains("  ")) {
            stroka = stroka.replace("  ", " ");
        }
        String[] b = stroka.split(" ");
        if (b.length != 3) throw new RuntimeException("Выражение должно содержать 2 числа и знак между ними");

        Number numb;
        try {
            Integer.parseInt(b[0]);
            Integer.parseInt(b[2]);

            numb = new Arabic(b);

        } catch (NumberFormatException e) {
            numb = new Rome(b);

        }
        numb.result();
    }


}

