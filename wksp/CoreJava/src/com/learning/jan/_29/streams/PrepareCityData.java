package com.learning.jan._29.streams;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
public class PrepareCityData {
    private static final long ONE_DAY_MS = 1000*60*60*24;
    private static final Random RANDOM = new Random();
    public static List<City> prepareData(
            int numCities, int numTemps) {
        List<City> cities = new ArrayList<>();
        IntStream.range(0, numCities).forEach( i ->
                cities.add(new City( generateName(),
                                generateTemperatures(numTemps)
                        )
                )
        );
        return cities;
    }
    private static List<Temperature> generateTemperatures(
            int numTemps) {
        List<Temperature> temps = new ArrayList<>();
        for(int i = 0; i < numTemps; i++){
            long when = System.currentTimeMillis();
            when += ONE_DAY_MS*RANDOM.nextInt(365);
            Date d = new Date(when);
            Temperature t = new Temperature(
                    d,
                    new BigDecimal(
                            RANDOM.nextDouble()
                    )
            );
            temps.add(t);
        }
        return temps;
    }
    private static String generateName() {
        char[] chars = new char[RANDOM.nextInt(5)+5];
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char)(RANDOM.nextInt(26) + 65);
        }
        return new String(chars);
    }
}
