import club.minnced.discord.webhook.WebhookClient;

public class WebhookTools {
    public static WebhookClient client = WebhookClient.withUrl(Spammer.webhook);

    public static void sendMessage(){

        String everyone = "@everyone";
        if(Spammer.ping) {
            client.send(Spammer.text + " " + everyone);
        }
        else {
            client.send(Spammer.text);
        }
    }
}
