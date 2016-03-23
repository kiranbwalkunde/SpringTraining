/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import pojos.ShoppingCart;

/**
 *  The Cashier Class to check Bean Initialization and Destruction.
 * 
 * @author kiran. Created on 19/03/2016.
 */
public class Cashier {
    
    private String name;
    private String path;
    private BufferedWriter writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BufferedWriter getWriter() {
        return writer;
    }

    public void setWriter(BufferedWriter writer) {
        this.writer = writer;
    }
    
    public void openFile() throws IOException {
        File logFile = new File(path, name+".txt");
        // Boolean true to append at the end of the file.
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile, true)));
    }
    
    public void checkout(ShoppingCart cart) throws IOException {
        
    }
}
