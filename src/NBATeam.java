import java.util.ArrayList;

/**
 * This class models an NBA team and holds
 * all the data that is extracted from the
 * file and will be used to simulate a game.
 * @author Iain Black and Griffen Marler
 * @version 1.00, 23 January 2019
 */
public class NBATeam {



    private String teamName;
    private double FGp;
    private double ThreePTp;
    private double FTp;
    private double FGa;
    private double ThreePTa;
    private double FTa;
    private double TOV;
    private double REB;

    /**
     * Generates a multidimensional TeamStats array to
     * display information within the JTable.
     * https://www.geeksforgeeks.org/java-swing-jtable/
     * Helped us understand how to implement this concept.
     * @return Multidimensional array
     */
    public String[][]  genStats() {

        String[][] TeamStats = {{"Avg FG Makes Per Game: ", Double.toString(this.FGp)},
            {"Avg FG Attempts Per Game: ", Double.toString(this.FGa)},
            {"Avg 3PT Makes Per Game: ", Double.toString(this.ThreePTp)},
            {"Avg 3PT Attempts Per Game: ", Double.toString(this.ThreePTa)},
            {"Avg FT Makes Per Game: ", Double.toString(this.FTp)},
            {"Avg FT Attempts Per Game: ", Double.toString(this.FTa)},
            {"Avg REB Per Game: ", Double.toString(this.REB)},
            {"Avg TOV Per Game: ", Double.toString(this.TOV)}};
        return TeamStats;
    }

    /***
     * Necessary to initialize JTable.
     * @return StringArray of colnames
     */
    public String[] genColNames() {
        String[] ColNames = {this.getTeamName(), "Stat Summary"};
        return ColNames;
    }

    public NBATeam(){
        teamName = "";
        FGp = 0;
        FGa = 0;
        ThreePTp = 0;
        ThreePTa = 0;
        FTp = 0;
        FTa = 0;
        TOV = 0;
        REB = 0;
    }


    public double getFGp() {return FGp;}
    public void setFGp(double FGp) {this.FGp = FGp;}
    public double getThreePTp() {return ThreePTp;}
    public void setThreePTp(double threePTp) {ThreePTp = threePTp;}
    public double getFTp() {return FTp;}
    public void setFTp(double FTp) {this.FTp = FTp;}
    public double getFGa() {return FGa;}
    public void setFGa(double FGa) {this.FGa = FGa;}
    public double getThreePTa() {return ThreePTa;}
    public void setThreePTa(double threePTa) {ThreePTa = threePTa;}
    public double getFTa() {return FTa;}
    public void setFTa(double FTa) {this.FTa = FTa;}
    public double getTOV() {return TOV;}
    public void setTOV(double TOV) {this.TOV = TOV;}
    public double getREB() {return REB;}
    public void setREB(double REB) {this.REB = REB;}
    public void setTeamName(String name) {teamName = name;}
    public String getTeamName(){return teamName;}






}
