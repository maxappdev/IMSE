<template>
  <b-navbar>
    <template slot="brand">
      <b-navbar-item tag="router-link" :to="{ path: '/orders' }">
        <img
            src="https://www.univie.ac.at/mathematik_didaktik/uniwien_logo.png"
            alt="Lightweight UI components for Vue.js based on Bulma"
        >
      </b-navbar-item>
    </template>
    <template slot="start">
      <b-navbar-item href="#/orders">
        Orders
      </b-navbar-item>
      <b-navbar-item href="#/orders/new">
        New Order
      </b-navbar-item>
      <b-navbar-item href="#/reports">
        Reports
      </b-navbar-item>
    </template>

    <template slot="end">
      <b-navbar-item tag="div">
        <div class="buttons">
          <a href="#" @click="logout" class="button is-light">
            Log out
          </a>
          <a href="#/signup" class="button is-primary">
            <strong>Sign up</strong>
          </a>
          <a href="#/login" class="button is-light">
            Log in
          </a>
        </div>
      </b-navbar-item>
    </template>
  </b-navbar>
</template>

<script>
export default {
  name: 'Navbar',
  methods : {
    logout: function(){
      localStorage.removeItem("token")
      alert("You are logged out")
    }
  }
}
</script>
