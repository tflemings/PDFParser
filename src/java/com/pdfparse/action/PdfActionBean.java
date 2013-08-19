package com.pdfparse.action;

import com.pdfparse.controller.Parser;
import com.pdfparse.controller.XMLBuilder;
import com.pdfparse.model.AnnualRegisterT4Report;
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
 * This ActionBean handles instantiating the needed objects to parse a PDF file.
 * 
 * @author Tony
 */
public class PdfActionBean extends PdfParserAbstractActionBean {
    private static final String CONTENTS = "/contents.jsp";
    
    private FileBean pdfName;
    private XMLBuilder xmlBuilder;
    private AnnualRegisterT4Report report;
    private Parser parser;
    private PDDocument splitDocument;
    private String contents;
    
    /**
     * This method is the default behavior of this class. When this class is
     * invoked without using the event attribute of a link or the name attribute
     * of a form control it merely forwards directly to the CONSTANT page.
     * 
     * @return a Resolution object responsible for forwarding the request
     */
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(CONTENTS);
    }
    
    /**
     * This method instantiates the requisite objects needed to parse the 
     * provided file and is called from a button on the requesting page.
     * 
     * @return a Resolution object responsible for forwarding the request
     */   
    public Resolution submit() {
        try {
            String filePath = "C:\\Users\\Tony\\Downloads\\" + pdfName.getFileName();          
            PDDocument document = PDDocument.load(filePath);
            this.parser = new Parser();
            this.parser.setDocument(document);
            this.parser.splitDocument();
            this.splitDocument = this.parser.getDocList().get(0);
            PDFTextStripper s = new PDFTextStripper();
            this.contents = s.getText(this.splitDocument);
            this.report = new AnnualRegisterT4Report();
            report.assignRunNumberFromPdf(this.contents);
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
    
    public void setReport(AnnualRegisterT4Report report) {
        this.report = report;
    }
    
    public AnnualRegisterT4Report getReport() {
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
