package com.learning.jan._29.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestCity {
    public static void main(String[] args) {
        List <City> cities = PrepareCityData.prepareData(5,3);
        for(City x:cities){
            System.out.println(x.getName());
            System.out.println(x.getTemperatures());
            System.out.println();
        }
        Stream<City> cityStream= cities.stream();
        cityStream.map(city -> city.getTemperatures()).forEach(System.out::println);

        cityStream= cities.stream();
        cityStream.flatMap(city -> city.getTemperatures().stream())
                .filter(t->{
                    return t.getReading().doubleValue() > 0.5;

                }).forEach(System.out::println);
    }
}
