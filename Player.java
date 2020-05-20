package java_x;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
                 Player[] player=new Player[4];
                 for(int i=0;i<player.length;i++)
                 {
                     int playerId=sc.nextInt();sc.nextLine();
                     String skill=sc.nextLine();
                     String level=sc.nextLine();
                     int points=sc.nextInt();sc.nextLine();
                     player[i]=new Player(playerId,skill,level,points);
                 }
                 String reqskill=sc.nextLine();
                 String reqlevel=sc.nextLine();
                 int output1=findPointsForGivenSkill(player,reqskill);
                 if(output1==0)
                 System.out.println("The given Skill is not available");
                 else
                 System.out.println(output1);
                 Player output2=getPlayerBasedOnLevel(player,reqskill,reqlevel);
                 
                     if(output2!=null)
                         System.out.println(output2.getPlayerId());
                     else
                         System.out.println("No player is available with specified level, skill and eligibility points");
                 }
    

    public static int findPointsForGivenSkill(Player[] player, String skill)
      {
         int sum=0;
                for(int i=0;i<player.length;i++)
                {
                    if(player[i].getSkill().equalsIgnoreCase(skill))
                        sum=sum+player[i].getPoints();
                }
                return sum;
      }

    public static Player getPlayerBasedOnLevel(Player[] player, String skill, String level)
      {
                Player player2=null;
                int count=0;
                for(int i=0;i<player.length;i++)
                {
                    if(player[i].getLevel().equalsIgnoreCase(level)&&player[i].getSkill().equalsIgnoreCase(skill)&&player[i].getPoints()>=20)
                    {
                        player2=player[i];
                    }
                }
                return player2;
      }
}

class Player
{
    private int playerId;
            private String skill;
            private String level;
            private int points;
            Player(int playerId,String skill,String level,int points)
            {
                this.playerId=playerId;
                this.skill=skill;
                this.level=level;
                this.points=points;
            }
            public int getPlayerId() {
                return playerId;
            }
            public void setPlayerId(int playerId) {
                this.playerId = playerId;
            }
            public String getSkill() {
                return skill;
            }
            public void setSkill(String skill) {
                this.skill = skill;
            }
            public String getLevel() {
                return level;
            }
            public void setLevel(String level) {
                this.level = level;
            }
            public int getPoints() {
                return points;
            }
            public void setPoints(int points) {
                this.points = points;
            }
            
}
