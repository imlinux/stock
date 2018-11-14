<template>
    <el-autocomplete
            v-model="state3"
            value-key="name"
            class="inline-input"
            :fetch-suggestions="querySearch"
            placeholder="请输入内容"
            v-on:select="selectItem"
            :trigger-on-focus="true">

    </el-autocomplete>
</template>

<script>
    import axios from 'axios'
    export default {
        data:function() {
          return {
              "state3":''
          }
        },
        methods:{
            querySearch:function(queryString, cb) {
                axios.get("/company/query_company?codeOrName=" + queryString).then(function (response) {
                    cb(response.data);
                })
            },
            selectItem:function (item) {
                this.$emit('select', item)
            }
        }
    }
</script>