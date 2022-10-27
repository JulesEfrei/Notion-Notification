package Env;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnvReader {

    private String filePath = "./.env";
    private String notion_token, database_id, database_url;
    private Map<String, String> content = new HashMap<String, String>();

    //Read File on construction and store data in variable
    public EnvReader() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currLine = reader.readLine();

            while(currLine != null) {
                String[] splitLine = currLine.split("=", 2);
                this.content.put(splitLine[0], splitLine[1]);
                currLine = reader.readLine();
            }

        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void getFile() {
        System.out.println(this.filePath);
    }

    public String getKeys(String key) {
        if(content.get(key) != null) {
            return content.get(key);
        } else {
            return "Key " + key + " does not exist";
        }
    }

    public String getNotion_token() {
        return content.get("personal_notion_token");
    }

    public String getDatabase_id() {
        return content.get("database_id");
    }

    public String getDatabase_url() {
        return content.get("database_url");
    }



}