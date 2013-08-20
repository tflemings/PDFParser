/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pdfparse.model;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class T4Form implements Serializable {
    
    private static final String FILE_NO = "FILE NO";
    private static final String DEPT = "DEPT";
    private static final String SIN = "S.I.N.";
    private static final String NAME = "NAME:";
    private static final String RECORD_START = "** T4 **";
    private static final String INCOME = "14?INCOME";
    private static final String CPP_DED = "16?CPP DED.";
    private static final String PEN_ADJUST = "52?PEN ADJUST";
    private static final String FED_TAX = "22?FED TAX";
    private static final String QPP_DED = "17?QPP DED.";
    private static final String PPIP_DED = "55?PPIP DED";
    private static final String RPP_DED = "20?RPP DED.";
    private static final String C_QPP_EARN = "26?C/QPP EARN";
    private static final String PPIP_EARN = "56?PPIP EARN";
    private static final String RPP_NO = "50?RPP NO.";
    private static final String C_QPP_XMPT= "28?C/QPP XMPT";
    private static final String PPIP_EXEMPT = "28?PPIP EXEMPT";
    private static final String CHARITY = "46?CHARITY";
    private static final String EI_DED = "18?EI DED.";
    private static final String UNION_DUES = "44?UNION DUES";
    private static final String EI_EARN = "24?EI EARN";
    private static final String EMPLOY_CODE = "29?EMPLOY. CODE";
    private static final String EI_EXEMPT = "28?EI EXEMPT";
    
    private String fileNo;
    private String dept;
    private String sin;
    private String name;
    private double income;
    private double cppDed;
    private double penAdjust;
    private double fedTax;
    private double qppDed;
    private double ppipDed;
    private double rppDed;
    private double cQppEarn;
    private double ppipEarn;
    private double rppNo;
    private double cQppXmpt;
    private double ppipExempt;
    private double charity;
    private double eiDed;
    private double unionDues;
    private double eiEarn;
    private double employCode;
    private double eiExempt;
    
    public T4Form() {
        
    }

    public String getFileNo() {
        return fileNo;
    }

    public String getDept() {
        return dept;
    }

    public String getSin() {
        return sin;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getCppDed() {
        return cppDed;
    }

    public double getPenAdjust() {
        return penAdjust;
    }

    public double getFedTax() {
        return fedTax;
    }

    public double getQppDed() {
        return qppDed;
    }

    public double getPpipDed() {
        return ppipDed;
    }

    public double getRppDed() {
        return rppDed;
    }

    public double getcQppEarn() {
        return cQppEarn;
    }

    public double getPpipEarn() {
        return ppipEarn;
    }

    public double getRppNo() {
        return rppNo;
    }

    public double getcQppXmpt() {
        return cQppXmpt;
    }

    public double getPpipExempt() {
        return ppipExempt;
    }

    public double getCharity() {
        return charity;
    }

    public double getEiDed() {
        return eiDed;
    }

    public double getUnionDues() {
        return unionDues;
    }

    public double getEiEarn() {
        return eiEarn;
    }

    public double getEmployCode() {
        return employCode;
    }

    public double getEiExempt() {
        return eiExempt;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setCppDed(double cppDed) {
        this.cppDed = cppDed;
    }

    public void setPenAdjust(double penAdjust) {
        this.penAdjust = penAdjust;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public void setQppDed(double qppDed) {
        this.qppDed = qppDed;
    }

    public void setPpipDed(double ppipDed) {
        this.ppipDed = ppipDed;
    }

    public void setRppDed(double rppDed) {
        this.rppDed = rppDed;
    }

    public void setcQppEarn(double cQppEarn) {
        this.cQppEarn = cQppEarn;
    }

    public void setPpipEarn(double ppipEarn) {
        this.ppipEarn = ppipEarn;
    }

    public void setRppNo(double rppNo) {
        this.rppNo = rppNo;
    }

    public void setcQppXmpt(double cQppXmpt) {
        this.cQppXmpt = cQppXmpt;
    }

    public void setPpipExempt(double ppipExempt) {
        this.ppipExempt = ppipExempt;
    }

    public void setCharity(double charity) {
        this.charity = charity;
    }

    public void setEiDed(double eiDed) {
        this.eiDed = eiDed;
    }

    public void setUnionDues(double unionDues) {
        this.unionDues = unionDues;
    }

    public void setEiEarn(double eiEarn) {
        this.eiEarn = eiEarn;
    }

    public void setEmployCode(double employCode) {
        this.employCode = employCode;
    }

    public void setEiExempt(double eiExempt) {
        this.eiExempt = eiExempt;
    }
}
