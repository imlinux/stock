
<template>
	<el-container style="height:100%">
		<el-container>
			<el-header>
				<el-menu router mode="horizontal">
					<el-menu-item index="1" route="/company_hq">行情</el-menu-item>
					<el-menu-item index="2" route="/wh">外汇</el-menu-item>
					<el-menu-item index="3" route="/shang_pin">商品</el-menu-item>
					<el-menu-item index="4" >自选</el-menu-item>
					<el-submenu index="5">
						<template slot="title">行业</template>
						<el-menu-item index="5-1" route="/sw_industry_hq">申万行业行情</el-menu-item>
						<el-menu-item index="5-2" route="/indystry/captial_flow_heapmap">行业资金流热度</el-menu-item>
					</el-submenu>
					<el-submenu index="6">
						<template slot="title">宏观经济</template>
						<el-menu-item index="6-1" route="/gdp">中国GDP</el-menu-item>
                        <el-menu-item index="6-2" route="/money_supply">货币供应量</el-menu-item>
						<el-menu-item index="6-3" route="/fdl">发电量</el-menu-item>
						<el-menu-item index="6-4" route="/pmi">采购经理指数</el-menu-item>
					</el-submenu>

					<el-submenu index="7">
						<template slot="title">市场情绪</template>
						<el-menu-item index="7-1" route="/rzrq_gdp">融资融券余额</el-menu-item>
						<el-menu-item index="7-2" route="/buffett_ratio">巴菲特指标</el-menu-item>
					</el-submenu>
					<el-menu-item index="8" route="/tmp">测试</el-menu-item>
					<el-menu-item index="9"><cc v-on:select="changeStock"></cc></el-menu-item>
					<el-menu-item index="10" route="/tycjlv">同业拆借利率</el-menu-item>
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
    import money_supply from './money_supply'
	import sw_industry_hq from './swIndustryHq'
	import company_hq from './company_hq'
	import rzrq_gdp from './rzrq_gdp'
	import buffett_ratio from './buffett_ratio'
	import fdl from './fdl'
	import pmi from './pmi'
	import tmp from './tmp'
	import industry_capital_flow_heapmap from './industry_capital_flow_heapmap'
	import shang_pin from './ShangPin'
	import tong_ye_chai_jie from './tong_ye_chai_jie';

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

		}, {
            path:'/money_supply',
            component: money_supply
        }, {
            path:'/fdl',
			component: fdl
		}, {
            path:'/pmi',
			component: pmi
		}, {
            path:'/tmp',
			component: tmp
		}, {
            path:'/indystry/captial_flow_heapmap',
			component: industry_capital_flow_heapmap
		}, {
            path: '/shang_pin',
			component: shang_pin
		}, {
            path:'/tycjlv',
			component: tong_ye_chai_jie
		}]
    });

	export default {

        components:{
	        cc,
			cb,
			wh,
            sw_industry_hq,
            company_hq,
            rzrq_gdp,
            buffett_ratio,
            money_supply,
			fdl,
			pmi,
			tmp,
            shang_pin,
            tong_ye_chai_jie
		},
		methods: {
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