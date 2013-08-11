/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.FileBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;

/**
 *
 * @author Tony
 */
public class PdfActionBean extends PdfParserAbstractActionBean {
    private static final String INDEX = "/index.jsp";
    
    private FileBean pdfName;
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(INDEX);
    }
    
    public Resolution submit() {
        getContext().getMessages().add(new SimpleMessage("The Parse button works."));
        return new ForwardResolution(INDEX);
    }
    
    public void setPdfName(FileBean pdfName) {
        this.pdfName = pdfName;
    }
    
    public FileBean getPdfName() {
        return this.pdfName;
    }
}
