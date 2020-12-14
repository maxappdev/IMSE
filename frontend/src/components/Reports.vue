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
        <b-button>Count</b-button>
      </b-tab-item>

      <b-tab-item label="Customers Buy Specific Good">
        <b-field label="Subject"
                 :label-position="labelPosition">
          <b-select placeholder="Select a subject">
            <option value="1">Option 1</option>
            <option value="2">Option 2</option>
          </b-select>
        </b-field>
        <b-button>Count</b-button>
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
