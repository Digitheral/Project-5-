package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by Art on 12/9/2014.
 */
public class Node{
    public Team value = null;
    public BracketQueue nextQ = null;
    public BracketQueue currNode = null;
    public PlacingStack nextS = null;
    public PlacingStack currStack = null;


}
