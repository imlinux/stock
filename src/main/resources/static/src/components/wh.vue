<template>
    <el-table
            :data="tableData"
            style="width: 100%"
            v-loading="loading"
            border>
        <el-table-column
                prop="date"
                label="日期">
        </el-table-column>
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
                    prop="week52High"
                    label="最高">
            </el-table-column>
            <el-table-column
                    prop="week52Low"
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
        created:function () {
            const that = this;
            const tableData = that.tableData;
            axios.get('/wh/get_latest').then(function (response) {
                const data = response.data;

                 for(var i = 0; i < data.length; i++) {
                     tableData.push(data[i]);
                 }
                 that.loading = false;
            }).catch(function (reason) {
                that.$message.error('服务请求异常');
            }).then(function () {
                that.loading = false;
            })
        }
    }
</script>