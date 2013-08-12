/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.controller;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class XMLBuilder implements Serializable{
    private String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
    
    public XMLBuilder() {
        
    }
    
    public void setXml(String xml) {
        this.xml = xml;
    }
    
    public String getXml() {
        return this.xml;
    }
}
