import CMD.CmdExecution;
import Env.EnvReader;

public class Main {
    public static void main(String[] args) {

        CmdExecution terminal = new CmdExecution();
        terminal.addCommand("pwd");
        terminal.execute();

        EnvReader test = new EnvReader();
        System.out.printf(test.getNotion_token() + "\n");
        System.out.printf(test.getDatabase_id() + "\n");
        System.out.printf(test.getDatabase_url());

    }
}