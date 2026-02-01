package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
public class Maximum {

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Integer: " + testMaximum(3, 5, 9));
        System.out.println("Max Float: " + testMaximum(3.2f, 5.6f, 4.1f));
        System.out.println("Max String: " +
                testMaximum("Apple", "Peach", "Banana"));
    }
}
