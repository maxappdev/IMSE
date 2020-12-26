<template>
  <div class="card" id="login-card">
    <section id="card-content">

      <b-field label="Username"
               :type="{ 'is-danger': hasError }"
               :message="{ 'Username is not available': hasError }">
        <b-input value="johnsilver" maxlength="30"></b-input>
      </b-field>

      <b-field label="Password"
               :type="{ 'is-danger': hasError }"
               :message="[
                { 'Password is too short': hasError },
                { 'Password must have at least 8 characters': hasError }
            ]">
        <b-input value="123" type="password" maxlength="30"></b-input>
      </b-field>
      <b-button >Log In</b-button>
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
#login-card{
  margin: 100px auto;
  width: 30%;
  padding: 10px;
}
#card-content{
  padding: 20px;
}
</style>
