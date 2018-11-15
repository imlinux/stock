package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-11-3
 */
@Entity
@Table(name = "zcfzb")
public class Zcfzb extends BaseEntity {

    @Id
    private String id;

    private Date date;

    private String SECURITYCODE;

    private String REPORTTYPE;

    private String TYPE;

    private String REPORTDATE;

    //------------------------------流动资产开始---------------------
    /**
     *  货币资金
     */
    private double MONETARYFUND;

    /**
     * 结算备付金
     */
    private double SETTLEMENTPROVISION;

    /**
     * 拆出资金
     */
    private double LENDFUND;

    /**
     * 以公允价值计量且其变动计入当期损益的金融资产
     */
    private double FVALUEFASSET;

    /**
     * 其中:交易性金融资产
     */
    private double TRADEFASSET;

    /**
     * 指定为以公允价值计量且其变动计入当期损益的金融资产
     */
    private double DEFINEFVALUEFASSET;

    /**
     * 应收票据
     */
    private double BILLREC;

    /**
     * 应收账款
     */
    private double ACCOUNTREC;

    /**
     * 预付款项
     */
    private double ADVANCEPAY;

    /**
     * 应收保费
     */
    private double PREMIUMREC;

    /**
     * 应收分保账款
     */
    private double RIREC;

    /**
     * 应收分保合同准备金
     */
    private double RICONTACTRESERVEREC;

    /**
     * 应收利息
     */
    private double INTERESTREC;

    /**
     * 应收股利
     */
    private double DIVIDENDREC;

    /**
     * 其他应收款
     */
    private double OTHERREC;

    /**
     * 应收出口退税
     */
    private double EXPORTREBATEREC;

    /**
     * 应收补贴款
     */
    private double SUBSIDYREC;

    /**
     * 内部应收款
     */
    private double INTERNALREC;

    /**
     * 买入返售金融资产
     */
    private double BUYSELLBACKFASSET;

    /**
     * 存货
     */
    private double INVENTORY;

    /**
     * 划分为持有待售的资产
     */
    private double CLHELDSALEASS;

    /**
     * 一年内到期的非流动资产
     */
    private double NONLASSETONEYEAR;

    /**
     * 其他流动资产
     */
    private double OTHERLASSET;

    /**
     * 流动资产合计
     */
    private double SUMLASSET;

    //------------------------------非流动资产开始---------------------

    /**
     * 发放委托贷款及垫款
     */
    private double LOANADVANCES;

    /**
     * 可供出售金融资产
     */
    private double SALEABLEFASSET;

    /**
     * 持有至到期投资
     */
    private double HELDMATURITYINV;

    /**
     * 长期应收款
     */
    private double LTREC;

    /**
     * 长期股权投资
     */
    private double LTEQUITYINV;

    /**
     * 投资性房地产
     */
    private double ESTATEINVEST;

    /**
     * 固定资产
     */
    private double FIXEDASSET;

    /**
     * 在建工程
     */
    private double CONSTRUCTIONPROGRESS;

    /**
     * 工程物资
     */
    private double CONSTRUCTIONMATERIAL;

    /**
     * 固定资产清理
     */
    private double LIQUIDATEFIXEDASSET;

    /**
     * 生产性生物资产
     */
    private double PRODUCTBIOLOGYASSET;

    /**
     * 油气资产
     */
    private double OILGASASSET;

    /**
     * 无形资产
     */
    private double INTANGIBLEASSET;

    /**
     * 开发支出
     */
    private double DEVELOPEXP;

    /**
     * 商誉
     */
    private double GOODWILL;

    /**
     * 长期待摊费用
     */
    private double LTDEFERASSET;

    /**
     * 递延所得税资产
     */
    private double DEFERINCOMETAXASSET;

    /**
     * 其他非流动资产
     */
    private double OTHERNONLASSET;

    /**
     * 非流动资产合计
     */
    private double SUMNONLASSET;

    /**
     * 资产总计
     */
    private double SUMASSET;

    //-----------------------流动负债开始--------------------------

    /**
     * 短期借款
     */
    private double STBORROW;

    /**
     * 向中央银行借款
     */
    private double BORROWFROMCBANK;

    /**
     * 吸收存款及同业存放
     */
    private double DEPOSIT;

    /**
     * 拆入资金
     */
    private double BORROWFUND;

    /**
     * 以公允价值计量且其变动计入当期损益的金融负债
     */
    private double FVALUEFLIAB;

    /**
     * 其中：交易性金融负债
     */
    private double TRADEFLIAB;

    /**
     * 指定以公允价值计量且其变动计入当期损益的金融负债
     */
    private double DEFINEFVALUEFLIAB;

    /**
     * 应付票据
     */
    private double BILLPAY;

    /**
     * 应付账款
     */
    private double ACCOUNTPAY;

    /**
     * 预收款项
     */
    private double ADVANCERECEIVE;

    /**
     * 卖出回购金融资产款
     */
    private double SELLBUYBACKFASSET;

    /**
     * 应付手续费及佣金
     */
    private double COMMPAY;

    /**
     * 应付职工薪酬
     */
    private double SALARYPAY;

    /**
     * 应交税费
     */
    private double TAXPAY;

    /**
     * 应付利息
     */
    private double INTERESTPAY;

    /**
     * 应付股利
     */
    private double DIVIDENDPAY;

    /**
     * 应付分保账款
     */
    private double RIPAY;

    /**
     * 内部应付款
     */
    private double INTERNALPAY;

    /**
     * 其他应付款
     */
    private double OTHERPAY;

    /**
     * 预计流动负债
     */
    private double ANTICIPATELLIAB;

    /**
     * 保险合同准备金
     */
    private double CONTACTRESERVE;

    /**
     * 代理买卖证券款
     */
    private double AGENTTRADESECURITY;

    /**
     * 代理承销证券款
     */
    private double AGENTUWSECURITY;

    /**
     *  一年内的递延收益
     */
    private double DEFERINCOMEONEYEAR;

    /**
     *  应付短期债券
     */
    private double STBONDREC;

    /**
     * 划分为持有待售的负债
     */
    private double CLHELDSALELIAB;

    /**
     * 一年内到期的非流动负债
     */
    private double NONLLIABONEYEAR;

    /**
     * 其他流动负债
     */
    private double OTHERLLIAB;

    /**
     * 流动负债合计
     */
    private double SUMLLIAB;
    //------------------------------非流动负债开始

    /**
     * 长期借款
     */
    private double LTBORROW;

    /**
     * 应付债券
     */
    private double BONDPAY;

    /**
     * 其中:优先股
     */
    private double PREFERSTOCBOND;

    /**
     * 永续债
     */
    private double SUSTAINBOND;

    /**
     * 长期应付款
     */
    private double LTACCOUNTPAY;

    /**
     * 长期应付职工薪酬
     */
    private double LTSALARYPAY;

    /**
     * 专项应付款
     */
    private double SPECIALPAY;

    /**
     * 预计负债
     */
    private double ANTICIPATELIAB;

    /**
     * 递延收益
     */
    private double DEFERINCOME;

    /**
     * 递延所得税负债
     */
    private double DEFERINCOMETAXLIAB;

    /**
     * 其他非流动负债
     */
    private double OTHERNONLLIAB;

    /**
     * 非流动负债合计
     */
    private double SUMNONLLIAB;

    /**
     * 负债合计
     */
    private double SUMLIAB;
    //---------------------所有者权益(或股东权益)-----------------------

    /**
     * 实收资本（或股本）
     */
    private double SHARECAPITAL;

    private double OTHEREQUITY;

    private double PREFERREDSTOCK;

    private double SUSTAINABLEDEBT;

    private double OTHEREQUITYOTHER;

    /**
     * 资本公积
     */
    private double CAPITALRESERVE;

    private double INVENTORYSHARE;

    private double SPECIALRESERVE;

    /**
     * 盈余公积
     */
    private double SURPLUSRESERVE;

    private double GENERALRISKPREPARE;

    private double UNCONFIRMINVLOSS;

    /**
     * 未分配利润
     */
    private double RETAINEDEARNING;

    private double PLANCASHDIVI;

    private double DIFFCONVERSIONFC;

    /**
     * 归属于母公司股东权益合计
     */
    private double SUMPARENTEQUITY;

