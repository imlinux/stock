<template>
    <div style="width: 100%;height:800px;"></div>
</template>


<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {

        mounted:function () {

            const myChart = echarts.init(this.$el);

            let option = {
                title: {
                    text: '融资占gdp百分比'
                },
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
                },
                series: [{
                    name: '融资占gdp百分比',
                    type: 'line',

                    markPoint: {
                        data: [
                            {type: 'max', name: '最大值'},
                            {type: 'min', name: '最小值'}
                        ]
                    },
                    markLine: {
                        data: [
                            {type: 'average', name: '平均值'}
                        ]
                    }
                }]
            };

            myChart.setOption(option);


            axios.get("/rzrq/get_rzrq_gdp").then(function (response) {

                let data = response.data;

                let tradeDate = [];
                let tradeValGdp = [];

                for(let i = 0; i < data.length; i++) {
                    tradeDate.push(data[i].tradeDate);
                    tradeValGdp.push(data[i].tradeValGdp)
                }

                myChart.setOption({
                    xAxis: {
                        data: tradeDate
                    },
                    series: [{
                        name:'融资占gdp百分比',
                        data: tradeValGdp
                    }]
                });
            })
        }
    }
</script>