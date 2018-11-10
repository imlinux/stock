
<template>
	<el-container style="height: 900px">
		<el-aside width="200px">
			<el-menu
					default-active="2"
					class="el-menu-vertical-demo">
				<el-submenu index="1">
					<template slot="title">
						<i class="el-icon-location"></i>
						<span>导航一</span>
					</template>
					<el-menu-item-group>
						<el-menu-item index="1-1">选项1</el-menu-item>
						<el-menu-item index="1-2">选项2</el-menu-item>
					</el-menu-item-group>
					<el-menu-item-group>
						<el-menu-item index="1-3">选项3</el-menu-item>
					</el-menu-item-group>
					<el-submenu index="1-4">
						<template slot="title">选项4</template>
						<el-menu-item index="1-4-1">选项1</el-menu-item>
					</el-submenu>
				</el-submenu>
				<el-menu-item index="2">
					<i class="el-icon-menu"></i>
					<span slot="title">导航二</span>
				</el-menu-item>
				<el-menu-item index="3">
					<i class="el-icon-document"></i>
					<span slot="title">导航三</span>
				</el-menu-item>
				<el-menu-item index="4">
					<i class="el-icon-setting"></i>
					<span slot="title">导航四</span>
				</el-menu-item>
			</el-menu>
		</el-aside>
		<el-container>
			<el-header>
				<el-menu mode="horizontal">
					<el-menu-item index="1" v-on:click="menuClick">行情</el-menu-item>
					<el-menu-item index="2" v-on:click="menuClick" route="/wh">外汇</el-menu-item>
					<el-menu-item index="3" v-on:click="menuClick">自选</el-menu-item>
					<el-menu-item index="4" ><cc></cc></el-menu-item>
				</el-menu>
			</el-header>
			<el-container>
				<el-main>
					<router-view></router-view>
				</el-main>
			</el-container>
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
            path: '/b',
			component: cc
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
                this.$router.push(event.route);
            }
		},
		router:router
	}
</script>

<style>

</style>