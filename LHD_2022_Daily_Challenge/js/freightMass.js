function calculateMass(freightItems) {
    // This is a placeholder for the total length in characters of all strings
    // in the freightItems array
    let totalMass = 0;
  
    /*
    Replace this comment with your code.
    Use the array reduce() function to replace the value of totalMass.
    Note that it is possible to use forEach or other loop types to do this, but
    using "reduce" is probably the most elegant solution!
    */
    for (let i = 0; i < freightItems.length; i++) {
        totalMass += freightItems[i].length;
      }
    return totalMass;
  }
  
  // The following lines of code are not required for the solution, but can be
  // used by you to test your solution.
  const mass = calculateMass(['dog', 'donkey', 'cat']);
  console.log('Total mass of items is ' + mass); // should be 12