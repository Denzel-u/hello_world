import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String choice = "";

        System.out.println("================================");
        System.out.println("       NOKIA 5510 PHONE");
        System.out.println("================================");
        System.out.println("Welcome to Nokia 5510!");

        while (!choice.equals("0")) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Phone Book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call Divert");
            System.out.println("8. Music");
            System.out.println("9. Games");
            System.out.println("10. Calculator");
            System.out.println("11. Reminders");
            System.out.println("12. Clock");
            System.out.println("13. Profiles");
            System.out.println("14. WAP Services");
            System.out.println("15. SIM Services");
            System.out.println("0. Exit");

            System.out.print("\nSelect an option: ");
            choice = input.nextLine();

            String option;

            if (choice.equals("1")) {

                System.out.println("\nPHONE BOOK");
                System.out.println("1. Search");
                System.out.println("2. Add Entry");
                System.out.println("3. Erase");
                System.out.println("4. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Searching for contact...");
                } else if (option.equals("2")) {
                    System.out.println("Adding new contact...");
                } else if (option.equals("3")) {
                    System.out.println("Erasing contact...");
                } else if (option.equals("4")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("2")) {

                System.out.println("\nMESSAGES");
                System.out.println("1. Write Message");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture Messages");
                System.out.println("5. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Writing a new message...");
                } else if (option.equals("2")) {
                    System.out.println("Opening Inbox...");
                } else if (option.equals("3")) {
                    System.out.println("Opening Outbox...");
                } else if (option.equals("4")) {
                    System.out.println("Opening Picture Messages...");
                } else if (option.equals("5")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("3")) {

                System.out.println("\nCHAT");
                System.out.println("Opening Chat...");
                System.out.println("1. Back");
                option = input.nextLine();

            } else if (choice.equals("4")) {

                System.out.println("\nCALL REGISTER");
                System.out.println("1. Missed Calls");
                System.out.println("2. Received Calls");
                System.out.println("3. Dialled Numbers");
                System.out.println("4. Erase Recent Call Lists");
                System.out.println("5. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Showing missed calls");
                } else if (option.equals("2")) {
                    System.out.println("Showing received calls");
                } else if (option.equals("3")) {
                    System.out.println("Showing dialled numbers");
                } else if (option.equals("4")) {
                    System.out.println("Deleting recent call lists");
                } else if (option.equals("5")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("5")) {

                System.out.println("\nTONES");
                System.out.println("1. Ringing Tone");
                System.out.println("2. Ringing Volume");
                System.out.println("3. Message Alert Tone");
                System.out.println("4. Composer");
                System.out.println("5. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening ringing tones");
                } else if (option.equals("2")) {
                    System.out.println("Adjusting ringing volume");
                } else if (option.equals("3")) {
                    System.out.println("Opening message alert tones");
                } else if (option.equals("4")) {
                    System.out.println("Opening composer");
                } else if (option.equals("5")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("6")) {

                System.out.println("\nSETTINGS");
                System.out.println("1. Call Settings");
                System.out.println("2. Phone Settings");
                System.out.println("3. Security Settings");
                System.out.println("4. Restore Factory Settings");
                System.out.println("5. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening call settings");
                } else if (option.equals("2")) {
                    System.out.println("Opening phone settings");
                } else if (option.equals("3")) {
                    System.out.println("Opening security settings");
                } else if (option.equals("4")) {
                    System.out.println("Restoring factory settings");
                } else if (option.equals("5")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("7")) {

                System.out.println("\nCALL DIVERT");
                System.out.println("1. Divert All Voice Calls");
                System.out.println("2. Divert When Busy");
                System.out.println("3. Divert When Unanswered");
                System.out.println("4. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Diverting all voice calls");
                } else if (option.equals("2")) {
                    System.out.println("Diverting calls when busy");
                } else if (option.equals("3")) {
                    System.out.println("Diverting unanswered calls");
                } else if (option.equals("4")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("8")) {

                System.out.println("\nMUSIC");
                System.out.println("1. Music Player");
                System.out.println("2. Radio");
                System.out.println("3. Recorder");
                System.out.println("4. Track List");
                System.out.println("0. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening Music Player");
                } else if (option.equals("2")) {
                    System.out.println("Opening Radio");
                } else if (option.equals("3")) {
                    System.out.println("Opening Recorder");
                } else if (option.equals("4")) {
                    System.out.println("Opening Track List");
                } else if (option.equals("0")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("9")) {

                System.out.println("\nGAMES");
                System.out.println("1. Open Games");
                System.out.println("2. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening Games");
                } else if (option.equals("2")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("10")) {

                System.out.println("\nCALCULATOR");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");

                System.out.print("Select an operation: ");
                option = input.nextLine();

                System.out.print("Enter first number: ");
                double number1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double number2 = input.nextDouble();

                input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Answer: " + (number1 + number2));
                } else if (option.equals("2")) {
                    System.out.println("Answer: " + (number1 - number2));
                } else if (option.equals("3")) {
                    System.out.println("Answer: " + (number1 * number2));
                } else if (option.equals("4")) {

                    if (number2 != 0) {
                        System.out.println("Answer: " + (number1 / number2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }

                } else {
                    System.out.println("Invalid operation");
                }

            } else if (choice.equals("11")) {

                System.out.println("\nREMINDERS");
                System.out.println("1. Open Reminders");
                System.out.println("2. Back");

                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening Reminders");
                } else {
                    System.out.println("Returning to main menu");
                }

            } else if (choice.equals("12")) {

                System.out.println("\nCLOCK");
                System.out.println("1. Alarm Clock");
                System.out.println("2. Clock Settings");
                System.out.println("3. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening Alarm Clock");
                } else if (option.equals("2")) {
                    System.out.println("Opening Clock Settings");
                } else if (option.equals("3")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("13")) {

                System.out.println("\nPROFILES");
                System.out.println("1. General");
                System.out.println("2. Silent");
                System.out.println("3. Meeting");
                System.out.println("4. Back");

                System.out.print("Select an option: ");
                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("General profile selected");
                } else if (option.equals("2")) {
                    System.out.println("Silent profile selected");
                } else if (option.equals("3")) {
                    System.out.println("Meeting profile selected");
                } else if (option.equals("4")) {
                    System.out.println("Returning to main menu");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice.equals("14")) {

                System.out.println("\nWAP SERVICES");
                System.out.println("1. Open WAP Services");
                System.out.println("2. Back");

                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening WAP Services");
                } else {
                    System.out.println("Returning to main menu");
                }

            } else if (choice.equals("15")) {

                System.out.println("\nSIM SERVICES");
                System.out.println("1. Open SIM Services");
                System.out.println("2. Back");

                option = input.nextLine();

                if (option.equals("1")) {
                    System.out.println("Opening SIM Services");
                } else {
                    System.out.println("Returning to main menu");
                }

            } else if (choice.equals("0")) {

                System.out.println("\nThank you for using Nokia 5510!");
                System.out.println("Goodbye!");

            } else {

                System.out.println("Invalid selection. Try again.");

            }

        }

        input.close();
    }
}
