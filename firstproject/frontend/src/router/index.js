import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import User from '@/components/User'
import Admin from '@/components/Admin'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/user',
      name: 'user',
      component: User,
      meta: {requiresAuth: false, adminAuth: false, userAuth: true}
    },
    {
      path: '/admin',
      name: 'admin',
      component: Admin,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {path: '*', redirect: '/'}
  ]
})
/*
.beforeEach((to, from, next) => {
  if (to.meta.requiresAuth) {
    const authUser = JSON.parse(window.localStorage.getItem('user_session'))
    if (!authUser || !authUser.token) {
      next({name: 'login'})
    } else if (to.meta.adminAuth) {
      if (authUser.data.role_id === 'ADMIN') {
        next()
      } else {
        next('/user')
      }
    } else if (to.meta.userAuth) {
      if (authUser.data.role_id === 'USER') {
        next()
      } else {
        console.log('Im in admin')
        next('/admin')
      }
    }
  }
})
*/
