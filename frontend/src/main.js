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
    { path: '/orders', component: OrdersTable, meta: {requiresAuth: true}},
    { path: '/orders/new', component: OrdersNew, meta: {requiresAuth: true}},
    { path: '/reports', component: Reports, meta: {requiresAuth: true}},
    { path: '/signup', component: SignUp, meta: {requiresAuth: false}},
    { path: '/login', component: LogIn, meta: {requiresAuth: false}},
]

const router = new VueRouter({
    routes // short for `routes: routes`
})

router.beforeEach((to, from, next) => {
    if (to.matched.some((record) => record.meta.requiresAuth)) {
        if (!isAuthenticated()) {
            alert("You are not logged in")
            next('/login')
        }
        else{
            next()
        }
    } else {
        next()
    }
})

function isAuthenticated() {
    return localStorage.getItem("token") != null
}

new Vue({
    render: h => h(App),
    router
}).$mount('#app')
