package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-10-30
 * 利润表
 */
@Entity
@Table(name = "lrb")
public class Lrb extends BaseEntity {

    @Id
    private String id;

    private Date date;

    private String SECURITYCODE;

    private String REPORTTYPE;

    private String TYPE;

    private String REPORTDATE;


    /**
     * 营业总收入
     */
    private double TOTALOPERATEREVE;
    /**
     * 营业收入
     */
    private double OPERATEREVE;

    /**
     * 利息净收入
     */
    private double INTNREVE;

    /**
     * 利息收入
     */
    private double INTREVE;

    /**
     * 利息支出
     */
    private double INTEXP;

    /**
     * 已赚保费
     */
    private double PREMIUMEARNED;

    /**
     * 手续费及佣金净收入
     */
    private double COMMNREVE;

    /**
     * 手续费及佣金收入
     */
    private double COMMREVE;

    /**
     * 其中:代理买卖证券业务净收入
     */
    private double AGENTTRADESECURITY;

    /**
     * 手续费及佣金支出
     */
    private double COMMEXP;

    /**
     * 加:投资收益
     */
    private double INVESTINCOME;

    /**
     * 其中:对联营企业和合营企业的投资收益
     */
    private double INVESTJOINTINCOME;

    /**
     * 证券承销业务净收入
     */
    private double SECURITYUW;


    /**
     * 受托客户资产管理业务净收入
     */
    private double CLIENTASSETMANAGE;




    /**
     * 财务顾问净收入
     */
    private double FINACONSULT;

    /**
     * 保荐业务净收入
     */
    private double SPONSOR;

    /**
     * 基金管理业务净收入
     */
    private double FUNDMANAGE;

    /**
     * 基金销售业务净收入
     */
    private double FUNDSALE;

    /**
     * 证券经纪业务净收入
     */
    private double SECURITYBROKER;

    /**
     * 手续费及佣金净收入其他项目
     */
    private double COMMNREVEOTHER;

    /**
     * 公允价值变动收益
     */
    private double FVALUEINCOME;


    /**
     * 可供出售金融资产公允价值变动损益
     */
    private double FVALUEOSALABLE;


    /**
     * 汇兑收益
     */
    private double EXCHANGEINCOME;


    /**
     * 其他业务收入
     */
    private double OTHERREVE;

    /**
     * 营业总成本
     */
    private double TOTALOPERATEEXP;

    /**
     * 营业支出/营业成本
     */
    private double OPERATEEXP;

    /**
     * 研发费用
     */
    private double RDEXP;

    /**
     *退保金
     */
    private double SURRENDERPREMIUM;


    /**
     * 赔付支出净额
     */
    private double NETINDEMNITYEXP;

    /**
     * 提取保险合同准备金净额
     */
    private double NETCONTACTRESERVE;

    /**
     * 保单红利支出
     */
    private double POLICYDIVIEXP;


    /**
     * 分保费用
     */
    private double RIEXP;


    /**
     * 营业税金及附加
     */
    private double OPERATETAX;

    /**
     * 销售费用
     */
    private double SALEEXP;

    /**
     * 管理费用
     */
    private double MANAGEEXP;


    /**
     * 财务费用
     */
    private double FINANCEEXP;

    /**
     * 业务及管理费
     */
    private double OPERATEMANAGEEXP;

    /**
     * 资产减值损失
     */
    private double ASSETDEVALUELOSS;

    /**
     * 其他业务成本
     */
    private double OTHEREXP;

    /**
     * 营业利润
     */
    private double OPERATEPROFIT;

    /**
     * 加:营业外收入
     */
    private double NONOPERATEREVE;

    /**
     * 其中:非流动资产处置利得
     */
    private double NONLASSETREVE;

    /**
     * 减:营业外支出
     */
    private double NONOPERATEEXP;

    /**
     * 其中:非流动资产处置净损失
     */
    private double NONLASSETNETLOSS;

    /**
     * 利润总额
     */
    private double SUMPROFIT;

    /**
     * 减:所得税费用
     */
    private double INCOMETAX;

    /**
     * 被合并方在合并前实现利润
     */
    private double COMBINEDNETPROFITB;

    /**
     * 净利润
     */
    private double NETPROFIT;

    /**
     * 其中:归属于母公司股东的净利润
     */
    private double PARENTNETPROFIT;

    /**
     * 少数股东损益
     */
    private double MINORITYINCOME;

    /**
     * 扣除非经常性损益后的净利润
     */
    private double KCFJCXSYJLR;


    /**
     *稀释每股收益
     */
    private double DILUTEDEPS;

    /**
     * 基本每股收益
     */
    private double BASICEPS;

