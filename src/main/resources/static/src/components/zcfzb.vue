
<template>
    <table class="finance-table" v-loading="loading">
        <tbody>
        <tr>
            <th class="tips-colname-Left"><span>资产负债表</span></th>
            <th v-for="e in zcfz.REPORTDATE"><span>{{e}}</span></th>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>流动资产</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;货币资金</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.MONETARYFUND"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以公允价值计量且其变动计入当期损益的金融资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.FVALUEFASSET"><span>{{e}}</span></td>
        </tr>

        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应收票据</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.BILLREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应收账款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ACCOUNTREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预付款项</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ADVANCEPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应收利息</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.INTERESTREC"><span>{{e}}</span></td>
        </tr>

        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他应收款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.OTHERREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存货</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.INVENTORY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他流动资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.OTHERLASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>流动资产合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMLASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>非流动资产</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;可供出售金融资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SALEABLEFASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长期股权投资</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.LTEQUITYINV"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;投资性房地产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ESTATEINVEST"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;固定资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.FIXEDASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在建工程</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.CONSTRUCTIONPROGRESS"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无形资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.INTANGIBLEASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商誉</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.GOODWILL"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长期待摊费用</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.LTDEFERASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;递延所得税资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.DEFERINCOMETAXASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td ><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他非流动资产</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.OTHERNONLASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>非流动资产合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMNONLASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>资产总计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMASSET"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>流动负债</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应付账款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ACCOUNTPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预收款项</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ADVANCERECEIVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应付职工薪酬</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SALARYPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应交税费</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.TAXPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应付利息</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.INTERESTPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他应付款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.OTHERPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他流动负债</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.OTHERLLIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>流动负债合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMLLIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>非流动负债</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长期借款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.LTBORROW"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专项应付款</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SPECIALPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预计负债</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.ANTICIPATELIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;递延收益</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.DEFERINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;递延所得税负债</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.DEFERINCOMETAXLIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>非流动负债合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMNONLLIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>负债合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMLIAB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-colname-Left"><span>所有者权益(或股东权益)</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实收资本（或股本）</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SHARECAPITAL"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资本公积</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.CAPITALRESERVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;盈余公积</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SURPLUSRESERVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未分配利润</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.RETAINEDEARNING"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>归属于母公司股东权益合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMPARENTEQUITY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;少数股东权益</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.MINORITYEQUITY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>股东权益合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMSHEQUITY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>负债和股东权益合计</span></td>
            <td class="tips-data-Right" v-for="e in zcfz.SUMLIABSHEQUITY"><span>{{e}}</span></td>
        </tr>
        </tbody>

    </table>

</template>


<script>
    import axios from 'axios'
    import {formatDate, formatNumber} from '../tools/formatData.js'

    export default {
        data: function () {
            return {
                ctype:0,
                loading:true
            }
        },
        props: {
            code: {
                type: String,
                required: true
            },
            report_type: {
                type: String,
                required: true
            }
        },
        computed: {
            zcfz: function () {
                this.loading = true;
                let that = this;

                let zcfz = {
                    REPORTDATE: [],
                    MONETARYFUND: [],
                    FVALUEFASSET: [],
                    BILLREC:[],
                    ACCOUNTREC:[],
                    ADVANCEPAY:[],
                    ADVANCEPAY:[],
                    INTERESTREC:[],
                    OTHERREC:[],
                    OTHERREC:[],
                    INVENTORY:[],
                    OTHERLASSET:[],
                    SUMLASSET:[],
                    SALEABLEFASSET:[],
                    LTEQUITYINV:[],
                    ESTATEINVEST:[],
                    FIXEDASSET:[],
                    CONSTRUCTIONPROGRESS:[],
                    INTANGIBLEASSET:[],
                    GOODWILL:[],
                    LTDEFERASSET:[],
                    DEFERINCOMETAXASSET:[],
                    OTHERNONLASSET:[],
                    SUMNONLASSET:[],
                    SUMASSET:[],
                    ACCOUNTPAY:[],
                    SALARYPAY:[],
                    TAXPAY:[],
                    INTERESTPAY:[],
                    OTHERPAY:[],
                    OTHERLLIAB:[],
                    SUMLLIAB:[],
                    LTBORROW:[],
                    SPECIALPAY:[],
                    ANTICIPATELIAB:[],
                    DEFERINCOME:[],
                    DEFERINCOMETAXLIAB:[],
                    SUMNONLLIAB:[],
                    SUMLIAB:[],
                    SHARECAPITAL:[],
                    CAPITALRESERVE:[],
                    SURPLUSRESERVE:[],
                    RETAINEDEARNING:[],
                    SUMPARENTEQUITY:[],
                    MINORITYEQUITY:[],
                    SUMSHEQUITY:[],
                    SUMLIABSHEQUITY:[]
                };

                axios.get("finance/query_zcfzb?code=" + this.code + "&reportType=" + this.report_type)
                    .then(function (response) {

                        const data = response.data;

                        for(let i = 0; i < data.length; i++) {
                            let obj = data[i];

                            that.ctype = obj.type;

                            for (let k in zcfz) {
                                let v;
                                if(k == 'REPORTDATE') {
                                    v = formatDate(obj[k.toLowerCase()]);
                                } else if(k == 'BASICEPS' || k == 'DILUTEDEPS') {
                                    v = obj[k.toLocaleLowerCase()];
                                } else {
                                    v = formatNumber(obj[k.toLowerCase()]);
                                }
                                zcfz[k].push(v);
                            }

                        }
                        that.loading = false;
                    });
                return zcfz;
            }
        }
    }
</script>

<style scoped>
    .finance-table {
        width: 100%;
        line-height: 21px;
        border-collapse: collapse;
        border-spacing: 0;
    }
    .finance-table tr th, .finance-table tr td {
        border:1px solid #D7D7D7;
    }

    .tips-colname-Left {
        color: #333;
        font-weight: bold;
        text-align: left;
        width: 25%;
    }
    .tips-fieldname-Left {
        color: #333;
        text-align: left;
        width: 25%;
    }
    .tips-data-Right {
        color: #333;
        font-weight: normal;
        text-align: right;
    }

    tr:hover {
        background-color: #ffff99;
    }
</style>