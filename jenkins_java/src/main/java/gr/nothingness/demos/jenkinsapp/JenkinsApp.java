package gr.nothingness.demos.jenkinsapp;

/**
 * Hello world!
 */
public class JenkinsApp
{

    private final String message = "Hello World!";

    public JenkinsApp() {}

    public static void main(String[] args) {
        System.out.println(new JenkinsApp().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
