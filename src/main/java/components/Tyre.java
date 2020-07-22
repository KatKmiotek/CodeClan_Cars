package components;

public class Tyre extends Component {
    private String make;
    public Tyre(String make, double size) {
        super(size);
        this.make = make;
    }
}
