package components;

public abstract class Component {
    private double size;

    public Component(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }


}
