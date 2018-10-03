public class Main {

  public static void main(String[] args) {

    Teams Eagles = new Teams("Eagles", "NFC East", 91, 97,
        89, 84.9);
    Teams Redskins = new Teams("Redskins", "NFC East", 82, 87,
        83, 80.6);
    Teams Giants = new Teams("Giants", "NFC East", 74, 75,
        77, 77.7);
    Teams Cowboys = new Teams("Cowboys", "NFC East", 84, 89,
        83, 81.5);
    Teams Falcons = new Teams("Falcons", "NFC South", 84, 87,
        85, 82.3);
    Teams Saints = new Teams("Saints", "NFC South", 84, 87,
        85, 81.9);
    Teams Panthers = new Teams("Panthers", "NFC South", 80, 81,
        83, 79.6);
    Teams Buccaneers = new Teams("Buccaneers", "NFC South", 77, 79,
        81, 79.0);
    Teams Rams = new Teams("Rams", "NFC South", 83, 85,
        85, 82.3);
    Teams Cardinals = new Teams("Cardinals", "NFC South", 80, 81,
        83, 79.6);
    Teams Seahawks = new Teams("Seahawks", "NFC South", 81, 77,
        87, 79.0);
    Teams FortyNiners = new Teams("49ers", "NFC South", 79, 83,
        79, 79.9);
    Teams Packers = new Teams("Packers", "NFC South", 81, 83,
        83, 80.1);
    Teams Vikings = new Teams("Vikings", "NFC South", 83, 79,
        91, 81.4);
    Teams Bears = new Teams("Bears", "NFC South", 78, 79,
        83, 78.5);
    Teams Lions = new Teams("Lions", "NFC South", 78, 83,
        79, 79.4);
    Teams Patriots = new Teams("Patriots", "NFC South", 85, 91,
        85, 83.0);
    Teams Dolphins = new Teams("Dolphins", "NFC South", 75, 81,
        75, 77.4);
    Teams Bills = new Teams("Bills", "NFC South", 76, 75,
        81, 78.3);
    Teams Jets = new Teams("Jets", "NFC South", 74, 71,
        81, 76.7);
    Teams Chiefs = new Teams("Chiefs", "NFC South", 82, 83,
        83, 80.7);
    Teams Broncos = new Teams("Broncos", "NFC South", 80, 77,
        87, 80.2);
    Teams Raiders = new Teams("Raiders", "NFC South", 82, 87,
        83, 81.0);
    Teams Chargers = new Teams("Chargers", "NFC South", 81, 83,
        85, 79.7);
    Teams Jaguars = new Teams("Jaguars", "NFC South", 84, 81,
        93, 82.0);
    Teams Titans = new Teams("Titans", "NFC South", 81, 85,
        83, 81.3);
    Teams Colts = new Teams("Colts", "NFC South", 74, 81,
        71, 77.8);
    Teams Texans = new Teams("Texans", "NFC South", 79, 75,
        89, 79.2);
    Teams Steelers = new Teams("Steelers", "NFC South", 86, 97,
        89, 84.7);
    Teams Ravens = new Teams("Ravens", "NFC South", 82, 79,
        87, 80.5);
    Teams Bengals = new Teams("Bengals", "NFC South", 75, 75,
        81, 78.0);
    Teams Browns = new Teams("Browns", "NFC South", 76, 81,
        77, 77.9);

    Teams[] TeamList = new Teams[32]; // change to 31 when full
    TeamList[0] = Eagles;
    TeamList[1] = Redskins;
    TeamList[2] = Giants;
    TeamList[3] = Cowboys;
    TeamList[4] = Falcons;
    TeamList[5] = Saints;
    TeamList[6] = Panthers;
    TeamList[7] = Buccaneers;
    TeamList[8] = Rams;
    TeamList[9] = Cardinals;
    TeamList[10] = Seahawks;
    TeamList[11] = FortyNiners;
    TeamList[12] = Packers;
    TeamList[13] = Vikings;
    TeamList[14] = Bears;
    TeamList[15] = Lions;
    TeamList[16] = Patriots;
    TeamList[17] = Dolphins;
    TeamList[18] = Bills;
    TeamList[19] = Jets;
    TeamList[20] = Chiefs;
    TeamList[21] = Broncos;
    TeamList[22] = Raiders;
    TeamList[23] = Chargers;
    TeamList[24] = Jaguars;
    TeamList[25] = Titans;
    TeamList[26] = Colts;
    TeamList[27] = Texans;
    TeamList[28] = Steelers;
    TeamList[29] = Ravens;
    TeamList[30] = Bengals;
    TeamList[31] = Browns;

    //System.out.println(TeamList[0].getTeamName());
    System.out.println(
        "Team name" + "\t" + "Division" + "\t" + "Overall" + "\t" + "Offensive Rank" + "\t"
            + "Defensive Rank"  + "\t" + "Starter Rank");
    System.out.println("-------------------------------------------------------------------------");

    for (int i = 0; i < TeamList.length; i++) {
      System.out.println(
          TeamList[i].getTeamName() + "\t\t\t" + TeamList[i].getDivision() + "\t\t\t" +
              TeamList[i].getOvrRank() + "\t\t\t" + TeamList[i].getOffRank() + "\t\t\t\t" + TeamList[i]
              .getDefRank()
              + "\t\t\t\t\t\t" + TeamList[i].getStarterRank());
    }

  }
}