    /**
     * 少数股东权益
     */
    private double MINORITYEQUITY;

    /**
     * 股东权益合计
     */
    private double SUMSHEQUITY;

    /**
     * 负债和股东权益合计
     */
    private double SUMLIABSHEQUITY;

    //------------------------百分比------------------------------------
    private double MONETARYFUND_YOY;
    private double SETTLEMENTPROVISION_YOY;
    private double LENDFUND_YOY;
    private double FVALUEFASSET_YOY;
    private double TRADEFASSET_YOY;
    private double DEFINEFVALUEFASSET_YOY;
    private double BILLREC_YOY;
    private double ACCOUNTREC_YOY;
    private double ADVANCEPAY_YOY;
    private double PREMIUMREC_YOY;
    private double RIREC_YOY;
    private double RICONTACTRESERVEREC_YOY;
    private double INTERESTREC_YOY;
    private double DIVIDENDREC_YOY;
    private double OTHERREC_YOY;
    private double EXPORTREBATEREC_YOY;
    private double SUBSIDYREC_YOY;
    private double INTERNALREC_YOY;
    private double BUYSELLBACKFASSET_YOY;
    private double INVENTORY_YOY;
    private double CLHELDSALEASS_YOY;
    private double NONLASSETONEYEAR_YOY;
    private double OTHERLASSET_YOY;
    private double SUMLASSET_YOY;
    private double LOANADVANCES_YOY;
    private double SALEABLEFASSET_YOY;
    private double HELDMATURITYINV_YOY;
    private double LTREC_YOY;
    private double LTEQUITYINV_YOY;
    private double ESTATEINVEST_YOY;
    private double FIXEDASSET_YOY;
    private double CONSTRUCTIONPROGRESS_YOY;
    private double CONSTRUCTIONMATERIAL_YOY;
    private double LIQUIDATEFIXEDASSET_YOY;
    private double PRODUCTBIOLOGYASSET_YOY;
    private double OILGASASSET_YOY;
    private double INTANGIBLEASSET_YOY;
    private double DEVELOPEXP_YOY;
    private double GOODWILL_YOY;
    private double LTDEFERASSET_YOY;
    private double DEFERINCOMETAXASSET_YOY;
    private double OTHERNONLASSET_YOY;
    private double SUMNONLASSET_YOY;
    private double SUMASSET_YOY;
    private double STBORROW_YOY;
    private double BORROWFROMCBANK_YOY;
    private double DEPOSIT_YOY;
    private double BORROWFUND_YOY;
    private double FVALUEFLIAB_YOY;
    private double TRADEFLIAB_YOY;
    private double DEFINEFVALUEFLIAB_YOY;
    private double BILLPAY_YOY;
    private double ACCOUNTPAY_YOY;
    private double ADVANCERECEIVE_YOY;
    private double SELLBUYBACKFASSET_YOY;
    private double COMMPAY_YOY;
    private double SALARYPAY_YOY;
    private double TAXPAY_YOY;
    private double INTERESTPAY_YOY;
    private double DIVIDENDPAY_YOY;
    private double RIPAY_YOY;
    private double INTERNALPAY_YOY;
    private double OTHERPAY_YOY;
    private double ANTICIPATELLIAB_YOY;
    private double CONTACTRESERVE_YOY;
    private double AGENTTRADESECURITY_YOY;
    private double AGENTUWSECURITY_YOY;
    private double DEFERINCOMEONEYEAR_YOY;
    private double STBONDREC_YOY;
    private double CLHELDSALELIAB_YOY;
    private double NONLLIABONEYEAR_YOY;
    private double OTHERLLIAB_YOY;
    private double SUMLLIAB_YOY;
    private double LTBORROW_YOY;
    private double BONDPAY_YOY;
    private double PREFERSTOCBOND_YOY;
    private double SUSTAINBOND_YOY;
    private double LTACCOUNTPAY_YOY;
    private double LTSALARYPAY_YOY;
    private double SPECIALPAY_YOY;
    private double ANTICIPATELIAB_YOY;
    private double DEFERINCOME_YOY;
    private double DEFERINCOMETAXLIAB_YOY;
    private double OTHERNONLLIAB_YOY;
    private double SUMNONLLIAB_YOY;
    private double SUMLIAB_YOY;
    private double SHARECAPITAL_YOY;
    private double OTHEREQUITY_YOY;
    private double PREFERREDSTOCK_YOY;
    private double SUSTAINABLEDEBT_YOY;
    private double OTHEREQUITYOTHER_YOY;
    private double CAPITALRESERVE_YOY;
    private double INVENTORYSHARE_YOY;
    private double SPECIALRESERVE_YOY;
    private double SURPLUSRESERVE_YOY;
    private double GENERALRISKPREPARE_YOY;
    private double UNCONFIRMINVLOSS_YOY;
    private double RETAINEDEARNING_YOY;
    private double PLANCASHDIVI_YOY;
    private double DIFFCONVERSIONFC_YOY;
    private double SUMPARENTEQUITY_YOY;
    private double MINORITYEQUITY_YOY;
    private double SUMSHEQUITY_YOY;
    private double SUMLIABSHEQUITY_YOY;

    private String CURRENCY;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public double getMONETARYFUND() {
        return MONETARYFUND;
    }

    public void setMONETARYFUND(double MONETARYFUND) {
        this.MONETARYFUND = MONETARYFUND;
    }

    public double getSETTLEMENTPROVISION() {
        return SETTLEMENTPROVISION;
    }

    public void setSETTLEMENTPROVISION(double SETTLEMENTPROVISION) {
        this.SETTLEMENTPROVISION = SETTLEMENTPROVISION;
    }

    public double getLENDFUND() {
        return LENDFUND;
    }

    public void setLENDFUND(double LENDFUND) {
        this.LENDFUND = LENDFUND;
    }

    public double getFVALUEFASSET() {
        return FVALUEFASSET;
    }

    public void setFVALUEFASSET(double FVALUEFASSET) {
        this.FVALUEFASSET = FVALUEFASSET;
    }

    public double getTRADEFASSET() {
        return TRADEFASSET;
    }

    public void setTRADEFASSET(double TRADEFASSET) {
        this.TRADEFASSET = TRADEFASSET;
    }

    public double getDEFINEFVALUEFASSET() {
        return DEFINEFVALUEFASSET;
    }

    public void setDEFINEFVALUEFASSET(double DEFINEFVALUEFASSET) {
        this.DEFINEFVALUEFASSET = DEFINEFVALUEFASSET;
    }

    public double getBILLREC() {
        return BILLREC;
    }

    public void setBILLREC(double BILLREC) {
        this.BILLREC = BILLREC;
    }

    public double getACCOUNTREC() {
        return ACCOUNTREC;
    }

    public void setACCOUNTREC(double ACCOUNTREC) {
        this.ACCOUNTREC = ACCOUNTREC;
    }

    public double getADVANCEPAY() {
        return ADVANCEPAY;
    }

    public void setADVANCEPAY(double ADVANCEPAY) {
        this.ADVANCEPAY = ADVANCEPAY;
    }

    public double getPREMIUMREC() {
        return PREMIUMREC;
    }

    public void setPREMIUMREC(double PREMIUMREC) {
        this.PREMIUMREC = PREMIUMREC;
    }

    public double getRIREC() {
        return RIREC;
    }

    public void setRIREC(double RIREC) {
        this.RIREC = RIREC;
    }

    public double getRICONTACTRESERVEREC() {
        return RICONTACTRESERVEREC;
    }

    public void setRICONTACTRESERVEREC(double RICONTACTRESERVEREC) {
        this.RICONTACTRESERVEREC = RICONTACTRESERVEREC;
    }

    public double getINTERESTREC() {
        return INTERESTREC;
    }

    public void setINTERESTREC(double INTERESTREC) {
        this.INTERESTREC = INTERESTREC;
    }

    public double getDIVIDENDREC() {
        return DIVIDENDREC;
    }

    public void setDIVIDENDREC(double DIVIDENDREC) {
        this.DIVIDENDREC = DIVIDENDREC;
    }

    public double getOTHERREC() {
        return OTHERREC;
    }

    public void setOTHERREC(double OTHERREC) {
        this.OTHERREC = OTHERREC;
    }

