/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.action;

import com.pdfparse.action.ParserActionBeanContext;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 *
 * @author Tony
 */
public class PdfParserAbstractActionBean implements ActionBean {
    private ParserActionBeanContext context;
    
    public ParserActionBeanContext getContext() {
        return this.context;
    }
    
    public void setContext(ActionBeanContext actionBeanContext) {
        this.context = (ParserActionBeanContext) actionBeanContext;
    }
}
