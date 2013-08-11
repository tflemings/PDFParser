/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Tony
 */
public class HomeActionBean extends PdfParserAbstractActionBean {
    private static final String INDEX = "/index.jsp";
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(INDEX);
    }
}
