
/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Sample Output 0

1 1
 * 
 * 
 * 
 * 
 * 
 * 
 * */
package problemSolving;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class prob1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a=new ArrayList<>();
		List<Integer>b=new ArrayList<>();
		
		a.add(4);
		a.add(2);
		a.add(2);
		a.add(5);
		
		b.add(2);
		b.add(2);
		b.add(3);
		b.add(6);
		
		int A = 0, B = 0;
		for (int i = 0; i < a.size(); i++){
		if (a.get(i) > b.get(i)){
		A++;
		} else if (a.get(i) < b.get(i)){
		B++;
		}
		}
		
		System.out.println(Arrays.asList(A,B));
		
		

	}


}
