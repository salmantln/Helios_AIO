package sample.model;


public class Captcha extends Thread{

    String apiKey;
    String host;
    String siteKey;
    Thread remCaptchaThread;
    boolean debug;
    boolean running;

    public Captcha(String apiKey, String siteKey, String host) {
        this.apiKey = apiKey;
        this.siteKey = siteKey;
        this.host = host;
    }
}
