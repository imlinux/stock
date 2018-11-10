import App from './components/app.vue'
import Vue from 'vue'
import ElementUI from 'element-ui';
import VueRouter from 'vue-router'
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(ElementUI);
Vue.use(VueRouter);

const routes = [
    { path: '/a', component: App},
    { path: '/b', component: App}
];

const router = new VueRouter({
    routes
});
var vm = new Vue({
    el:'#app',
    router:router,
    components:{
        App
    },
    methods:{
        aa:function(event) {
            console.log(event.route)
            this.$router.push(event.route)
        }
    }
});