    /**
     * 其他综合收益
     */
    private double OTHERCINCOME;

    /**
     * 归属于母公司股东的其他综合收益
     */
    private double PARENTOTHERCINCOME;

    /**
     * 归属于少数股东的其他综合收益
     */
    private double MINORITYOTHERCINCOME;

    /**
     * 综合收益总额
     */
    private double SUMCINCOME;

    /**
     * 归属于母公司股东的综合收益总额
     */
    private double PARENTCINCOME;

    /**
     * 归属于少数股东的综合收益总额
     */
    private double MINORITYCINCOME;


    private double TOTALOPERATEREVE_YOY;

    private double OPERATEREVE_YOY;

    private double INTNREVE_YOY;

    private double INTREVE_YOY;

    private double INTEXP_YOY;

    private double RDEXP_YOY;

    private double SURRENDERPREMIUM_YOY;

    private double NETINDEMNITYEXP_YOY;

    private double PREMIUMEARNED_YOY;

    private double TOTALOPERATEEXP_YOY;

    private double NETCONTACTRESERVE_YOY;

    private double POLICYDIVIEXP_YOY;

    private double RIEXP_YOY;

    private double COMMNREVE_YOY;

    private double COMMREVE_YOY;

    private double COMMEXP_YOY;

    private double INVESTINCOME_YOY;

    private double INVESTJOINTINCOME_YOY;

    private double FVALUEINCOME_YOY;

    private double EXCHANGEINCOME_YOY;

    private double OTHERREVE_YOY;

    private double OPERATEEXP_YOY;

    private double OPERATETAX_YOY;

    private double OPERATEMANAGEEXP_YOY;


    private double AGENTTRADESECURITY_YOY;

    private double ASSETDEVALUELOSS_YOY;

    private double OTHEREXP_YOY;

    private double OPERATEPROFIT_YOY;

    private double NONOPERATEREVE_YOY;

    private double NONOPERATEEXP_YOY;

    private double SUMPROFIT_YOY;

    private double INCOMETAX_YOY;

    private double NETPROFIT_YOY;

    private double PARENTNETPROFIT_YOY;

    private double MINORITYINCOME_YOY;

    private double KCFJCXSYJLR_YOY;

    private double DILUTEDEPS_YOY;

    private double BASICEPS_YOY;

    private double OTHERCINCOME_YOY;

    private double PARENTOTHERCINCOME_YOY;

    private double MINORITYOTHERCINCOME_YOY;

    private double SUMCINCOME_YOY;

    private double PARENTCINCOME_YOY;

    private double MINORITYCINCOME_YOY;

    private double SECURITYUW_YOY;

    private double SALEEXP_YOY;

    private double MANAGEEXP_YOY;

    private double FINANCEEXP_YOY;

    private double NONLASSETREVE_YOY;

    private double NONLASSETNETLOSS_YOY;

    private double COMBINEDNETPROFITB_YOY;

    private double CLIENTASSETMANAGE_YOY;
    private double FINACONSULT_YOY;
    private double SPONSOR_YOY;
    private double FUNDMANAGE_YOY;
    private double FUNDSALE_YOY;
    private double SECURITYBROKER_YOY;
    private double COMMNREVEOTHER_YOY;
    private double FVALUEOSALABLE_YOY;

    private String CURRENCY;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getREPORTDATE() {
        return REPORTDATE;
    }

    public void setREPORTDATE(String REPORTDATE) {
        this.REPORTDATE = REPORTDATE;
    }

    public double getOPERATEREVE() {
        return OPERATEREVE;
    }

    public void setOPERATEREVE(double OPERATEREVE) {
        this.OPERATEREVE = OPERATEREVE;
    }

    public double getINTNREVE() {
        return INTNREVE;
    }

    public void setINTNREVE(double INTNREVE) {
        this.INTNREVE = INTNREVE;
    }

    public double getINTREVE() {
        return INTREVE;
    }

    public void setINTREVE(double INTREVE) {
        this.INTREVE = INTREVE;
    }

    public double getINTEXP() {
        return INTEXP;
    }

    public void setINTEXP(double INTEXP) {
        this.INTEXP = INTEXP;
    }

    public double getCOMMNREVE() {
        return COMMNREVE;
    }

    public void setCOMMNREVE(double COMMNREVE) {
        this.COMMNREVE = COMMNREVE;
    }

    public double getCOMMREVE() {
        return COMMREVE;
    }

    public void setCOMMREVE(double COMMREVE) {
        this.COMMREVE = COMMREVE;
    }

    public double getCOMMEXP() {
        return COMMEXP;
    }

    public void setCOMMEXP(double COMMEXP) {
        this.COMMEXP = COMMEXP;
    }

