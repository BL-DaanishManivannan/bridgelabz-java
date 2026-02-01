package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
public class Maximum {

    public static Integer testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of Integers: " +
                testMaximum(3, 5, 9));
    }
}
