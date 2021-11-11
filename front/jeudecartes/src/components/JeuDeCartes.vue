<template>
  <div>
  <button v-on:click="play()" >Appuyer ici pour Jouer</button>

  <div style="margin-top:100px" v-if="done">
  Liste non triée
    <span v-for="card in unsortedList" :key="card.numero">
      <span class="set-border"> 
      {{ card.index }} 
      <img v-if="card.couleur=='COEUR'" class="image-dimensions" src="../assets/Coeur.png">
      <img v-if="card.couleur=='TREFLE'" class="image-dimensions" src="../assets/trefle.png">
      <img v-if="card.couleur=='CARREAU'" class="image-dimensions" src="../assets/carreau.png">
      <img v-if="card.couleur=='PIQUE'" class="image-dimensions" src="../assets/pique.png">
      </span>
    </span>
</div>
<br>
<div style="margin-top:200px"  v-if="done">
Liste triée
    <span v-for="card in sortedList" :key="card.numero">
      <span class="set-border"> 
      {{ card.index }} 
       <img v-if="card.couleur=='COEUR'" class="image-dimensions" src="../assets/Coeur.png">
      <img v-if="card.couleur=='TREFLE'" class="image-dimensions" src="../assets/trefle.png">
      <img v-if="card.couleur=='CARREAU'" class="image-dimensions" src="../assets/carreau.png">
      <img v-if="card.couleur=='PIQUE'" class="image-dimensions" src="../assets/pique.png">
      </span>
    </span>
</div>
  <h3 style="margin-top:100px">®Developped by Naim </h3>

  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'JeuDeCartes',
  
  data (){
    return{
      done : true,
      sortedList : [],
      unsortedList: []
    };
  },
   created() {
     this.play();
    
  },
  methods :{
    play (){
      this.done = false;
    axios.get(`http://localhost:8080/jouer`)
    .then(response => {
      // JSON responses are automatically parsed.
      console.log(response);
      this.sortedList = response.data.sortedList;
      this.unsortedList = response.data.unsortedList;
      this.done = true;

    })
    .catch(e => {
      this.errors.push(e)
    })
    }
  }
}
</script>

<style scoped>
.set-border{
  border-style: dotted;
  margin:20px;
  padding :20px;
}

.image-dimensions{
  height:20px;
  width:20px;
}

</style>
