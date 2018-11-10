<template>
    <el-table
            :data="tableData"
            style="width: 100%">
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
                prop=""
                label="日内区间">

        </el-table-column>
        <el-table-column
                prop=""
                label="52周区间">

        </el-table-column>
    </el-table>
</template>

<script>
    import axios from 'axios'

    export default {

        data: function () {
            return {
                tableData:[]
            }
        },
        mounted:function () {
            const tableData = this.tableData;
            axios.get('/wh/get_latest').then(function (response) {
                const data = response.data;

                 for(var i = 0; i < data.length; i++) {
                     tableData.push(data[i]);
                 }
            })
        }
    }
</script>