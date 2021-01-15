package com.company;

import java.util.HashMap;
import java.util.Map;

public class Rome extends Number {

    private final String[] arg;
    private int a;
    private int b;


    public Rome(String[] s) {
        this.arg = s;
    }

    private Map<Integer, String> mapVivod() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        return map;

    }

    private Map<String, Integer> zapolnenie() {
        Map<String, Integer> number = new HashMap<>();
        number.put("I", 1);
        number.put("II", 2);
        number.put("III", 3);
        number.put("IV", 4);
        number.put("V", 5);
        number.put("VI", 6);
        number.put("VII", 7);
        number.put("VIII", 8);
        number.put("IX", 9);
        number.put("X", 10);
        return number;
    }

    private Map<Integer, String> zapolnenie10() {
        Map<Integer, String> number10 = new HashMap<>();
        number10.put(1, "X");
        number10.put(2, "XX");
        number10.put(3, "XXX");
        number10.put(4, "XL");
        number10.put(5, "L");
        number10.put(6, "LX");
        number10.put(7, "LXX");
        number10.put(8, "LXXX");
        number10.put(9, "XC");
        number10.put(10, "C");
        return number10;

    }

    private void proverka() {
        Map<String, Integer> map = zapolnenie();

        boolean b1 = map.containsKey(arg[0]);
        boolean b2 = map.containsKey(arg[2]);

        if (b1 == true && b2 == true) {
            a = map.get(arg[0]);
            b = map.get(arg[2]);
        } else {
            throw new RuntimeException("Введите корректные числа");
        }

    }

    @Override
    public void result() {
        proverka();
        int result = 0;

        switch (arg[1]) {
            case ("+"):
                result = a + b;
                break;

            case ("-"):
                result = a - b;
                break;

            case ("/"):
                result = a / b;
                break;

            case ("*"):
                result = a * b;
                break;
            default:
                throw new RuntimeException("Неправильный арифметический знак");
        }

        Map<Integer, String> map10 = zapolnenie10();
        Map<Integer, String> map1 = mapVivod();

        int cel = Math.abs(result / 10);
        int ost = Math.abs(result % 10);


        String stroka = "";
        if (result < 0) stroka += "-";
        if (cel > 0) stroka += map10.get(cel);
        if (ost > 0) stroka += map1.get(ost);
        if (result == 0) System.out.println("N");
        System.out.println(stroka);


    }


}
