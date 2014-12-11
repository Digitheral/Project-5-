package edu.marist.cmpt220l.events;

import com.sun.istack.internal.NotNull;
import edu.marist.cmpt220l.teams.Team;
import edu.marist.cmpt220l.teams.TeamManager;

/**
 * Created by Art on 12/4/2014.
 */
public class BracketQueue{
    // this is essentially a linked list that will work as a queue

    private Node firstSet = null;
    private Node lastSet = null;
    private Node currSet = null;
    private Node next, prev;
    public BracketQueue(TeamManager tm)
    {
        Team[] team = tm.getTeams();
        System.out.println(tm.teams[0].getOlympian1().getName());
        for(int i=0; i < tm.getTeams().length; i++)
        {
            // The queue always starts as empty

            //    This is producing a null pointer exception
          //    this.firstSet.value = team[0];
           //   this.lastSet.value = team[tm.getTeams().length];

        }
    }
    // this method will enqueue

     public void enqueue(int value) {
        int newVal = 0;
        if (lastSet != null) {
            lastSet.next = currSet.currNode;
            lastSet = currSet;
        }
    }

    // this method will dequeue

    public void dequeue() {
        if (firstSet != null) {
            currSet = firstSet;
            firstSet.next = currSet.next;
        }
    }

    // If the queue is empty we return null

    public boolean isEmpty() {
        return firstSet == null;
    }
}