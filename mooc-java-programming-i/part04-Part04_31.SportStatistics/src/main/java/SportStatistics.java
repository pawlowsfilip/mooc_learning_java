import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        int gameCounter = 0;
        int winCounter = 0;
        int lossCounter = 0;

        System.out.println("File: ");
        String file = scan.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                String[] splitted = line.split(",");
                String homeTown = splitted[0];
                String visitingTeam = splitted[1];
                int homePoints = Integer.valueOf(splitted[2]);
                int visitingPoints = Integer.valueOf(splitted[3]);

                games.add(new Game(homeTown, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Team: ");
        String team = scan.nextLine();

        for (Game game: games) {
            if (game.getHomeTown().equals(team)) {
                gameCounter = gameCounter + 1;
                if (game.getWinner().equals(team)){
                    winCounter = winCounter + 1;
                } else {
                    lossCounter = lossCounter + 1;
                }
            }
            if (game.getVisitingTown().equals(team)) {
                gameCounter = gameCounter + 1;
                if (game.getWinner().equals(team)){
                    winCounter = winCounter + 1;
                } else {
                    lossCounter = lossCounter + 1;
                }
            }  
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossCounter);
    }

}
