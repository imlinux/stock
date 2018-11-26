<template>
    <div style="width: 100%;height:800px;"></div>
</template>

<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {
        mounted:function () {
            let myChart = echarts.init(this.$el);

            let option = {
                title: {
                    text: ''
                },
                legend: {
                    data:['流通中现金(M0)供应量_同比增长(%)', '货币(M1)供应量_同比增长(%)', '货币和准货币(M2)供应量_同比增长(%)']
                },
                tooltip: {
                    trigger: 'axis'
                },
                dataZoom: [
                    {
                        show: true,
                        realtime: true
                    }
                ],
                xAxis: {
                    type:'category'
                },
                yAxis: {
                    name:'同比',
                    type:'value'
                }
            };
            myChart.setOption(option);

            axios.get("/money_supply/get_all").then(function (response) {

                let data = response.data;

                let month = [];
                let m0yoy = [];
                let m1yoy = [];
                let m2yoy = [];

                for(var i = 0; i < data.length; i++) {
                    month.push(data[i].month);
                    m0yoy.push(data[i].m0yoy);
                    m1yoy.push(data[i].m1yoy);
                    m2yoy.push(data[i].m2yoy)
                }
                myChart.setOption({
                    xAxis: {
                        data: month
                    },
                    series: [ {
                        name:'流通中现金(M0)供应量_同比增长(%)',
                        data: m0yoy,
                        type: 'line'
                    }, {
                        name:'货币(M1)供应量_同比增长(%)',
                        data: m1yoy,
                        type: 'line'
                    }, {
                        name:'货币和准货币(M2)供应量_同比增长(%)',
                        data: m2yoy,
                        type: 'line'
                    }]
                });
            })
        }
    }
</script>