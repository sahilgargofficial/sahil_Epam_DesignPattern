package BehavioralPattern.CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        simpleRemoteControl.setCommand(new LightOnCommand(light));
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(new StereoOnWithCDCommand(stereo));
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(new StereoOffCommand(stereo));
        simpleRemoteControl.buttonWasPressed();

    }
}
