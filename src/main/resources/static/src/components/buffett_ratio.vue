<template>
    <div style="width: 100%;height:800px;"></div>
</template>

<script>

    import echarts from 'echarts';
    import axios from 'axios';

    export default {
        mounted: function () {

            const myChart = echarts.init(this.$el);

            let option = {
                title: {
                    text: '巴菲特指标'
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
                legend: {
                    data:['巴菲特指标']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: {
                }
            };
            myChart.setOption(option);

            axios.get("/gpjytj/get_all").then( function (response) {

                let data = response.data;

                console.log(data);
                let date = [];
                let mktValGdp = [];


                for(let i = 0; i < data.length; i++) {
                    date.push(data[i].date);
                    mktValGdp.push(data[i].mktValGdp);
                }

                myChart.setOption({
                    xAxis: {
                        data: date
                    },
                    series: [{
                        name:'巴菲特指标',
                        data: mktValGdp,
                        type: 'line'
                    }
                    ]
                });
            });
        }
    }
</script>