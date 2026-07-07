package dev.scx.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

/// ScxArray
///
/// @author scx567888
public final class ScxArray {

    // ****************** toPrimitive ******************

    public static byte[] toPrimitive(Byte... w) {
        var p = new byte[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static short[] toPrimitive(Short... w) {
        var p = new short[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static int[] toPrimitive(Integer... w) {
        var p = new int[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static long[] toPrimitive(Long... w) {
        var p = new long[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static float[] toPrimitive(Float... w) {
        var p = new float[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static double[] toPrimitive(Double... w) {
        var p = new double[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static boolean[] toPrimitive(Boolean... w) {
        var p = new boolean[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    public static char[] toPrimitive(Character... w) {
        var p = new char[w.length];
        for (var i = 0; i < w.length; i = i + 1) {
            p[i] = w[i];
        }
        return p;
    }

    // ****************** toWrapper ******************

    public static Byte[] toWrapper(byte... p) {
        var w = new Byte[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Short[] toWrapper(short... p) {
        var w = new Short[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Integer[] toWrapper(int... p) {
        var w = new Integer[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Long[] toWrapper(long... p) {
        var w = new Long[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Float[] toWrapper(float... p) {
        var w = new Float[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Double[] toWrapper(double... p) {
        var w = new Double[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Boolean[] toWrapper(boolean... p) {
        var w = new Boolean[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    public static Character[] toWrapper(char... p) {
        var w = new Character[p.length];
        for (int i = 0; i < p.length; i = i + 1) {
            w[i] = p[i];
        }
        return w;
    }

    // ****************** swap ******************

    public static void swap(byte[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(short[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(int[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(long[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(float[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(double[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(boolean[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(char[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(Object[] arr, int i, int j) {
        var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // ****************** reverse ******************

    public static void reverse(byte... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(short... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(int... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(long... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(float... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(double... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(boolean... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(char... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void reverse(Object... arr) {
        for (int i = 0, mid = arr.length / 2; i < mid; i = i + 1) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    // ****************** concat ******************

    public static byte[] concat(byte[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new byte[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static short[] concat(short[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new short[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static int[] concat(int[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new int[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static long[] concat(long[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new long[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static float[] concat(float[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new float[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static double[] concat(double[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new double[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static boolean[] concat(boolean[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new boolean[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    public static char[] concat(char[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = new char[totalLength];
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    /// 该方法可以正确处理数组协变.
    /// 因为 `arrays` 参数在编译期会被推断为传入数组的最小公共父类 (即协变后的上界类型),
    /// 所以可以通过 `arrays.getClass().componentType().componentType()` 来获取推断后的组件类型.
    @SuppressWarnings("unchecked")
    public static <T> T[] concat(T[]... arrays) {
        int totalLength = 0;
        for (var arr : arrays) {
            totalLength += arr.length;
        }
        var result = (T[]) Array.newInstance(arrays.getClass().componentType().componentType(), totalLength);
        var pos = 0;
        for (var arr : arrays) {
            System.arraycopy(arr, 0, result, pos, arr.length);
            pos += arr.length;
        }
        return result;
    }

    // ****************** concat ******************

    /// 校验索引
    private static void subArrayCheck(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException("fromIndex = " + fromIndex);
        }
        if (toIndex > size) {
            throw new ArrayIndexOutOfBoundsException("toIndex = " + toIndex);
        }
        if (fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
    }

    public static byte[] subArray(byte[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new byte[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static short[] subArray(short[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new short[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static int[] subArray(int[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new int[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static long[] subArray(long[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new long[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static float[] subArray(float[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new float[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static double[] subArray(double[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new double[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static boolean[] subArray(boolean[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new boolean[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    public static char[] subArray(char[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = new char[toIndex - fromIndex];
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] subArray(T[] array, int fromIndex, int toIndex) {
        subArrayCheck(fromIndex, toIndex, array.length);
        var subArray = (T[]) Array.newInstance(array.getClass().componentType(), toIndex - fromIndex);
        System.arraycopy(array, fromIndex, subArray, 0, subArray.length);
        return subArray;
    }

    // ****************** splitArray ******************

    /// 计算 长度可以被分割为几个子长度 (向上取整)
    private static int numOfSlices(int length, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("sliceSize must be > 0 : " + n);
        }
        return (length + n - 1) / n;
    }

    public static byte[][] splitArray(byte[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new byte[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static short[][] splitArray(short[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new short[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static int[][] splitArray(int[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new int[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static long[][] splitArray(long[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new long[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static float[][] splitArray(float[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new float[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static double[][] splitArray(double[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new double[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static boolean[][] splitArray(boolean[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new boolean[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    public static char[][] splitArray(char[] arr, int sliceSize) {
        var numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = new char[numOfSlices][];
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    /// 按照指定长度切割数组
    @SuppressWarnings("unchecked")
    public static <T> T[][] splitArray(T[] arr, int sliceSize) {
        int numOfSlices = numOfSlices(arr.length, sliceSize);
        var result = (T[][]) Array.newInstance(arr.getClass().componentType(), numOfSlices, 0);
        for (int i = 0; i < numOfSlices; i = i + 1) {
            var start = i * sliceSize;
            var end = Math.min(start + sliceSize, arr.length);
            result[i] = Arrays.copyOfRange(arr, start, end);
        }
        return result;
    }

    // ****************** indexOf ******************

    public static int indexOf(byte[] a, int startIndex, int endIndex, byte b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(short[] a, int startIndex, int endIndex, short b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] a, int startIndex, int endIndex, int b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(long[] a, int startIndex, int endIndex, long b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(float[] a, int startIndex, int endIndex, float b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(double[] a, int startIndex, int endIndex, double b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(boolean[] a, int startIndex, int endIndex, boolean b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(char[] a, int startIndex, int endIndex, char b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(Object[] a, int startIndex, int endIndex, Object b) {
        for (var i = startIndex; i < endIndex; i = i + 1) {
            if (Objects.equals(a[i], b)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(byte[] a, byte b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(short[] a, short b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(int[] a, int b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(long[] a, long b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(float[] a, float b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(double[] a, double b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(boolean[] a, boolean b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(char[] a, char b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(Object[] a, Object b) {
        return indexOf(a, 0, a.length, b);
    }

    // ****************** indexOf(...) ******************

    public static int indexOf(byte[] a, int startIndex, int endIndex, byte... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(short[] a, int startIndex, int endIndex, short... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(int[] a, int startIndex, int endIndex, int... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(long[] a, int startIndex, int endIndex, long... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(float[] a, int startIndex, int endIndex, float... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(double[] a, int startIndex, int endIndex, double... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(boolean[] a, int startIndex, int endIndex, boolean... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(char[] a, int startIndex, int endIndex, char... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (a[i + j] != b[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(Object[] a, int startIndex, int endIndex, Object... b) {
        var max = endIndex - b.length;
        outer:
        for (var i = startIndex; i <= max; i = i + 1) {
            for (var j = 0; j < b.length; j = j + 1) {
                if (!Objects.equals(a[i + j], b[j])) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public static int indexOf(byte[] a, byte... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(short[] a, short... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(int[] a, int... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(long[] a, long... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(float[] a, float... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(double[] a, double... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(boolean[] a, boolean... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(char[] a, char... b) {
        return indexOf(a, 0, a.length, b);
    }

    public static int indexOf(Object[] a, Object... b) {
        return indexOf(a, 0, a.length, b);
    }

    // ****************** shuffle ******************

    public static void shuffle(byte[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(short[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(int[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(long[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(float[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(double[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(boolean[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(char[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(Object[] arr, RandomGenerator random) {
        for (var i = 0; i < arr.length; i = i + 1) {
            var j = i + random.nextInt(arr.length - i);
            swap(arr, i, j);
        }
    }

    public static void shuffle(byte... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(short... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(int... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(long... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(float... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(double... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(boolean... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(char... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    public static void shuffle(Object... arr) {
        shuffle(arr, ThreadLocalRandom.current());
    }

    // ****************** randomGet ******************

    public static byte randomGet(byte[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static short randomGet(short[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static int randomGet(int[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static long randomGet(long[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static float randomGet(float[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static double randomGet(double[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static boolean randomGet(boolean[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static char randomGet(char[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static <T> T randomGet(T[] arr, RandomGenerator random) {
        return arr[random.nextInt(arr.length)];
    }

    public static byte randomGet(byte... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static short randomGet(short... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static int randomGet(int... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static long randomGet(long... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static float randomGet(float... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static double randomGet(double... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static boolean randomGet(boolean... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    public static char randomGet(char... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    @SafeVarargs
    public static <T> T randomGet(T... arr) {
        return randomGet(arr, ThreadLocalRandom.current());
    }

    // ****************** randomGet(...) ******************

    /// 校验索引
    private static void randomGetCheck(int arrLength, int size) {
        if (size < 0) {
            throw new ArrayIndexOutOfBoundsException("size = " + size);
        }
        if (size > arrLength) {
            throw new ArrayIndexOutOfBoundsException("size(" + size + ") > arr.length(" + arrLength + ")");
        }
    }

    public static byte[] randomGet(byte[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static short[] randomGet(short[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static int[] randomGet(int[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static long[] randomGet(long[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static float[] randomGet(float[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static double[] randomGet(double[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static boolean[] randomGet(boolean[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static char[] randomGet(char[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static <T> T[] randomGet(T[] arr, int size, RandomGenerator random) {
        randomGetCheck(arr.length, size);
        var copy = Arrays.copyOf(arr, arr.length);
        // 此处为了性能 采取部分洗牌
        for (var i = 0; i < size; i = i + 1) {
            var j = i + random.nextInt(copy.length - i);
            swap(copy, i, j);
        }
        return Arrays.copyOf(copy, size);
    }

    public static byte[] randomGet(byte[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static short[] randomGet(short[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static int[] randomGet(int[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static long[] randomGet(long[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static float[] randomGet(float[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static double[] randomGet(double[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static boolean[] randomGet(boolean[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static char[] randomGet(char[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

    public static <T> T[] randomGet(T[] arr, int size) {
        return randomGet(arr, size, ThreadLocalRandom.current());
    }

}
