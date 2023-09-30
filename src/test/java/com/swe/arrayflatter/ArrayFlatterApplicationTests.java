package com.swe.arrayflatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ArrayFlatterApplicationTests {
    public ArrayFlatterApplicationTests() {
    }

    @Test
    void contextLoads() {
    }
@Test
   public void legitInput() {
    List<int[]> arrays = new ArrayList<>() ;
    arrays.add(new int[]{1, 2, 3});
    arrays.add(new int[]{4});
    arrays.add(new int[]{5, 6});
    int[] flattened = FlattenArray.flatten(arrays);
    assertArrayEquals(flattened, new int[]{1, 2, 3, 4, 5, 6});

}

    @Test
    void nullInputTester() {
        List<int[]> arrays = new ArrayList<>() ;
        int[] flattened = FlattenArray.flatten(arrays);
        assertArrayEquals(flattened, null);
    }
}
