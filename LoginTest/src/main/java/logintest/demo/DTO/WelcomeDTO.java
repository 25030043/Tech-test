package logintest.demo.DTO;

public class WelcomeDTO {
    private String greetingId;
    private String greeting;

    public String getGreetingId() {
        return greetingId;
    }

    public void setGreetingId(String greetingId) {
        this.greetingId = greetingId;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public WelcomeDTO(String greetingId, String greeting) {
        this.greetingId = greetingId;
        this.greeting = greeting;
    }
}
