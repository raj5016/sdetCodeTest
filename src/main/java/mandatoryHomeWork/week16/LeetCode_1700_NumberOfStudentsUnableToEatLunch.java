package mandatoryHomeWork.week16;

import java.util.ArrayDeque;

public class LeetCode_1700_NumberOfStudentsUnableToEatLunch {
	
	//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
    /*
    Pseudocode Explanation Pattern:

1. Initialize an empty queue called 'queue' to store students.

2. Enqueue each student from the 'students' array into the 'queue'.

3. Initialize two variables: 'sandwichIndex' to keep track of the current sandwich to be served, and 'temp' to count the number of students cycled through without serving a sandwich.

4. Enter a loop that continues as long as 'temp' is less than the size of 'queue'.

5. Inside the loop, check if the front student in 'queue' is the same as the sandwich indicated by 'sandwiches[sandwichIndex]'.

6. If they are the same, increment 'sandwichIndex' to indicate that the sandwich has been served, dequeue the student from 'queue', and reset 'temp' to 0 to start counting again.

7. If the student's preference doesn't match the current sandwich, move the student to the end of 'queue' by dequeuing and then enqueuing them back. Also, increment 'temp' to keep track of how many students have been cycled through without finding a matching sandwich.

8. Repeat steps 5-7 until all students have either been served a sandwich or moved to the end of the queue multiple times without being served.

9. After the loop, return the size of 'queue', which represents the number of students who couldn't be served a matching sandwich.

10. Return the final result, which is the number of students who couldn't be served a matching sandwich.

 Time complexity- O(N) , where N is the number of students.
 Space complexity- O(N) , where N is the number of students.

  */
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int each : students)
            queue.add(each);

        int sandwichIndex = 0, temp =0;

        while (temp < queue.size()) {

            if (queue.peek() == sandwiches[sandwichIndex]) {
                sandwichIndex++;
                queue.poll();
                temp = 0;
            } else {
                queue.add(queue.removeFirst());
                temp++;
            }
        }
        return queue.size();
    }

}