    public double getINVESTINCOME() {
        return INVESTINCOME;
    }

    public void setINVESTINCOME(double INVESTINCOME) {
        this.INVESTINCOME = INVESTINCOME;
    }

    public double getINVESTJOINTINCOME() {
        return INVESTJOINTINCOME;
    }

    public void setINVESTJOINTINCOME(double INVESTJOINTINCOME) {
        this.INVESTJOINTINCOME = INVESTJOINTINCOME;
    }

    public double getFVALUEINCOME() {
        return FVALUEINCOME;
    }

    public void setFVALUEINCOME(double FVALUEINCOME) {
        this.FVALUEINCOME = FVALUEINCOME;
    }

    public double getEXCHANGEINCOME() {
        return EXCHANGEINCOME;
    }

    public void setEXCHANGEINCOME(double EXCHANGEINCOME) {
        this.EXCHANGEINCOME = EXCHANGEINCOME;
    }

    public double getOTHERREVE() {
        return OTHERREVE;
    }

    public void setOTHERREVE(double OTHERREVE) {
        this.OTHERREVE = OTHERREVE;
    }

    public double getOPERATEEXP() {
        return OPERATEEXP;
    }

    public void setOPERATEEXP(double OPERATEEXP) {
        this.OPERATEEXP = OPERATEEXP;
    }

    public double getOPERATETAX() {
        return OPERATETAX;
    }

    public void setOPERATETAX(double OPERATETAX) {
        this.OPERATETAX = OPERATETAX;
    }

    public double getOPERATEMANAGEEXP() {
        return OPERATEMANAGEEXP;
    }

    public void setOPERATEMANAGEEXP(double OPERATEMANAGEEXP) {
        this.OPERATEMANAGEEXP = OPERATEMANAGEEXP;
    }

    public double getASSETDEVALUELOSS() {
        return ASSETDEVALUELOSS;
    }

    public void setASSETDEVALUELOSS(double ASSETDEVALUELOSS) {
        this.ASSETDEVALUELOSS = ASSETDEVALUELOSS;
    }

    public double getOTHEREXP() {
        return OTHEREXP;
    }

    public void setOTHEREXP(double OTHEREXP) {
        this.OTHEREXP = OTHEREXP;
    }

    public double getOPERATEPROFIT() {
        return OPERATEPROFIT;
    }

    public void setOPERATEPROFIT(double OPERATEPROFIT) {
        this.OPERATEPROFIT = OPERATEPROFIT;
    }

    public double getNONOPERATEREVE() {
        return NONOPERATEREVE;
    }

    public void setNONOPERATEREVE(double NONOPERATEREVE) {
        this.NONOPERATEREVE = NONOPERATEREVE;
    }

    public double getNONOPERATEEXP() {
        return NONOPERATEEXP;
    }

    public void setNONOPERATEEXP(double NONOPERATEEXP) {
        this.NONOPERATEEXP = NONOPERATEEXP;
    }

    public double getSUMPROFIT() {
        return SUMPROFIT;
    }

    public void setSUMPROFIT(double SUMPROFIT) {
        this.SUMPROFIT = SUMPROFIT;
    }

    public double getINCOMETAX() {
        return INCOMETAX;
    }

    public void setINCOMETAX(double INCOMETAX) {
        this.INCOMETAX = INCOMETAX;
    }

    public double getNETPROFIT() {
        return NETPROFIT;
    }

    public void setNETPROFIT(double NETPROFIT) {
        this.NETPROFIT = NETPROFIT;
    }

    public double getPARENTNETPROFIT() {
        return PARENTNETPROFIT;
    }

    public void setPARENTNETPROFIT(double PARENTNETPROFIT) {
        this.PARENTNETPROFIT = PARENTNETPROFIT;
    }

    public double getMINORITYINCOME() {
        return MINORITYINCOME;
    }

    public void setMINORITYINCOME(double MINORITYINCOME) {
        this.MINORITYINCOME = MINORITYINCOME;
    }

    public double getKCFJCXSYJLR() {
        return KCFJCXSYJLR;
    }

    public void setKCFJCXSYJLR(double KCFJCXSYJLR) {
        this.KCFJCXSYJLR = KCFJCXSYJLR;
    }

    public double getDILUTEDEPS() {
        return DILUTEDEPS;
    }

    public void setDILUTEDEPS(double DILUTEDEPS) {
        this.DILUTEDEPS = DILUTEDEPS;
    }

    public double getBASICEPS() {
        return BASICEPS;
    }

    public void setBASICEPS(double BASICEPS) {
        this.BASICEPS = BASICEPS;
    }

    public double getOTHERCINCOME() {
        return OTHERCINCOME;
    }

