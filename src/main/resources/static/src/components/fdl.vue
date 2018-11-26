<template>
    <div style="width: 100%;height:800px;"></div>
</template>

<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {

        mounted: function () {


            const myChart = echarts.init(this.$el);

            myChart.setOption({
                title: {
                    text: '发电量'
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
                    data:['发电量', '火力发电量', '水利发电量', '核能发电量', '风能发电量', '太阳能发电量']
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
            });

            axios.get("/fdl/get_all").then(function (response) {

                let data = response.data;

                let month = [];

                let fdl = [];
                let fdlYoy = [];

                let hlFdl = [];
                let hlFdlYoy = [];

                let slFdl = [];
                let slFdlYoy = [];

                let hnFdl = [];
                let hnFdlYoy = [];

                let flFdl = [];
                let flFdlYoy = [];

                let tynFdl = [];
                let tynFdlYoy = [];


                for(let i = 0; i< data.length; i++) {

                    month.push(data[i].month);

                    fdl.push(data[i].fdl);
                    fdlYoy.push(data[i].fdlYoy);

                    hlFdl.push(data[i].hlFdl);
                    hlFdlYoy.push(data[i].hlFdlYoy);

                    slFdl.push(data[i].slFdl);
                    slFdlYoy.push(data[i].slFdlYoy);

                    hnFdl.push(data[i].hnFdl);
                    hnFdlYoy.push(data[i].hnFdlYoy);

                }



                myChart.setOption({
                    xAxis: {
                        data: month
                    },
                    series: [{
                        name:'发电量',
                        data: fdl,
                        type: 'bar',
                        yAxisIndex:1
                    }, {
                        name:'发电量同比',
                        data: fdlYoy,
                        type:'line'
                    }, {
                        name:"火力发电量",
                        data:hlFdl,
                        type:'bar',
                        yAxisIndex:1
                    }, {
                        name:"火力发电量同比",
                        data:hlFdlYoy,
                        type:'line',
                    }, {
                        name:"水利发电量",
                        data:slFdl,
                        type:'bar',
                        yAxisIndex:1
                    }, {
                        name:"水利发电量同比",
                        data:slFdlYoy,
                        type:'line',
                    }, {
                        name:"核能发电量",
                        data:hnFdl,
                        type:'bar',
                        yAxisIndex:1
                    }, {
                        name:"核能发电量同比",
                        data:hnFdlYoy,
                        type:'line',
                    }]
                })
            })
        }

    }
</script>