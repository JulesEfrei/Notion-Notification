import CMD.CmdExecution;

public class Main {
    public static void main(String[] args) {

        CmdExecution terminal = new CmdExecution(); //Create new terminal

        String template = "osascript -e 'display notification \"Test\"'";

        terminal.addCommand(template); //Add a commmand to the terminal
        terminal.getCommand(); //Verify the command has been correctly added
        terminal.execute(true); //Execute the command in the terminal

    }
}