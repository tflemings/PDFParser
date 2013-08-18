package com.pdfparse.action;

import com.pdfparse.action.ParserActionBeanContext;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * This is the abstract ActionBean definition. All ActionBeans must extend this
 * class to make use of the context getter and setter. All child classes must
 * define their own set of getters and setters for the class properties.
 * <p>
 * ActionBean classes behave more like a method repository than a class. Direct 
 * instantiating of ActionBeans is not needed because the presentation element
 * associated with an ActionBean has direct access to the fields of the
 * ActionBean.
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
