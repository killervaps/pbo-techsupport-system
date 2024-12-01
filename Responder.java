import java.util.HashMap;

public class Responder {
    private HashMap<String, String> keywordResponses;

    public Responder() {
        initializeKeywordResponses();
    }

    private void initializeKeywordResponses() {
        keywordResponses = new HashMap<>();

        // Internet-related issues
        keywordResponses.put("internet", 
            "It seems you're having internet issues. Please try these steps:\n" +
            "1. Restart your router and modem.\n" +
            "2. Check your cables and connections.\n" +
            "3. Run a speed test to verify your internet speed.\n" +
            "4. Contact your ISP if the problem persists.");

        // Performance issues
        keywordResponses.put("slow", 
            "If your system is running slow, consider the following:\n" +
            "1. Close unnecessary applications.\n" +
            "2. Clear your temporary files or browser cache.\n" +
            "3. Check your system's memory and storage usage.\n" +
            "4. Run an antivirus scan to ensure there are no malware issues.");

        // Error messages
        keywordResponses.put("error", 
            "You've encountered an error. Please provide the exact error message or code.\n" +
            "In the meantime, try restarting the application or checking the logs for details.\n" +
            "Visit the application's support page for known issues and fixes.");

        // System updates
        keywordResponses.put("update", 
            "To keep your system updated:\n" +
            "1. Check for software updates through your system's settings.\n" +
            "2. Ensure you have a stable internet connection during updates.\n" +
            "3. Restart your system after updates to apply changes.");

        // Security issues
        keywordResponses.put("security", 
            "For security concerns, follow these best practices:\n" +
            "1. Install a trusted antivirus and keep it updated.\n" +
            "2. Enable your system's firewall.\n" +
            "3. Avoid clicking on suspicious links or downloading unverified files.\n" +
            "4. Use strong, unique passwords and enable two-factor authentication.");

        // Printing issues
        keywordResponses.put("print", 
            "If you're having trouble with printing, try these steps:\n" +
            "1. Ensure your printer is turned on and connected to your system.\n" +
            "2. Check if the printer has paper and enough ink/toner.\n" +
            "3. Restart your printer and your system.\n" +
            "4. Reinstall the printer driver if necessary.");

        // Other common issues
        keywordResponses.put("bluetooth", 
            "For Bluetooth connection issues:\n" +
            "1. Ensure your Bluetooth is turned on and discoverable.\n" +
            "2. Pair the device again and verify the connection.\n" +
            "3. Restart your system and the device you're connecting to.");
        keywordResponses.put("wifi", 
            "If you're experiencing Wi-Fi issues:\n" +
            "1. Forget and reconnect to the network.\n" +
            "2. Ensure you're within range of the router.\n" +
            "3. Check for network congestion and try switching to a less crowded channel.");
    }

    public String generateResponse(String input) {
        for (String keyword : keywordResponses.keySet()) {
            if (input.toLowerCase().contains(keyword)) {
                return keywordResponses.get(keyword);
            }
        }
        return getFallbackResponse();
    }

    private String getFallbackResponse() {
        return "I'm sorry, I couldn't identify the issue. Could you provide more details? " +
               "If it's urgent, consider reaching out to our technical support team directly.";
    }
}
