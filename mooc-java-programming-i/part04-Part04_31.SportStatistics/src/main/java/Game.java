public class Game {
    private String homeTown;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Game (String homeTown, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTown = homeTown;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public String getVisitingTown() {
        return this.visitingTeam;
    }

    public String getWinner() {
        if (this.homePoints > this.visitingPoints) {
            return this.getHomeTown();
        } else {
            return this.getVisitingTown();
        }
    }    
}
