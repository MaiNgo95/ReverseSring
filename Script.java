//create a function to reverse a string
//abcd -> dcba
function reverse(str){
  //need to check input first
  //if there is no string
  // converse the string into an array
  if (!str || str.length < 2 || typeof str != 'string'){
    return "that is not a string";
  } //check all the condition of a string
   const list =[];
   const totalItems = str.length-1; //get the number without 0 
   //loop through the string to get every element
//put i = the last item in the list
   for (let i = totalItems; i >= 0; i--){ //remember the condition of i --
      //add the item after loop into trhe list
      list.push(str[i]); //str[i] to get the element not the index
    
   }
  console.log(list);
  //return list.join('');
}
function reverse1(str){ 
  console.log(str.split("").reverse().join('')); //second method
}
reverse('abcdef')
reverse("maingo")
reverse1("computer")
