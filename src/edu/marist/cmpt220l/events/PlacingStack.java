package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by Art on 12/4/2014.
 */
public class PlacingStack
{
    // this is essentially a linked list that will work as a stack

    private PlacingStack firstSet = null;
    private PlacingStack lastSet = null;
    private Node currSet = new Node();

    // Adds teams to the stack
    public void push()
    {
        currSet.currStack = firstSet;
        firstSet = currSet.currStack;
    }

    // Removes teams from the stack
    public Team pop()
    {
        if(firstSet == null)
        {
            currSet.currStack = firstSet;
            firstSet = currSet.nextS;
            return currSet.value;
        }
        return null;
    }


    // Checks to see if the stack is empty
    public boolean isEmpty()
    {
        return firstSet == null;
    }
}
