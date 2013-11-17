package edu.grinnell.kelleyan.csc207.hw10;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;

import edu.grinnell.glimmer.ushahidi.UshahidiIncident;
import edu.grinnell.glimmer.ushahidi.UshahidiWebClient;

public class Evaluator {

    /*
     * Fields
     */
    LinkedList incidents;

    /*
     * Constructor
     */

    /**
     * Evaluator constructs a linked list containing all the incidents from a
     * client.
     * 
     * @param website
     * @throws Exception
     */
    public Evaluator(UshahidiWebClient website) throws Exception {
	while (website.hasMoreIncidents()) {
	    this.incidents.add(website.nextIncident());
	} // while
    } // Evaluator(UshahidiWebClient)
    
    /**
     * formQueue creates a priority queue of UshahidiIncidents using the given Comparator
     * @param c
     * @return PriorityQueue
     */
    
    @SuppressWarnings("unchecked")
    public PriorityQueue<UshahidiIncident> formQueue(
	    Comparator<UshahidiIncident> c) {
	PriorityQueue<UshahidiIncident> queue = new PriorityQueue<UshahidiIncident>(
		0, c);
	ListIterator<UshahidiIncident> it = (ListIterator<UshahidiIncident>) this.incidents
		.listIterator(0);
	while (it.hasNext()) {
	    queue.add(it.next());
	} // while
	return queue;
    } // formQueue(Comparator<UshahidiIncident>)
    
} // class Evaluator
