class Ducktypium {
    constructor(color) {
      // your code here
      if(color == 'red' || color == 'blue' || color == 'yellow')
      {
        this.color = color;
      }
      else {
        throw "error";
      }
      this.calibrationSequence = [];
    }
  
    refract (color) {
        if(color == 'red' || color == 'blue' || color == 'yellow')
        {
            if(color == this.color)
                return color;
        else
          if(color == 'red') {
            if(this.color == 'yellow') {
                return 'orange';
            }
            else if(this.color == 'blue') {
                return 'purple';
              }
          }
          else if(color == 'blue') {
            if(this.color == 'yellow') {
                return 'green';
            }
            else if(this.color == 'red') {
                return 'purple';
              }
            }
            else if(color == 'yellow') {
                if(this.color == 'red') {
                    return 'orange';
                }
                else if(this.color == 'blue') {
                    return 'green';
                  }
            }
        }
        else {
          throw "error";
        }
    }
    // your code here
    calibrate (arr) {
        arr.sort();
        this.calibrationSequence = arr.map(item => item * 3);
    }
  }
  
  // The following lines of code are not required for the solution, but can be
  // used by you to test your solution.
  const dt = new Ducktypium('red');
  
  console.log(dt.color); // prints 'red'
  
  console.log(dt.refract('blue')); // prints 'purple'
  console.log(dt.refract('red')); // prints 'red'
  
  dt.calibrate([3, 5, 1]);
  
  console.log(dt.calibrationSequence); // prints [3, 9, 15]