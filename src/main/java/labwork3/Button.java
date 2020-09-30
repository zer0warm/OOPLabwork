package labwork3;

public class Button {
    private String label;
    private String color;
    private String state;

    public Button() {
        this.label = "label";
        this.color = "white";
        this.state = "undepressed";
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void dePress() {
        this.state = "depressed";
        printButtonState();
    }

    public void unDepress() {
        this.state = "undepressed";
        printButtonState();
    }

    public void printButtonState() {
        System.out.println("Button label: " + this.label);
        System.out.println("Button color: " + this.color);
        System.out.println("State: " + this.state.toUpperCase());
        System.out.println();
    }
}