<template>
  <div class="card" id="signup-card">
    <section id="card-content">
      <b-field label="Name">
        <b-input v-model="firstName" value="" placeholder="First Name"></b-input>
        <b-input v-model="lastName" value="" placeholder="Last Name"></b-input>
      </b-field>

      <b-field label="Email">
        <b-input type="email"
                 v-model="email"
                 value=""
                 maxlength="30">
        </b-input>
      </b-field>

      <b-field label="Address">
        <b-input value="" placeholder="City"></b-input>
        <b-input value="" placeholder="Street"></b-input>
        <b-input value="" placeholder="House"></b-input>
        <b-input value="" placeholder="Postcode"></b-input>
      </b-field>

      <b-field label="Username">
        <b-input v-model="username" value="" maxlength="30"></b-input>
      </b-field>

      <b-field label="Password">
        <b-input v-model="password" value="" type="password" maxlength="30"></b-input>
      </b-field>

      <b-button @click="register" type="is-primary">Sign Up</b-button>
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
      firstName: "",
      lastName: "",
      email: "",
      username: "",
      password: ""
    }
  },
  methods: {
    register: function () {
      const baseURI = 'http://localhost:8000/register'
      axios.post(baseURI, {
        firstname: this.firstName,
        lastname: this.lastName,
        email: this.email,
        isActive: true,
        username: this.username,
        password: this.password,
        birthDate: "1995-03-03",
        personalDiscount: 0
      }).then(function () {
        alert("You were successfully registered. Now you can log in")
      }).catch(() => {
        alert("Error occured")
      })
    }
  }
}
</script>

<style scoped>
#signup-card {
  margin: 10px auto;
  width: 30%;
  padding: 10px;
}

#card-content {
  padding: 20px;
}
</style>
