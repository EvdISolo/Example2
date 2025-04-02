package ru.netology.service;

public class СustomsService {
    public static final int WEIGHT_TAX_RATE = 3;

    public static int calculateCustoms(int price, int weight) {

        int Customs = price / 100 + weight * WEIGHT_TAX_RATE;
        return Customs;
    }
}