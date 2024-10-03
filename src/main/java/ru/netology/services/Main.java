package ru.netology.services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CountService service = new CountService();
        long income = 10_000;
        long expenses = 3_000;
        long threshold = 20_000;

        int count = service.calculate(income, expenses, threshold);

        System.out.println(count);

    }
}
