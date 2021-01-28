package com.nourish1709.homework17.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    private static final String[] companies = new String[]{"Samsung", "Asus", "Xiaomi", "Dell", "HP", "Lenovo", "Razer"};
    private static final String[] modelNames = new String[]{"Envy", "Pro", "XPS", "Zenphyrus", "Dragonfly", "Chromebook", "Blade", "Spectre", "Aero"};
    private static final String[] modelNumbers = new String[]{"X360", "16", "13", "G14", "713", "15", "G5", ""};
    private static final String[] manufacturers = new String[]{"Taiwan", "China", "United States", "Spain", "Canada", "Brazil", "Indonesia"};
    private static final String[] cpuBrands = new String[]{"Intel", "AMD"};
    private static final String[] cpuNames = new String[]{"5900X", "3950X", "3600X", "3100", "i5", "i7", "i9"};
    private static final int[] memories = new int[]{2, 4, 8, 16, 32};
    private static final String[] materials = new String[]{"plastic", "metal", "steel", "stainless steel", "gold", "silver"};
    private static final Date startOfProduction = new GregorianCalendar(2015, 1, 10).getTime();

    public static String getModel() {
        return companies[getRandomInt(companies.length)] + " " + modelNames[getRandomInt(modelNames.length)] + " " +
                modelNumbers[getRandomInt(modelNumbers.length)];
    }

    public static String getManufacturer() {
        return manufacturers[getRandomInt(manufacturers.length)];
    }

    public static String getCpu() {
        return cpuBrands[getRandomInt(cpuBrands.length)] + " " + cpuNames[getRandomInt(cpuNames.length)];
    }

    public static int getMemory() {
        return memories[getRandomInt(memories.length)];
    }

    public static boolean getUsed() {
        return new Random().nextBoolean();
    }

    public static String getMaterial() {
        return materials[getRandomInt(materials.length)];
    }

    public static int getPrice() {
        return getRandomInt(40000) + 8000;
    }

    public static Date getDate() {
        long startMillis = startOfProduction.getTime();
        long endMillis = new Date().getTime();
        long randomMillis = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);
        return new Date(randomMillis);
    }

    public static int getRandomInt(int length) {
        return new Random().nextInt(length);
    }
}