    public double getEXPORTREBATEREC() {
        return EXPORTREBATEREC;
    }

    public void setEXPORTREBATEREC(double EXPORTREBATEREC) {
        this.EXPORTREBATEREC = EXPORTREBATEREC;
    }

    public double getSUBSIDYREC() {
        return SUBSIDYREC;
    }

    public void setSUBSIDYREC(double SUBSIDYREC) {
        this.SUBSIDYREC = SUBSIDYREC;
    }

    public double getINTERNALREC() {
        return INTERNALREC;
    }

    public void setINTERNALREC(double INTERNALREC) {
        this.INTERNALREC = INTERNALREC;
    }

    public double getBUYSELLBACKFASSET() {
        return BUYSELLBACKFASSET;
    }

    public void setBUYSELLBACKFASSET(double BUYSELLBACKFASSET) {
        this.BUYSELLBACKFASSET = BUYSELLBACKFASSET;
    }

    public double getINVENTORY() {
        return INVENTORY;
    }

    public void setINVENTORY(double INVENTORY) {
        this.INVENTORY = INVENTORY;
    }

    public double getCLHELDSALEASS() {
        return CLHELDSALEASS;
    }

    public void setCLHELDSALEASS(double CLHELDSALEASS) {
        this.CLHELDSALEASS = CLHELDSALEASS;
    }

    public double getNONLASSETONEYEAR() {
        return NONLASSETONEYEAR;
    }

    public void setNONLASSETONEYEAR(double NONLASSETONEYEAR) {
        this.NONLASSETONEYEAR = NONLASSETONEYEAR;
    }

    public double getOTHERLASSET() {
        return OTHERLASSET;
    }

    public void setOTHERLASSET(double OTHERLASSET) {
        this.OTHERLASSET = OTHERLASSET;
    }

    public double getSUMLASSET() {
        return SUMLASSET;
    }

    public void setSUMLASSET(double SUMLASSET) {
        this.SUMLASSET = SUMLASSET;
    }

    public double getLOANADVANCES() {
        return LOANADVANCES;
    }

    public void setLOANADVANCES(double LOANADVANCES) {
        this.LOANADVANCES = LOANADVANCES;
    }

    public double getSALEABLEFASSET() {
        return SALEABLEFASSET;
    }

    public void setSALEABLEFASSET(double SALEABLEFASSET) {
        this.SALEABLEFASSET = SALEABLEFASSET;
    }

    public double getHELDMATURITYINV() {
        return HELDMATURITYINV;
    }

    public void setHELDMATURITYINV(double HELDMATURITYINV) {
        this.HELDMATURITYINV = HELDMATURITYINV;
    }

    public double getLTREC() {
        return LTREC;
    }

    public void setLTREC(double LTREC) {
        this.LTREC = LTREC;
    }

    public double getLTEQUITYINV() {
        return LTEQUITYINV;
    }

    public void setLTEQUITYINV(double LTEQUITYINV) {
        this.LTEQUITYINV = LTEQUITYINV;
    }

    public double getESTATEINVEST() {
        return ESTATEINVEST;
    }

    public void setESTATEINVEST(double ESTATEINVEST) {
        this.ESTATEINVEST = ESTATEINVEST;
    }

    public double getFIXEDASSET() {
        return FIXEDASSET;
    }

    public void setFIXEDASSET(double FIXEDASSET) {
        this.FIXEDASSET = FIXEDASSET;
    }

    public double getCONSTRUCTIONPROGRESS() {
        return CONSTRUCTIONPROGRESS;
    }

    public void setCONSTRUCTIONPROGRESS(double CONSTRUCTIONPROGRESS) {
        this.CONSTRUCTIONPROGRESS = CONSTRUCTIONPROGRESS;
    }

    public double getCONSTRUCTIONMATERIAL() {
        return CONSTRUCTIONMATERIAL;
    }

    public void setCONSTRUCTIONMATERIAL(double CONSTRUCTIONMATERIAL) {
        this.CONSTRUCTIONMATERIAL = CONSTRUCTIONMATERIAL;
    }

    public double getLIQUIDATEFIXEDASSET() {
        return LIQUIDATEFIXEDASSET;
    }

    public void setLIQUIDATEFIXEDASSET(double LIQUIDATEFIXEDASSET) {
        this.LIQUIDATEFIXEDASSET = LIQUIDATEFIXEDASSET;
    }

    public double getPRODUCTBIOLOGYASSET() {
        return PRODUCTBIOLOGYASSET;
    }

    public void setPRODUCTBIOLOGYASSET(double PRODUCTBIOLOGYASSET) {
        this.PRODUCTBIOLOGYASSET = PRODUCTBIOLOGYASSET;
    }

    public double getOILGASASSET() {
        return OILGASASSET;
    }

    public void setOILGASASSET(double OILGASASSET) {
        this.OILGASASSET = OILGASASSET;
    }

    public double getINTANGIBLEASSET() {
        return INTANGIBLEASSET;
    }

    public void setINTANGIBLEASSET(double INTANGIBLEASSET) {
        this.INTANGIBLEASSET = INTANGIBLEASSET;
    }

    public double getDEVELOPEXP() {
        return DEVELOPEXP;
    }

    public void setDEVELOPEXP(double DEVELOPEXP) {
        this.DEVELOPEXP = DEVELOPEXP;
    }

    public double getGOODWILL() {
        return GOODWILL;
    }

    public void setGOODWILL(double GOODWILL) {
        this.GOODWILL = GOODWILL;
    }

    public double getLTDEFERASSET() {
        return LTDEFERASSET;
    }

    public void setLTDEFERASSET(double LTDEFERASSET) {
        this.LTDEFERASSET = LTDEFERASSET;
    }

    public double getDEFERINCOMETAXASSET() {
        return DEFERINCOMETAXASSET;
    }

    public void setDEFERINCOMETAXASSET(double DEFERINCOMETAXASSET) {
        this.DEFERINCOMETAXASSET = DEFERINCOMETAXASSET;
    }

    public double getOTHERNONLASSET() {
        return OTHERNONLASSET;
    }

    public void setOTHERNONLASSET(double OTHERNONLASSET) {
        this.OTHERNONLASSET = OTHERNONLASSET;
    }

    public double getSUMNONLASSET() {
        return SUMNONLASSET;
    }

    public void setSUMNONLASSET(double SUMNONLASSET) {
        this.SUMNONLASSET = SUMNONLASSET;
    }

    public double getSUMASSET() {
        return SUMASSET;
    }

    public void setSUMASSET(double SUMASSET) {
        this.SUMASSET = SUMASSET;
    }

    public double getSTBORROW() {
        return STBORROW;
    }

    public void setSTBORROW(double STBORROW) {
        this.STBORROW = STBORROW;
    }

    public double getBORROWFROMCBANK() {
        return BORROWFROMCBANK;
    }

    public void setBORROWFROMCBANK(double BORROWFROMCBANK) {
        this.BORROWFROMCBANK = BORROWFROMCBANK;
    }

    public double getDEPOSIT() {
        return DEPOSIT;
    }

    public void setDEPOSIT(double DEPOSIT) {
        this.DEPOSIT = DEPOSIT;
    }

    public double getBORROWFUND() {
        return BORROWFUND;
    }

    public void setBORROWFUND(double BORROWFUND) {
        this.BORROWFUND = BORROWFUND;
    }

    public double getFVALUEFLIAB() {
        return FVALUEFLIAB;
    }

    public void setFVALUEFLIAB(double FVALUEFLIAB) {
        this.FVALUEFLIAB = FVALUEFLIAB;
    }

    public double getTRADEFLIAB() {
        return TRADEFLIAB;
    }

    public void setTRADEFLIAB(double TRADEFLIAB) {
        this.TRADEFLIAB = TRADEFLIAB;
    }

    public double getDEFINEFVALUEFLIAB() {
        return DEFINEFVALUEFLIAB;
    }

    public void setDEFINEFVALUEFLIAB(double DEFINEFVALUEFLIAB) {
        this.DEFINEFVALUEFLIAB = DEFINEFVALUEFLIAB;
    }

    public double getBILLPAY() {
        return BILLPAY;
    }

    public void setBILLPAY(double BILLPAY) {
        this.BILLPAY = BILLPAY;
    }

