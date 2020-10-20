package main.java.com.andrii.shape;

import java.util.Objects;

public class Vertex2D {
    int x;
    int y;

    public Vertex2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vertex2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex2D vertex2D = (Vertex2D) o;
        return x == vertex2D.x &&
                y == vertex2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
