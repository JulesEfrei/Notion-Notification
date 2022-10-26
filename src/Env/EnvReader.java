package Env;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EnvReader {

    private String filePath = "./.env";
    private String notion_token, database_id, database_url;
    private ArrayList<String> content = new ArrayList<String>();

    //Read File on construction and store data in variable
    public EnvReader() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currLine = reader.readLine();

            while(currLine != null) {
                this.content.add(currLine); //Replace by dictionnary => {notion: <value>, url: <value>, ...}
                currLine = reader.readLine();
            }

        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void getFile() {
        System.out.println(this.filePath);
    }

    public String getNotion_token() {
        return content.get(0).split("=")[1];
    }



}