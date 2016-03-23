/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojos.sequence;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author kiran
 */
public class SequenceDaoImpl implements SequenceDao{
    
    private Map<String, Sequence> sequences;
    private Map<String, Integer> values;
    
    public SequenceDaoImpl() {
       sequences = new HashMap<>();
       sequences.put("IT", new Sequence("IT","30","A"));
       values = new HashMap<>();
       values.put("IT",10000);
    }
    
    public Sequence getSequence(String sequenceId){
        return sequences.get(sequenceId);
    }
    
    public synchronized int getNextValue(String sequenceId){
        int value = values.get(sequenceId);
        values.put(sequenceId, value+1);
        return value; 
    }
}
