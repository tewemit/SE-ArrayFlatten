package com.swe.arrayflatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ArrayFlattenAndReverseTests {
    public ArrayFlattenAndReverseTests() {
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
    int[] flattened = FlattenAndReverseArray.flattenAndReverse(arrays);
    assertArrayEquals(flattened, new int[]{6, 5, 4, 3, 2, 1});

}

    @Test
    void nullInputTester() {
        List<int[]> arrays = new ArrayList<>() ;
        int[] flattened = FlattenArray.flatten(arrays);
        assertArrayEquals(flattened, null);
    }
}
