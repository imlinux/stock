
<template>
	<el-container style="height:100%">
		<el-container>
			<el-header>
				<el-menu mode="horizontal">
					<el-menu-item index="1" v-on:click="menuClick">行情</el-menu-item>
					<el-menu-item index="2" v-on:click="menuClick" route="/wh">外汇</el-menu-item>
					<el-menu-item index="3" v-on:click="menuClick">自选</el-menu-item>
					<el-menu-item index="4" v-on:click="menuClick" route="/lrb">财务报表</el-menu-item>
					<el-menu-item index="5" ><cc></cc></el-menu-item>
				</el-menu>
			</el-header>
			<el-main>
				<router-view></router-view>
			</el-main>
		</el-container>
	</el-container>
</template>

<script>
    import Vue from 'vue'
    import VueRouter from 'vue-router'
    import ElementUI from 'element-ui';
    import 'element-ui/lib/theme-chalk/index.css';

	import cc from './CompanySearch'
	import lrb from './lrb'
	import wh from './wh'

    Vue.use(VueRouter);
    Vue.use(ElementUI);

    const router = new VueRouter({
        routes: [{
            path: '/wh',
			component: wh
		}, {
            path: '/lrb',
			component: lrb,
			props:{
                code:'600570.SH',
                report_type:'1'
			}
		}]
    });

	export default {

        components:{
	        cc,
			lrb,
			wh
		},
		methods: {
            menuClick:function (event) {
                if(event.route) {
                    this.$router.push(event.route);
                } else {
                    this.$message.warning('未设置路由');
				}
            }
		},
		router:router
	}
</script>

<style>

</style>