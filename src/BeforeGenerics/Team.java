package BeforeGenerics;

import java.util.ArrayList;

public class Team {

    private String teamName;

    int played = 0, won = 0, lost = 0, tied = 0;

    private ArrayList<Player> member = new ArrayList<Player>();

    public Team(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void addPlayer(Player player){
        if (member.contains(player)){
            System.out.println(player.getName() + " is already on the team. ");
        } else{
          member.add(player);
            System.out.println(player.getName() + " picked for the team " + teamName);
        }
    }

    public int numPlayer(){
        return member.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }

        played++;

        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won *10) + tied;
    }
}
