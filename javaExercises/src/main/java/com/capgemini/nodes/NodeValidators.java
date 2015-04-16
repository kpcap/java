package com.capgemini.nodes;

import java.util.List;

/**
 * Created by ldrygala on 2015-02-09.
 * <p/>
 * Write validate for
 * <ul>
 *     <li>node id should have 4 characters</li>
 *     <li>node description can have maximal 128 characters</li>
 *     <li>no cycle</li>
 *     <li>only penultimate can have two subsequent</li>
 * </ul>
 */
public class NodeValidators {
    public static void validateMethod(List<Node> nodes) {
    	
    	if(nodes.get(0).getPredecessor() != null) { //jesli predecessor pierwszego node'a != null tzn ze mamy cykls
    		Error.add("Cycle detected");
    	}
    	for(Node temp : nodes) {
    		if(temp.getId().length() != 4) {
    			Error.add("Node "+temp.getId()+" should have 4 characters");
    		}
    		if(temp.getDescription().length() > 128) {
    			Error.add("Node "+temp.getId()+" has more than 128 characters");
    		}	
    	}
    	Error.show();
    }
}