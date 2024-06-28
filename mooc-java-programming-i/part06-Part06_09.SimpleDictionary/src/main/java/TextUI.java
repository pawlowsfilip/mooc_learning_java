import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String word = scanner.nextLine();
    
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            else if (word.equals("add")) {
                add();
            }

            else if (word.equals("search")){
                search();
            }

            else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {

        System.out.println("Word:");
        String originalWord = scanner.nextLine();

        System.out.println("Translation:");
        String translatedWord = scanner.nextLine();

        this.simpleDictionary.add(originalWord, translatedWord);
    }

    public void search() {
        System.out.println("To be translated:");
        String searchingWord = scanner.nextLine();

        String translated = this.simpleDictionary.translate(searchingWord);

        if (translated == null) {
            System.out.println("Word " + searchingWord + " was not found");
        } else {
            System.out.println(translated);
        }
    }
}
