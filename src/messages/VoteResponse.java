package messages;
import java.io.Serializable;

/**
 * The class VoteResponse is sent in response to a VoteRequest, and either grants or denies the election candidate the vote.
 */

public class VoteResponse implements Serializable {

    private int nodeID;
    private int currTerm;
    private boolean granted;

    public VoteResponse(int nodeID, int currTerm, boolean granted) {
        this.nodeID = nodeID;
        this.currTerm = currTerm; 
        this.granted = granted;
    }

    public int getNodeID() {
        return nodeID;
    }

    public int getCurrTerm() {
        return currTerm;
    }

    public boolean getGranted() {
        return granted;
    }

    @Override
    public String toString() {
        return "Votetresponse - NodeID: " + Integer.toString(nodeID) + ", CurrTerm:" + Integer.toString(currTerm) + ", Granted: " + Boolean.toString(granted) + ". ";
    }

}