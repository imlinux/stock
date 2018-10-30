package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-10-30
 * 利润表
 */
@Entity
@Table(name = "profit_statement")
public class ProfitStatement {


    private String ticker; //股票代码

    private String secShortName; //证券简称

    private String publishDate; //发布日期

    private String endDate; //截止日期

    private String endDateRep; //报表截止日期

    private String actPubtime; //实际披露时间

    private String mergedFlag; //合并类型。1-合并,2-母公司。对应DataAPI.SysCodeGet.codeTypeID=70003。

    private String reportType; //报告类型。Q1-第一季报，S1-半年报，Q3-第三季报，CQ3-三季报（累计1-9月），A-年报。对应DataAPI.SysCodeGet.codeTypeID=70001。

    private String fiscalPeriod; //会计期间

    private String accoutingStandards; //会计准则

    private String currencyCD; //货币代码。例如，USD-美元；CAD-加元等。对应DataAPI.SysCodeGet.codeTypeID=10004。

    private float tRevenue; //营业总收入

    private float revenue; //营业收入

    private float intIncome; //利息收入

    private float intExp; //利息支出

    private float premEarned; //已赚保费

    private float commisIncome; //手续费及佣金收入

    private float commisExp; //手续费及佣金支出

    private float TCogs; //营业总成本

    private float COGS; //营业成本

    private float premRefund; //退保金

    private float NCompensPayout; //赔付支出净额

    private float reserInsurContr; //提取保险合同准备金净额

    private float policyDivPayt; // 保单红利支出

    private float reinsurExp; //分保费用

    private float bizTaxSurchg; //营业税金及附加

    private float sellExp; //销售费用

    private float adminExp; //管理费用

    private float finanExp; //财务费用

    private float assetsImpairLoss; //资产减值损失

    private float fValueChgGain; //公允价值变动收益

    private float investIncome; //投资收益

    private float AJInvestIncome; //其中:对联营企业和合营企业的投资收益

    private float forexGain; //汇兑收益

    private float assetsDispGain; //资产处置收益

    private float othGain; //其他收益

    private float operateProfit; //营业利润

    private float NoperateIncome; //营业外收入

    private float NoperateExp; //营业外支出

    private float NCADisploss; //非流动资产处置损失

    private float TProfit; //利润总额

    private float incomeTax; //所得税费用

    private float NIncome; //净利润

    private float goingConcernNI; //持续经营净利润

    private float quitConcernNI; //终止经营净利润

    private float NIncomeAttrP; //归属于母公司所有者的净利润

    private float minorityGain; //少数股东损益

    private float basicEPS; //基本每股收益

    private float dilutedEPS; //稀释每股收益

    private float othComprIncome; //其他综合收益

    private float TComprIncome; //综合收益总额

    private float comprIncAttrP; //归属于母公司所有者的综合收益总额

    private float comprIncAttrMS; //归属于少数股东的综合收益总额

    private String updateTime; //更新时间
}
