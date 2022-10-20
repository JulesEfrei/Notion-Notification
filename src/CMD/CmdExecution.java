package CMD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdExecution {
    private String cmd;
    private ProcessBuilder processBuilder = new ProcessBuilder();
    private StringBuilder output = new StringBuilder();

    public void addCommand(String command) {
        this.cmd = command;
        processBuilder.command("bash", "-c", cmd);
        System.out.print(cmd);
    }

    public void getCommand() {
        System.out.printf(cmd);
    }

    public void execute(Boolean output) {
        if(cmd.length() != 0) {
            try {
                Process process = processBuilder.start();
            } catch (IOException err) {
                System.out.print(err);
            }
            if(output == true) {
                outputMode();
            }
        }
    }

    private void outputMode() {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(processBuilder.start().getInputStream())
            );

            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        } catch (IOException err) {
            System.out.print(err);
        }

        System.out.print(output);
    }
}
