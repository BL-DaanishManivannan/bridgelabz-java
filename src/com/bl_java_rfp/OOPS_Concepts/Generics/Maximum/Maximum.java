package com.bl_java_rfp.OOPS_Concepts.Generics.Maximum;
public class Maximum<T extends Comparable<T>> {

    private T a;
    private T b;
    private T c;

    // Parameterized constructor
    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Instance method calling static generic method
    public T testMaximum() {
        return Maximum.testMaximum(a, b, c);
    }

    // Static generic method
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
        Maximum<Integer> intMax =
                new Maximum<>(3, 5, 9);
        System.out.println("Max Integer: " + intMax.testMaximum());

        Maximum<Float> floatMax =
                new Maximum<>(3.2f, 5.6f, 4.1f);
        System.out.println("Max Float: " + floatMax.testMaximum());

        Maximum<String> stringMax =
                new Maximum<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + stringMax.testMaximum());
    }
}
