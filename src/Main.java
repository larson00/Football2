public class Main {

    public static void main(String[] args) {
        Teams Eagles = new Teams("Eagles", "NFC East", 91, 97,
            89, 84.9);
        Teams Redskins = new Teams("Redskins", "NFC East", 82, 87,
            83, 80.6 );
        Teams Giants = new Teams("Giants", "NFC East", 74,  75,
            77, 77.7);
        Teams Cowboys = new Teams("Cowboys", "NFC East", 84, 89,
            83, 81.5);
        Teams[] TeamList = new Teams[4]; // change to 31 when full
        TeamList[0] = Eagles;
        TeamList[1] = Redskins;
        TeamList[2] = Giants;
        TeamList[3] = Cowboys;
        //System.out.println(TeamList[0].getTeamName());

        for(int i = 0; i<TeamList.length;i++){
            System.out.println(TeamList[i].getTeamName()+" "+TeamList[i].getDivision()+" "+
                TeamList[i].getOvrRank()+" "+ TeamList[i].getStarterRank()+" "+ TeamList[i].getOffRank()
                +" "+TeamList[i].getDefRank());
        }

    }
}
