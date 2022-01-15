function scan(freightItems) {
    let contrabandIndexes = [];
  
    /*
    Replace this comment with your code.
  
    Your code needs to:
    - Loop through every item in the freightItems array
    - if the item is equal to "contraband", add the current index of the item 
      to contrabandIndexes - hint: use the array "push()" method
  
    */
      for (let i = 0; i < freightItems.length; i++) {
        if(freightItems[i] == 'contraband')
            contrabandIndexes.push(i);
      }
    return contrabandIndexes;
  }
  
  // The following lines of code are not required for the solution, but can be
  // used by you to test your solution.
  const indexes = scan(['dog', 'contraband', 'cat', 'zippers', 'contraband']);
  console.log('Contraband Indexes: ' + indexes); // should be [1, 4]