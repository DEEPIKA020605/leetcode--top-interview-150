import java.util.*;

public class RandomizedSet {

    // ArrayList to store the values
    private List<Integer> list;
    // HashMap to store the value and its corresponding index in the list
    private Map<Integer, Integer> valToIndex;
    private Random rand;

    // Constructor to initialize the RandomizedSet object
    public RandomizedSet() {
        list = new ArrayList<>();
        valToIndex = new HashMap<>();
        rand = new Random();
    }

    // Inserts a value to the set, if not present. Returns true if inserted, false if already exists
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        // Add value to list and map its index in the list
        valToIndex.put(val, list.size());
        list.add(val);
        return true;
    }

    // Removes a value from the set, if present. Returns true if removed, false if not present
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        // Get the index of the element to remove
        int index = valToIndex.get(val);
        // Swap the element with the last one in the list
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);  // Replace the index with the last element
        valToIndex.put(lastElement, index);  // Update the index of the last element in the map
        
        // Remove the last element from the list
        list.remove(list.size() - 1);
        // Remove the element from the map
        valToIndex.remove(val);
        return true;
    }

    // Get a random element from the set. Guaranteed to have at least one element in the set
    public int getRandom() {
        // Pick a random index in the range [0, list.size() - 1]
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}
