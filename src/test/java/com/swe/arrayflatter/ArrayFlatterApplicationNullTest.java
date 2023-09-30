package com.swe.arrayflatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ArrayFlatterApplicationNullTest {

    @Test
    void contextLoads() {
    }

    public ArrayFlatterApplicationNullTest() {
    }

    @Test
   public void nullInputTester() {
        List<int[]> arrays = new ArrayList<>() ;
        int[] flattened = FlattenArray.flatten(arrays);
        assertArrayEquals(flattened, new int[]{});
    }
}
