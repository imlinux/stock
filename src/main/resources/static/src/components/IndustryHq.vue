<template>
    <el-table :data="tableData"
              style="width: 100%"
              highlight-current-row
              :default-sort = "{prop: 'turnoverRatio', order: 'descending'}">

        <el-table-column prop="date" label="日期" sortable></el-table-column>
        <el-table-column prop="symbol" label="行业" sortable></el-table-column>
        <el-table-column prop="marketValue" label="总市值" sortable></el-table-column>
        <el-table-column prop="changePercent" label="涨跌幅" sortable></el-table-column>
        <el-table-column prop="turnoverRatio" label="换手率" sortable></el-table-column>
    </el-table>
</template>

<script>
    import axios from 'axios';

    export default {
        data:function () {
            return {
                "tableData":[]
            }
        },

        mounted: function () {
            const that = this;

            axios.get("/industry/get_industry_hq")
                .then(function (response) {

                    that.tableData = response.data;
            })
        }
    }

</script>