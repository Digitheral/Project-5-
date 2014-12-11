package edu.marist.cmpt220l.events;

/**
 * Created by Art on 12/4/2014.
 */
public class PlacingStack
{
    // this is essentially a linked list that will work as a stack

    private PlacingStack firstSet = null;
    private PlacingStack lastSet = null;

    // Adds teams to the stack
    public void push()
    {
        firstSet.push();
    }

    // Removes teams from the stack
    public void pop()
    {
        firstSet.pop();
    }

    // Checks to see if the stack is empty
    public boolean isEmpty()
    {
        return firstSet == null;
    }
}
