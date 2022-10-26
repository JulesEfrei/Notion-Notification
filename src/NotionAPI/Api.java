package NotionAPI;

import notion.api.v1.NotionClient;
import notion.api.v1.model.search.SearchResults;
import org.junit.Assert;

public class Api {
    private String base_url = "https://api.notion.com";
    private String TOKEN = "secret_cypa3dmY8yN0oVjLRnOMChAJT5xgkAcy91mCMWzTXvV";
    private NotionClient client = new NotionClient(TOKEN);

    public void Api() {
        try {
            SearchResults results = client.search("Test Database");
            Assert.assertNotNull(results);
        } finally {
            client.close();
        }
    }

}
