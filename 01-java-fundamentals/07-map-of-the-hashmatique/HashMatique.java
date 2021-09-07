import java.util.HashMap;
import java.util.Set;
public class HashMatique{   
    public static void main(String[] args){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Never gonna give you up", "Never gonna give you up");
        tracklist.put("Stupid kid", "Remember when I said I love you well forget it I take it back");
        tracklist.put("Mercy Me", "Ohhhh, mercy meeee, god bless catastrophe.");
        String mercyme= tracklist.get("Mercy Me");
        String stupidkid= tracklist.get("Stupid Kid");
        String nevergiveup= tracklist.get("Never gonna give you up");
        System.out.println(mercyme);

        //Set<String> keys= tracklist.keySet();
        //for(String key : keys){
            //System.out.println(key);
            //System.out.println(tracklist.get(key));
        }
    }

    
   