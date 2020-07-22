package components;

public class Engine extends Component{
    private String type;
    public Engine(double size, String type) {
        super(size);
        this.type = type;
    }
}
