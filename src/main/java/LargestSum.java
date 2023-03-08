
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int largest = 0;
        int secondLargest = 0;
        if(nums.get(1) > nums.get(0)) {
            largest = nums.get(1);
            secondLargest = nums.get(1);
        } else {
            largest = nums.get(0);
            secondLargest = nums.get(1);
        }
        
        for(int i = 2; i < nums.size(); i++) {
            int num = nums.get(i);
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest) {
                secondLargest = num;
            } else {
                continue;
            }
        }
        System.out.println(largest + " " + secondLargest);
        return largest + secondLargest;
    }
}