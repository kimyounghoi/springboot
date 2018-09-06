<template>
  <div id="app">
    <router-view/>
    <p>
      <router-link :to="{ name: 'home', params: {} }">home page</router-link>
      <router-link :to="{ name: 'user', params: {} }">user page</router-link>
      <router-link :to="{ name: 'admin', params: {} }">admin page</router-link>
    </p>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