    public double getACCOUNTPAY() {
        return ACCOUNTPAY;
    }

    public void setACCOUNTPAY(double ACCOUNTPAY) {
        this.ACCOUNTPAY = ACCOUNTPAY;
    }

    public double getADVANCERECEIVE() {
        return ADVANCERECEIVE;
    }

    public void setADVANCERECEIVE(double ADVANCERECEIVE) {
        this.ADVANCERECEIVE = ADVANCERECEIVE;
    }

    public double getSELLBUYBACKFASSET() {
        return SELLBUYBACKFASSET;
    }

    public void setSELLBUYBACKFASSET(double SELLBUYBACKFASSET) {
        this.SELLBUYBACKFASSET = SELLBUYBACKFASSET;
    }

    public double getCOMMPAY() {
        return COMMPAY;
    }

    public void setCOMMPAY(double COMMPAY) {
        this.COMMPAY = COMMPAY;
    }

    public double getSALARYPAY() {
        return SALARYPAY;
    }

    public void setSALARYPAY(double SALARYPAY) {
        this.SALARYPAY = SALARYPAY;
    }

    public double getTAXPAY() {
        return TAXPAY;
    }

    public void setTAXPAY(double TAXPAY) {
        this.TAXPAY = TAXPAY;
    }

    public double getINTERESTPAY() {
        return INTERESTPAY;
    }

    public void setINTERESTPAY(double INTERESTPAY) {
        this.INTERESTPAY = INTERESTPAY;
    }

    public double getDIVIDENDPAY() {
        return DIVIDENDPAY;
    }

    public void setDIVIDENDPAY(double DIVIDENDPAY) {
        this.DIVIDENDPAY = DIVIDENDPAY;
    }

    public double getRIPAY() {
        return RIPAY;
    }

    public void setRIPAY(double RIPAY) {
        this.RIPAY = RIPAY;
    }

    public double getINTERNALPAY() {
        return INTERNALPAY;
    }

    public void setINTERNALPAY(double INTERNALPAY) {
        this.INTERNALPAY = INTERNALPAY;
    }

    public double getOTHERPAY() {
        return OTHERPAY;
    }

    public void setOTHERPAY(double OTHERPAY) {
        this.OTHERPAY = OTHERPAY;
    }

    public double getANTICIPATELLIAB() {
        return ANTICIPATELLIAB;
    }

    public void setANTICIPATELLIAB(double ANTICIPATELLIAB) {
        this.ANTICIPATELLIAB = ANTICIPATELLIAB;
    }

    public double getCONTACTRESERVE() {
        return CONTACTRESERVE;
    }

    public void setCONTACTRESERVE(double CONTACTRESERVE) {
        this.CONTACTRESERVE = CONTACTRESERVE;
    }

    public double getAGENTTRADESECURITY() {
        return AGENTTRADESECURITY;
    }

    public void setAGENTTRADESECURITY(double AGENTTRADESECURITY) {
        this.AGENTTRADESECURITY = AGENTTRADESECURITY;
    }

    public double getAGENTUWSECURITY() {
        return AGENTUWSECURITY;
    }

    public void setAGENTUWSECURITY(double AGENTUWSECURITY) {
        this.AGENTUWSECURITY = AGENTUWSECURITY;
    }

    public double getDEFERINCOMEONEYEAR() {
        return DEFERINCOMEONEYEAR;
    }

    public void setDEFERINCOMEONEYEAR(double DEFERINCOMEONEYEAR) {
        this.DEFERINCOMEONEYEAR = DEFERINCOMEONEYEAR;
    }

    public double getSTBONDREC() {
        return STBONDREC;
    }

    public void setSTBONDREC(double STBONDREC) {
        this.STBONDREC = STBONDREC;
    }

    public double getCLHELDSALELIAB() {
        return CLHELDSALELIAB;
    }

    public void setCLHELDSALELIAB(double CLHELDSALELIAB) {
        this.CLHELDSALELIAB = CLHELDSALELIAB;
    }

    public double getNONLLIABONEYEAR() {
        return NONLLIABONEYEAR;
    }

    public void setNONLLIABONEYEAR(double NONLLIABONEYEAR) {
        this.NONLLIABONEYEAR = NONLLIABONEYEAR;
    }

    public double getOTHERLLIAB() {
        return OTHERLLIAB;
    }

    public void setOTHERLLIAB(double OTHERLLIAB) {
        this.OTHERLLIAB = OTHERLLIAB;
    }

    public double getSUMLLIAB() {
        return SUMLLIAB;
    }

    public void setSUMLLIAB(double SUMLLIAB) {
        this.SUMLLIAB = SUMLLIAB;
    }

    public double getLTBORROW() {
        return LTBORROW;
    }

    public void setLTBORROW(double LTBORROW) {
        this.LTBORROW = LTBORROW;
    }

    public double getBONDPAY() {
        return BONDPAY;
    }

    public void setBONDPAY(double BONDPAY) {
        this.BONDPAY = BONDPAY;
    }

    public double getPREFERSTOCBOND() {
        return PREFERSTOCBOND;
    }

    public void setPREFERSTOCBOND(double PREFERSTOCBOND) {
        this.PREFERSTOCBOND = PREFERSTOCBOND;
    }

    public double getSUSTAINBOND() {
        return SUSTAINBOND;
    }

    public void setSUSTAINBOND(double SUSTAINBOND) {
        this.SUSTAINBOND = SUSTAINBOND;
    }

    public double getLTACCOUNTPAY() {
        return LTACCOUNTPAY;
    }

    public void setLTACCOUNTPAY(double LTACCOUNTPAY) {
        this.LTACCOUNTPAY = LTACCOUNTPAY;
    }

    public double getLTSALARYPAY() {
        return LTSALARYPAY;
    }

    public void setLTSALARYPAY(double LTSALARYPAY) {
        this.LTSALARYPAY = LTSALARYPAY;
    }

    public double getSPECIALPAY() {
        return SPECIALPAY;
    }

    public void setSPECIALPAY(double SPECIALPAY) {
        this.SPECIALPAY = SPECIALPAY;
    }

    public double getANTICIPATELIAB() {
        return ANTICIPATELIAB;
    }

    public void setANTICIPATELIAB(double ANTICIPATELIAB) {
        this.ANTICIPATELIAB = ANTICIPATELIAB;
    }

    public double getDEFERINCOME() {
        return DEFERINCOME;
    }

    public void setDEFERINCOME(double DEFERINCOME) {
        this.DEFERINCOME = DEFERINCOME;
    }

    public double getDEFERINCOMETAXLIAB() {
        return DEFERINCOMETAXLIAB;
    }

    public void setDEFERINCOMETAXLIAB(double DEFERINCOMETAXLIAB) {
        this.DEFERINCOMETAXLIAB = DEFERINCOMETAXLIAB;
    }

    public double getOTHERNONLLIAB() {
        return OTHERNONLLIAB;
    }

    public void setOTHERNONLLIAB(double OTHERNONLLIAB) {
        this.OTHERNONLLIAB = OTHERNONLLIAB;
    }

    public double getSUMNONLLIAB() {
        return SUMNONLLIAB;
    }

    public void setSUMNONLLIAB(double SUMNONLLIAB) {
        this.SUMNONLLIAB = SUMNONLLIAB;
    }

    public double getSUMLIAB() {
        return SUMLIAB;
    }

    public void setSUMLIAB(double SUMLIAB) {
        this.SUMLIAB = SUMLIAB;
    }

    public double getSHARECAPITAL() {
        return SHARECAPITAL;
    }

    public void setSHARECAPITAL(double SHARECAPITAL) {
        this.SHARECAPITAL = SHARECAPITAL;
    }

    public double getOTHEREQUITY() {
        return OTHEREQUITY;
    }

    public void setOTHEREQUITY(double OTHEREQUITY) {
        this.OTHEREQUITY = OTHEREQUITY;
    }

    public double getPREFERREDSTOCK() {
        return PREFERREDSTOCK;
    }

    public void setPREFERREDSTOCK(double PREFERREDSTOCK) {
        this.PREFERREDSTOCK = PREFERREDSTOCK;
    }

    public double getSUSTAINABLEDEBT() {
        return SUSTAINABLEDEBT;
    }

