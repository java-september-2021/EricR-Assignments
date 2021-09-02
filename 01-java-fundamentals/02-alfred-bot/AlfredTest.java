public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();

        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");

        String testDateAnnouncement = alfredBot.dateAnnouncement();

        
        String alexisTest = alfredBot.respondBeforeAlexis(
            "Alexis, play some lo-fi beats."
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
    }
}