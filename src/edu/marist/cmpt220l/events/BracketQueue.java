package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by Art on 12/4/2014.
 */
public class BracketQueue {
    // this is essentially a linked list that will work as a queue

    private BracketQueue firstSet;
    private BracketQueue lastSet;


    // this method will enqueue

/*    public void enqueue(int value) {
        BracketQueue newSet = new BracketQueue(value);
        if (lastSet != null) {
            lastSet.next = newVal;
            last = newVal;
        }
    }

    // this method will dequeue

    public void dequeue() {
        if (firstSet != null) {
            BracketQueue currSet = firstSet;
            firstSet = firstSet.next;
            return currSet.value;
        }
    }

    public boolean isEmpty() {
        return firstSet == null;
    }
*/
}