import App from './components/app.vue'

import Vue from 'vue'

const vm = new Vue({
    el:'#app',
    render:function (h) {
        return h(App);
    }
});