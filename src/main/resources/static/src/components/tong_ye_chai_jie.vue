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
                    text: '同业拆借利率'
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
                    data:['隔夜(O/N)', '1周(1W)', '2周(2W)', '1月(1M)', '3月(3M)', '6月(6M)', '9月(9M)', '1年(1Y)']
                },
                xAxis: {
                    type:'category'
                },
                yAxis: [{
                    name:'利率',
                    type:'value'
                }]
            });

            axios.get("/analyze/get_data", {
                params: {
                    hql: 'select e from TongYeChaiJie e order by e.date'
                }
            }).then(function (response) {
                let data = response.data;


                let date = [];
                let gy = [];
                let oneW = [];
                let twoW = [];
                let oneM = [];
                let threeM = [];
                let sixM = [];
                let nineM = [];
                let oneY = [];

                for(let i = 0; i < data.length; i++) {
                    date.push(data[i].date);

                    gy.push(data[i].gylv);
                    oneW.push(data[i].oneWeekLv);
                    twoW.push(data[i].twoWeekLv);
                    oneM.push(data[i].oneMonthLv);
                    threeM.push(data[i].threeMonthLv);
                    sixM.push(data[i].sixMonthLv);
                    nineM.push(data[i].nineMonthLv);
                    oneY.push(data[i].oneYearLv);
                }

                myChart.setOption({
                    xAxis: {
                        data: date
                    },
                    series: [{
                        name: '隔夜(O/N)',
                        data: gy,
                        type: 'line'
                    }, {
                        name: '1周(1W)',
                        data: oneW,
                        type:'line'
                    }, {
                        name:'2周(2W)',
                        data: twoW,
                        type: 'line'
                    }, {
                        name:'1月(1M)',
                        data: oneM,
                        type:'line'
                    }, {
                        name:'3月(3M)',
                        data:threeM,
                        type:'line'
                    }, {
                        name:'6月(6M)',
                        data:sixM,
                        type:'line'
                    }, {
                        name:'9月(9M)',
                        data:nineM,
                        type:'line'
                    }, {
                        name:'1年(1Y)',
                        data:oneY,
                        type:'line'
                    }]
                });
            })
        }
    }
</script>