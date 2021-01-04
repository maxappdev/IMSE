<template>
  <div class="card" id="login-card">
    <section id="card-content">

      <b-field label="Username"
               :type="{ 'is-danger': hasError }"
               :message="{ 'Username is not available': hasError }">
        <b-input v-model="username" value="" maxlength="30"></b-input>
      </b-field>

      <b-field label="Password"
               :type="{ 'is-danger': hasError }"
               :message="[
                { 'Password is too short': hasError },
                { 'Password must have at least 8 characters': hasError }
            ]">
        <b-input v-model="password" value="" type="password" maxlength="30"></b-input>
      </b-field>
      <b-button @click="login">Log In</b-button>
    </section>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "SignUp",
  data() {
    return {
      hasError: false,
      username: "",
      password: ""
    }
  },
  methods: {
    login: function () {
      const baseURI = 'http://localhost:8000/login'
      var authorizationBasic = window.btoa(this.username + ':' + this.password);
      var config = {
        "headers": {
          "Authorization": "Basic " + authorizationBasic
        }
      };
      axios.get(baseURI, config)
          .then(() => {
            localStorage.setItem("token", authorizationBasic)
            alert("You successfully logged in!")
          })
          .catch(() => {
            alert("Data not correct")
          })
    }
  }
}
</script>

<style scoped>
#login-card {
  margin: 100px auto;
  width: 30%;
  padding: 10px;
}

#card-content {
  padding: 20px;
}
</style>