    public void setOTHERCINCOME(double OTHERCINCOME) {
        this.OTHERCINCOME = OTHERCINCOME;
    }

    public double getPARENTOTHERCINCOME() {
        return PARENTOTHERCINCOME;
    }

    public void setPARENTOTHERCINCOME(double PARENTOTHERCINCOME) {
        this.PARENTOTHERCINCOME = PARENTOTHERCINCOME;
    }

    public double getMINORITYOTHERCINCOME() {
        return MINORITYOTHERCINCOME;
    }

    public void setMINORITYOTHERCINCOME(double MINORITYOTHERCINCOME) {
        this.MINORITYOTHERCINCOME = MINORITYOTHERCINCOME;
    }

    public double getSUMCINCOME() {
        return SUMCINCOME;
    }

    public void setSUMCINCOME(double SUMCINCOME) {
        this.SUMCINCOME = SUMCINCOME;
    }

    public double getPARENTCINCOME() {
        return PARENTCINCOME;
    }

    public void setPARENTCINCOME(double PARENTCINCOME) {
        this.PARENTCINCOME = PARENTCINCOME;
    }

    public double getMINORITYCINCOME() {
        return MINORITYCINCOME;
    }

    public void setMINORITYCINCOME(double MINORITYCINCOME) {
        this.MINORITYCINCOME = MINORITYCINCOME;
    }

    public double getOPERATEREVE_YOY() {
        return OPERATEREVE_YOY;
    }

    public void setOPERATEREVE_YOY(double OPERATEREVE_YOY) {
        this.OPERATEREVE_YOY = OPERATEREVE_YOY;
    }

    public double getINTNREVE_YOY() {
        return INTNREVE_YOY;
    }

    public void setINTNREVE_YOY(double INTNREVE_YOY) {
        this.INTNREVE_YOY = INTNREVE_YOY;
    }

    public double getINTREVE_YOY() {
        return INTREVE_YOY;
    }

    public void setINTREVE_YOY(double INTREVE_YOY) {
        this.INTREVE_YOY = INTREVE_YOY;
    }

    public double getINTEXP_YOY() {
        return INTEXP_YOY;
    }

    public void setINTEXP_YOY(double INTEXP_YOY) {
        this.INTEXP_YOY = INTEXP_YOY;
    }

    public double getCOMMNREVE_YOY() {
        return COMMNREVE_YOY;
    }

    public void setCOMMNREVE_YOY(double COMMNREVE_YOY) {
        this.COMMNREVE_YOY = COMMNREVE_YOY;
    }

    public double getCOMMREVE_YOY() {
        return COMMREVE_YOY;
    }

    public void setCOMMREVE_YOY(double COMMREVE_YOY) {
        this.COMMREVE_YOY = COMMREVE_YOY;
    }

    public double getCOMMEXP_YOY() {
        return COMMEXP_YOY;
    }

    public void setCOMMEXP_YOY(double COMMEXP_YOY) {
        this.COMMEXP_YOY = COMMEXP_YOY;
    }

    public double getINVESTINCOME_YOY() {
        return INVESTINCOME_YOY;
    }

    public void setINVESTINCOME_YOY(double INVESTINCOME_YOY) {
        this.INVESTINCOME_YOY = INVESTINCOME_YOY;
    }

    public double getINVESTJOINTINCOME_YOY() {
        return INVESTJOINTINCOME_YOY;
    }

    public void setINVESTJOINTINCOME_YOY(double INVESTJOINTINCOME_YOY) {
        this.INVESTJOINTINCOME_YOY = INVESTJOINTINCOME_YOY;
    }

    public double getFVALUEINCOME_YOY() {
        return FVALUEINCOME_YOY;
    }

    public void setFVALUEINCOME_YOY(double FVALUEINCOME_YOY) {
        this.FVALUEINCOME_YOY = FVALUEINCOME_YOY;
    }

    public double getEXCHANGEINCOME_YOY() {
        return EXCHANGEINCOME_YOY;
    }

    public void setEXCHANGEINCOME_YOY(double EXCHANGEINCOME_YOY) {
        this.EXCHANGEINCOME_YOY = EXCHANGEINCOME_YOY;
    }

    public double getOTHERREVE_YOY() {
        return OTHERREVE_YOY;
    }

    public void setOTHERREVE_YOY(double OTHERREVE_YOY) {
        this.OTHERREVE_YOY = OTHERREVE_YOY;
    }

    public double getOPERATEEXP_YOY() {
        return OPERATEEXP_YOY;
    }

    public void setOPERATEEXP_YOY(double OPERATEEXP_YOY) {
        this.OPERATEEXP_YOY = OPERATEEXP_YOY;
    }

