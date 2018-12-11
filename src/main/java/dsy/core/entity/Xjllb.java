package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-11-4
 * 现金流量表
 */
@Entity
@Table(name = "xjllb")
public class Xjllb extends BaseEntity {

    @Id
    private String id;

    private String date;

    private String SECURITYCODE;

    private String REPORTTYPE;

    private String TYPE;

    private String REPORTDATE;


    private double SALEGOODSSERVICEREC;
    private double NIDEPOSIT;
    private double NIBORROWFROMCBANK;
    private double NIBORROWFROMFI;
    private double PREMIUMREC;
    private double NETRIREC;
    private double NIINSUREDDEPOSITINV;
    private double NIDISPTRADEFASSET;
    private double INTANDCOMMREC;
    private double NIBORROWFUND;
    private double NDLOANADVANCES;
    private double NIBUYBACKFUND;
    private double TAXRETURNREC;
    private double OTHEROPERATEREC;

    /**
     * 经营活动现金流入小计
     */
    private double SUMOPERATEFLOWIN;
    private double BUYGOODSSERVICEPAY;
    private double NILOANADVANCES;
    private double NIDEPOSITINCBANKFI;
    private double INDEMNITYPAY;
    private double INTANDCOMMPAY;
    private double DIVIPAY;
    private double EMPLOYEEPAY;
    private double TAXPAY;
    private double OTHEROPERATEPAY;
    private double SUMOPERATEFLOWOUT;
    /**
     * 经营活动产生的现金流量净额
     */
    private double NETOPERATECASHFLOW;
    private double DISPOSALINVREC;
    private double INVINCOMEREC;
    private double DISPFILASSETREC;
    private double DISPSUBSIDIARYREC;
    private double REDUCEPLEDGETDEPOSIT;
    private double OTHERINVREC;
    private double SUMINVFLOWIN;
    private double BUYFILASSETPAY;
    private double INVPAY;
    private double NIPLEDGELOAN;
    private double GETSUBSIDIARYPAY;
    private double ADDPLEDGETDEPOSIT;
    private double OTHERINVPAY;
    private double SUMINVFLOWOUT;

    /**
     * 投资活动产生的现金流量净额
     */
    private double NETINVCASHFLOW;
    private double ACCEPTINVREC;
    private double SUBSIDIARYACCEPT;
    private double LOANREC;
    private double ISSUEBONDREC;
    private double OTHERFINAREC;
    private double SUMFINAFLOWIN;
    private double REPAYDEBTPAY;
    private double DIVIPROFITORINTPAY;
    private double SUBSIDIARYPAY;
    private double BUYSUBSIDIARYPAY;
    private double OTHERFINAPAY;
    private double SUBSIDIARYREDUCTCAPITAL;
    private double SUMFINAFLOWOUT;

    /**
     * 筹资活动产生的现金流量净额
     */
    private double NETFINACASHFLOW;
    private double EFFECTEXCHANGERATE;
    private double NICASHEQUI;
    private double CASHEQUIBEGINNING;
    private double CASHEQUIENDING;
    private double SALEGOODSSERVICEREC_YOY;
    private double NIDEPOSIT_YOY;
    private double NIBORROWFROMCBANK_YOY;
    private double NIBORROWFROMFI_YOY;
    private double PREMIUMREC_YOY;
    private double NETRIREC_YOY;
    private double NIINSUREDDEPOSITINV_YOY;
    private double NIDISPTRADEFASSET_YOY;
    private double INTANDCOMMREC_YOY;
    private double NIBORROWFUND_YOY;
    private double NDLOANADVANCES_YOY;
    private double NIBUYBACKFUND_YOY;
    private double TAXRETURNREC_YOY;
    private double OTHEROPERATEREC_YOY;
    private double SUMOPERATEFLOWIN_YOY;
    private double BUYGOODSSERVICEPAY_YOY;
    private double NILOANADVANCES_YOY;
    private double NIDEPOSITINCBANKFI_YOY;
    private double INDEMNITYPAY_YOY;
    private double INTANDCOMMPAY_YOY;
    private double DIVIPAY_YOY;
    private double EMPLOYEEPAY_YOY;
    private double TAXPAY_YOY;
    private double OTHEROPERATEPAY_YOY;
    private double SUMOPERATEFLOWOUT_YOY;
    private double NETOPERATECASHFLOW_YOY;
    private double DISPOSALINVREC_YOY;
    private double INVINCOMEREC_YOY;
    private double DISPFILASSETREC_YOY;
    private double DISPSUBSIDIARYREC_YOY;
    private double REDUCEPLEDGETDEPOSIT_YOY;
    private double OTHERINVREC_YOY;
    private double SUMINVFLOWIN_YOY;
    private double BUYFILASSETPAY_YOY;
    private double INVPAY_YOY;
    private double NIPLEDGELOAN_YOY;
    private double GETSUBSIDIARYPAY_YOY;
    private double ADDPLEDGETDEPOSIT_YOY;
    private double OTHERINVPAY_YOY;
    private double SUMINVFLOWOUT_YOY;
    private double NETINVCASHFLOW_YOY;
    private double ACCEPTINVREC_YOY;
    private double SUBSIDIARYACCEPT_YOY;
    private double LOANREC_YOY;
    private double ISSUEBONDREC_YOY;
    private double OTHERFINAREC_YOY;
    private double SUMFINAFLOWIN_YOY;
    private double REPAYDEBTPAY_YOY;
    private double DIVIPROFITORINTPAY_YOY;
    private double SUBSIDIARYPAY_YOY;
    private double BUYSUBSIDIARYPAY_YOY;
    private double OTHERFINAPAY_YOY;
    private double SUBSIDIARYREDUCTCAPITAL_YOY;
    private double SUMFINAFLOWOUT_YOY;
    private double NETFINACASHFLOW_YOY;
    private double EFFECTEXCHANGERATE_YOY;
    private double NICASHEQUI_YOY;
    private double CASHEQUIBEGINNING_YOY;
    private double CASHEQUIENDING_YOY;
    private String CURRENCY;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSECURITYCODE() {
        return SECURITYCODE;
    }