    public void setSUSTAINABLEDEBT(double SUSTAINABLEDEBT) {
        this.SUSTAINABLEDEBT = SUSTAINABLEDEBT;
    }

    public double getOTHEREQUITYOTHER() {
        return OTHEREQUITYOTHER;
    }

    public void setOTHEREQUITYOTHER(double OTHEREQUITYOTHER) {
        this.OTHEREQUITYOTHER = OTHEREQUITYOTHER;
    }

    public double getCAPITALRESERVE() {
        return CAPITALRESERVE;
    }

    public void setCAPITALRESERVE(double CAPITALRESERVE) {
        this.CAPITALRESERVE = CAPITALRESERVE;
    }

    public double getINVENTORYSHARE() {
        return INVENTORYSHARE;
    }

    public void setINVENTORYSHARE(double INVENTORYSHARE) {
        this.INVENTORYSHARE = INVENTORYSHARE;
    }

    public double getSPECIALRESERVE() {
        return SPECIALRESERVE;
    }

    public void setSPECIALRESERVE(double SPECIALRESERVE) {
        this.SPECIALRESERVE = SPECIALRESERVE;
    }

    public double getSURPLUSRESERVE() {
        return SURPLUSRESERVE;
    }

    public void setSURPLUSRESERVE(double SURPLUSRESERVE) {
        this.SURPLUSRESERVE = SURPLUSRESERVE;
    }

    public double getGENERALRISKPREPARE() {
        return GENERALRISKPREPARE;
    }

    public void setGENERALRISKPREPARE(double GENERALRISKPREPARE) {
        this.GENERALRISKPREPARE = GENERALRISKPREPARE;
    }

    public double getUNCONFIRMINVLOSS() {
        return UNCONFIRMINVLOSS;
    }

    public void setUNCONFIRMINVLOSS(double UNCONFIRMINVLOSS) {
        this.UNCONFIRMINVLOSS = UNCONFIRMINVLOSS;
    }

    public double getRETAINEDEARNING() {
        return RETAINEDEARNING;
    }

    public void setRETAINEDEARNING(double RETAINEDEARNING) {
        this.RETAINEDEARNING = RETAINEDEARNING;
    }

    public double getPLANCASHDIVI() {
        return PLANCASHDIVI;
    }

    public void setPLANCASHDIVI(double PLANCASHDIVI) {
        this.PLANCASHDIVI = PLANCASHDIVI;
    }

    public double getDIFFCONVERSIONFC() {
        return DIFFCONVERSIONFC;
    }

    public void setDIFFCONVERSIONFC(double DIFFCONVERSIONFC) {
        this.DIFFCONVERSIONFC = DIFFCONVERSIONFC;
    }

    public double getSUMPARENTEQUITY() {
        return SUMPARENTEQUITY;
    }

    public void setSUMPARENTEQUITY(double SUMPARENTEQUITY) {
        this.SUMPARENTEQUITY = SUMPARENTEQUITY;
    }

    public double getMINORITYEQUITY() {
        return MINORITYEQUITY;
    }

    public void setMINORITYEQUITY(double MINORITYEQUITY) {
        this.MINORITYEQUITY = MINORITYEQUITY;
    }

    public double getSUMSHEQUITY() {
        return SUMSHEQUITY;
    }

    public void setSUMSHEQUITY(double SUMSHEQUITY) {
        this.SUMSHEQUITY = SUMSHEQUITY;
    }

    public double getSUMLIABSHEQUITY() {
        return SUMLIABSHEQUITY;
    }

    public void setSUMLIABSHEQUITY(double SUMLIABSHEQUITY) {
        this.SUMLIABSHEQUITY = SUMLIABSHEQUITY;
    }

    public double getMONETARYFUND_YOY() {
        return MONETARYFUND_YOY;
    }

    public void setMONETARYFUND_YOY(double MONETARYFUND_YOY) {
        this.MONETARYFUND_YOY = MONETARYFUND_YOY;
    }

    public double getSETTLEMENTPROVISION_YOY() {
        return SETTLEMENTPROVISION_YOY;
    }

    public void setSETTLEMENTPROVISION_YOY(double SETTLEMENTPROVISION_YOY) {
        this.SETTLEMENTPROVISION_YOY = SETTLEMENTPROVISION_YOY;
    }

    public double getLENDFUND_YOY() {
        return LENDFUND_YOY;
    }

    public void setLENDFUND_YOY(double LENDFUND_YOY) {
        this.LENDFUND_YOY = LENDFUND_YOY;
    }

    public double getFVALUEFASSET_YOY() {
        return FVALUEFASSET_YOY;
    }

    public void setFVALUEFASSET_YOY(double FVALUEFASSET_YOY) {
        this.FVALUEFASSET_YOY = FVALUEFASSET_YOY;
    }

    public double getTRADEFASSET_YOY() {
        return TRADEFASSET_YOY;
    }

    public void setTRADEFASSET_YOY(double TRADEFASSET_YOY) {
        this.TRADEFASSET_YOY = TRADEFASSET_YOY;
    }

    public double getDEFINEFVALUEFASSET_YOY() {
        return DEFINEFVALUEFASSET_YOY;
    }

    public void setDEFINEFVALUEFASSET_YOY(double DEFINEFVALUEFASSET_YOY) {
        this.DEFINEFVALUEFASSET_YOY = DEFINEFVALUEFASSET_YOY;
    }

    public double getBILLREC_YOY() {
        return BILLREC_YOY;
    }

    public void setBILLREC_YOY(double BILLREC_YOY) {
        this.BILLREC_YOY = BILLREC_YOY;
    }

    public double getACCOUNTREC_YOY() {
        return ACCOUNTREC_YOY;
    }

    public void setACCOUNTREC_YOY(double ACCOUNTREC_YOY) {
        this.ACCOUNTREC_YOY = ACCOUNTREC_YOY;
    }

    public double getADVANCEPAY_YOY() {
        return ADVANCEPAY_YOY;
    }

    public void setADVANCEPAY_YOY(double ADVANCEPAY_YOY) {
        this.ADVANCEPAY_YOY = ADVANCEPAY_YOY;
    }

    public double getPREMIUMREC_YOY() {
        return PREMIUMREC_YOY;
    }

    public void setPREMIUMREC_YOY(double PREMIUMREC_YOY) {
        this.PREMIUMREC_YOY = PREMIUMREC_YOY;
    }

    public double getRIREC_YOY() {
        return RIREC_YOY;
    }

    public void setRIREC_YOY(double RIREC_YOY) {
        this.RIREC_YOY = RIREC_YOY;
    }

    public double getRICONTACTRESERVEREC_YOY() {
        return RICONTACTRESERVEREC_YOY;
    }

    public void setRICONTACTRESERVEREC_YOY(double RICONTACTRESERVEREC_YOY) {
        this.RICONTACTRESERVEREC_YOY = RICONTACTRESERVEREC_YOY;
    }

    public double getINTERESTREC_YOY() {
        return INTERESTREC_YOY;
    }

    public void setINTERESTREC_YOY(double INTERESTREC_YOY) {
        this.INTERESTREC_YOY = INTERESTREC_YOY;
    }

    public double getDIVIDENDREC_YOY() {
        return DIVIDENDREC_YOY;
    }

    public void setDIVIDENDREC_YOY(double DIVIDENDREC_YOY) {
        this.DIVIDENDREC_YOY = DIVIDENDREC_YOY;
    }

    public double getOTHERREC_YOY() {
        return OTHERREC_YOY;
    }

    public void setOTHERREC_YOY(double OTHERREC_YOY) {
        this.OTHERREC_YOY = OTHERREC_YOY;
    }

    public double getEXPORTREBATEREC_YOY() {
        return EXPORTREBATEREC_YOY;
    }

    public void setEXPORTREBATEREC_YOY(double EXPORTREBATEREC_YOY) {
        this.EXPORTREBATEREC_YOY = EXPORTREBATEREC_YOY;
    }

    public double getSUBSIDYREC_YOY() {
        return SUBSIDYREC_YOY;
    }

    public void setSUBSIDYREC_YOY(double SUBSIDYREC_YOY) {
        this.SUBSIDYREC_YOY = SUBSIDYREC_YOY;
    }

    public double getINTERNALREC_YOY() {
        return INTERNALREC_YOY;
    }

