import platforms.Facebook;
import platforms.IPlatform;
import platforms.TwitchTV;
import platforms.YouTube;
import transmissions.AdvancedLive;
import transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform){
//            System.out.println("Iniciando a transmissão... Aguarde!");
//            Live live = new Live(platform);
//            live.broadcasting();
//            live.result();
        System.out.println("Iniciando a transmissão Avançada... Aguarde!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

    }
}