    public double getOPERATETAX_YOY() {
        return OPERATETAX_YOY;
    }

    public void setOPERATETAX_YOY(double OPERATETAX_YOY) {
        this.OPERATETAX_YOY = OPERATETAX_YOY;
    }

    public double getOPERATEMANAGEEXP_YOY() {
        return OPERATEMANAGEEXP_YOY;
    }

    public void setOPERATEMANAGEEXP_YOY(double OPERATEMANAGEEXP_YOY) {
        this.OPERATEMANAGEEXP_YOY = OPERATEMANAGEEXP_YOY;
    }

    public double getASSETDEVALUELOSS_YOY() {
        return ASSETDEVALUELOSS_YOY;
    }

    public void setASSETDEVALUELOSS_YOY(double ASSETDEVALUELOSS_YOY) {
        this.ASSETDEVALUELOSS_YOY = ASSETDEVALUELOSS_YOY;
    }

    public double getOTHEREXP_YOY() {
        return OTHEREXP_YOY;
    }

    public void setOTHEREXP_YOY(double OTHEREXP_YOY) {
        this.OTHEREXP_YOY = OTHEREXP_YOY;
    }

    public double getOPERATEPROFIT_YOY() {
        return OPERATEPROFIT_YOY;
    }

    public void setOPERATEPROFIT_YOY(double OPERATEPROFIT_YOY) {
        this.OPERATEPROFIT_YOY = OPERATEPROFIT_YOY;
    }

    public double getNONOPERATEREVE_YOY() {
        return NONOPERATEREVE_YOY;
    }

    public void setNONOPERATEREVE_YOY(double NONOPERATEREVE_YOY) {
        this.NONOPERATEREVE_YOY = NONOPERATEREVE_YOY;
    }

    public double getNONOPERATEEXP_YOY() {
        return NONOPERATEEXP_YOY;
    }

    public void setNONOPERATEEXP_YOY(double NONOPERATEEXP_YOY) {
        this.NONOPERATEEXP_YOY = NONOPERATEEXP_YOY;
    }

    public double getSUMPROFIT_YOY() {
        return SUMPROFIT_YOY;
    }

    public void setSUMPROFIT_YOY(double SUMPROFIT_YOY) {
        this.SUMPROFIT_YOY = SUMPROFIT_YOY;
    }

    public double getINCOMETAX_YOY() {
        return INCOMETAX_YOY;
    }

    public void setINCOMETAX_YOY(double INCOMETAX_YOY) {
        this.INCOMETAX_YOY = INCOMETAX_YOY;
    }

    public double getNETPROFIT_YOY() {
        return NETPROFIT_YOY;
    }

    public void setNETPROFIT_YOY(double NETPROFIT_YOY) {
        this.NETPROFIT_YOY = NETPROFIT_YOY;
    }

    public double getPARENTNETPROFIT_YOY() {
        return PARENTNETPROFIT_YOY;
    }

    public void setPARENTNETPROFIT_YOY(double PARENTNETPROFIT_YOY) {
        this.PARENTNETPROFIT_YOY = PARENTNETPROFIT_YOY;
    }

    public double getMINORITYINCOME_YOY() {
        return MINORITYINCOME_YOY;
    }

    public void setMINORITYINCOME_YOY(double MINORITYINCOME_YOY) {
        this.MINORITYINCOME_YOY = MINORITYINCOME_YOY;
    }

    public double getKCFJCXSYJLR_YOY() {
        return KCFJCXSYJLR_YOY;
    }

    public void setKCFJCXSYJLR_YOY(double KCFJCXSYJLR_YOY) {
        this.KCFJCXSYJLR_YOY = KCFJCXSYJLR_YOY;
    }

    public double getDILUTEDEPS_YOY() {
        return DILUTEDEPS_YOY;
    }

    public void setDILUTEDEPS_YOY(double DILUTEDEPS_YOY) {
        this.DILUTEDEPS_YOY = DILUTEDEPS_YOY;
    }

    public double getBASICEPS_YOY() {
        return BASICEPS_YOY;
    }

    public void setBASICEPS_YOY(double BASICEPS_YOY) {
        this.BASICEPS_YOY = BASICEPS_YOY;
    }

    public double getOTHERCINCOME_YOY() {
        return OTHERCINCOME_YOY;
    }

    public void setOTHERCINCOME_YOY(double OTHERCINCOME_YOY) {
        this.OTHERCINCOME_YOY = OTHERCINCOME_YOY;
    }

    public double getPARENTOTHERCINCOME_YOY() {
        return PARENTOTHERCINCOME_YOY;
    }

    public void setPARENTOTHERCINCOME_YOY(double PARENTOTHERCINCOME_YOY) {
        this.PARENTOTHERCINCOME_YOY = PARENTOTHERCINCOME_YOY;
    }

