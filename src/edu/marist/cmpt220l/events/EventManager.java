package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.TeamManager;

/**
 * The event manager manages the events in the application
 */
public class EventManager {
    private Event[] events;
    private BracketQueue newQueue;
    private BracketQueue next;
    private BracketQueue prev;
    private int value = 0;

    /**
     * Construct a new EventManager
     */
    public EventManager(TeamManager tm) {
        events = new Event[] {
                new WashoosEvent(),
                new HorseshoesEvent(),
                new CornHoleEvent(),
                new CanJamEvent(),
                new LadderBallEvent(),
                new StickGameEvent()};
        BracketQueue newQueue = new BracketQueue(tm);
    }

    /**
     * Retrieve the events
     *
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }
}
