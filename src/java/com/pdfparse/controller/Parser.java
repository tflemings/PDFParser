/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Tony
 */
public class Parser implements Serializable {
    
    private String document;
    
    public Parser() {
        
    }
    
    public void setDocument(String document) {
        this.document = document;
    }
    
    public String getDocument() {
        return this.document;
    }
    
    public ArrayList<String> getDocumentLines() {
        ArrayList<String> lines = new ArrayList<String>();
        StringTokenizer t = new StringTokenizer(this.document, "\r\n");
        while (t.hasMoreTokens()) {
            lines.add(t.nextToken());
        }
        return lines;
    }
}
