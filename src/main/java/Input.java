import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);
    public static String getWebhook(){
        System.out.println("Webhook you wanna spam?: ");
        String webhook = scanner.nextLine();
        return webhook;
    }
    public static int getDelay(){
        System.out.println("Delay in seconds? (0 for no delay): ");
        int a = scanner.nextInt();
        a = a * 1000;
        scanner.nextLine();
        return a;
    }

    public static String getText(){
        String text;
        System.out.println("Text to spam with (leave blank to send default text): ");
        text = scanner.nextLine();
        if(text.isEmpty()){
            text = "ur webhook being spammed #ripfatbozo #getezd";
        }
        return text;
    }

    public static boolean getPing(){
        boolean yesorno = false;
        System.out.println("Include everyone ping?: Y/n");
        String yn = scanner.nextLine();
        if(yn.toLowerCase().contains("y")){
            yesorno = true;
        }
        else if(yn.toLowerCase().contains("n")){
            yesorno = false;
        }
        else{
            System.out.println("wrong formatting");
        }
        return yesorno;
    }
}
