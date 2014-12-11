package edu.marist.cmpt220l.events;

import com.sun.istack.internal.NotNull;
import edu.marist.cmpt220l.teams.Team;
import edu.marist.cmpt220l.teams.TeamManager;

/**
 * Created by Art on 12/4/2014.
 */
public class BracketQueue{
    // this is essentially a linked list that will work as a queue

    private Node currSet = null;
    private Node next;
    public BracketQueue(TeamManager tm)
    {
        Team[] team = tm.getTeams();
        // This is showing we are actually getting the teams into the Queue but below we're having an issue with referencing
        System.out.println(tm.teams[0].getOlympian1().getName());
        for(int i=0; i < tm.getTeams().length; i++)
        {
            // The queue always starts as empty

            //    This is producing a null pointer exception
          //    this.firstSet.value = team[0];
           //   this.lastSet.value = team[tm.getTeams().length];

        }
    }

}