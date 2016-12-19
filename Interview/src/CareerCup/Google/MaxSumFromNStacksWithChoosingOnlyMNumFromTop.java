/**
 * 
 */
package CareerCup.Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given N stacks, each stack contains Si elements, find the maximum sum of the M numbers in the N stacks. To get the number of the stack, only supporting get the top number. For example, S=[1,200,1,2,3], if you want to get the number 200, you need choose 3,2,1 first. 
EX: 
S1=[1,1,100,3] 
S2=[2000,2,3,1] 
S3=[10,1,4] 
the maximum sum of the 3 numbers in the above stacks is 3+100+3=107. 
Any better solution for this problem?

 * @author vikash
 *
 */
public class MaxSumFromNStacksWithChoosingOnlyMNumFromTop {

	@SuppressWarnings("unchecked")
	static List<Integer> stacks[] = new ArrayList[3];

    static int N = 3, m = 3;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String s[]){
        stacks[0] = new ArrayList<>();
        stacks[0].add(3);
        stacks[0].add(100);
        stacks[0].add(1);
        stacks[0].add(1);
        stacks[1] = new ArrayList<>();
        stacks[1].add(1);
        stacks[1].add(3);
        stacks[1].add(2);
        stacks[1].add(2000);
        stacks[2] = new ArrayList<>();
        stacks[2].add(4);
        stacks[2].add(1);
        stacks[2].add(10);

        Integer sum[] = new Integer[3];
        for(int i = 0;i<sum.length;i++)
            sum[i] = -1;

        System.out.println(recurr(0, sum));

    }

    public static int recurr(int n, Integer sum[]){
        if(n == N){
            return 0;
        }
        String s = Arrays.toString(sum) + n;
        if(map.containsKey(s)){
            return map.get(s);
        }
        int max = 0;
        for(int i = 0;i<sum.length;i++){
            sum[i]++;
            if(stacks[i].size() > sum[i]) {
                max = Math.max(recurr(n + 1, sum) + stacks[i].get(sum[i]), max);
            }
            sum[i]--;
        }
        map.put(s,max);
        return max;

    }

}
