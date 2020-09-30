package labwork3;

public class ButtonTestDrive {
    public static void main(String[] args) {
        Button bigButton = new Button();

        bigButton.setColor("blue");
        bigButton.setLabel("click me");
        bigButton.dePress();
        bigButton.unDepress();
        bigButton.setLabel("stop clicking >_<");
        bigButton.dePress();
        bigButton.setColor("red");
        bigButton.unDepress();
    }
}
