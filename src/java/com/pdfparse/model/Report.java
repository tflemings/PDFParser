/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.model;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Tony
 */
public abstract class Report {
    private String name;
    private String runNumber;
    private String runDate;
    private String runTime;
    private String companyCode;
    private String servicingCenter;
    private String periodEnd;
    
    
    public Report() {
        
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
}
