package com.bl_java_rfp.OOPS_Concepts.LineComparison.OOPS_Refactor;

public class Line implements Comparable<Line> {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(
                Math.pow(end.x - start.x, 2) +
                        Math.pow(end.y - start.y, 2)
        );
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Line other = (Line) obj;
        return Double.compare(this.length(), other.length()) == 0;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
}
