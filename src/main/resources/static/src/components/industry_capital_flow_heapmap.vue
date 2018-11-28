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
                tooltip: {
                    axisPointer: {
                        type: 'cross'
                    }
                },
                animation: false,
                xAxis: {
                    type: 'category',
                    splitArea: {
                        show: true
                    }
                },
                yAxis: {
                    type: 'category',
                    splitArea: {
                        show: true
                    }
                },
                series: [{
                    name: 'Punch Card',
                    type: 'heatmap',
                    label: {
                        normal: {
                            show: true
                        }
                    }
                }]
            });
            axios.get("/analyze/get_data", {
                params: {
                    hql: 'select e from CapitalFlow e where e.code like \'BK%\' order by e.date, e.code'
                }
            }).then(function (response) {
                let data = response.data;

                let xSet = new Set();
                let ySet = new Set();
                let d = [];

                for(let i = 0; i < data.length; i++) {
                    xSet.add(data[i].date);
                    ySet.add(data[i].name);

                }

                let xData = Array.from(xSet);
                let yData = Array.from(ySet);

                for(let i = 0; i < data.length; i++) {

                    let v = data[i].zlje;
                    d.push([xData.indexOf(data[i].date), yData.indexOf(data[i].name), v])
                }
                myChart.setOption({
                    xAxis: {
                        data: xData
                    },
                    yAxis: {
                        data: yData
                    },
                    series:[{
                        name:'Punch Card',
                        data:d
                    }]
                })
            });
        }
    }
</script>
