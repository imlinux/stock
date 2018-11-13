<template>
    <el-tabs>
        <el-tab-pane label="资产负债表"></el-tab-pane>
        <el-tab-pane label="利润表"><lrb code="600570.SH" report_type="1"></lrb></el-tab-pane>
        <el-tab-pane label="现金流量表"></el-tab-pane>
    </el-tabs>
</template>

<script>
    import lrb from './lrb';

    export default {

        components: {
            lrb,

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
    }
</script>