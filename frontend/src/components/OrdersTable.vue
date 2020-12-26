<template>
  <section>
  <b-field>
    <button id="return-button" class="button is-danger" @click="checkedRows = []"
            :disabled="!checkedRows.length">
      <span>Return checked</span>
    </button>
  </b-field>

  <b-table :data="data"
           :columns="columns"
           :checked-rows.sync="checkedRows"
           checkable>
  </b-table>
  </section>
</template>

<script>
export default {
  name: 'OrdersTable',
  data() {
    return {
      checkedRows: [],
      data: [
        { 'id': 1, 'paid' : "Yes", 'delivered' : "Yes", 'cancelled' : "No",
          'date' : "12.02.2020", 'note' : "Small note", 'goods' : "Apple MacBook, Apple iPhone", 'price' : "15.00 EUR"}
      ],
      columns: [
        {
          field: 'id',
          label: 'ID',
        },
        {
          field: 'paid',
          label: 'Paid',
        },
        {
          field: 'delivered',
          label: 'Delivered',
        },
        {
          field: 'cancelled',
          label: 'Cancelled',
        },
        {
          field: 'date',
          label: 'Date',
        },
        {
          field: 'note',
          label: 'Note',
        },
        {
          field: 'goods',
          label: 'Goods',
        },
        {
          field: 'price',
          label: 'Price',
        }
      ]
    }
  }
}
</script>

<style scoped>
#return-button{
  margin: 10px;
}
</style>

