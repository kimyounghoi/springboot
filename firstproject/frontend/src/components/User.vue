<template>
  <div id="User">
    <form id="search">
      Search <input id="queryinput" name="query" v-model="searchQuery">
    </form>
    <pnpgrid
      :data="gridData"
      :columns="gridColumns"
      :filter-key="searchQuery"
    ></pnpgrid>
  </div>
</template>

<script>
import axios from 'axios'
import pnpgrid from '@/components/Grid'
export default {
  name: 'User',
  components: {
    pnpgrid
  },
  data () {
    return {
      searchQuery: '',
      gridColumns: ['idx', 'name', 'id', 'email', 'cellphone'],
      gridData:[]
    }
  },
  created(){
    this.load()
  },
  methods:{
    load(){
      axios.get('http://10.77.161.116/firstproject/api/userlist')
      .then(res => {
        this.gridData = res.data;
      }).catch(e => {
        console.error(e)
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#queryinput {width:310px; margin-left: 10px}
</style>
