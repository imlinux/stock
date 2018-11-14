<template>
    <el-row :gutter="100">
        <el-col :span="50">
            <el-tabs>
                <el-tab-pane label="资产负债表"></el-tab-pane>
                <el-tab-pane label="利润表"><lrb v-bind:code="stock_code" v-bind:report_type="rtype"></lrb></el-tab-pane>
                <el-tab-pane label="现金流量表"></el-tab-pane>
            </el-tabs>
        </el-col>
        <el-col :span="50"><cc v-on:select="changeStock"></cc></el-col>
    </el-row>
</template>

<script>
    import lrb from './lrb';
    import cc  from './CompanySearch';

    export default {

        components: {
            lrb,
            cc
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
        data: function() {
            return {
                "stock_code":this.code,
                'rtype':this.report_type
            }
        },
        methods: {
            changeStock: function (item) {
                console.log(item);

                var dotIndex = item.code.indexOf(".");
                var codePrefix = item.code.substring(0, dotIndex);
                var codeSuffix = item.code.substring(dotIndex);

                var code = codePrefix;
                if(codeSuffix == '.SS') {
                    code = code + '.SH'
                } else {
                    code = code + '.SZ'
                }

                this.stock_code=code;
            }
        }
    }
</script>