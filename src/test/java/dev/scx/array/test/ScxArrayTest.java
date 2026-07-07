package dev.scx.array.test;

import dev.scx.array.ScxArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ScxArrayTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    @Test
    public static void test1() {
        var a1 = new byte[]{1, 2, 3, 4, 5, 6};
        var a2 = new byte[]{3, 4, 5};
        var a3 = new byte[]{5, 8};
        Assert.assertEquals(ScxArray.indexOf(a1, a2), 2);
        Assert.assertEquals(ScxArray.indexOf(a1, a3), -1);
    }

    @Test
    public static void test2() {
        var s = new int[1001];
        for (int i = 0; i < 1001; i = i + 1) {
            s[i] = i;
        }
        var lists = ScxArray.splitArray(s, 9);
        Assert.assertEquals(lists.length, 112);
        Assert.assertEquals(lists[lists.length - 1].length, 2);
    }

    @Test
    public static void test3() {
        var bytes = new byte[101];
        ThreadLocalRandom.current().nextBytes(bytes);
        var newBytes = Arrays.copyOf(bytes, bytes.length);
        ScxArray.reverse(newBytes);
        ScxArray.reverse(newBytes);
        Assert.assertEquals(newBytes, bytes);
    }

    @Test
    public static void test4() {
        byte[] array = {1, 2, 3, 4, 5};
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> ScxArray.subArray(array, -1, 10)); // 期望抛出异常

        int[] array1 = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4};
        int[] result = ScxArray.subArray(array1, 1, 4);
        Assert.assertEquals(result, expected);

        long[] array2 = {1L, 2L, 3L, 4L, 5L};
        long[] expected2 = {1L, 2L, 3L, 4L, 5L};
        long[] result2 = ScxArray.subArray(array2, 0, 5);
        Assert.assertEquals(result2, expected2);


        float[] array3 = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        float[] expected3 = {2.0f, 3.0f};
        float[] result3 = ScxArray.subArray(array3, 1, 3);
        Assert.assertEquals(result3, expected3);

        double[] array4 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected4 = {1.0, 2.0, 3.0};
        double[] result4 = ScxArray.subArray(array4, 0, 3);
        Assert.assertEquals(result4, expected4);
    }

}
