
<template>
    <table class="finance-table" v-loading="loading">
        <tbody>
        <tr>
            <th class="tips-colname-Left"><span>利润表</span></th>
            <th v-for="e in lrb.REPORTDATE"><span>{{e}}</span></th>
        </tr>
        <tr v-if="ctype == 4">
            <td class="tips-fieldname-Left"><span>营业总收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.TOTALOPERATEREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;营业收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OPERATEREVE"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;利息收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.INTREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已赚保费</span></td>

            <td class="tips-data-Right" v-for="e in lrb.PREMIUMEARNED"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手续费及佣金净收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.COMMNREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他业务收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OTHERREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>营业总成本</span></td>

            <td class="tips-data-Right" v-for="e in lrb.TOTALOPERATEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;营业成本</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OPERATEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;利息支出</span></td>

            <td class="tips-data-Right" v-for="e in lrb.INTEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手续费及佣金支出</span></td>

            <td class="tips-data-Right" v-for="e in lrb.COMMEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;研发费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.RDEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退保金</span></td>

            <td class="tips-data-Right" v-for="e in lrb.SURRENDERPREMIUM"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;赔付支出净额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NETINDEMNITYEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;提取保险合同准备金净额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NETCONTACTRESERVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保单红利支出</span></td>

            <td class="tips-data-Right" v-for="e in lrb.POLICYDIVIEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分保费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.RIEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他业务成本</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OTHEREXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;营业税金及附加</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OPERATETAX"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.SALEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;管理费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.MANAGEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;财务费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.FINANCEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资产减值损失</span></td>

            <td class="tips-data-Right" v-for="e in lrb.ASSETDEVALUELOSS"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>其他经营收益</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;加:公允价值变动收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.FVALUEINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;投资收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.INVESTINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中:对联营企业和合营企业的投资收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.INVESTJOINTINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;汇兑收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.EXCHANGEINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>营业利润</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OPERATEPROFIT"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;加:营业外收入</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NONOPERATEREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中:非流动资产处置利得</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NONLASSETREVE"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;减:营业外支出</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NONOPERATEEXP"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中:非流动资产处置净损失</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NONLASSETNETLOSS"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>利润总额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.SUMPROFIT"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;减:所得税费用</span></td>

            <td class="tips-data-Right" v-for="e in lrb.INCOMETAX"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;被合并方在合并前实现利润</span></td>

            <td class="tips-data-Right" v-for="e in lrb.COMBINEDNETPROFITB"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>净利润</span></td>

            <td class="tips-data-Right" v-for="e in lrb.NETPROFIT"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中:归属于母公司股东的净利润</span></td>

            <td class="tips-data-Right" v-for="e in lrb.PARENTNETPROFIT"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;少数股东损益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.MINORITYINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;扣除非经常性损益后的净利润</span></td>

            <td class="tips-data-Right" v-for="e in lrb.KCFJCXSYJLR"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>每股收益</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基本每股收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.BASICEPS"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;稀释每股收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.DILUTEDEPS"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>其他综合收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.OTHERCINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;归属于母公司股东的其他综合收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.PARENTOTHERCINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;归属于少数股东的其他综合收益</span></td>

            <td class="tips-data-Right" v-for="e in lrb.MINORITYOTHERCINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>综合收益总额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.SUMCINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;归属于母公司股东的综合收益总额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.PARENTCINCOME"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;归属于少数股东的综合收益总额</span></td>

            <td class="tips-data-Right" v-for="e in lrb.MINORITYCINCOME"><span>{{e}}</span></td>
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
        methods: {
        },
        computed: {
            lrb:function () {

                this.loading = true;
                let that = this;

                let lrb = {
                        REPORTDATE: [],
                        TOTALOPERATEREVE: [],
                        OPERATEREVE: [],
                        INTREVE: [],
                        PREMIUMEARNED: [],
                        COMMNREVE: [],
                        OTHERREVE: [],
                        TOTALOPERATEEXP: [],
                        OPERATEEXP: [],
                        INTEXP: [],
                        COMMEXP: [],
                        RDEXP: [],
                        SURRENDERPREMIUM: [],
                        NETINDEMNITYEXP: [],
                        NETCONTACTRESERVE: [],
                        POLICYDIVIEXP: [],
                        RIEXP: [],
                        OTHEREXP: [],
                        OPERATETAX: [],
                        SALEEXP: [],
                        MANAGEEXP: [],
                        FINANCEEXP: [],
                        ASSETDEVALUELOSS: [],
                        FVALUEINCOME: [],
                        INVESTINCOME: [],
                        INVESTJOINTINCOME: [],
                        EXCHANGEINCOME: [],
                        OPERATEPROFIT: [],
                        NONOPERATEREVE: [],
                        NONLASSETREVE: [],
                        NONOPERATEEXP: [],
                        NONLASSETNETLOSS: [],
                        SUMPROFIT: [],
                        INCOMETAX: [],
                        COMBINEDNETPROFITB: [],
                        NETPROFIT: [],
                        PARENTNETPROFIT: [],
                        MINORITYINCOME: [],
                        KCFJCXSYJLR: [],
                        BASICEPS: [],
                        DILUTEDEPS: [],
                        OTHERCINCOME: [],
                        PARENTOTHERCINCOME: [],
                        MINORITYOTHERCINCOME: [],
                        SUMCINCOME: [],
                        PARENTCINCOME: [],
                        MINORITYCINCOME: []
                };

                axios.get("finance/query_lrb?code=" + this.code + "&reportType=" + this.report_type)
                    .then(function (response) {

                        const data = response.data;

                        for(let i = 0; i < data.length; i++) {
                            let obj = data[i];

                            that.ctype = obj.type;

                            for (let k in lrb) {
                                let v;
                                if(k == 'REPORTDATE') {
                                    v = formatDate(obj[k.toLowerCase()]);
                                } else if(k == 'BASICEPS' || k == 'DILUTEDEPS') {
                                    v = obj[k.toLocaleLowerCase()];
                                } else {
                                    v = formatNumber(obj[k.toLowerCase()]);
                                }
                                lrb[k].push(v);
                            }

                        }
                        that.loading = false;
                    });
                return lrb;
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
        font-weight: bold;
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