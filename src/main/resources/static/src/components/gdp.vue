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
                dataZoom: [
                    {
                        show: true,
                        realtime: true
                    }
                ],
                legend: {
                    data:['GDP', '第一产业', '第二产业', '第三产业']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: [{
                    name:'同比',
                    type:'value'
                }, {
                    name:'量',
                    type:'value'
                }]
            };

            myChart.setOption(option);

            axios.get("/gdp/year").then( function (response) {

                let data = response.data;

                let year = [];
                let gdp = [];
                let gdpYoy = [];
                let pi = [];
                let piYoy = [];
                let si = [];
                let siYoy = [];
                let ti = [];
                let tiYoy = [];


                for(let i = 0; i < data.length; i++) {
                    year.push(data[i].quarter);
                    gdp.push(data[i].gdp);
                    gdpYoy.push(data[i].gdpYoy);
                    pi.push(data[i].pi);
                    piYoy.push(data[i].piYoy);
                    si.push(data[i].si);
                    siYoy.push(data[i].siYoy);
                    ti.push(data[i].ti);
                    tiYoy.push(data[i].tiYoy)
                }

                myChart.setOption({
                    xAxis: {
                        data: year
                    },
                    series: [{
                        name:'GDP',
                        data: gdp,
                        type: 'bar',
                        yAxisIndex:1
                    },{
                        name:'第一产业',
                        data: pi,
                        type: 'bar',
                        yAxisIndex:1
                    }, {
                        name:'第二产业',
                        data: si,
                        type: 'bar',
                        yAxisIndex:1
                    }, {
                        name:'第三产业',
                        data: ti,
                        type: 'bar',
                        yAxisIndex:1
                    }, {
                        name: 'gdp同比',
                        data: gdpYoy,
                        type: 'line'
                    }, {
                        name: '第一产业同比',
                        data: piYoy,
                        type: 'line'
                    }, {
                        name:'第二产业同比',
                        data: siYoy,
                        type: 'line'
                    }, {
                        name: '第三产业同比',
                        data: tiYoy,
                        type: 'line'
                    }
                    ]
                });
            });
        }
    }
</script>