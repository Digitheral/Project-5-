package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by Art on 12/9/2014.
 */
public class Node{
    public Team value = null;
    public BracketQueue prev; // previous not used yet
    public BracketQueue next;
    public BracketQueue currNode;

}
