<template>
  <div>
    <section id="card-content">
      <b-field label="Find a good">
        <b-autocomplete
            rounded
            v-model="name"
            :data="filteredDataArray"
            placeholder="e.g. Samsung.."
            icon="magnify"
            clearable
            @select="option => selected = option">
          <template slot="empty">No results found</template>
        </b-autocomplete>
      </b-field>

      <b-field label="Order info">
        <ul>
          <li>Ordered Goods:</li>
          <li>1.Samsung S8 : 312.99 EUR</li>
          <li>1.Samsung S9 : 312.99 EUR</li>
          <li>1.Samsung S10 : 312.99 EUR</li>
          <li>Total : 410 EUR</li>
        </ul>
      </b-field>

      <b-field label="Small Note (max 30 symbols)">
        <b-input value="" placeholder="Note"></b-input>
      </b-field>

      <b-tabs v-model="activeTab">
        <b-tab-item label="Paypal">
          <b-field label="Paypal Payment">
            <b-input value="" placeholder="Email"></b-input>
            <b-input value="" placeholder="Password"></b-input>
          </b-field>
        </b-tab-item>
        <b-tab-item label="Card">
          <b-field label="Card Payment">
            <b-input value="" placeholder="Card Number"></b-input>
            <b-input value="" placeholder="Exp. date"></b-input>
            <b-input value="" placeholder="CVV2"></b-input>
          </b-field>
        </b-tab-item>
      </b-tabs>

      <b-button type="is-primary">Make Order</b-button>
    </section>
  </div>
</template>

<script>
export default {
  name: "OrdersNew",
  data() {
    return {
      hasError: false,
      activeTab: 0,
      data: [
        'Samsung S8',
        'Samsung S9',
        'Samsung S10',
      ],
      name: '',
      selected: null
    }
  },
  computed: {
    filteredDataArray() {
      return this.data.filter((option) => {
        return option
            .toString()
            .toLowerCase()
            .indexOf(this.name.toLowerCase()) >= 0
      })
    }
  }
}
</script>

<style scoped>
#card-content{
  padding: 20px;
}
</style>
