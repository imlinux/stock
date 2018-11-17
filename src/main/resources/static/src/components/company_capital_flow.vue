<template>
    <div style="width: 1865px;height:800px;"></div>
</template>

<script>

    import echarts from 'echarts';
    import axios from 'axios';

    export default {
        mounted: function () {

            const myChart = echarts.init(this.$el);

            let option = {
                title: {
                    text: '资金流向'
                },
                xAxis: {
                    type:'category'
                },
                yAxis: {},
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        animation: false,
                        label: {
                            backgroundColor: '#505765'
                        }
                    }
                },
                legend: {
                    data:['主力净额', '小单净额']
                },

                series: [{
                    name: '主力净额',
                    type: 'line'
                }, {
                    name: '小单净额',
                    type: 'line'
                }]
            };

            myChart.setOption(option);


            axios.get("company/all_capital_flow?code=300059.SZ").then(function (response) {

                let data = response.data;

                let tradeDate = [];
                let zlje = [];
                let xdje = [];

                for(let i = 0; i < data.length; i++) {
                    tradeDate.push(data[i].date);
                    zlje.push(data[i].zlje);
                    xdje.push(data[i].xdje);
                }

                myChart.setOption({
                    xAxis: {
                        data: tradeDate
                    },
                    series: [{
                        name:'主力净额',
                        data: zlje
                    }, {
                        name:'小单净额',
                        data: xdje
                    }]

                });
            })
        }
    }
</script>