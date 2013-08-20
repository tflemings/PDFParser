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
}
