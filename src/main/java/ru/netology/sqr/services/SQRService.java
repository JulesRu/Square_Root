package ru.netology.sqr.services;

public class SQRService {

    public int calcNumbers(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                count++;
            }
        }
        return count;
    }
}
