<template>
    <div style="width: 100%;height:800px;"></div>
</template>

<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {
        mounted:function () {
            let myChart = echarts.init(this.$el);

            let maxMoneySupply = 1801665.58145761 * 2;
            let maxMoneySuppleYoy = 20;

            let option = {
                title: {
                    text: ''
                },
                legend: {
                    data:['流通中现金(M0)供应量_同比增长(%)',
                        '货币(M1)供应量_同比增长(%)',
                        '货币和准货币(M2)供应量_同比增长(%)',
                        '流通中现金(M0)供应量_期末值(亿元)',
                        '流通中现金(M1)供应量_期末值(亿元)',
                        '流通中现金(M2)供应量_期末值(亿元)']
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
                yAxis: [{
                    name:'同比',
                    type:'value',
                    max: maxMoneySuppleYoy
                }, {
                    name:'值',
                    type:'value',
                    max:maxMoneySupply
                }]
            };
            myChart.setOption(option);

            axios.get("/money_supply/get_all").then(function (response) {

                let data = response.data;

                let month = [];

                let m0 = [];
                let m1 = [];
                let m2 = [];
                let m0yoy = [];
                let m1yoy = [];
                let m2yoy = [];
                for(var i = 0; i < data.length; i++) {
                    month.push(data[i].month);
                    m0.push(data[i].m0);
                    m1.push(data[i].m1);
                    m2.push(data[i].m2);
                    m0yoy.push(data[i].m0yoy);
                    m1yoy.push(data[i].m1yoy);
                    m2yoy.push(data[i].m2yoy);
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
                    }, {
                        name: '流通中现金(M0)供应量_期末值(亿元)',
                        yAxisIndex:1,
                        data: m0,
                        type: 'bar'
                    }, {
                        name:'货币(M1)供应量_期末值(亿元)',
                        yAxisIndex:1,
                        data: m1,
                        type: 'bar'
                    }, {
                        name:'货币和准货币(M2)供应量_期末值(亿元)',
                        yAxisIndex:1,
                        data: m2,
                        type: 'bar'
                    }]
                });
            })
        }
    }
</script>