    public void setSECURITYCODE(String SECURITYCODE) {
        this.SECURITYCODE = SECURITYCODE;
    }

    public String getREPORTTYPE() {
        return REPORTTYPE;
    }

    public void setREPORTTYPE(String REPORTTYPE) {
        this.REPORTTYPE = REPORTTYPE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getREPORTDATE() {
        return REPORTDATE;
    }

    public void setREPORTDATE(String REPORTDATE) {
        this.REPORTDATE = REPORTDATE;
    }

    public double getSALEGOODSSERVICEREC() {
        return SALEGOODSSERVICEREC;
    }

    public void setSALEGOODSSERVICEREC(double SALEGOODSSERVICEREC) {
        this.SALEGOODSSERVICEREC = SALEGOODSSERVICEREC;
    }

    public double getNIDEPOSIT() {
        return NIDEPOSIT;
    }

    public void setNIDEPOSIT(double NIDEPOSIT) {
        this.NIDEPOSIT = NIDEPOSIT;
    }

    public double getNIBORROWFROMCBANK() {
        return NIBORROWFROMCBANK;
    }

    public void setNIBORROWFROMCBANK(double NIBORROWFROMCBANK) {
        this.NIBORROWFROMCBANK = NIBORROWFROMCBANK;
    }

    public double getNIBORROWFROMFI() {
        return NIBORROWFROMFI;
    }

    public void setNIBORROWFROMFI(double NIBORROWFROMFI) {
        this.NIBORROWFROMFI = NIBORROWFROMFI;
    }

    public double getPREMIUMREC() {
        return PREMIUMREC;
    }

    public void setPREMIUMREC(double PREMIUMREC) {
        this.PREMIUMREC = PREMIUMREC;
    }

    public double getNETRIREC() {
        return NETRIREC;
    }

    public void setNETRIREC(double NETRIREC) {
        this.NETRIREC = NETRIREC;
    }

    public double getNIINSUREDDEPOSITINV() {
        return NIINSUREDDEPOSITINV;
    }

    public void setNIINSUREDDEPOSITINV(double NIINSUREDDEPOSITINV) {
        this.NIINSUREDDEPOSITINV = NIINSUREDDEPOSITINV;
    }

    public double getNIDISPTRADEFASSET() {
        return NIDISPTRADEFASSET;
    }

    public void setNIDISPTRADEFASSET(double NIDISPTRADEFASSET) {
        this.NIDISPTRADEFASSET = NIDISPTRADEFASSET;
    }

    public double getINTANDCOMMREC() {
        return INTANDCOMMREC;
    }

    public void setINTANDCOMMREC(double INTANDCOMMREC) {
        this.INTANDCOMMREC = INTANDCOMMREC;
    }

    public double getNIBORROWFUND() {
        return NIBORROWFUND;
    }

    public void setNIBORROWFUND(double NIBORROWFUND) {
        this.NIBORROWFUND = NIBORROWFUND;
    }

    public double getNDLOANADVANCES() {
        return NDLOANADVANCES;
    }

    public void setNDLOANADVANCES(double NDLOANADVANCES) {
        this.NDLOANADVANCES = NDLOANADVANCES;
    }

    public double getNIBUYBACKFUND() {
        return NIBUYBACKFUND;
    }

    public void setNIBUYBACKFUND(double NIBUYBACKFUND) {
        this.NIBUYBACKFUND = NIBUYBACKFUND;
    }

    public double getTAXRETURNREC() {
        return TAXRETURNREC;
    }

    public void setTAXRETURNREC(double TAXRETURNREC) {
        this.TAXRETURNREC = TAXRETURNREC;
    }

    public double getOTHEROPERATEREC() {
        return OTHEROPERATEREC;
    }

    public void setOTHEROPERATEREC(double OTHEROPERATEREC) {
        this.OTHEROPERATEREC = OTHEROPERATEREC;
    }

    public double getSUMOPERATEFLOWIN() {
        return SUMOPERATEFLOWIN;
    }

    public void setSUMOPERATEFLOWIN(double SUMOPERATEFLOWIN) {
        this.SUMOPERATEFLOWIN = SUMOPERATEFLOWIN;
    }

    public double getBUYGOODSSERVICEPAY() {
        return BUYGOODSSERVICEPAY;
    }

    public void setBUYGOODSSERVICEPAY(double BUYGOODSSERVICEPAY) {
        this.BUYGOODSSERVICEPAY = BUYGOODSSERVICEPAY;
    }

    public double getNILOANADVANCES() {
        return NILOANADVANCES;
    }

    public void setNILOANADVANCES(double NILOANADVANCES) {
        this.NILOANADVANCES = NILOANADVANCES;
    }

    public double getNIDEPOSITINCBANKFI() {
        return NIDEPOSITINCBANKFI;
    }

    public void setNIDEPOSITINCBANKFI(double NIDEPOSITINCBANKFI) {
        this.NIDEPOSITINCBANKFI = NIDEPOSITINCBANKFI;
    }

    public double getINDEMNITYPAY() {
        return INDEMNITYPAY;
    }

    public void setINDEMNITYPAY(double INDEMNITYPAY) {
        this.INDEMNITYPAY = INDEMNITYPAY;
    }

    public double getINTANDCOMMPAY() {
        return INTANDCOMMPAY;
    }

    public void setINTANDCOMMPAY(double INTANDCOMMPAY) {
        this.INTANDCOMMPAY = INTANDCOMMPAY;
    }

    public double getDIVIPAY() {
        return DIVIPAY;
    }

    public void setDIVIPAY(double DIVIPAY) {
        this.DIVIPAY = DIVIPAY;
    }

    public double getEMPLOYEEPAY() {
        return EMPLOYEEPAY;
    }

    public void setEMPLOYEEPAY(double EMPLOYEEPAY) {
        this.EMPLOYEEPAY = EMPLOYEEPAY;
    }

    public double getTAXPAY() {
        return TAXPAY;
    }

    public void setTAXPAY(double TAXPAY) {
        this.TAXPAY = TAXPAY;
    }

    public double getOTHEROPERATEPAY() {
        return OTHEROPERATEPAY;
    }

    public void setOTHEROPERATEPAY(double OTHEROPERATEPAY) {
        this.OTHEROPERATEPAY = OTHEROPERATEPAY;
    }

    public double getSUMOPERATEFLOWOUT() {
        return SUMOPERATEFLOWOUT;
    }

    public void setSUMOPERATEFLOWOUT(double SUMOPERATEFLOWOUT) {
        this.SUMOPERATEFLOWOUT = SUMOPERATEFLOWOUT;
    }

    public double getNETOPERATECASHFLOW() {
        return NETOPERATECASHFLOW;
    }

    public void setNETOPERATECASHFLOW(double NETOPERATECASHFLOW) {
        this.NETOPERATECASHFLOW = NETOPERATECASHFLOW;
    }

    public double getDISPOSALINVREC() {
        return DISPOSALINVREC;
    }

    public void setDISPOSALINVREC(double DISPOSALINVREC) {
        this.DISPOSALINVREC = DISPOSALINVREC;
    }

    public double getINVINCOMEREC() {
        return INVINCOMEREC;
    }

    public void setINVINCOMEREC(double INVINCOMEREC) {
        this.INVINCOMEREC = INVINCOMEREC;
    }

    public double getDISPFILASSETREC() {
        return DISPFILASSETREC;
    }

    public void setDISPFILASSETREC(double DISPFILASSETREC) {
        this.DISPFILASSETREC = DISPFILASSETREC;
    }

    public double getDISPSUBSIDIARYREC() {
        return DISPSUBSIDIARYREC;
    }

    public void setDISPSUBSIDIARYREC(double DISPSUBSIDIARYREC) {
        this.DISPSUBSIDIARYREC = DISPSUBSIDIARYREC;
    }

    public double getREDUCEPLEDGETDEPOSIT() {
        return REDUCEPLEDGETDEPOSIT;
    }

    public void setREDUCEPLEDGETDEPOSIT(double REDUCEPLEDGETDEPOSIT) {
        this.REDUCEPLEDGETDEPOSIT = REDUCEPLEDGETDEPOSIT;
    }

    public double getOTHERINVREC() {
        return OTHERINVREC;
    }

    public void setOTHERINVREC(double OTHERINVREC) {
        this.OTHERINVREC = OTHERINVREC;
    }

    public double getSUMINVFLOWIN() {
        return SUMINVFLOWIN;
    }

    public void setSUMINVFLOWIN(double SUMINVFLOWIN) {
        this.SUMINVFLOWIN = SUMINVFLOWIN;
    }

    public double getBUYFILASSETPAY() {
        return BUYFILASSETPAY;
    }

    public void setBUYFILASSETPAY(double BUYFILASSETPAY) {
        this.BUYFILASSETPAY = BUYFILASSETPAY;
    }

    public double getINVPAY() {
        return INVPAY;
    }

    public void setINVPAY(double INVPAY) {
        this.INVPAY = INVPAY;
    }

    public double getNIPLEDGELOAN() {
        return NIPLEDGELOAN;
    }

    public void setNIPLEDGELOAN(double NIPLEDGELOAN) {
        this.NIPLEDGELOAN = NIPLEDGELOAN;
    }

    public double getGETSUBSIDIARYPAY() {
        return GETSUBSIDIARYPAY;
    }

    public void setGETSUBSIDIARYPAY(double GETSUBSIDIARYPAY) {
        this.GETSUBSIDIARYPAY = GETSUBSIDIARYPAY;
    }

    public double getADDPLEDGETDEPOSIT() {
        return ADDPLEDGETDEPOSIT;
    }

    public void setADDPLEDGETDEPOSIT(double ADDPLEDGETDEPOSIT) {
        this.ADDPLEDGETDEPOSIT = ADDPLEDGETDEPOSIT;
    }

    public double getOTHERINVPAY() {
        return OTHERINVPAY;
    }

    public void setOTHERINVPAY(double OTHERINVPAY) {
        this.OTHERINVPAY = OTHERINVPAY;
    }

    public double getSUMINVFLOWOUT() {
        return SUMINVFLOWOUT;
    }

    public void setSUMINVFLOWOUT(double SUMINVFLOWOUT) {
        this.SUMINVFLOWOUT = SUMINVFLOWOUT;
    }

    public double getNETINVCASHFLOW() {
        return NETINVCASHFLOW;
    }

    public void setNETINVCASHFLOW(double NETINVCASHFLOW) {
        this.NETINVCASHFLOW = NETINVCASHFLOW;
    }

    public double getACCEPTINVREC() {
        return ACCEPTINVREC;
    }

    public void setACCEPTINVREC(double ACCEPTINVREC) {
        this.ACCEPTINVREC = ACCEPTINVREC;
    }

    public double getSUBSIDIARYACCEPT() {
        return SUBSIDIARYACCEPT;
    }

    public void setSUBSIDIARYACCEPT(double SUBSIDIARYACCEPT) {
        this.SUBSIDIARYACCEPT = SUBSIDIARYACCEPT;
    }

    public double getLOANREC() {
        return LOANREC;
    }

    public void setLOANREC(double LOANREC) {
        this.LOANREC = LOANREC;
    }

    public double getISSUEBONDREC() {
        return ISSUEBONDREC;
    }

    public void setISSUEBONDREC(double ISSUEBONDREC) {
        this.ISSUEBONDREC = ISSUEBONDREC;
    }

    public double getOTHERFINAREC() {
        return OTHERFINAREC;
    }

    public void setOTHERFINAREC(double OTHERFINAREC) {
        this.OTHERFINAREC = OTHERFINAREC;
    }

    public double getSUMFINAFLOWIN() {
        return SUMFINAFLOWIN;
    }

    public void setSUMFINAFLOWIN(double SUMFINAFLOWIN) {
        this.SUMFINAFLOWIN = SUMFINAFLOWIN;
    }

    public double getREPAYDEBTPAY() {
        return REPAYDEBTPAY;
    }

    public void setREPAYDEBTPAY(double REPAYDEBTPAY) {
        this.REPAYDEBTPAY = REPAYDEBTPAY;
    }

    public double getDIVIPROFITORINTPAY() {
        return DIVIPROFITORINTPAY;
    }

    public void setDIVIPROFITORINTPAY(double DIVIPROFITORINTPAY) {
        this.DIVIPROFITORINTPAY = DIVIPROFITORINTPAY;
    }

    public double getSUBSIDIARYPAY() {
        return SUBSIDIARYPAY;
    }

    public void setSUBSIDIARYPAY(double SUBSIDIARYPAY) {
        this.SUBSIDIARYPAY = SUBSIDIARYPAY;
    }

    public double getBUYSUBSIDIARYPAY() {
        return BUYSUBSIDIARYPAY;
    }

    public void setBUYSUBSIDIARYPAY(double BUYSUBSIDIARYPAY) {
        this.BUYSUBSIDIARYPAY = BUYSUBSIDIARYPAY;
    }

    public double getOTHERFINAPAY() {
        return OTHERFINAPAY;
    }

    public void setOTHERFINAPAY(double OTHERFINAPAY) {
        this.OTHERFINAPAY = OTHERFINAPAY;
    }

    public double getSUBSIDIARYREDUCTCAPITAL() {
        return SUBSIDIARYREDUCTCAPITAL;
    }

    public void setSUBSIDIARYREDUCTCAPITAL(double SUBSIDIARYREDUCTCAPITAL) {
        this.SUBSIDIARYREDUCTCAPITAL = SUBSIDIARYREDUCTCAPITAL;
    }

    public double getSUMFINAFLOWOUT() {
        return SUMFINAFLOWOUT;
    }

    public void setSUMFINAFLOWOUT(double SUMFINAFLOWOUT) {
        this.SUMFINAFLOWOUT = SUMFINAFLOWOUT;
    }

    public double getNETFINACASHFLOW() {
        return NETFINACASHFLOW;
    }

    public void setNETFINACASHFLOW(double NETFINACASHFLOW) {
        this.NETFINACASHFLOW = NETFINACASHFLOW;
    }

    public double getEFFECTEXCHANGERATE() {
        return EFFECTEXCHANGERATE;
    }

    public void setEFFECTEXCHANGERATE(double EFFECTEXCHANGERATE) {
        this.EFFECTEXCHANGERATE = EFFECTEXCHANGERATE;
    }

    public double getNICASHEQUI() {
        return NICASHEQUI;
    }

    public void setNICASHEQUI(double NICASHEQUI) {
        this.NICASHEQUI = NICASHEQUI;
    }

    public double getCASHEQUIBEGINNING() {
        return CASHEQUIBEGINNING;
    }

    public void setCASHEQUIBEGINNING(double CASHEQUIBEGINNING) {
        this.CASHEQUIBEGINNING = CASHEQUIBEGINNING;
    }

    public double getCASHEQUIENDING() {
        return CASHEQUIENDING;
    }

    public void setCASHEQUIENDING(double CASHEQUIENDING) {
        this.CASHEQUIENDING = CASHEQUIENDING;
    }

    public double getSALEGOODSSERVICEREC_YOY() {
        return SALEGOODSSERVICEREC_YOY;
    }

    public void setSALEGOODSSERVICEREC_YOY(double SALEGOODSSERVICEREC_YOY) {
        this.SALEGOODSSERVICEREC_YOY = SALEGOODSSERVICEREC_YOY;
    }

    public double getNIDEPOSIT_YOY() {
        return NIDEPOSIT_YOY;
    }

    public void setNIDEPOSIT_YOY(double NIDEPOSIT_YOY) {
        this.NIDEPOSIT_YOY = NIDEPOSIT_YOY;
    }

    public double getNIBORROWFROMCBANK_YOY() {
        return NIBORROWFROMCBANK_YOY;
    }

    public void setNIBORROWFROMCBANK_YOY(double NIBORROWFROMCBANK_YOY) {
        this.NIBORROWFROMCBANK_YOY = NIBORROWFROMCBANK_YOY;
    }

    public double getNIBORROWFROMFI_YOY() {
        return NIBORROWFROMFI_YOY;
    }

    public void setNIBORROWFROMFI_YOY(double NIBORROWFROMFI_YOY) {
        this.NIBORROWFROMFI_YOY = NIBORROWFROMFI_YOY;
    }

    public double getPREMIUMREC_YOY() {
        return PREMIUMREC_YOY;
    }

    public void setPREMIUMREC_YOY(double PREMIUMREC_YOY) {
        this.PREMIUMREC_YOY = PREMIUMREC_YOY;
    }

    public double getNETRIREC_YOY() {
        return NETRIREC_YOY;
    }

    public void setNETRIREC_YOY(double NETRIREC_YOY) {
        this.NETRIREC_YOY = NETRIREC_YOY;
    }

    public double getNIINSUREDDEPOSITINV_YOY() {
        return NIINSUREDDEPOSITINV_YOY;
    }

    public void setNIINSUREDDEPOSITINV_YOY(double NIINSUREDDEPOSITINV_YOY) {
        this.NIINSUREDDEPOSITINV_YOY = NIINSUREDDEPOSITINV_YOY;
    }

    public double getNIDISPTRADEFASSET_YOY() {
        return NIDISPTRADEFASSET_YOY;
    }

    public void setNIDISPTRADEFASSET_YOY(double NIDISPTRADEFASSET_YOY) {
        this.NIDISPTRADEFASSET_YOY = NIDISPTRADEFASSET_YOY;
    }

    public double getINTANDCOMMREC_YOY() {
        return INTANDCOMMREC_YOY;
    }

    public void setINTANDCOMMREC_YOY(double INTANDCOMMREC_YOY) {
        this.INTANDCOMMREC_YOY = INTANDCOMMREC_YOY;
    }

    public double getNIBORROWFUND_YOY() {
        return NIBORROWFUND_YOY;
    }

    public void setNIBORROWFUND_YOY(double NIBORROWFUND_YOY) {
        this.NIBORROWFUND_YOY = NIBORROWFUND_YOY;
    }

    public double getNDLOANADVANCES_YOY() {
        return NDLOANADVANCES_YOY;
    }

    public void setNDLOANADVANCES_YOY(double NDLOANADVANCES_YOY) {
        this.NDLOANADVANCES_YOY = NDLOANADVANCES_YOY;
    }

    public double getNIBUYBACKFUND_YOY() {
        return NIBUYBACKFUND_YOY;
    }

    public void setNIBUYBACKFUND_YOY(double NIBUYBACKFUND_YOY) {
        this.NIBUYBACKFUND_YOY = NIBUYBACKFUND_YOY;
    }

    public double getTAXRETURNREC_YOY() {
        return TAXRETURNREC_YOY;
    }

    public void setTAXRETURNREC_YOY(double TAXRETURNREC_YOY) {
        this.TAXRETURNREC_YOY = TAXRETURNREC_YOY;
    }

    public double getOTHEROPERATEREC_YOY() {
        return OTHEROPERATEREC_YOY;
    }

    public void setOTHEROPERATEREC_YOY(double OTHEROPERATEREC_YOY) {
        this.OTHEROPERATEREC_YOY = OTHEROPERATEREC_YOY;
    }

    public double getSUMOPERATEFLOWIN_YOY() {
        return SUMOPERATEFLOWIN_YOY;
    }

    public void setSUMOPERATEFLOWIN_YOY(double SUMOPERATEFLOWIN_YOY) {
        this.SUMOPERATEFLOWIN_YOY = SUMOPERATEFLOWIN_YOY;
    }

    public double getBUYGOODSSERVICEPAY_YOY() {
        return BUYGOODSSERVICEPAY_YOY;
    }

    public void setBUYGOODSSERVICEPAY_YOY(double BUYGOODSSERVICEPAY_YOY) {
        this.BUYGOODSSERVICEPAY_YOY = BUYGOODSSERVICEPAY_YOY;
    }

    public double getNILOANADVANCES_YOY() {
        return NILOANADVANCES_YOY;
    }

    public void setNILOANADVANCES_YOY(double NILOANADVANCES_YOY) {
        this.NILOANADVANCES_YOY = NILOANADVANCES_YOY;
    }

    public double getNIDEPOSITINCBANKFI_YOY() {
        return NIDEPOSITINCBANKFI_YOY;
    }

    public void setNIDEPOSITINCBANKFI_YOY(double NIDEPOSITINCBANKFI_YOY) {
        this.NIDEPOSITINCBANKFI_YOY = NIDEPOSITINCBANKFI_YOY;
    }

    public double getINDEMNITYPAY_YOY() {
        return INDEMNITYPAY_YOY;
    }

    public void setINDEMNITYPAY_YOY(double INDEMNITYPAY_YOY) {
        this.INDEMNITYPAY_YOY = INDEMNITYPAY_YOY;
    }

    public double getINTANDCOMMPAY_YOY() {
        return INTANDCOMMPAY_YOY;
    }

    public void setINTANDCOMMPAY_YOY(double INTANDCOMMPAY_YOY) {
        this.INTANDCOMMPAY_YOY = INTANDCOMMPAY_YOY;
    }

    public double getDIVIPAY_YOY() {
        return DIVIPAY_YOY;
    }

    public void setDIVIPAY_YOY(double DIVIPAY_YOY) {
        this.DIVIPAY_YOY = DIVIPAY_YOY;
    }

    public double getEMPLOYEEPAY_YOY() {
        return EMPLOYEEPAY_YOY;
    }

    public void setEMPLOYEEPAY_YOY(double EMPLOYEEPAY_YOY) {
        this.EMPLOYEEPAY_YOY = EMPLOYEEPAY_YOY;
    }

    public double getTAXPAY_YOY() {
        return TAXPAY_YOY;
    }

    public void setTAXPAY_YOY(double TAXPAY_YOY) {
        this.TAXPAY_YOY = TAXPAY_YOY;
    }

    public double getOTHEROPERATEPAY_YOY() {
        return OTHEROPERATEPAY_YOY;
    }

    public void setOTHEROPERATEPAY_YOY(double OTHEROPERATEPAY_YOY) {
        this.OTHEROPERATEPAY_YOY = OTHEROPERATEPAY_YOY;
    }

    public double getSUMOPERATEFLOWOUT_YOY() {
        return SUMOPERATEFLOWOUT_YOY;
    }

    public void setSUMOPERATEFLOWOUT_YOY(double SUMOPERATEFLOWOUT_YOY) {
        this.SUMOPERATEFLOWOUT_YOY = SUMOPERATEFLOWOUT_YOY;
    }

    public double getNETOPERATECASHFLOW_YOY() {
        return NETOPERATECASHFLOW_YOY;
    }

    public void setNETOPERATECASHFLOW_YOY(double NETOPERATECASHFLOW_YOY) {
        this.NETOPERATECASHFLOW_YOY = NETOPERATECASHFLOW_YOY;
    }

    public double getDISPOSALINVREC_YOY() {
        return DISPOSALINVREC_YOY;
    }

    public void setDISPOSALINVREC_YOY(double DISPOSALINVREC_YOY) {
        this.DISPOSALINVREC_YOY = DISPOSALINVREC_YOY;
    }

    public double getINVINCOMEREC_YOY() {
        return INVINCOMEREC_YOY;
    }

    public void setINVINCOMEREC_YOY(double INVINCOMEREC_YOY) {
        this.INVINCOMEREC_YOY = INVINCOMEREC_YOY;
    }

    public double getDISPFILASSETREC_YOY() {
        return DISPFILASSETREC_YOY;
    }

    public void setDISPFILASSETREC_YOY(double DISPFILASSETREC_YOY) {
        this.DISPFILASSETREC_YOY = DISPFILASSETREC_YOY;
    }

    public double getDISPSUBSIDIARYREC_YOY() {
        return DISPSUBSIDIARYREC_YOY;
    }

    public void setDISPSUBSIDIARYREC_YOY(double DISPSUBSIDIARYREC_YOY) {
        this.DISPSUBSIDIARYREC_YOY = DISPSUBSIDIARYREC_YOY;
    }

    public double getREDUCEPLEDGETDEPOSIT_YOY() {
        return REDUCEPLEDGETDEPOSIT_YOY;
    }

    public void setREDUCEPLEDGETDEPOSIT_YOY(double REDUCEPLEDGETDEPOSIT_YOY) {
        this.REDUCEPLEDGETDEPOSIT_YOY = REDUCEPLEDGETDEPOSIT_YOY;
    }

    public double getOTHERINVREC_YOY() {
        return OTHERINVREC_YOY;
    }

    public void setOTHERINVREC_YOY(double OTHERINVREC_YOY) {
        this.OTHERINVREC_YOY = OTHERINVREC_YOY;
    }

    public double getSUMINVFLOWIN_YOY() {
        return SUMINVFLOWIN_YOY;
    }

    public void setSUMINVFLOWIN_YOY(double SUMINVFLOWIN_YOY) {
        this.SUMINVFLOWIN_YOY = SUMINVFLOWIN_YOY;
    }

    public double getBUYFILASSETPAY_YOY() {
        return BUYFILASSETPAY_YOY;
    }

    public void setBUYFILASSETPAY_YOY(double BUYFILASSETPAY_YOY) {
        this.BUYFILASSETPAY_YOY = BUYFILASSETPAY_YOY;
    }

    public double getINVPAY_YOY() {
        return INVPAY_YOY;
    }

    public void setINVPAY_YOY(double INVPAY_YOY) {
        this.INVPAY_YOY = INVPAY_YOY;
    }

    public double getNIPLEDGELOAN_YOY() {
        return NIPLEDGELOAN_YOY;
    }

    public void setNIPLEDGELOAN_YOY(double NIPLEDGELOAN_YOY) {
        this.NIPLEDGELOAN_YOY = NIPLEDGELOAN_YOY;
    }

    public double getGETSUBSIDIARYPAY_YOY() {
        return GETSUBSIDIARYPAY_YOY;
    }

    public void setGETSUBSIDIARYPAY_YOY(double GETSUBSIDIARYPAY_YOY) {
        this.GETSUBSIDIARYPAY_YOY = GETSUBSIDIARYPAY_YOY;
    }

    public double getADDPLEDGETDEPOSIT_YOY() {
        return ADDPLEDGETDEPOSIT_YOY;
    }

    public void setADDPLEDGETDEPOSIT_YOY(double ADDPLEDGETDEPOSIT_YOY) {
        this.ADDPLEDGETDEPOSIT_YOY = ADDPLEDGETDEPOSIT_YOY;
    }

    public double getOTHERINVPAY_YOY() {
        return OTHERINVPAY_YOY;
    }

    public void setOTHERINVPAY_YOY(double OTHERINVPAY_YOY) {
        this.OTHERINVPAY_YOY = OTHERINVPAY_YOY;
    }

    public double getSUMINVFLOWOUT_YOY() {
        return SUMINVFLOWOUT_YOY;
    }

    public void setSUMINVFLOWOUT_YOY(double SUMINVFLOWOUT_YOY) {
        this.SUMINVFLOWOUT_YOY = SUMINVFLOWOUT_YOY;
    }

    public double getNETINVCASHFLOW_YOY() {
        return NETINVCASHFLOW_YOY;
    }

    public void setNETINVCASHFLOW_YOY(double NETINVCASHFLOW_YOY) {
        this.NETINVCASHFLOW_YOY = NETINVCASHFLOW_YOY;
    }

    public double getACCEPTINVREC_YOY() {
        return ACCEPTINVREC_YOY;
    }

    public void setACCEPTINVREC_YOY(double ACCEPTINVREC_YOY) {
        this.ACCEPTINVREC_YOY = ACCEPTINVREC_YOY;
    }

    public double getSUBSIDIARYACCEPT_YOY() {
        return SUBSIDIARYACCEPT_YOY;
    }

    public void setSUBSIDIARYACCEPT_YOY(double SUBSIDIARYACCEPT_YOY) {
        this.SUBSIDIARYACCEPT_YOY = SUBSIDIARYACCEPT_YOY;
    }

    public double getLOANREC_YOY() {
        return LOANREC_YOY;
    }

    public void setLOANREC_YOY(double LOANREC_YOY) {
        this.LOANREC_YOY = LOANREC_YOY;
    }

    public double getISSUEBONDREC_YOY() {
        return ISSUEBONDREC_YOY;
    }

    public void setISSUEBONDREC_YOY(double ISSUEBONDREC_YOY) {
        this.ISSUEBONDREC_YOY = ISSUEBONDREC_YOY;
    }

    public double getOTHERFINAREC_YOY() {
        return OTHERFINAREC_YOY;
    }

    public void setOTHERFINAREC_YOY(double OTHERFINAREC_YOY) {
        this.OTHERFINAREC_YOY = OTHERFINAREC_YOY;
    }

    public double getSUMFINAFLOWIN_YOY() {
        return SUMFINAFLOWIN_YOY;
    }

    public void setSUMFINAFLOWIN_YOY(double SUMFINAFLOWIN_YOY) {
        this.SUMFINAFLOWIN_YOY = SUMFINAFLOWIN_YOY;
    }

    public double getREPAYDEBTPAY_YOY() {
        return REPAYDEBTPAY_YOY;
    }

    public void setREPAYDEBTPAY_YOY(double REPAYDEBTPAY_YOY) {
        this.REPAYDEBTPAY_YOY = REPAYDEBTPAY_YOY;
    }

    public double getDIVIPROFITORINTPAY_YOY() {
        return DIVIPROFITORINTPAY_YOY;
    }

    public void setDIVIPROFITORINTPAY_YOY(double DIVIPROFITORINTPAY_YOY) {
        this.DIVIPROFITORINTPAY_YOY = DIVIPROFITORINTPAY_YOY;
    }

    public double getSUBSIDIARYPAY_YOY() {
        return SUBSIDIARYPAY_YOY;
    }

    public void setSUBSIDIARYPAY_YOY(double SUBSIDIARYPAY_YOY) {
        this.SUBSIDIARYPAY_YOY = SUBSIDIARYPAY_YOY;
    }

    public double getBUYSUBSIDIARYPAY_YOY() {
        return BUYSUBSIDIARYPAY_YOY;
    }

    public void setBUYSUBSIDIARYPAY_YOY(double BUYSUBSIDIARYPAY_YOY) {
        this.BUYSUBSIDIARYPAY_YOY = BUYSUBSIDIARYPAY_YOY;
    }

    public double getOTHERFINAPAY_YOY() {
        return OTHERFINAPAY_YOY;
    }

    public void setOTHERFINAPAY_YOY(double OTHERFINAPAY_YOY) {
        this.OTHERFINAPAY_YOY = OTHERFINAPAY_YOY;
    }

    public double getSUBSIDIARYREDUCTCAPITAL_YOY() {
        return SUBSIDIARYREDUCTCAPITAL_YOY;
    }

    public void setSUBSIDIARYREDUCTCAPITAL_YOY(double SUBSIDIARYREDUCTCAPITAL_YOY) {
        this.SUBSIDIARYREDUCTCAPITAL_YOY = SUBSIDIARYREDUCTCAPITAL_YOY;
    }

    public double getSUMFINAFLOWOUT_YOY() {
        return SUMFINAFLOWOUT_YOY;
    }

    public void setSUMFINAFLOWOUT_YOY(double SUMFINAFLOWOUT_YOY) {
        this.SUMFINAFLOWOUT_YOY = SUMFINAFLOWOUT_YOY;
    }

    public double getNETFINACASHFLOW_YOY() {
        return NETFINACASHFLOW_YOY;
    }

    public void setNETFINACASHFLOW_YOY(double NETFINACASHFLOW_YOY) {
        this.NETFINACASHFLOW_YOY = NETFINACASHFLOW_YOY;
    }

    public double getEFFECTEXCHANGERATE_YOY() {
        return EFFECTEXCHANGERATE_YOY;
    }

    public void setEFFECTEXCHANGERATE_YOY(double EFFECTEXCHANGERATE_YOY) {
        this.EFFECTEXCHANGERATE_YOY = EFFECTEXCHANGERATE_YOY;
    }

    public double getNICASHEQUI_YOY() {
        return NICASHEQUI_YOY;
    }

    public void setNICASHEQUI_YOY(double NICASHEQUI_YOY) {
        this.NICASHEQUI_YOY = NICASHEQUI_YOY;
    }

    public double getCASHEQUIBEGINNING_YOY() {
        return CASHEQUIBEGINNING_YOY;
    }

    public void setCASHEQUIBEGINNING_YOY(double CASHEQUIBEGINNING_YOY) {
        this.CASHEQUIBEGINNING_YOY = CASHEQUIBEGINNING_YOY;
    }

    public double getCASHEQUIENDING_YOY() {
        return CASHEQUIENDING_YOY;
    }

    public void setCASHEQUIENDING_YOY(double CASHEQUIENDING_YOY) {
        this.CASHEQUIENDING_YOY = CASHEQUIENDING_YOY;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }
}
