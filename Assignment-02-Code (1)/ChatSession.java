/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class ChatSession {

    // Text and Background Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    // Chat
    private final DateTimeFormatter dateTimeFormatter;
    private final String[] messages;

    // Club - Player - Student
    private final Club club;
    private final String clubPrompt;
    private final Player player;
    private final String playerPrompt;
    private final Student student;
    private String studentPrompt;

    // Quiz// Constructor
    public ChatSession(Club club, Player player) {

    }

    // Session Initialization
    private void startChatSession() {
        // Set Messages
        this.messages[0] = " Chat session started.";
        this.messages[1] = "\n" + this.clubPrompt + "Welcome to " + club.getCurrentOfficialName().toUpperCase() + "!";
        this.messages[2] = "\n" + this.clubPrompt + "Your first and last name, please: ";
        this.messages[3] = this.clubPrompt + "Your school email address, please:";
        this.messages[4] = this.clubPrompt + "Thank you. Connecting with a SF Giants player";
        this.messages[5] = " Chat session ended.";
        // Get Student Info
        System.out.print(this.messages[1]);
        System.out.println(this.club.toString());
        System.out.print(this.messages[2]);
        System.out.print(this.messages[3]);
        // Set Messages
        this.messages[6] = "Hello " + this.student.getFirstName() + "! C-O-N-G-R-A-T-U-L-A-T-I-O-N-S! ";
        this.messages[7] = ChatSession.ANSI_PURPLE_BACKGROUND + ChatSession.ANSI_YELLOW + Student.SCHOOL_NAME.toUpperCase() + ANSI_RESET + "way to go!";
        this.messages[8] = "Likewise, " + this.student.getFirstName() + ". Very nice chatting w/ you.";
        this.messages[9] = "How many SF Giants Thank You cards are you getting?";
        this.messages[10] = "In 2 lines, Name and Message for ";
        this.messages[11] = "Thanks, " + this.student.getFirstName() + ". Your order: ";
        this.messages[12] = "Thanks again, " + this.student.getFirstName() + ". See you at your graduation ceremony!";
        this.messages[13] = "\nFREE tickets to SF Giants games this summer! Ace this quiz:";
        this.messages[14] = "See you at the summer games!!!";this.messages[15] = "\n***FREE tickets to summer games!***";
        this.messages[16] = "Thank you!";}

        // Connect Student w/ Player
        private void connectChatters() {
            // Connecting...
            System.out.print(this.messages[4]);
            int numDots = 10;for (int i = 1; i < numDots; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ChatSession.class.getName()).log(Level.SEVERE, null, ex);
                }
                    if (i == 4) {
                        // Connected. Display player info.
                        System.out.println(this.player.toStringPlayerInfo());
                    }
                    System.out.print(" .");
                }
                System.out.println("");
            }

            // Chat: Student & Player
            private void chatStudentPlayer() {
                // Congrats
                System.out.println(this.playerPrompt + this.messages[6]);
                System.out.println(this.playerPrompt + this.messages[7]);
                System.out.print(this.studentPrompt);
                // Ask # of CardsSystem.out.println(this.playerPrompt + this.messages[8]);
                System.out.println(this.playerPrompt + this.messages[9]);
                System.out.print(this.studentPrompt);
                // Recipient and Message for each card
                this.tmpString = this.messages[10];
                for (int i = 1; i <= numCards; i++) {
                    this.tmpString = this.tmpString + "the Card #" + i + ", please:";
                    System.out.println(this.playerPrompt + this.tmpString);
                    // RecipientSystem.out.print(this.studentPrompt);
                    // MessageSystem.out.print(this.studentPrompt);
                }
                // Order Summary
                System.out.println(this.playerPrompt + this.messages[11]);
                this.student.listCards();
                
                // Student confirms
                System.out.print(this.studentPrompt);
                // Player leaves 
                System.out.println(this.playerPrompt + this.messages[12]);}

                private void runQuiz() {
                    System.out.println(this.messages[13]);
                    
                         }

                private void stopChatSession() {
                }

                // A Chat Session
                public void runChatSession() {
                    this.startChatSession();
                    this.connectStudentPlayer();
                    this.chatStudentPlayer();
                    this.runQuiz();
                    this.endChatSession();}

//     //  Static Data Fields

//     //
//     // Instance Data Fields
//     //
//     private String playerName;
//     private int number;
//     private int cardAmount;

    
//  public static void main(String[] args) {
//     int player= sc.nextInt();
//     // System.out.println(player.getPlayerName() );
//     // int cardAmount = sc.nextInt();
//     System.out.println("\t[1] Recipent name: ");
//     System.out.println("\t[2] Art symbol (a character): ");
//     System.out.println("\t[3] Message to recipent: ");

//     String[] answer1 = new String[cardAmount];
//     char[] answer2 = new char[cardAmount];
//     String answer3 = new String[cardAmount];


//  }
 
//     for (int i=0; i < cardAmount; i++){
//         int cardNumber = i + 1;
//         System.out.println(player.getPlayerName() + "," + player.getNumber() + ": Card" + cardNumber);
//         answer1[i]= sc.nextLine();
//         answer2[i]=sc.nextLine().charAt(0);
//         answer3[i]=sc.nextLine();
//     }
//     SFGiantsCardGenerator generator = new SFGiantsCardGenerator();
    
//     int j = 0;
//     for (int x  = 0; x <cardAmount; x++){
//         String recipent = answer1[j];
//         char artSymbol = answer2[j];
//         String message = answer3[j];
//         String senderFirstName = firstName;
//         String senderEmail = email;
//         int artSize = 12;
//         String artFont = "Courier";
//         j++;
        
//         try{
//             generator.generateSFGiantsCard(recipient, message, senderFirstName, senderEmail, artSymbol, artSize, artFont);
//         }
//         catch (Exception e){
//             e.printStackTrace();
//         }
    
//     }

//     //
//     // Constructors
//     //
//     public ChatSession() {
//     }

//     //
//     // Instance Methods
//     //

//     // getters and setters
//    public String getPlayerName() {
//        return playerName;
//    }
//    public void setPlayerName(String playerName) {
//        this.playerName = playerName;
//    }
//    public int getNumber() {
//        return number;
//    }
//    public void setNumber(int number) {
//        this.number = number;
//    }
//    public int getCardAmount() {
//        return cardAmount;
//    }
//    public void setCardAmount(int cardAmount) {
//        this.cardAmount = cardAmount;
//    }

//     //
//     // Additional Instance Methods
//     //
//     private void startChatSession() {
//     }
//     private void connectChatters() {
//     }
//     private void chat() {
//     }
//     private void runQuiz() {
//         Scanner sc = new Scanner(System.in);

//     }
//     private void stopChatSession() {
//     }
//     public void runChatSession() {
//     }

//     //
//     // Language
//     //
}