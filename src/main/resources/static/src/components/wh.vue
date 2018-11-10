<template>
    <el-table
            :data="tableData"
            style="width: 100%"
            v-loading="loading"
            border>
        <el-table-column
                prop="prodName"
                label="资产"
                width="180">
        </el-table-column>
        <el-table-column
                prop="lastPx"
                label="最新价"
                width="180">
        </el-table-column>
        <el-table-column
                prop="pxChangeRate"
                label="涨跌幅">
        </el-table-column>
        <el-table-column
                label="日内区间">
            <el-table-column
                prop="highPx"
                label="最高">
            </el-table-column>
            <el-table-column
                    prop="lowPx"
                    label="最低">
            </el-table-column>
        </el-table-column>
        <el-table-column
                label="52周区间">
            <el-table-column
                    prop="week52high"
                    label="最高">
            </el-table-column>
            <el-table-column
                    prop="week52low"
                    label="最低">
            </el-table-column>
        </el-table-column>
    </el-table>
</template>

<script>
    import axios from 'axios'

    export default {

        data: function () {
            return {
                tableData:[],
                "loading": true
            }
        },
        mounted:function () {
            const that = this;
            const tableData = that.tableData;
            axios.get('/wh/get_latest').then(function (response) {
                const data = response.data;

                 for(var i = 0; i < data.length; i++) {
                     tableData.push(data[i]);
                 }
                 that.loading = false;
            })
        }
    }
</script>