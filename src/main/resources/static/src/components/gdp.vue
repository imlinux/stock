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
                    text: 'GDP'
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
                    data:['GDP', '第一产业', '第二产业', '第三产业']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: {
                },
                series: [{
                    name: 'GDP',
                    type: 'line'
                }, {
                    name: '第一产业',
                    type: 'line'
                }, {
                    name: '第二产业',
                    type: 'line'
                }, {
                    name: '第三产业',
                    type: 'line'
                }]
            };

            myChart.setOption(option);

            axios.get("/gdp/year").then( function (response) {

                let data = response.data;

                let year = [];
                let gdp = [];
                let pi = [];
                let si = [];
                let ti = [];


                for(let i = 0; i < data.length; i++) {
                    year.push(data[i].quarter);
                    gdp.push(data[i].gdp);
                    pi.push(data[i].pi);
                    si.push(data[i].si);
                    ti.push(data[i].ti);
                }

                myChart.setOption({
                    xAxis: {
                        data: year
                    },
                    series: [{
                        name:'GDP',
                        data: gdp
                    },{
                        name:'第一产业',
                        data: pi
                    }, {
                        name:'第二产业',
                        data: si
                    }, {
                        name:'第三产业',
                        data: ti
                    }
                    ]
                });
            });
        }
    }
</script>