<template>
    <div>
        <ve-line :data="chartData"></ve-line>
    </div>
</template>

<script>

    import axios from 'axios';
    import VeLine from 'v-charts/lib/line.common'

    export default {
        components: { VeLine },
        data: function(){

            let ret = {
                chartData: {
                    columns: ['date', 'zlje'],
                    row:[]
                }
            };

            axios.get("/analyze/get_data", {
                params: {
                    clazz: 'dsy.core.entity.CapitalFlow',
                    hql: 'select e from CapitalFlow e where e.code like \'BK%\''
                }
            }).then(function (response) {
                let data = response.data;

                for(let i = 0; i< data.length; i++) {
                    ret.chartData.row.push(data[i]);
                }
            });

            return ret
        }
    }
</script>