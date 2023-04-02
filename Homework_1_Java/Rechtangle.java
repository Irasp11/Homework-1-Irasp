package lesson1.geometry;

public class Rechtangle {
    // добавьте свойства se и nw - юго восточная точка и северозападная
    Point se;
    Point nw;
    // добавьте конструктор

    public Rechtangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    // геттеры и сеттеры

    public Point getSe() {
        return se;
    }

    public void setSe(Point se) {
        this.se = se;
    }

    public Point getNw() {
        return nw;
    }

    public void setNw(Point nw) {
        this.nw = nw;
    }

    public Rechtangle() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    double area() {
        // вернуть площадь


        return 0;
    }
}

