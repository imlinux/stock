<template>
    <table class="finance-table" v-loading="loading">
        <tbody>
        <tr>
            <th><span>每股指标</span></th>
            <td v-for="e in cwzb.date"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>基本每股收益(元)</span></td>
            <td v-for="e in cwzb.jbmgsy"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>扣非每股收益(元)</span></td>
            <td v-for="e in cwzb.kfmgsy"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>稀释每股收益(元)</span></td>
            <td v-for="e in cwzb.xsmgsy"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>每股净资产(元)</span></td>
            <td v-for="e in cwzb.mgjzc"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>每股公积金(元)</span></td>
            <td v-for="e in cwzb.mggjj"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>每股未分配利润(元)</span></td>
            <td v-for="e in cwzb.mgwfply"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>每股经营现金流(元)</span></td>
            <td v-for="e in cwzb.mgjyxjl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <th><span>成长能力指标</span></th>
        </tr>
        <tr>
            <td><span>营业总收入(元)</span></td>
            <td v-for="e in cwzb.yyzsr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>毛利润(元)</span></td>
            <td v-for="e in cwzb.mlr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>归属净利润(元)</span></td>
            <td v-for="e in cwzb.gsjlr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>扣非净利润(元)</span></td>
            <td v-for="e in cwzb.kfjlr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>营业总收入同比增长(%)</span></td>
            <td v-for="e in cwzb.yyzsrtbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>归属净利润同比增长(%)</span></td>
            <td v-for="e in cwzb.gsjlrtbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>扣非净利润同比增长(%)</span></td>
            <td v-for="e in cwzb.kfjlrtbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>营业总收入滚动环比增长(%)</span></td>
            <td v-for="e in cwzb.yyzsrgdhbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>归属净利润滚动环比增长(%)</span></td>
            <td v-for="e in cwzb.gsjlrgdhbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>扣非净利润滚动环比增长(%)</span></td>
            <td v-for="e in cwzb.kfjlrgdhbzz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <th><span>盈利能力指标</span></th>
        </tr>
        <tr>
            <td><span>加权净资产收益率(%)</span></td>
            <td v-for="e in cwzb.jqjzcsyl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>摊薄净资产收益率(%)</span></td>
            <td v-for="e in cwzb.tbjzcsyl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>摊薄总资产收益率(%)</span></td>
            <td v-for="e in cwzb.tbzzcsyl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>毛利率(%)</span></td>
            <td v-for="e in cwzb.mll"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>净利率(%)</span></td>
            <td v-for="e in cwzb.jll"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>实际税率(%)</span></td>
            <td v-for="e in cwzb.sjsl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <th><span>盈利质量指标</span></th>
        </tr>
        <tr>
            <td><span>预收款/营业收入</span></td>
            <td v-for="e in cwzb.yskyysr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>销售现金流/营业收入</span></td>
            <td v-for="e in cwzb.xsxjlyysr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>经营现金流/营业收入</span></td>
            <td v-for="e in cwzb.jyxjlyysr"><span>{{e}}</span></td>
        </tr>
        <tr>
            <th><span>运营能力指标</span></th>
        </tr>
        <tr>
            <td><span>总资产周转率(次)</span></td>
            <td v-for="e in cwzb.zzczzy"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>应收账款周转天数(天)</span></td>
            <td v-for="e in cwzb.yszkzzts"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>存货周转天数(天)</span></td>
            <td v-for="e in cwzb.chzzts"><span>{{e}}</span></td>
        </tr>
        <tr>
            <th><span>财务风险指标</span></th>
        </tr>
        <tr>
            <td><span>资产负债率(%)</span></td>
            <td v-for="e in cwzb.zcfzl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>流动负债/总负债(%)</span></td>
            <td v-for="e in cwzb.ldzczfz"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>流动比率</span></td>
            <td v-for="e in cwzb.ldbl"><span>{{e}}</span></td>
        </tr>
        <tr>
            <td><span>速动比率</span></td>
            <td v-for="e in cwzb.sdbl"><span>{{e}}</span></td>
        </tr>
        </tbody>
    </table>
</template>

<script>
    import axios from 'axios'

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
            }
        },
        computed: {
            cwzb: function () {

                this.loading = true;
                let that = this;

                let cwzb = {
                    date: [],
                    jbmgsy:[],
                    kfmgsy:[],
                    xsmgsy:[],
                    mgjzc:[],
                    mggjj:[],
                    mgwfply:[],
                    mgjyxjl:[],
                    yyzsr:[],
                    mlr:[],
                    gsjlr:[],
                    kfjlr:[],
                    yyzsrtbzz:[],
                    gsjlrtbzz:[],
                    kfjlrtbzz:[],
                    yyzsrgdhbzz:[],
                    gsjlrgdhbzz:[],
                    kfjlrgdhbzz:[],
                    jqjzcsyl:[],
                    tbjzcsyl:[],
                    tbzzcsyl:[],
                    mll:[],
                    jll:[],
                    sjsl:[],
                    yskyysr:[],
                    xsxjlyysr:[],
                    jyxjlyysr:[],
                    zzczzy:[],
                    yszkzzts:[],
                    chzzts:[],
                    zcfzl:[],
                    ldzczfz:[],
                    ldbl:[],
                    sdbl:[]
                };

                axios.get("finance/query_cwzb?code=" + this.code)
                    .then(function (response) {

                        const data = response.data;

                        for(let i = 0; i < data.length; i++) {
                            let obj = data[i];

                            that.ctype = obj.type;

                            for (let k in cwzb) {

                                let v = obj[k.toLocaleLowerCase()];
                                cwzb[k].push(v);
                            }

                        }
                        that.loading = false;
                    });
                return cwzb;
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