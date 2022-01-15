function scan(freightItems) {
    let contrabandCount = 0;
  
    /*
    Replace this comment with your code.
  
    Your code needs to:
    - Loop through every item in the freightItems array
    - if the item is equal to "contraband", increase contrabandCount by one
  
    */
    for (let i = 0; i < freightItems.length; i++) {
        if(freightItems[i] == 'contraband')
            contrabandCount++;
      }
  
    return contrabandCount;
  }
  
  // The following lines of code are not required for the solution, but can be
  // used by you to test your solution.
  const numItems = scan(['dog', 'contraband', 'cat', 'zippers', 'contraband']);
  console.log('Number of "contraband": ' + numItems); // should be 2