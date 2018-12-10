<template>
    <div style="width: 100%;height:800px;"></div>
</template>

<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {

        mounted:function () {

            const myChart = echarts.init(this.$el);

            myChart.setOption({
                title: {
                    text: '债券'
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
                    data:['美国1年期国债', '美国2年期国债', '美国3年期国债', '美国5年期国债', '美国7年期国债', '美国10年期国债', '美国30年期国债']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: [{
                    name:'利率',
                    type:'value'
                }]
            });

            axios.get("/bond/get_all_bond").then(function (response) {

                let data = response.data;

                let date = new Set();
                let US1YR = [];
                let US2YR = [];
                let US3YR = [];
                let US5YR = [];
                let US7YR = [];
                let US10YR = [];
                let US30YR = [];

                for(let i = 0; i < data.length; i++) {
                    date.add(data[i].date);

                    if(data[i].prodCode == 'US1YR.OTC') {
                        US1YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US2YR.OTC') {
                        US2YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US3YR.OTC') {
                        US3YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US5YR.OTC') {
                        US5YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US7YR.OTC') {
                        US7YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US10YR.OTC') {
                        US10YR.push(data[i].closePx);
                    } else if (data[i].prodCode == 'US30YR.OTC') {
                        US30YR.push(data[i].closePx);
                    }
                }

                myChart.setOption({
                    xAxis: {
                        data: Array.from(date)
                    },
                    series: [{
                        name:'美国1年期国债',
                        data:US1YR,
                        type:'line'
                    }, {
                        name:'美国2年期国债',
                        data:US2YR,
                        type:'line'
                    }, {
                        name:'美国3年期国债',
                        data:US3YR,
                        type:'line'
                    }, {
                        name:'美国5年期国债',
                        data:US5YR,
                        type:'line'
                    }, {
                        name:'美国7年期国债',
                        data:US7YR,
                        type:'line'
                    }, {
                        name:'美国10年期国债',
                        data:US10YR,
                        type:'line'
                    }, {
                        name:'美国30年期国债',
                        data:US30YR,
                        type:'line'
                    }]

                });
            })

        }
    }
</script>