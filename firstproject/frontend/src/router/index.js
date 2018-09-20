import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import User from '@/components/User'
import Admin from '@/components/Admin'
import Widgets from '@/components/Widgets'
import General from '@/components/UIGeneral'
import Icons from '@/components/UIIcons'
import Buttons from '@/components/UIButtons'
import Sliders from '@/components/UISliders'
import Timeline from '@/components/UITimeline'
import Modal from '@/components/UIModal'

Vue.use(Router)
const contextRoot = '/firstproject';

export default new Router({
  mode: 'history',
  routes: [
    {
      path: contextRoot + '/',
      name: 'home',
      component: Home
    },
    {
      path: contextRoot + '/user',
      name: 'user',
      component: User,
      meta: {requiresAuth: false, adminAuth: false, userAuth: true}
    },
    {
      path: contextRoot + '/admin',
      name: 'admin',
      component: Admin,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/widgets',
      name: 'widgets',
      component: Widgets,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/general',
      name: 'general',
      component: General,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/icons',
      name: 'icons',
      component: Icons,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/buttons',
      name: 'buttons',
      component: Buttons,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/sliders',
      name: 'sliders',
      component: Sliders,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/timeline',
      name: 'timeline',
      component: Timeline,
      meta: {requiresAuth: true, adminAuth: true, userAuth: false}
    },
    {
      path: contextRoot + '/modal',
      name: 'modal',
      component: Modal,
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
