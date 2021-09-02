
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayperiod) {
        return String.format("Good " + dayperiod +" "+ name + ", Lovely to see you.");
    }
    public String dateAnnouncement() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        return "Today is " + dtf.format(time);
    }

    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        String response = "";
        if(alexis == -1){
            response= "Right. And with that I shall retire.";
        }
        else{
            response= "Right away sir. She certainly isn't sophisticated enough for that.";
        }
        if(alfred == -1){
            response= "Right. And with that I shall retire.";
        }
        else{
            response= "At your service. As you wish, naturally.";
        }

        return response;
    }
}
