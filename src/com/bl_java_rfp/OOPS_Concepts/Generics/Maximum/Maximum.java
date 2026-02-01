package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
import java.util.Arrays;
public class Maximum<T extends Comparable<T>> {

    private T[] values;

    @SafeVarargs
    public Maximum(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        return Maximum.testMaximum(values);
    }

    // UC4: Generic varargs max method using sorting
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        Maximum<Integer> intMax =
                new Maximum<>(3, 5, 9, 2, 7);
        System.out.println("Max Integer: " + intMax.testMaximum());

        Maximum<Float> floatMax =
                new Maximum<>(3.2f, 5.6f, 4.1f, 9.8f);
        System.out.println("Max Float: " + floatMax.testMaximum());

        Maximum<String> stringMax =
                new Maximum<>("Apple", "Peach", "Banana", "Mango");
        System.out.println("Max String: " + stringMax.testMaximum());
    }
}
