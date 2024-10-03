package ru.netology.services;

public class CountService {
    public int calculate(long income, long expenses, long threshold) {
        int count = 0; // счётчик месяцев отдыха
        int remainder = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (remainder >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                remainder = (int) ((remainder - expenses) / 3);
            } else {
                remainder = (int) (remainder + income - expenses);
            }
        }
        return count;
    }
}