    public double getMINORITYOTHERCINCOME_YOY() {
        return MINORITYOTHERCINCOME_YOY;
    }

    public void setMINORITYOTHERCINCOME_YOY(double MINORITYOTHERCINCOME_YOY) {
        this.MINORITYOTHERCINCOME_YOY = MINORITYOTHERCINCOME_YOY;
    }

    public double getSUMCINCOME_YOY() {
        return SUMCINCOME_YOY;
    }

    public void setSUMCINCOME_YOY(double SUMCINCOME_YOY) {
        this.SUMCINCOME_YOY = SUMCINCOME_YOY;
    }

    public double getPARENTCINCOME_YOY() {
        return PARENTCINCOME_YOY;
    }

    public void setPARENTCINCOME_YOY(double PARENTCINCOME_YOY) {
        this.PARENTCINCOME_YOY = PARENTCINCOME_YOY;
    }

    public double getMINORITYCINCOME_YOY() {
        return MINORITYCINCOME_YOY;
    }

    public void setMINORITYCINCOME_YOY(double MINORITYCINCOME_YOY) {
        this.MINORITYCINCOME_YOY = MINORITYCINCOME_YOY;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public double getTOTALOPERATEREVE() {
        return TOTALOPERATEREVE;
    }

    public void setTOTALOPERATEREVE(double TOTALOPERATEREVE) {
        this.TOTALOPERATEREVE = TOTALOPERATEREVE;
    }

    public double getPREMIUMEARNED() {
        return PREMIUMEARNED;
    }

    public void setPREMIUMEARNED(double PREMIUMEARNED) {
        this.PREMIUMEARNED = PREMIUMEARNED;
    }

    public double getTOTALOPERATEEXP() {
        return TOTALOPERATEEXP;
    }

    public void setTOTALOPERATEEXP(double TOTALOPERATEEXP) {
        this.TOTALOPERATEEXP = TOTALOPERATEEXP;
    }

    public double getRDEXP() {
        return RDEXP;
    }

    public void setRDEXP(double RDEXP) {
        this.RDEXP = RDEXP;
    }

    public double getSURRENDERPREMIUM() {
        return SURRENDERPREMIUM;
    }

    public void setSURRENDERPREMIUM(double SURRENDERPREMIUM) {
        this.SURRENDERPREMIUM = SURRENDERPREMIUM;
    }

    public double getNETINDEMNITYEXP() {
        return NETINDEMNITYEXP;
    }

    public void setNETINDEMNITYEXP(double NETINDEMNITYEXP) {
        this.NETINDEMNITYEXP = NETINDEMNITYEXP;
    }

    public double getNETCONTACTRESERVE() {
        return NETCONTACTRESERVE;
    }

    public void setNETCONTACTRESERVE(double NETCONTACTRESERVE) {
        this.NETCONTACTRESERVE = NETCONTACTRESERVE;
    }

    public double getPOLICYDIVIEXP() {
        return POLICYDIVIEXP;
    }

    public void setPOLICYDIVIEXP(double POLICYDIVIEXP) {
        this.POLICYDIVIEXP = POLICYDIVIEXP;
    }

    public double getRIEXP() {
        return RIEXP;
    }

    public void setRIEXP(double RIEXP) {
        this.RIEXP = RIEXP;
    }

    public double getSALEEXP() {
        return SALEEXP;
    }

    public void setSALEEXP(double SALEEXP) {
        this.SALEEXP = SALEEXP;
    }

    public double getMANAGEEXP() {
        return MANAGEEXP;
    }

    public void setMANAGEEXP(double MANAGEEXP) {
        this.MANAGEEXP = MANAGEEXP;
    }

    public double getFINANCEEXP() {
        return FINANCEEXP;
    }

    public void setFINANCEEXP(double FINANCEEXP) {
        this.FINANCEEXP = FINANCEEXP;
    }

    public double getNONLASSETREVE() {
        return NONLASSETREVE;
    }

    public void setNONLASSETREVE(double NONLASSETREVE) {
        this.NONLASSETREVE = NONLASSETREVE;
    }

    public double getNONLASSETNETLOSS() {
        return NONLASSETNETLOSS;
    }

    public void setNONLASSETNETLOSS(double NONLASSETNETLOSS) {
        this.NONLASSETNETLOSS = NONLASSETNETLOSS;
    }

    public double getCOMBINEDNETPROFITB() {
        return COMBINEDNETPROFITB;
    }

    public void setCOMBINEDNETPROFITB(double COMBINEDNETPROFITB) {
        this.COMBINEDNETPROFITB = COMBINEDNETPROFITB;
    }

    public double getTOTALOPERATEREVE_YOY() {
        return TOTALOPERATEREVE_YOY;
    }

    public void setTOTALOPERATEREVE_YOY(double TOTALOPERATEREVE_YOY) {
        this.TOTALOPERATEREVE_YOY = TOTALOPERATEREVE_YOY;
    }

    public double getRDEXP_YOY() {
        return RDEXP_YOY;
    }

    public void setRDEXP_YOY(double RDEXP_YOY) {
        this.RDEXP_YOY = RDEXP_YOY;
    }

    public double getSURRENDERPREMIUM_YOY() {
        return SURRENDERPREMIUM_YOY;
    }

    public void setSURRENDERPREMIUM_YOY(double SURRENDERPREMIUM_YOY) {
        this.SURRENDERPREMIUM_YOY = SURRENDERPREMIUM_YOY;
    }

    public double getNETINDEMNITYEXP_YOY() {
        return NETINDEMNITYEXP_YOY;
    }

    public void setNETINDEMNITYEXP_YOY(double NETINDEMNITYEXP_YOY) {
        this.NETINDEMNITYEXP_YOY = NETINDEMNITYEXP_YOY;
    }

    public double getPREMIUMEARNED_YOY() {
        return PREMIUMEARNED_YOY;
    }

    public void setPREMIUMEARNED_YOY(double PREMIUMEARNED_YOY) {
        this.PREMIUMEARNED_YOY = PREMIUMEARNED_YOY;
    }

    public double getTOTALOPERATEEXP_YOY() {
        return TOTALOPERATEEXP_YOY;
    }

    public void setTOTALOPERATEEXP_YOY(double TOTALOPERATEEXP_YOY) {
        this.TOTALOPERATEEXP_YOY = TOTALOPERATEEXP_YOY;
    }

    public double getNETCONTACTRESERVE_YOY() {
        return NETCONTACTRESERVE_YOY;
    }

    public void setNETCONTACTRESERVE_YOY(double NETCONTACTRESERVE_YOY) {
        this.NETCONTACTRESERVE_YOY = NETCONTACTRESERVE_YOY;
    }

    public double getPOLICYDIVIEXP_YOY() {
        return POLICYDIVIEXP_YOY;
    }

    public void setPOLICYDIVIEXP_YOY(double POLICYDIVIEXP_YOY) {
        this.POLICYDIVIEXP_YOY = POLICYDIVIEXP_YOY;
    }

    public double getRIEXP_YOY() {
        return RIEXP_YOY;
    }

    public void setRIEXP_YOY(double RIEXP_YOY) {
        this.RIEXP_YOY = RIEXP_YOY;
    }

    public double getSALEEXP_YOY() {
        return SALEEXP_YOY;
    }

    public void setSALEEXP_YOY(double SALEEXP_YOY) {
        this.SALEEXP_YOY = SALEEXP_YOY;
    }

    public double getMANAGEEXP_YOY() {
        return MANAGEEXP_YOY;
    }

    public void setMANAGEEXP_YOY(double MANAGEEXP_YOY) {
        this.MANAGEEXP_YOY = MANAGEEXP_YOY;
    }

    public double getFINANCEEXP_YOY() {
        return FINANCEEXP_YOY;
    }

    public void setFINANCEEXP_YOY(double FINANCEEXP_YOY) {
        this.FINANCEEXP_YOY = FINANCEEXP_YOY;
    }

    public double getNONLASSETREVE_YOY() {
        return NONLASSETREVE_YOY;
    }

    public void setNONLASSETREVE_YOY(double NONLASSETREVE_YOY) {
        this.NONLASSETREVE_YOY = NONLASSETREVE_YOY;
    }

    public double getNONLASSETNETLOSS_YOY() {
        return NONLASSETNETLOSS_YOY;
    }

    public void setNONLASSETNETLOSS_YOY(double NONLASSETNETLOSS_YOY) {
        this.NONLASSETNETLOSS_YOY = NONLASSETNETLOSS_YOY;
    }

    public double getCOMBINEDNETPROFITB_YOY() {
        return COMBINEDNETPROFITB_YOY;
    }

    public void setCOMBINEDNETPROFITB_YOY(double COMBINEDNETPROFITB_YOY) {
        this.COMBINEDNETPROFITB_YOY = COMBINEDNETPROFITB_YOY;
    }

    public double getAGENTTRADESECURITY() {
        return AGENTTRADESECURITY;
    }

    public void setAGENTTRADESECURITY(double AGENTTRADESECURITY) {
        this.AGENTTRADESECURITY = AGENTTRADESECURITY;
    }

    public double getSECURITYUW() {
        return SECURITYUW;
    }

    public void setSECURITYUW(double SECURITYUW) {
        this.SECURITYUW = SECURITYUW;
    }

    public double getCLIENTASSETMANAGE() {
        return CLIENTASSETMANAGE;
    }

    public void setCLIENTASSETMANAGE(double CLIENTASSETMANAGE) {
        this.CLIENTASSETMANAGE = CLIENTASSETMANAGE;
    }

    public double getFINACONSULT() {
        return FINACONSULT;
    }

    public void setFINACONSULT(double FINACONSULT) {
        this.FINACONSULT = FINACONSULT;
    }

    public double getSPONSOR() {
        return SPONSOR;
    }

    public void setSPONSOR(double SPONSOR) {
        this.SPONSOR = SPONSOR;
    }

    public double getFUNDMANAGE() {
        return FUNDMANAGE;
    }

    public void setFUNDMANAGE(double FUNDMANAGE) {
        this.FUNDMANAGE = FUNDMANAGE;
    }

    public double getFUNDSALE() {
        return FUNDSALE;
    }

    public void setFUNDSALE(double FUNDSALE) {
        this.FUNDSALE = FUNDSALE;
    }

    public double getSECURITYBROKER() {
        return SECURITYBROKER;
    }

    public void setSECURITYBROKER(double SECURITYBROKER) {
        this.SECURITYBROKER = SECURITYBROKER;
    }

    public double getCOMMNREVEOTHER() {
        return COMMNREVEOTHER;
    }

    public void setCOMMNREVEOTHER(double COMMNREVEOTHER) {
        this.COMMNREVEOTHER = COMMNREVEOTHER;
    }

    public double getAGENTTRADESECURITY_YOY() {
        return AGENTTRADESECURITY_YOY;
    }

    public void setAGENTTRADESECURITY_YOY(double AGENTTRADESECURITY_YOY) {
        this.AGENTTRADESECURITY_YOY = AGENTTRADESECURITY_YOY;
    }

    public double getSECURITYUW_YOY() {
        return SECURITYUW_YOY;
    }

    public void setSECURITYUW_YOY(double SECURITYUW_YOY) {
        this.SECURITYUW_YOY = SECURITYUW_YOY;
    }

    public double getCLIENTASSETMANAGE_YOY() {
        return CLIENTASSETMANAGE_YOY;
    }

    public void setCLIENTASSETMANAGE_YOY(double CLIENTASSETMANAGE_YOY) {
        this.CLIENTASSETMANAGE_YOY = CLIENTASSETMANAGE_YOY;
    }

    public double getFINACONSULT_YOY() {
        return FINACONSULT_YOY;
    }

    public void setFINACONSULT_YOY(double FINACONSULT_YOY) {
        this.FINACONSULT_YOY = FINACONSULT_YOY;
    }

    public double getSPONSOR_YOY() {
        return SPONSOR_YOY;
    }

    public void setSPONSOR_YOY(double SPONSOR_YOY) {
        this.SPONSOR_YOY = SPONSOR_YOY;
    }

    public double getFUNDMANAGE_YOY() {
        return FUNDMANAGE_YOY;
    }

    public void setFUNDMANAGE_YOY(double FUNDMANAGE_YOY) {
        this.FUNDMANAGE_YOY = FUNDMANAGE_YOY;
    }

    public double getFUNDSALE_YOY() {
        return FUNDSALE_YOY;
    }

    public void setFUNDSALE_YOY(double FUNDSALE_YOY) {
        this.FUNDSALE_YOY = FUNDSALE_YOY;
    }

    public double getSECURITYBROKER_YOY() {
        return SECURITYBROKER_YOY;
    }

    public void setSECURITYBROKER_YOY(double SECURITYBROKER_YOY) {
        this.SECURITYBROKER_YOY = SECURITYBROKER_YOY;
    }

    public double getCOMMNREVEOTHER_YOY() {
        return COMMNREVEOTHER_YOY;
    }

    public void setCOMMNREVEOTHER_YOY(double COMMNREVEOTHER_YOY) {
        this.COMMNREVEOTHER_YOY = COMMNREVEOTHER_YOY;
    }

    public double getFVALUEOSALABLE() {
        return FVALUEOSALABLE;
    }

    public void setFVALUEOSALABLE(double FVALUEOSALABLE) {
        this.FVALUEOSALABLE = FVALUEOSALABLE;
    }

    public double getFVALUEOSALABLE_YOY() {
        return FVALUEOSALABLE_YOY;
    }

    public void setFVALUEOSALABLE_YOY(double FVALUEOSALABLE_YOY) {
        this.FVALUEOSALABLE_YOY = FVALUEOSALABLE_YOY;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
