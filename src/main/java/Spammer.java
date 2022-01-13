public class Spammer {

    public static String webhook;
    public static int delay;
    public static boolean ping;
    public static String text;

    public static void main(String[] args) throws InterruptedException {


        System.out.println(" __          __  _     _                 _       _____                                            \n" +
                " \\ \\        / / | |   | |               | |     / ____|                                           \n" +
                "  \\ \\  /\\  / /__| |__ | |__   ___   ___ | | __ | (___  _ __   __ _ _ __ ___  _ __ ___   ___ _ __  \n" +
                "   \\ \\/  \\/ / _ \\ '_ \\| '_ \\ / _ \\ / _ \\| |/ /  \\___ \\| '_ \\ / _` | '_ ` _ \\| '_ ` _ \\ / _ \\ '__| \n" +
                "    \\  /\\  /  __/ |_) | | | | (_) | (_) |   <   ____) | |_) | (_| | | | | | | | | | | |  __/ |    \n" +
                "     \\/  \\/ \\___|_.__/|_| |_|\\___/ \\___/|_|\\_\\ |_____/| .__/ \\__,_|_| |_| |_|_| |_| |_|\\___|_|    \n" +
                "                                                      | |                                         \n" +
                "                                                      |_|                                         ");


        webhook = Input.getWebhook();
        delay = Input.getDelay();
        text = Input.getText();
        ping = Input.getPing();

        while (true) {
            WebhookTools.sendMessage();
            Thread.sleep(delay);
        }
    }
}
