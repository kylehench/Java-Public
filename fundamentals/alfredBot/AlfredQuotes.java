import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Period;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String guestGreeting() {
      Date currentDate = new Date();
      SimpleDateFormat dateFormatter = new SimpleDateFormat("k");
      int hour = Integer.parseInt(dateFormatter.format(currentDate));
      String periodOfDay;
      if ( hour >= 0 && hour <=12 ) {
        periodOfDay = "morning";
      } else if ( hour > 12 && hour <=17 ) {
        periodOfDay = "afternoon";
      } else { periodOfDay = "not morning"; }
      return periodOfDay;
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
          return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
          return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}