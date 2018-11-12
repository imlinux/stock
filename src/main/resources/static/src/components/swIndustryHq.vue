<template>
    <el-table :data="tableData"
              style="width: 100%"
              highlight-current-row
              :default-sort = "{prop: 'amount', order: 'descending'}">

        <el-table-column prop="date" label="日期" sortable></el-table-column>
        <el-table-column prop="symbol" label="行业" sortable></el-table-column>
        <el-table-column prop="amount" label="成交额" sortable></el-table-column>
        <el-table-column prop="volume" label="成交量" sortable></el-table-column>
        <el-table-column prop="changePercent" label="涨跌幅" sortable></el-table-column>
        <el-table-column prop="priceChange" label="涨跌额" sortable></el-table-column>
        <el-table-column prop="avg" label="平均价" sortable></el-table-column>
        <el-table-column prop="count" label="公司数量" sortable></el-table-column>
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

            axios.get("/industry/get_sw_industry_hq")
                .then(function (response) {

                    that.tableData = response.data;
            })
        }
    }

</script>