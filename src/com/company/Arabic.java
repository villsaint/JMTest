package com.company;

public class Arabic extends Number {
    private final String[] arg;
    private int a;
    private int b;

    public Arabic(String[] s) {
        this.arg = s;
    }

    private void proverka() {
        a = Integer.parseInt(arg[0]);
        b = Integer.parseInt(arg[2]);
        if ((a < 1 || a > 10) || (b < 1 || b > 10)) throw new RuntimeException("Введите корректные числа");
//        if (b<1 || b>10) throw new  RuntimeException("Второе число вне диапазона");
    }

    @Override
    public void result() {
        proverka();

        switch (arg[1]) {
            case ("+"):
                System.out.println(a + b);
                break;

            case ("-"):
                System.out.println(a - b);
                break;

            case ("/"):
                System.out.println(a / b);
                break;
            case ("*"):
                System.out.println(a * b);
                break;
            default:
                throw new RuntimeException("Неправильный арифметический знак");
        }


    }


}
