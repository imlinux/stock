import App from './components/app'
import P from './components/p'

import Vue from 'vue'

const vm = new Vue({
    el:'#app',

    render:function (h) {
        return h(App);
    }
});