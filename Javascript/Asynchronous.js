function getRandomNumber() {
    return Math.floor(Math.random() * 100);
  }
  
  function simulateStockPriceChange() {
    return new Promise((resolve, reject) => {
      let count = 0;
      const intervalId = setInterval(() => {
        const stockPrice = getRandomNumber();
        console.log(`Stock price: ${stockPrice}`);
        count++;
        if (count === 5) {
          clearInterval(intervalId);
          resolve("Simulation completed");
        }
      }, 3000);
    });
  }
  
  simulateStockPriceChange().then((response) => {
    console.log(response);
  }).catch((error) => {
    console.error(error);
  });
  