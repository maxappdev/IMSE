<!-- https://buefy.org/documentation/field -->
<template>
  <section>
    <b-tabs v-model="activeTab">
      <b-tab-item label="Customers Ordered Specific Product">
        <b-field label="Select a date" :label-position="labelPosition">
          <b-datepicker
              placeholder="Click to select..."
              icon="calendar-today"
              trap-focus>
          </b-datepicker>
        </b-field>
        <b-field label="Name of good">
          <b-input value="" placeholder="Enter Name"></b-input>
        </b-field>
        <b-button>Count</b-button>
        <div>Result: 14 Customers</div>
      </b-tab-item>

      <b-tab-item label="Customers From Country Buy Specific Good">
        <b-field label="Country"
                 :label-position="labelPosition">
          <b-select placeholder="Select a country">
            <option value="1">Germany</option>
            <option value="2">England</option>
          </b-select>
        </b-field>
        <b-field label="Name of good">
          <b-input value="" placeholder="Enter Name"></b-input>
        </b-field>
        <b-button>Count</b-button>
        <div>Result: 14 Customers</div>
      </b-tab-item>

    </b-tabs>
  </section>
</template>

<script>
export default {
  name: "Reports",
  data() {
    return {
      activeTab: 0,
      showBooks: false
    }
  }
}
</script>