    public void setINTERNALREC_YOY(double INTERNALREC_YOY) {
        this.INTERNALREC_YOY = INTERNALREC_YOY;
    }

    public double getBUYSELLBACKFASSET_YOY() {
        return BUYSELLBACKFASSET_YOY;
    }

    public void setBUYSELLBACKFASSET_YOY(double BUYSELLBACKFASSET_YOY) {
        this.BUYSELLBACKFASSET_YOY = BUYSELLBACKFASSET_YOY;
    }

    public double getINVENTORY_YOY() {
        return INVENTORY_YOY;
    }

    public void setINVENTORY_YOY(double INVENTORY_YOY) {
        this.INVENTORY_YOY = INVENTORY_YOY;
    }

    public double getCLHELDSALEASS_YOY() {
        return CLHELDSALEASS_YOY;
    }

    public void setCLHELDSALEASS_YOY(double CLHELDSALEASS_YOY) {
        this.CLHELDSALEASS_YOY = CLHELDSALEASS_YOY;
    }

    public double getNONLASSETONEYEAR_YOY() {
        return NONLASSETONEYEAR_YOY;
    }

    public void setNONLASSETONEYEAR_YOY(double NONLASSETONEYEAR_YOY) {
        this.NONLASSETONEYEAR_YOY = NONLASSETONEYEAR_YOY;
    }

    public double getOTHERLASSET_YOY() {
        return OTHERLASSET_YOY;
    }

    public void setOTHERLASSET_YOY(double OTHERLASSET_YOY) {
        this.OTHERLASSET_YOY = OTHERLASSET_YOY;
    }

    public double getSUMLASSET_YOY() {
        return SUMLASSET_YOY;
    }

    public void setSUMLASSET_YOY(double SUMLASSET_YOY) {
        this.SUMLASSET_YOY = SUMLASSET_YOY;
    }

    public double getLOANADVANCES_YOY() {
        return LOANADVANCES_YOY;
    }

    public void setLOANADVANCES_YOY(double LOANADVANCES_YOY) {
        this.LOANADVANCES_YOY = LOANADVANCES_YOY;
    }

    public double getSALEABLEFASSET_YOY() {
        return SALEABLEFASSET_YOY;
    }

    public void setSALEABLEFASSET_YOY(double SALEABLEFASSET_YOY) {
        this.SALEABLEFASSET_YOY = SALEABLEFASSET_YOY;
    }

    public double getHELDMATURITYINV_YOY() {
        return HELDMATURITYINV_YOY;
    }

    public void setHELDMATURITYINV_YOY(double HELDMATURITYINV_YOY) {
        this.HELDMATURITYINV_YOY = HELDMATURITYINV_YOY;
    }

    public double getLTREC_YOY() {
        return LTREC_YOY;
    }

    public void setLTREC_YOY(double LTREC_YOY) {
        this.LTREC_YOY = LTREC_YOY;
    }

    public double getLTEQUITYINV_YOY() {
        return LTEQUITYINV_YOY;
    }

    public void setLTEQUITYINV_YOY(double LTEQUITYINV_YOY) {
        this.LTEQUITYINV_YOY = LTEQUITYINV_YOY;
    }

    public double getESTATEINVEST_YOY() {
        return ESTATEINVEST_YOY;
    }

    public void setESTATEINVEST_YOY(double ESTATEINVEST_YOY) {
        this.ESTATEINVEST_YOY = ESTATEINVEST_YOY;
    }

    public double getFIXEDASSET_YOY() {
        return FIXEDASSET_YOY;
    }

    public void setFIXEDASSET_YOY(double FIXEDASSET_YOY) {
        this.FIXEDASSET_YOY = FIXEDASSET_YOY;
    }

    public double getCONSTRUCTIONPROGRESS_YOY() {
        return CONSTRUCTIONPROGRESS_YOY;
    }

    public void setCONSTRUCTIONPROGRESS_YOY(double CONSTRUCTIONPROGRESS_YOY) {
        this.CONSTRUCTIONPROGRESS_YOY = CONSTRUCTIONPROGRESS_YOY;
    }

    public double getCONSTRUCTIONMATERIAL_YOY() {
        return CONSTRUCTIONMATERIAL_YOY;
    }

    public void setCONSTRUCTIONMATERIAL_YOY(double CONSTRUCTIONMATERIAL_YOY) {
        this.CONSTRUCTIONMATERIAL_YOY = CONSTRUCTIONMATERIAL_YOY;
    }

    public double getLIQUIDATEFIXEDASSET_YOY() {
        return LIQUIDATEFIXEDASSET_YOY;
    }

    public void setLIQUIDATEFIXEDASSET_YOY(double LIQUIDATEFIXEDASSET_YOY) {
        this.LIQUIDATEFIXEDASSET_YOY = LIQUIDATEFIXEDASSET_YOY;
    }

    public double getPRODUCTBIOLOGYASSET_YOY() {
        return PRODUCTBIOLOGYASSET_YOY;
    }

    public void setPRODUCTBIOLOGYASSET_YOY(double PRODUCTBIOLOGYASSET_YOY) {
        this.PRODUCTBIOLOGYASSET_YOY = PRODUCTBIOLOGYASSET_YOY;
    }

    public double getOILGASASSET_YOY() {
        return OILGASASSET_YOY;
    }

    public void setOILGASASSET_YOY(double OILGASASSET_YOY) {
        this.OILGASASSET_YOY = OILGASASSET_YOY;
    }

    public double getINTANGIBLEASSET_YOY() {
        return INTANGIBLEASSET_YOY;
    }

    public void setINTANGIBLEASSET_YOY(double INTANGIBLEASSET_YOY) {
        this.INTANGIBLEASSET_YOY = INTANGIBLEASSET_YOY;
    }

    public double getDEVELOPEXP_YOY() {
        return DEVELOPEXP_YOY;
    }

    public void setDEVELOPEXP_YOY(double DEVELOPEXP_YOY) {
        this.DEVELOPEXP_YOY = DEVELOPEXP_YOY;
    }

    public double getGOODWILL_YOY() {
        return GOODWILL_YOY;
    }

    public void setGOODWILL_YOY(double GOODWILL_YOY) {
        this.GOODWILL_YOY = GOODWILL_YOY;
    }

    public double getLTDEFERASSET_YOY() {
        return LTDEFERASSET_YOY;
    }

    public void setLTDEFERASSET_YOY(double LTDEFERASSET_YOY) {
        this.LTDEFERASSET_YOY = LTDEFERASSET_YOY;
    }

    public double getDEFERINCOMETAXASSET_YOY() {
        return DEFERINCOMETAXASSET_YOY;
    }

    public void setDEFERINCOMETAXASSET_YOY(double DEFERINCOMETAXASSET_YOY) {
        this.DEFERINCOMETAXASSET_YOY = DEFERINCOMETAXASSET_YOY;
    }

    public double getOTHERNONLASSET_YOY() {
        return OTHERNONLASSET_YOY;
    }

    public void setOTHERNONLASSET_YOY(double OTHERNONLASSET_YOY) {
        this.OTHERNONLASSET_YOY = OTHERNONLASSET_YOY;
    }

    public double getSUMNONLASSET_YOY() {
        return SUMNONLASSET_YOY;
    }

    public void setSUMNONLASSET_YOY(double SUMNONLASSET_YOY) {
        this.SUMNONLASSET_YOY = SUMNONLASSET_YOY;
    }

    public double getSUMASSET_YOY() {
        return SUMASSET_YOY;
    }

    public void setSUMASSET_YOY(double SUMASSET_YOY) {
        this.SUMASSET_YOY = SUMASSET_YOY;
    }

    public double getSTBORROW_YOY() {
        return STBORROW_YOY;
    }

    public void setSTBORROW_YOY(double STBORROW_YOY) {
        this.STBORROW_YOY = STBORROW_YOY;
    }

    public double getBORROWFROMCBANK_YOY() {
        return BORROWFROMCBANK_YOY;
    }

    public void setBORROWFROMCBANK_YOY(double BORROWFROMCBANK_YOY) {
        this.BORROWFROMCBANK_YOY = BORROWFROMCBANK_YOY;
    }

    public double getDEPOSIT_YOY() {
        return DEPOSIT_YOY;
    }

