package edu.grinnell.kelleyan.csc207.hw10;

import java.util.Comparator;
import java.util.PriorityQueue;

import edu.grinnell.glimmer.ushahidi.UshahidiWebClient;

public class Controller {

    /*
     * Fields
     */
    PriorityQueue current;
    Evaluator eval;

    /*
     * Constructors
     */
    public Controller() {
	eval = null;
	current = null;
    }

    public void makeServer(String str) throws Exception {
	UshahidiWebClient web = new UshahidiWebClient(str);
	eval = new Evaluator(web);
    }

    public void makeQueue(String str, int i) {
	// Make the comparator
	Comparator c;
	switch (str) {
	case "latitude":
	    break;
	case "longitude":
	    break;
	case "id":
	    break;
	case "date":
	    break;
	} // switch
	  // get the queue given that comparator
	this.current = this.eval.formQueue(c);
    }
}
