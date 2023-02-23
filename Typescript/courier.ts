const dtdc: number = 1; 
const firstFlight: number = 2; 

const firstFlightCharges: number = firstFlight * 5; 
const dtdcCharges: number = dtdc * 10; 
const dtdcServiceTax: number = dtdcCharges * 0.1;
const totalCharge: number = (firstFlightCharges + dtdcCharges + dtdcServiceTax);

console.log(`Total cargo charges: $${totalCharge}`); 
