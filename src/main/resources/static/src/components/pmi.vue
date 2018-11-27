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
                    text: 'PMI'
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
                    data:['制造业采购经理指数', '非制造业采购经理指数']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: {
                    name:'同比',
                    type:'value'
                }
            });

            axios.get("/pmi/get_all").then(function (response) {
                let data = response.data;

                let month = [];
                let zay = [];
                let fzay = [];

                for(let i = 0; i < data.length; i++) {
                    month.push(data[i].month);
                    zay.push(data[i].zzycgjlzs);
                    fzay.push(data[i].fzzycgjlzs);
                }

                myChart.setOption({
                    xAxis: {
                        data: month
                    },
                    series:[{
                        name:'制造业采购经理指数',
                        data:zay,
                        type:'line'
                    }, {
                        name:'非制造业采购经理指数',
                        data: fzay,
                        type: 'line'
                    }]
                })
            })
        }
    }

</script>