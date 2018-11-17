<template>
    <el-tabs style="width: 100%;">
        <el-tab-pane label="资产负债表"><zcfzb v-bind:code="stock_code" v-bind:report_type="rtype"></zcfzb></el-tab-pane>
        <el-tab-pane label="利润表"><lrb v-bind:code="stock_code" v-bind:report_type="rtype"></lrb></el-tab-pane>
        <el-tab-pane label="现金流量表"><xjllb v-bind:code="stock_code" v-bind:report_type="rtype"></xjllb></el-tab-pane>
        <el-tab-pane label="资金流向"><company_capital_flow></company_capital_flow></el-tab-pane>
    </el-tabs>

</template>

<script>
    import lrb from './lrb';
    import zcfzb from './zcfzb'
    import xjllb from './xjllb'
    import company_capital_flow from './company_capital_flow'

    export default {

        components: {
            lrb,
            zcfzb,
            xjllb,
            company_capital_flow
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
        computed:{
            "stock_code":function () {
                return this.code
            },
            'rtype':function () {
                return this.report_type
            }
        }
    }
</script>