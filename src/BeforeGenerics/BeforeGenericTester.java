package BeforeGenerics;

public class BeforeGenericTester {
    public static void main(String[] args) {

        FootballPlayer mahomes = new FootballPlayer("Patrick Mahomes");
        BaseballPlayer trout = new BaseballPlayer("Mike Trout");
        SoccerPlayer messi = new SoccerPlayer("Lionel Messi");

        Team grizzlyBear = new Team("Grizzly Bear");

        grizzlyBear.addPlayer(mahomes);
        grizzlyBear.addPlayer(trout);
        grizzlyBear.addPlayer(messi);

        Team bulldogs = new Team("Bull Dogs");

        bulldogs.addPlayer(mahomes);
        bulldogs.addPlayer(trout);
        bulldogs.addPlayer(messi);

        bulldogs.matchResult(grizzlyBear, 100, 10);
        bulldogs.matchResult(grizzlyBear, 5, 12);

        System.out.println(bulldogs.ranking());
        System.out.println(grizzlyBear.ranking());
    }
}
