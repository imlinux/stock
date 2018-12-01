<template>
    <iframe style="width: 100%; height: 800px; border: 0px" v-bind:src=url></iframe>
</template>

<script>

    export default {
        props:{
            symbol:{
                type: String,
                required: true
            }
        },
        computed: {
           url: function () {
               let code = this.symbol;

               let dotIndex = code.indexOf('.');

               let suffix = code.substr(dotIndex + 1);

               if(suffix == 'SH') code = this.symbol.substr(0, dotIndex) + '.SS';

               return 'https://marketchart.wallstreetcn.com/?symbol=' + code + '&interval=1D&description=';
           }
        }
    }
</script>