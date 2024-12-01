public class SupportSystem {
    private InputReader inputReader;
    private Responder responder;

    public SupportSystem() {
        inputReader = new InputReader();
        responder = new Responder();
    }

    public void start() {
        boolean exit = false;

        printWelcomeMessage();

        while (!exit) {
            String userInput = inputReader.getInput();
            if (userInput.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
                continue;
            }

            if (userInput.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                String response = responder.generateResponse(userInput);
                System.out.println(response);
            }
        }

        printGoodbyeMessage();
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to the Technical Support System!");
        System.out.println("Type your issue below or type 'exit' to close the system.");
    }

    private void printGoodbyeMessage() {
        System.out.println("Thank you for using our Technical Support System. Goodbye!");
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