    public void setDEPOSIT_YOY(double DEPOSIT_YOY) {
        this.DEPOSIT_YOY = DEPOSIT_YOY;
    }

    public double getBORROWFUND_YOY() {
        return BORROWFUND_YOY;
    }

    public void setBORROWFUND_YOY(double BORROWFUND_YOY) {
        this.BORROWFUND_YOY = BORROWFUND_YOY;
    }

    public double getFVALUEFLIAB_YOY() {
        return FVALUEFLIAB_YOY;
    }

    public void setFVALUEFLIAB_YOY(double FVALUEFLIAB_YOY) {
        this.FVALUEFLIAB_YOY = FVALUEFLIAB_YOY;
    }

    public double getTRADEFLIAB_YOY() {
        return TRADEFLIAB_YOY;
    }

    public void setTRADEFLIAB_YOY(double TRADEFLIAB_YOY) {
        this.TRADEFLIAB_YOY = TRADEFLIAB_YOY;
    }

    public double getDEFINEFVALUEFLIAB_YOY() {
        return DEFINEFVALUEFLIAB_YOY;
    }

    public void setDEFINEFVALUEFLIAB_YOY(double DEFINEFVALUEFLIAB_YOY) {
        this.DEFINEFVALUEFLIAB_YOY = DEFINEFVALUEFLIAB_YOY;
    }

    public double getBILLPAY_YOY() {
        return BILLPAY_YOY;
    }

    public void setBILLPAY_YOY(double BILLPAY_YOY) {
        this.BILLPAY_YOY = BILLPAY_YOY;
    }

    public double getACCOUNTPAY_YOY() {
        return ACCOUNTPAY_YOY;
    }

    public void setACCOUNTPAY_YOY(double ACCOUNTPAY_YOY) {
        this.ACCOUNTPAY_YOY = ACCOUNTPAY_YOY;
    }

    public double getADVANCERECEIVE_YOY() {
        return ADVANCERECEIVE_YOY;
    }

    public void setADVANCERECEIVE_YOY(double ADVANCERECEIVE_YOY) {
        this.ADVANCERECEIVE_YOY = ADVANCERECEIVE_YOY;
    }

    public double getSELLBUYBACKFASSET_YOY() {
        return SELLBUYBACKFASSET_YOY;
    }

    public void setSELLBUYBACKFASSET_YOY(double SELLBUYBACKFASSET_YOY) {
        this.SELLBUYBACKFASSET_YOY = SELLBUYBACKFASSET_YOY;
    }

    public double getCOMMPAY_YOY() {
        return COMMPAY_YOY;
    }

    public void setCOMMPAY_YOY(double COMMPAY_YOY) {
        this.COMMPAY_YOY = COMMPAY_YOY;
    }

    public double getSALARYPAY_YOY() {
        return SALARYPAY_YOY;
    }

    public void setSALARYPAY_YOY(double SALARYPAY_YOY) {
        this.SALARYPAY_YOY = SALARYPAY_YOY;
    }

    public double getTAXPAY_YOY() {
        return TAXPAY_YOY;
    }

    public void setTAXPAY_YOY(double TAXPAY_YOY) {
        this.TAXPAY_YOY = TAXPAY_YOY;
    }

    public double getINTERESTPAY_YOY() {
        return INTERESTPAY_YOY;
    }

    public void setINTERESTPAY_YOY(double INTERESTPAY_YOY) {
        this.INTERESTPAY_YOY = INTERESTPAY_YOY;
    }

    public double getDIVIDENDPAY_YOY() {
        return DIVIDENDPAY_YOY;
    }

    public void setDIVIDENDPAY_YOY(double DIVIDENDPAY_YOY) {
        this.DIVIDENDPAY_YOY = DIVIDENDPAY_YOY;
    }

    public double getRIPAY_YOY() {
        return RIPAY_YOY;
    }

    public void setRIPAY_YOY(double RIPAY_YOY) {
        this.RIPAY_YOY = RIPAY_YOY;
    }

    public double getINTERNALPAY_YOY() {
        return INTERNALPAY_YOY;
    }

    public void setINTERNALPAY_YOY(double INTERNALPAY_YOY) {
        this.INTERNALPAY_YOY = INTERNALPAY_YOY;
    }

    public double getOTHERPAY_YOY() {
        return OTHERPAY_YOY;
    }

    public void setOTHERPAY_YOY(double OTHERPAY_YOY) {
        this.OTHERPAY_YOY = OTHERPAY_YOY;
    }

    public double getANTICIPATELLIAB_YOY() {
        return ANTICIPATELLIAB_YOY;
    }

    public void setANTICIPATELLIAB_YOY(double ANTICIPATELLIAB_YOY) {
        this.ANTICIPATELLIAB_YOY = ANTICIPATELLIAB_YOY;
    }

    public double getCONTACTRESERVE_YOY() {
        return CONTACTRESERVE_YOY;
    }

    public void setCONTACTRESERVE_YOY(double CONTACTRESERVE_YOY) {
        this.CONTACTRESERVE_YOY = CONTACTRESERVE_YOY;
    }

    public double getAGENTTRADESECURITY_YOY() {
        return AGENTTRADESECURITY_YOY;
    }

    public void setAGENTTRADESECURITY_YOY(double AGENTTRADESECURITY_YOY) {
        this.AGENTTRADESECURITY_YOY = AGENTTRADESECURITY_YOY;
    }

    public double getAGENTUWSECURITY_YOY() {
        return AGENTUWSECURITY_YOY;
    }

    public void setAGENTUWSECURITY_YOY(double AGENTUWSECURITY_YOY) {
        this.AGENTUWSECURITY_YOY = AGENTUWSECURITY_YOY;
    }

    public double getDEFERINCOMEONEYEAR_YOY() {
        return DEFERINCOMEONEYEAR_YOY;
    }

    public void setDEFERINCOMEONEYEAR_YOY(double DEFERINCOMEONEYEAR_YOY) {
        this.DEFERINCOMEONEYEAR_YOY = DEFERINCOMEONEYEAR_YOY;
    }

    public double getSTBONDREC_YOY() {
        return STBONDREC_YOY;
    }

    public void setSTBONDREC_YOY(double STBONDREC_YOY) {
        this.STBONDREC_YOY = STBONDREC_YOY;
    }

    public double getCLHELDSALELIAB_YOY() {
        return CLHELDSALELIAB_YOY;
    }

    public void setCLHELDSALELIAB_YOY(double CLHELDSALELIAB_YOY) {
        this.CLHELDSALELIAB_YOY = CLHELDSALELIAB_YOY;
    }

    public double getNONLLIABONEYEAR_YOY() {
        return NONLLIABONEYEAR_YOY;
    }

    public void setNONLLIABONEYEAR_YOY(double NONLLIABONEYEAR_YOY) {
        this.NONLLIABONEYEAR_YOY = NONLLIABONEYEAR_YOY;
    }

    public double getOTHERLLIAB_YOY() {
        return OTHERLLIAB_YOY;
    }

    public void setOTHERLLIAB_YOY(double OTHERLLIAB_YOY) {
        this.OTHERLLIAB_YOY = OTHERLLIAB_YOY;
    }

    public double getSUMLLIAB_YOY() {
        return SUMLLIAB_YOY;
    }

    public void setSUMLLIAB_YOY(double SUMLLIAB_YOY) {
        this.SUMLLIAB_YOY = SUMLLIAB_YOY;
    }

    public double getLTBORROW_YOY() {
        return LTBORROW_YOY;
    }

    public void setLTBORROW_YOY(double LTBORROW_YOY) {
        this.LTBORROW_YOY = LTBORROW_YOY;
    }

    public double getBONDPAY_YOY() {
        return BONDPAY_YOY;
    }

    public void setBONDPAY_YOY(double BONDPAY_YOY) {
        this.BONDPAY_YOY = BONDPAY_YOY;
    }

    public double getPREFERSTOCBOND_YOY() {
        return PREFERSTOCBOND_YOY;
    }

    public void setPREFERSTOCBOND_YOY(double PREFERSTOCBOND_YOY) {
        this.PREFERSTOCBOND_YOY = PREFERSTOCBOND_YOY;
    }

    public double getSUSTAINBOND_YOY() {
        return SUSTAINBOND_YOY;
    }

