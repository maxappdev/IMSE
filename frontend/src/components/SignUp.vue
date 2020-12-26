<template>
  <div class="card" id="signup-card">
  <section id="card-content">
    <b-field label="Name">
      <b-input value="" placeholder="First Name"></b-input>
      <b-input value="" placeholder="Last Name"></b-input>
    </b-field>

    <b-field label="Email"
             type="is-danger"
             message="This email is invalid">
      <b-input type="email"
               value="john@"
               maxlength="30">
      </b-input>
    </b-field>

    <b-field label="Address">
      <b-input value="" placeholder="City"></b-input>
      <b-input value="" placeholder="Street"></b-input>
      <b-input value="" placeholder="House"></b-input>
      <b-input value="" placeholder="Postcode"></b-input>
    </b-field>

    <b-field label="Username"
             type="is-success"
             message="This username is available">
      <b-input value="johnsilver" maxlength="30"></b-input>
    </b-field>

    <b-field label="Password"
             type="is-warning"
             :message="['Password is too short', 'Password must have at least 8 characters']">
      <b-input value="123" type="password" maxlength="30"></b-input>
    </b-field>

    <b-field label="Role">
      <b-select placeholder="Select a role">
        <option value="1">Customer</option>
        <option value="2">Admin</option>
      </b-select>
    </b-field>
    <b-button type="is-primary">Sign Up</b-button>
  </section>
  </div>
</template>

<script>
export default {
  name: "SignUp",
  data() {
    return {
      hasError: false
    }
  }
}
</script>

<style scoped>
#signup-card{
  margin: 10px auto;
  width: 30%;
  padding: 10px;
}
#card-content{
  padding: 20px;
}
</style>
