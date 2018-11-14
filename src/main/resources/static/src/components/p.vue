<template>
    <div>
    <c v-bind:msg="message"></c>
    <input type="button" v-on:click="click"/>
    </div>
</template>

<script>
    import c from './c'

    export default {
        components: {
            c
        },
        data: function () {
            return {
                "message":"hello"
            }
        },
        methods:{
            click:function () {
                this.message = "AAAA";
            }
        }
    }
</script>