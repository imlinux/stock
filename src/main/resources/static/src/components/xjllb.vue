<template>
    <table class="finance-table" v-loading="loading">
        <tbody>
        <tr>
            <th class="tips-colname-Left"><span>现金流量表</span></th>
            <th v-for="e in xjll.REPORTDATE"><span>{{e}}</span></th>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>经营活动产生的现金流量</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销售商品、提供劳务收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.SALEGOODSSERVICEREC"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收到的税费返还</span></td>

            <td class="tips-data-Right" v-for="e in xjll.TAXRETURNREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收到其他与经营活动有关的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.OTHEROPERATEREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>经营活动现金流入小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMOPERATEFLOWIN"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>购买商品、接受劳务支付的现金</span></td>
            <td class="tips-data-Right" v-for="e in xjll.BUYGOODSSERVICEPAY"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支付给职工以及为职工支付的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.EMPLOYEEPAY"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支付的各项税费</span></td>

            <td class="tips-data-Right" v-for="e in xjll.TAXPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支付其他与经营活动有关的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.OTHEROPERATEPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>经营活动现金流出小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMOPERATEFLOWOUT"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>经营活动产生的现金流量净额</span></td>
            <td class="tips-data-Right" v-for="e in xjll.NETOPERATECASHFLOW"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>投资活动产生的现金流量</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收回投资收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.DISPOSALINVREC"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支付的各项税费</span></td>

            <td class="tips-data-Right" v-for="e in xjll.TAXPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;取得投资收益收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.INVINCOMEREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;处置固定资产、无形资产和其他长期资产收回的现金净额</span></td>

            <td class="tips-data-Right" v-for="e in xjll.DISPFILASSETREC"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;处置子公司及其他营业单位收到的现金净额</span></td>

            <td class="tips-data-Right" v-for="e in xjll.DISPSUBSIDIARYREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收到其他与投资活动有关的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.OTHERINVREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>投资活动现金流入小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMINVFLOWIN"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;购建固定资产、无形资产和其他长期资产支付的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.BUYFILASSETPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;投资支付的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.INVPAY"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;取得子公司及其他营业单位支付的现金净额</span></td>

            <td class="tips-data-Right" v-for="e in xjll.NIPLEDGELOAN"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支付其他与投资活动有关的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.GETSUBSIDIARYPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>投资活动现金流出小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMINVFLOWOUT"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>投资活动产生的现金流量净额</span></td>
            <td class="tips-data-Right" v-for="e in xjll.NETINVCASHFLOW"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>筹资活动产生的现金流量</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;吸收投资收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.ACCEPTINVREC"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;子公司吸收少数股东投资收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.SUBSIDIARYACCEPT"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;取得借款收到的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.LOANREC"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>收到其他与筹资活动有关的现金</span></td>
            <td class="tips-data-Right" v-for="e in xjll.ISSUEBONDREC"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>筹资活动现金流入小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMFINAFLOWIN"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;偿还债务支付的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.REPAYDEBTPAY"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分配股利、利润或偿付利息支付的现金</span></td>

            <td class="tips-data-Right" v-for="e in xjll.DIVIPROFITORINTPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;子公司支付给少数股东的股利、利润</span></td>

            <td class="tips-data-Right" v-for="e in xjll.SUBSIDIARYPAY"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>支付其他与筹资活动有关的现金</span></td>
            <td class="tips-data-Right" v-for="e in xjll.OTHERFINAPAY"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>筹资活动现金流出小计</span></td>
            <td class="tips-data-Right" v-for="e in xjll.SUMFINAFLOWOUT"><span><span>{{e}}</span></span></td>
        </tr>

        <tr>
            <td class="tips-fieldname-Left"><span>筹资活动产生的现金流量净额</span></td>
            <td class="tips-data-Right" v-for="e in xjll.NETFINACASHFLOW"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>汇率变动对现金及现金等价物的影响</span></td>
            <td class="tips-data-Right" v-for="e in xjll.EFFECTEXCHANGERATE"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>现金及现金等价物净增加额</span></td>
            <td class="tips-data-Right" v-for="e in xjll.NICASHEQUI"><span><span>{{e}}</span></span></td>
        </tr>
        <tr>
            <td><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;加:期初现金及现金等价物余额</span></td>

            <td class="tips-data-Right" v-for="e in xjll.CASHEQUIBEGINNING"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td class="tips-fieldname-Left"><span>期末现金及现金等价物余额</span></td>
            <td class="tips-data-Right" v-for="e in xjll.CASHEQUIENDING"><span><span>{{e}}</span></span></td>
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
            xjll:function () {

                this.loading = true;
                let that = this;

                const xjll = {
                    REPORTDATE: [],
                    SALEGOODSSERVICEREC:[],
                    TAXRETURNREC:[],
                    OTHEROPERATEREC:[],
                    SUMOPERATEFLOWIN:[],
                    BUYGOODSSERVICEPAY:[],
                    EMPLOYEEPAY:[],
                    TAXPAY:[],
                    OTHEROPERATEPAY:[],
                    SUMOPERATEFLOWOUT:[],
                    NETOPERATECASHFLOW:[],
                    INVINCOMEREC:[],
                    DISPFILASSETREC:[],
                    DISPSUBSIDIARYREC:[],
                    OTHERINVREC:[],
                    SUMINVFLOWIN:[],
                    BUYFILASSETPAY:[],
                    INVPAY:[],
                    NIPLEDGELOAN:[],
                    GETSUBSIDIARYPAY:[],
                    SUMINVFLOWOUT:[],
                    NETINVCASHFLOW:[],
                    ACCEPTINVREC:[],
                    SUBSIDIARYACCEPT:[],
                    LOANREC:[],
                    ISSUEBONDREC:[],
                    SUMFINAFLOWIN:[],
                    REPAYDEBTPAY:[],
                    DIVIPROFITORINTPAY:[],
                    SUBSIDIARYPAY:[],
                    OTHERFINAPAY:[],
                    SUMFINAFLOWOUT:[],
                    NETFINACASHFLOW:[],
                    EFFECTEXCHANGERATE:[],
                    NICASHEQUI:[],
                    CASHEQUIBEGINNING:[],
                    CASHEQUIENDING:[],
                    DISPOSALINVREC:[]
                };

                axios.get("finance/query_xjllb?code=" + this.code + "&reportType=" + this.report_type)
                    .then(function (response) {

                        const data = response.data;

                        for(let i = 0; i < data.length; i++) {
                            let obj = data[i];

                            that.ctype = obj.type;

                            for (let k in xjll) {
                                let v;
                                if(k == 'REPORTDATE') {
                                    v = formatDate(obj[k.toLowerCase()]);
                                } else if(k == 'BASICEPS' || k == 'DILUTEDEPS') {
                                    v = obj[k.toLocaleLowerCase()];
                                } else {
                                    v = formatNumber(obj[k.toLowerCase()]);
                                }
                                xjll[k].push(v);
                            }

                        }
                        that.loading = false;
                    });

                return xjll;
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