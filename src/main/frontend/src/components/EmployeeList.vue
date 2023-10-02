<template>
    <div>
      <h1>Employee List</h1>
      <ul>
        <li v-for="employee in employees" :key="employee.id">
          {{ employee.name }}
        </li>
      </ul>
    </div>
</template>
  
  <script>
  import axios from 'axios';
  export default {
    data() {
      return {
        employees: []
      };
    },
    mounted() {
    // 在這裡發送 HTTP GET 請求獲取員工資料
    axios.get('http://localhost:8080/employees')
      .then(response => {
        this.employees = response.data;
      })
      .catch(error => {
        console.error('Error fetching employees:', error);
      });
    }
  };
  </script>