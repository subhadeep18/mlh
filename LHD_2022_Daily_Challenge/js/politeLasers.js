function getLaserSetting(magicWord) {
    if (magicWord === 'please') {
      return 'OFF';
    } else {
      return 'ON';
    }
  }
  const argumentValue = process.argv[2];
  const currentSetting = getLaserSetting('right now!');
  console.log('The current laser setting is: ' + currentSetting);