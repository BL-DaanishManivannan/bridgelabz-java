package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
import java.util.Arrays;
public class Maximum<T extends Comparable<T>> {

    private T[] values;

    @SafeVarargs
    public Maximum(T... values) {
        this.values = values;
    }

    // Calls printMax internally
    public T testMaximum() {
        return printMax(values);
    }

    // UC5: Generic method to print and return maximum
    public static <T extends Comparable<T>> T printMax(T... values) {
        Arrays.sort(values);
        T max = values[values.length - 1];
        System.out.println("Maximum value is: " + max);
        return max;
    }

    public static void main(String[] args) {
        new Maximum<>(3, 5, 9, 2, 7).testMaximum();
        new Maximum<>(3.2f, 5.6f, 4.1f, 9.8f).testMaximum();
        new Maximum<>("Apple", "Peach", "Banana", "Mango").testMaximum();
    }
}
