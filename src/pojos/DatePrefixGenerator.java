/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kiran
 */
public class DatePrefixGenerator implements PrefixGenerator{

    private DateFormat formatter;
    
    @Override
    public String getPrefix() {
        return formatter.format(new Date());
    }
    
    public void setPattern(String pattern){
        this.formatter = new SimpleDateFormat(pattern);
    }
}
