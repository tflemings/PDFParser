/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.action;

import com.pdfparse.controller.XMLBuilder;
import java.io.IOException;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.FileBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

/**
 *
 * @author Tony
 */
public class PdfActionBean extends PdfParserAbstractActionBean {
    private static final String INDEX = "/index.jsp";
    
    private FileBean pdfName;
    private String contents;
    private XMLBuilder xmlBuilder;
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(INDEX);
    }
    
    public Resolution submit() {
        try {
            String filePath = "C:\\Users\\Tony\\Downloads\\" + pdfName.getFileName();          
            PDDocument document = PDDocument.load(filePath);
            PDFTextStripper s = new PDFTextStripper();
            this.contents = s.getText(document);
            this.xmlBuilder = this.getXmlBuilder();
            if (this.xmlBuilder == null) {
                getContext().getMessages().add(new SimpleMessage("The XMLBuilder is null"));
                return new ForwardResolution(INDEX);
            }
            this.xmlBuilder.setXml("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            getContext().getMessages().add(new SimpleMessage("XML: " + this.xmlBuilder.getXml()));
        } catch (IOException e) {
            getContext().getMessages().add(new SimpleMessage(e.getMessage()));
        }   
        return new ForwardResolution(INDEX);
    }
    
    public void setPdfName(FileBean pdfName) {
        this.pdfName = pdfName;
    }
    
    public FileBean getPdfName() {
        return this.pdfName;
    }
    
    public void SetContents(String contents) {
        this.contents = contents;
    }
    
    public String getContents() {
        return this.contents;
    }
    
    public void setXmlBuilder(XMLBuilder xml) {
        this.xmlBuilder = xml;
    }
    
    public XMLBuilder getXmlBuilder() {
        return new XMLBuilder();
    }
}
