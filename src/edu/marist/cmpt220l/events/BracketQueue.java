package edu.marist.cmpt220l.events;

import com.sun.istack.internal.NotNull;
import edu.marist.cmpt220l.teams.Team;
import edu.marist.cmpt220l.teams.TeamManager;

/**
 * Created by Art on 12/4/2014.
 */
public class BracketQueue{
    // this is essentially a linked list that will work as a queue

    private BracketQueue firstSet = null;
    private BracketQueue lastSet = null;
    private Node currSet = new Node();
    public BracketQueue(TeamManager tm)
    {
        Team[] team = tm.getTeams();
        // This is showing we are actually getting the teams into the Queue but below we're having an issue with referencing
        System.out.println(tm.teams[0].getOlympian1().getName());
        for(int i=0; i < tm.getTeams().length; i++)
        {
            enqueue(team[i]);
        }
    }
    public void enqueue(Team value) {
        if (lastSet != null)
        {
            // This reference isn't working correctly.
            lastSet.nextQ = currSet;
        }
    }

    // this method will dequeue

    public Team dequeue()
    {
        currSet.currNode = firstSet;
        if (firstSet == null)
        {
            System.out.println("Nothing to dequeue");
        }
        //     firstSet = firstSet.next;
        if(firstSet == null)
        {
            lastSet = null;
        }
        return currSet.value;
    }
    // If the queue is empty we return null

    public boolean isEmpty() {
        return firstSet == null;
    }


}