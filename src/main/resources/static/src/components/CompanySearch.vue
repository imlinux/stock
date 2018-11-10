<template>
    <el-autocomplete
            value-key="name"
            class="inline-input"
            :fetch-suggestions="querySearch"
            placeholder="请输入内容"
            :trigger-on-focus="false">

    </el-autocomplete>
</template>

<script>
    import axios from 'axios'
    export default {
        methods:{
            querySearch:function(queryString, cb) {
                axios.get("/company/query_company?codeOrName=" + queryString).then(function (response) {
                    cb(response.data);
                })
            }
        }
    }
</script>