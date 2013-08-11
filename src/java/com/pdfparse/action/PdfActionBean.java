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
    private static final String INDEX = "/index.php";
    
    private FileBean pdfName;
    
    @DefaultHandler
    public Resolution index() {
        getContext().getMessages().add(new SimpleMessage(this.pdfName.toString()));
        return new ForwardResolution(INDEX);
    }
    
    public void setPdfName(FileBean pdfName) {
        this.pdfName = pdfName;
    }
    
    public FileBean getPdfName() {
        return this.pdfName;
    }
}
