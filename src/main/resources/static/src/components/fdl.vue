<template>
    <div>
        <div style="width: 100%;height:800px;" class="fdl"></div>
        <div style="width: 100%;height:800px;" class="fdl_zb"></div>
    </div>

</template>

<script>
    import echarts from 'echarts';
    import axios from 'axios';

    export default {

        mounted: function () {


            const fdlChart = echarts.init(document.getElementsByClassName("fdl")[0]);
            const fdlZbChart = echarts.init(document.getElementsByClassName("fdl_zb")[0]);

            fdlChart.setOption({
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

            fdlZbChart.setOption({
               title: {
                   text: '发电量占比'
               },
                legend: {
                    data:['火力发电量占比', '水利发电量占比', '核能发电量占比', '风能发电量占比', '太阳能发电量占比']
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
                    name:'占比',
                    type:'value'
                }
            });

            axios.get("/fdl/get_all").then(function (response) {

                let data = response.data;

                let month = [];

                let fdl = [];
                let fdlYoy = [];

                let hlFdl = [];
                let hlFdlYoy = [];
                let hlFdlZb = [];

                let slFdl = [];
                let slFdlYoy = [];
                let slFdlZb = [];

                let hnFdl = [];
                let hnFdlYoy = [];
                let hnFdlZb = [];

                let flFdl = [];
                let flFdlYoy = [];
                let flFdlZb = [];

                let tynFdl = [];
                let tynFdlYoy = [];
                let tynFdlZb = [];


                for(let i = 0; i< data.length; i++) {

                    month.push(data[i].month);

                    fdl.push(data[i].fdl);
                    fdlYoy.push(data[i].fdlYoy);

                    hlFdl.push(data[i].hlFdl);
                    hlFdlYoy.push(data[i].hlFdlYoy);
                    hlFdlZb.push(data[i].hlFdl / data[i].fdl);

                    slFdl.push(data[i].slFdl);
                    slFdlYoy.push(data[i].slFdlYoy);
                    slFdlZb.push(data[i].slFdl / data[i].fdl);

                    hnFdl.push(data[i].hnFdl);
                    hnFdlYoy.push(data[i].hnFdlYoy);
                    hnFdlZb.push(data[i].hnFdl / data[i].fdl);

                    flFdl.push(data[i].flFdl);
                    flFdlYoy.push(data[i].flFdlYoy);
                    flFdlZb.push(data[i].flFdl / data[i].fdl);

                    tynFdl.push(data[i].tynFdl);
                    tynFdlYoy.push(data[i].tynFdlYoy);
                    tynFdlZb.push(data[i].tynFdl / data[i].fdl);
                }



                fdlChart.setOption({
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
                });

                fdlZbChart.setOption({
                    xAxis: {
                        data: month
                    },
                    series: [{
                        name:"火力发电量占比",
                        data:hlFdlZb,
                        type:'line'
                    }, {
                        name:"水利发电量占比",
                        data:slFdlZb,
                        type:'line',
                    }, {
                        name:"核能发电量占比",
                        data:hnFdlZb,
                        type:'line',
                    }, {
                        name:'风能发电量占比',
                        data:flFdlZb,
                        type:'line'
                    }, {
                        name:'太阳能发电量占比',
                        data: tynFdlZb,
                        type:'line'
                    }]
                })
            })
        }

    }
</script>

<style>
    .fdl {

    }

    .fdl_zb {

    }
</style>