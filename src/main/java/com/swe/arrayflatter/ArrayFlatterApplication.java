package com.swe.arrayflatter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ArrayFlatterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ArrayFlatterApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.printf("ArrayFlatter started.");
        List<int[]> arrays = new ArrayList<>() ;
        arrays.add(new int[]{1, 2, 3});
        arrays.add(new int[]{5});
        arrays.add(new int[]{4, 5, 6});
        Arrays.stream(FlattenArray.flatten(arrays)).forEach(value -> System.out.print(" "+value));
    }
}
