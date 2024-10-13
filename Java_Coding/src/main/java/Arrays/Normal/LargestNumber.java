package Arrays.Normal;
//   use different ways to solve the same problem that way you will learn
//   Try to formulate question inside your mind, given 5-10mins to understand the question
//   Time check
//   All Test Cases should be included
//  first try Day 1, second Try day 2, 3rd Try day 3, 4th day [see the solution only], 5th Day Solve it
// [19th, 25th]
public class LargestNumber {

    // Way 1
    public int findLargest(int[] arr) {
        if(arr.length < 2) return -1;

        int largest = arr[0];
        int second_largest = arr[1];

        if(second_largest > largest) {
            largest = arr[1];
            second_largest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[0];
            } else if (arr[i] > second_largest && arr[i] < largest) {
                second_largest = arr[i];
            }
        }

        return second_largest;
    }

    // Way 2
    public int findLargest2(int[] arr) {

        return -1;
    }

    // use priority heap
    public int findLargest3(int[] arr) {

        return -1;
    }
}


//        1. 2 pointer: 6:18
//        2. Binary Tree BFS: 5:26
//        3. Topological Sort: 4:33
//        4. Binary Tree DFS: 3:39
//        5. Top K Elements: 2:45
//        6. Modified Binary Search: 1:35
//        7. Subset: 1:04
//        8. Sliding window: 0:17


