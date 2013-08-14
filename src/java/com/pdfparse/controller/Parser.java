/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.Splitter;

/**
 *
 * @author Tony
 */
public class Parser {
    
    private PDDocument document;
    private ArrayList<PDDocument> docList = new ArrayList<PDDocument>();
    
    public Parser() {
        
    }
    
    public void setDocument(PDDocument document) {
        this.document = document;
    }
    
    public PDDocument getDocument() {
        return this.document;
    }
    
    public void setDocList(ArrayList<PDDocument> docList) {
        this.docList = docList;
    }
    
    public ArrayList<PDDocument> getDocList() {
        return this.docList;
    }
    
    public String splitDocument() {
        Splitter s = new Splitter();
        try {
            this.docList = (ArrayList<PDDocument>) s.split(this.document);
            return "Document split";
        } catch (IOException e) {
            return e.getMessage();
        }
        
    }
}
