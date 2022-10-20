package org.example;

public class FiguraGeometryczna {

    private int wall1;
    private int wall2;
    private int radius;


    public FiguraGeometryczna(int wall1, int wall2) {
        this.wall1 = wall1;
        this.wall2 = wall2;
    }

    public FiguraGeometryczna() {

    }

    public FiguraGeometryczna(int radius) {
        this.radius = radius;
    }

    public int area(int wall1, int wall2) {
        return this.wall1 * this.wall2;
    }

    public double area(int radius) {
        return (Math.pow(this.radius, 2)) * Math.PI;
    }

    public int perimetr(int wall1, int wall2) {
        return 2 * this.wall1 + 2 * this.wall2;
    }

    public double perimetr(int radius) {
        return 2 * Math.PI * this.radius;
    }
}
