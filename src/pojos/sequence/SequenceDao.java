package pojos.sequence;

/**
 *
 * @author kiran. Created on 07 Mar 2016.
 */
public interface SequenceDao {
    
    public Sequence getSequence(String sequenceId); 
    public int getNextValue(String sequenceId);
}
