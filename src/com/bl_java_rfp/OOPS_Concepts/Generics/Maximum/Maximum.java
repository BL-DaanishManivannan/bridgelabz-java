package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
public class Maximum {

    // UC1: Integer maximum
    public static Integer testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    // UC2: Float maximum
    public static Float testMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    // UC3: String maximum
    public static String testMaximum(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Integer: " + testMaximum(3, 5, 9));
        System.out.println("Max Float: " + testMaximum(3.2f, 5.6f, 4.1f));
        System.out.println("Max String: " +
                testMaximum("Apple", "Peach", "Banana"));
    }
}
