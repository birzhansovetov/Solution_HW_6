package SmartHomeRemoteControl;


import java.util.HashMap;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private HashMap<String, Command> commandSlots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("[Remote] No command assigned to slot: " + slot);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            System.out.println("Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
