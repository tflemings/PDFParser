/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.action;

import com.pdfparse.controller.Parser;
import com.pdfparse.controller.XMLBuilder;
import com.pdfparse.model.Report;
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
    private static final String CONTENTS = "/contents.jsp";
    
    private FileBean pdfName;
    private XMLBuilder xmlBuilder;
    private Report report;
    private Parser parser;
    private PDDocument splitDocument;
    private String contents;
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(CONTENTS);
    }
    
    public Resolution submit() {
        try {
            String filePath = "C:\\Users\\Tony\\Downloads\\" + pdfName.getFileName();          
            PDDocument document = PDDocument.load(filePath);
            this.parser = new Parser();
            this.parser.setDocument(document);
            this.parser.splitDocument();
            this.splitDocument = this.parser.getDocList().get(1);
            PDFTextStripper s = new PDFTextStripper();
            this.contents = s.getText(this.splitDocument);
            /*
            PDFTextStripper s = new PDFTextStripper();
            String contents  = s.getText(document);
            this.report = new Report();
            report.setContents(contents);
            this.report.buildLineArray();
            this.xmlBuilder = this.getXmlBuilder();
            if (this.xmlBuilder == null) {
                getContext().getMessages().add(new SimpleMessage("The XMLBuilder is null"));
                return new ForwardResolution(CONTENTS);
            }
            this.xmlBuilder.setXml("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");*/
        } catch (IOException e) {
            getContext().getMessages().add(new SimpleMessage(e.getMessage()));
        }   
        return new ForwardResolution(CONTENTS);
    }
    
    public void setPdfName(FileBean pdfName) {
        this.pdfName = pdfName;
    }
    
    public FileBean getPdfName() {
        return this.pdfName;
    }
    
    public void setXmlBuilder(XMLBuilder xml) {
        this.xmlBuilder = xml;
    }
    
    public XMLBuilder getXmlBuilder() {
        return new XMLBuilder();
    }
    
    public void setReport(Report report) {
        this.report = report;
    }
    
    public Report getReport() {
        return this.report;
    }
    
    public void setParser(Parser parser) {
        this.parser = parser;
    }
    
    public Parser getParser() {
        return this.parser;
    }
    
    public void setSplitDocument(PDDocument splitDocument) {
        this.splitDocument = splitDocument;
    }
    
    public PDDocument getSplitDocument() {
        return this.splitDocument;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }
    
    public String getContents() {
        return this.contents;
    }
}
