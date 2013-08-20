/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.model;

import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class AnnualRegisterT4Report  {
    
    private String name;
    private String runNumber;
    private String runDate;
    private String runTime;
    private String companyCode;
    private String servicingCenter;
    private String periodEnd;
    private ArrayList<T4Form> forms = new ArrayList<T4Form>();
    
    public AnnualRegisterT4Report() {
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setRunNumber(String runNumber) {
        this.runNumber = runNumber;
    }
    
    public String getRunNumber() {
        return this.runNumber;
    }
    
    public void setRunDate(String runDate) {
        this.runDate = runDate;
    }
    
    public String getRunDate() {
        return this.runDate;
    }
    
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
    
    public String getRunTime() {
        return this.runTime;
    }
    
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
    
    public String getCompanyCode() {
        return this.companyCode;
    }
    
    public void setServicingCenter(String servicingCenter) {
        this.servicingCenter = servicingCenter;
    }
    
    public String getServicingCenter() {
        return this.servicingCenter;
    }
    
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }
    
    public String getPeriodEnd() {
        return this.periodEnd;
    }
    
    public void setForms(ArrayList<T4Form> forms) {
        this.forms = forms;
    }
    
    public ArrayList<T4Form> getForms() {
        return this.forms;
    }
    
    public void addForm(T4Form form) {
        this.forms.add(form);
    }
    
    /**
     * This method takes a PDF page as a String and extracts the run number.
     * Passes the run number to the setRunNumber method of the superclass.
     * 
     * @param doc a PDF document as a String
     */
    public void assignRunNumberFromPdf(String doc) {
        String[] longToken = doc.split("RUN NUMBER ");
        String[] space = longToken[0].split(" ");
        this.setRunNumber(space[0]);
    }
}
