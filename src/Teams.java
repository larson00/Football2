public class Teams {
  private String teamName;
  private int offRank;
  private int defRank;
  private double starterRank;
  private int ovrRank;
  private String division;

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public int getOffRank() {
    return offRank;
  }

  public void setOffRank(int offRank) {
    this.offRank = offRank;
  }

  public int getDefRank() {
    return defRank;
  }

  public void setDefRank(int defRank) {
    this.defRank = defRank;
  }

  public double getStarterRank() {
    return starterRank;
  }

  public void setStarterRank(int starterRank) {
    this.starterRank = starterRank;
  }

  public int getOvrRank() {
    return ovrRank;
  }

  public void setOvrRank(int ovrRank) {
    this.ovrRank = ovrRank;
  }

  Teams(String teamName, String division, int ovrRank, int offRank, int defRank,
      double starterRank) {
    this.teamName = teamName;
    this.offRank = offRank;
    this.defRank = defRank;
    this.starterRank = starterRank;
    this.ovrRank = ovrRank;
    this.division = division;
  }
}
