import Vue from 'vue'
import App from './App.vue'
import Buefy from 'buefy'
import 'buefy/dist/buefy.css'
import VueRouter from 'vue-router'
import OrdersTable from "@/components/OrdersTable";
import Reports from "@/components/Reports";
import SignUp from "@/components/SignUp";
import LogIn from "@/components/LogIn";
import OrdersNew from "@/components/OrdersNew";

Vue.use(VueRouter)
Vue.use(Buefy)

Vue.config.productionTip = false

const routes = [
    { path: '/orders', component: OrdersTable },
    { path: '/orders/new', component: OrdersNew },
    { path: '/reports', component: Reports },
    { path: '/signup', component: SignUp },
    { path: '/login', component: LogIn }
]

const router = new VueRouter({
    routes // short for `routes: routes`
})

new Vue({
    render: h => h(App),
    router
}).$mount('#app')
