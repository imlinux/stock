
<template>
	<el-container style="height:100%">
		<el-container>
			<el-header>
				<el-menu mode="horizontal" default-active="4">
					<el-menu-item index="1" v-on:click="menuClick" route="/company_hq">行情</el-menu-item>
					<el-menu-item index="2" v-on:click="menuClick" route="/wh">外汇</el-menu-item>
					<el-menu-item index="3" v-on:click="menuClick">自选</el-menu-item>
					<el-menu-item index="4" v-on:click="menuClick" route="/sw_industry_hq">申万行业行情</el-menu-item>
					<el-menu-item index="5" v-on:click="menuClick" route="/gdp">中国GDP</el-menu-item>
					<el-menu-item index="6" v-on:click="menuClick" route="/rzrq_gdp">融资融券余额</el-menu-item>
					<el-menu-item index="7" v-on:click="menuClick" route="/buffett_ratio">巴菲特指标</el-menu-item>
					<el-menu-item index="8"><cc v-on:select="changeStock"></cc></el-menu-item>
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
	import cb from './cb'
	import wh from './wh'
	import gdp from './gdp'
	import sw_industry_hq from './swIndustryHq'
	import company_hq from './company_hq'
	import rzrq_gdp from './rzrq_gdp'
	import buffett_ratio from './buffett_ratio'

    Vue.use(VueRouter);
    Vue.use(ElementUI);

    const router = new VueRouter({
        routes: [{
            path: '/wh',
			component: wh
		}, {
            path: '/cb/code/:code/type/:report_type',
			component: cb,
			props:true
		}, {
            path:'/sw_industry_hq',
			component: sw_industry_hq
		}, {
            path: '/gdp',
			component: gdp
		}, {
            path: '/company_hq',
			component: company_hq
		}, {
            path: '/rzrq_gdp',
			component: rzrq_gdp
		}, {
            path: '/buffett_ratio',
			component: buffett_ratio

		}]
    });

	export default {

        activeName:'',
        components:{
	        cc,
			cb,
			wh,
            sw_industry_hq,
            company_hq,
            rzrq_gdp,
            buffett_ratio
		},
		methods: {
            menuClick:function (event) {
                if(event.route) {
                    this.$router.push(event.route);
                } else {
                    this.$message.warning('未设置路由');
				}
            },
            changeStock: function (item) {

                this.stock_code=item.code;
                this.$router.push('/cb/code/' + item.code + '/type/1');
            }
		},
		router:router
	}
</script>

<style>

</style>