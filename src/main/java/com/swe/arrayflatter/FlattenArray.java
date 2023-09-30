package com.swe.arrayflatter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {
    public static int[] flatten(List<int[]> list) {
       return list.stream().flatMapToInt(Arrays::stream).toArray();
    }
}
