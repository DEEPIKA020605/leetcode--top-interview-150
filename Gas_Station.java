public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;   // Total gas available
        int totalCost = 0;  // Total cost needed
        int tank = 0;       // Current gas in the tank
        int start = 0;      // Starting station
        
        // Traverse all stations
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];
            
            // If tank becomes negative, we cannot complete the circuit from current start
            if (tank < 0) {
                // Start from the next station
                start = i + 1;
                tank = 0; // Reset the tank
            }
        }
        
        // If total gas is less than total cost, return -1
        if (totalGas < totalCost) {
            return -1;
        }
        
        // Otherwise, return the starting station
        return start;
    }
}