    public void setSUSTAINBOND_YOY(double SUSTAINBOND_YOY) {
        this.SUSTAINBOND_YOY = SUSTAINBOND_YOY;
    }

    public double getLTACCOUNTPAY_YOY() {
        return LTACCOUNTPAY_YOY;
    }

    public void setLTACCOUNTPAY_YOY(double LTACCOUNTPAY_YOY) {
        this.LTACCOUNTPAY_YOY = LTACCOUNTPAY_YOY;
    }

    public double getLTSALARYPAY_YOY() {
        return LTSALARYPAY_YOY;
    }

    public void setLTSALARYPAY_YOY(double LTSALARYPAY_YOY) {
        this.LTSALARYPAY_YOY = LTSALARYPAY_YOY;
    }

    public double getSPECIALPAY_YOY() {
        return SPECIALPAY_YOY;
    }

    public void setSPECIALPAY_YOY(double SPECIALPAY_YOY) {
        this.SPECIALPAY_YOY = SPECIALPAY_YOY;
    }

    public double getANTICIPATELIAB_YOY() {
        return ANTICIPATELIAB_YOY;
    }

    public void setANTICIPATELIAB_YOY(double ANTICIPATELIAB_YOY) {
        this.ANTICIPATELIAB_YOY = ANTICIPATELIAB_YOY;
    }

    public double getDEFERINCOME_YOY() {
        return DEFERINCOME_YOY;
    }

    public void setDEFERINCOME_YOY(double DEFERINCOME_YOY) {
        this.DEFERINCOME_YOY = DEFERINCOME_YOY;
    }

    public double getDEFERINCOMETAXLIAB_YOY() {
        return DEFERINCOMETAXLIAB_YOY;
    }

    public void setDEFERINCOMETAXLIAB_YOY(double DEFERINCOMETAXLIAB_YOY) {
        this.DEFERINCOMETAXLIAB_YOY = DEFERINCOMETAXLIAB_YOY;
    }

    public double getOTHERNONLLIAB_YOY() {
        return OTHERNONLLIAB_YOY;
    }

    public void setOTHERNONLLIAB_YOY(double OTHERNONLLIAB_YOY) {
        this.OTHERNONLLIAB_YOY = OTHERNONLLIAB_YOY;
    }

    public double getSUMNONLLIAB_YOY() {
        return SUMNONLLIAB_YOY;
    }

    public void setSUMNONLLIAB_YOY(double SUMNONLLIAB_YOY) {
        this.SUMNONLLIAB_YOY = SUMNONLLIAB_YOY;
    }

    public double getSUMLIAB_YOY() {
        return SUMLIAB_YOY;
    }

    public void setSUMLIAB_YOY(double SUMLIAB_YOY) {
        this.SUMLIAB_YOY = SUMLIAB_YOY;
    }

    public double getSHARECAPITAL_YOY() {
        return SHARECAPITAL_YOY;
    }

    public void setSHARECAPITAL_YOY(double SHARECAPITAL_YOY) {
        this.SHARECAPITAL_YOY = SHARECAPITAL_YOY;
    }

    public double getOTHEREQUITY_YOY() {
        return OTHEREQUITY_YOY;
    }

    public void setOTHEREQUITY_YOY(double OTHEREQUITY_YOY) {
        this.OTHEREQUITY_YOY = OTHEREQUITY_YOY;
    }

    public double getPREFERREDSTOCK_YOY() {
        return PREFERREDSTOCK_YOY;
    }

    public void setPREFERREDSTOCK_YOY(double PREFERREDSTOCK_YOY) {
        this.PREFERREDSTOCK_YOY = PREFERREDSTOCK_YOY;
    }

    public double getSUSTAINABLEDEBT_YOY() {
        return SUSTAINABLEDEBT_YOY;
    }

    public void setSUSTAINABLEDEBT_YOY(double SUSTAINABLEDEBT_YOY) {
        this.SUSTAINABLEDEBT_YOY = SUSTAINABLEDEBT_YOY;
    }

    public double getOTHEREQUITYOTHER_YOY() {
        return OTHEREQUITYOTHER_YOY;
    }

    public void setOTHEREQUITYOTHER_YOY(double OTHEREQUITYOTHER_YOY) {
        this.OTHEREQUITYOTHER_YOY = OTHEREQUITYOTHER_YOY;
    }

    public double getCAPITALRESERVE_YOY() {
        return CAPITALRESERVE_YOY;
    }

    public void setCAPITALRESERVE_YOY(double CAPITALRESERVE_YOY) {
        this.CAPITALRESERVE_YOY = CAPITALRESERVE_YOY;
    }

    public double getINVENTORYSHARE_YOY() {
        return INVENTORYSHARE_YOY;
    }

    public void setINVENTORYSHARE_YOY(double INVENTORYSHARE_YOY) {
        this.INVENTORYSHARE_YOY = INVENTORYSHARE_YOY;
    }

    public double getSPECIALRESERVE_YOY() {
        return SPECIALRESERVE_YOY;
    }

    public void setSPECIALRESERVE_YOY(double SPECIALRESERVE_YOY) {
        this.SPECIALRESERVE_YOY = SPECIALRESERVE_YOY;
    }

    public double getSURPLUSRESERVE_YOY() {
        return SURPLUSRESERVE_YOY;
    }

    public void setSURPLUSRESERVE_YOY(double SURPLUSRESERVE_YOY) {
        this.SURPLUSRESERVE_YOY = SURPLUSRESERVE_YOY;
    }

    public double getGENERALRISKPREPARE_YOY() {
        return GENERALRISKPREPARE_YOY;
    }

    public void setGENERALRISKPREPARE_YOY(double GENERALRISKPREPARE_YOY) {
        this.GENERALRISKPREPARE_YOY = GENERALRISKPREPARE_YOY;
    }

    public double getUNCONFIRMINVLOSS_YOY() {
        return UNCONFIRMINVLOSS_YOY;
    }

    public void setUNCONFIRMINVLOSS_YOY(double UNCONFIRMINVLOSS_YOY) {
        this.UNCONFIRMINVLOSS_YOY = UNCONFIRMINVLOSS_YOY;
    }

    public double getRETAINEDEARNING_YOY() {
        return RETAINEDEARNING_YOY;
    }

    public void setRETAINEDEARNING_YOY(double RETAINEDEARNING_YOY) {
        this.RETAINEDEARNING_YOY = RETAINEDEARNING_YOY;
    }

    public double getPLANCASHDIVI_YOY() {
        return PLANCASHDIVI_YOY;
    }

    public void setPLANCASHDIVI_YOY(double PLANCASHDIVI_YOY) {
        this.PLANCASHDIVI_YOY = PLANCASHDIVI_YOY;
    }

    public double getDIFFCONVERSIONFC_YOY() {
        return DIFFCONVERSIONFC_YOY;
    }

    public void setDIFFCONVERSIONFC_YOY(double DIFFCONVERSIONFC_YOY) {
        this.DIFFCONVERSIONFC_YOY = DIFFCONVERSIONFC_YOY;
    }

    public double getSUMPARENTEQUITY_YOY() {
        return SUMPARENTEQUITY_YOY;
    }

    public void setSUMPARENTEQUITY_YOY(double SUMPARENTEQUITY_YOY) {
        this.SUMPARENTEQUITY_YOY = SUMPARENTEQUITY_YOY;
    }

    public double getMINORITYEQUITY_YOY() {
        return MINORITYEQUITY_YOY;
    }

    public void setMINORITYEQUITY_YOY(double MINORITYEQUITY_YOY) {
        this.MINORITYEQUITY_YOY = MINORITYEQUITY_YOY;
    }

    public double getSUMSHEQUITY_YOY() {
        return SUMSHEQUITY_YOY;
    }

    public void setSUMSHEQUITY_YOY(double SUMSHEQUITY_YOY) {
        this.SUMSHEQUITY_YOY = SUMSHEQUITY_YOY;
    }

    public double getSUMLIABSHEQUITY_YOY() {
        return SUMLIABSHEQUITY_YOY;
    }

    public void setSUMLIABSHEQUITY_YOY(double SUMLIABSHEQUITY_YOY) {
        this.SUMLIABSHEQUITY_YOY = SUMLIABSHEQUITY_YOY;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }
}
