import CMD.CmdExecution;

public class Main {
    public static void main(String[] args) {

        CmdExecution terminal = new CmdExecution();

        terminal.getCommand();
        terminal.addCommand("osascript diaplay notification 'Test'");
        terminal.execute(false);

    }
}