/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package march.madness.bracket.picker;

import java.util.ArrayList;

/**
 *
 * @author jword
 */
public class AppDataFormatter {
ArrayList<Team> teams;
StringBuffer teamDataStream = new StringBuffer();

    public void writeTeamsData() {
         for (Team t : teams) {
            //Get team name from t, store it in variable
            String teamName = t.getName();
            //Add teamName to the String Buffer
            teamDataStream.append(teamName);
            
        }
         System.out.print(teamDataStream);
    }
    
}
