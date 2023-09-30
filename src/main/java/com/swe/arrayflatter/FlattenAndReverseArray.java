package com.swe.arrayflatter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlattenAndReverseArray {
    public static int[] flattenAndReverse(List<int[]> list) {
       int[] flat = list.stream().flatMapToInt(Arrays::stream).toArray();
       return IntStream.range(0, flat.length)
               .map(i -> flat[flat.length - 1 - i])
               .toArray();
    }
}
