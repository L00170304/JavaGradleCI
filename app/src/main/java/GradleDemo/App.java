package GradleDemo;

public class App{
    /**
     *  getGreeting method - This returns a greeting message
     * @return Hardcode greeting "Hello World"
     */

    public String getGreeting(){
        return "Hello World";
    }

    /**
     *  Hello world app for use demonstrating Gradle Builds.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
    }
}