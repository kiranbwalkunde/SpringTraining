package pojos;

import java.util.List;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Required;

/**
 * SequenceGenerator POJO to test properties and constructor in Spring.
 * 
 * @author kiran
 */
public class SequenceGenerator {
    
    private String prefix;
    private String suffix;
    private int initial;
    private List suffixes;
    private int counter;
    private PrefixGenerator prefixGenerator;
    
    public SequenceGenerator() {
    }
    
    public SequenceGenerator(final String prefix, final int initial) {
        this.prefix = prefix;
        this.initial = initial;
    }
    
    public SequenceGenerator(final String prefix, final String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public PrefixGenerator getPrefixGenerator() {
        return prefixGenerator;
    }
    
    public SequenceGenerator(final String prefix, final String suffix, final int initial){
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }

    public String getPrefix() {
        return prefix;
    }

//    @Required
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

//    @Required
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getInitial() {
        return initial;
    }

    @Required
    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffixes(List suffixes) {
        this.suffixes = suffixes;
    }

    public List getSuffixes() {
        return suffixes;
    }
    
    public synchronized String getSequence(){
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(prefix);
        buffer.append(initial + counter++);
     
        buffer.append(suffix);
        buffer.append("-");
        buffer.append(suffixes);
        return buffer.toString();
    }

    @Override
    public String toString() {
        return prefix + " "+initial +" "+suffix+"  "+prefixGenerator.getPrefix();
    }
}
