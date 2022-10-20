package org.example;

public class Trojkat extends FiguraGeometryczna {

    private int wall3;
    private int height;

    public Trojkat(int wall1, int wall2, int wall3, int height) {
        super(wall1, wall2);
        this.wall3 = wall3;
        this.height = height;
    }

    @Override
    public int area(int wall3, int height) {
        return this.wall3 * this.height / 2;
    }

    public int perimetr(int wall1, int wall2, int wall3) {
        return wall1 + wall2 + wall3;
    }
}
