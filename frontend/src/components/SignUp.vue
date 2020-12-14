<template>
  <div class="card" id="signup-card">
  <section id="card-content">
    <b-field label="Name">
      <b-input value="Kevin Garvey"></b-input>
    </b-field>

    <b-field label="Email"
             type="is-danger"
             message="This email is invalid">
      <b-input type="email"
               value="john@"
               maxlength="30">
      </b-input>
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

    <b-field label="Subject">
      <b-select placeholder="Select a subject">
        <option value="1">Option 1</option>
        <option value="2">Option 2</option>
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
  margin: 30px auto;
  width: 30%;
  padding: 10px;
}
#card-content{
  padding: 20px;
}
</style>
