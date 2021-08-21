package DataStructure.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//40
public class revQueueKelemts {
    public static void main(String[] args) {

        Queue<Integer> given = new LinkedList();
        Stack<Integer> stack = new Stack<Integer>();
        given.add(10);
        given.add(20);
        given.add(30);
        given.add(40);
        given.add(50);
        given.add(60);
        given.add(70);

        Queue<Integer> result = new LinkedList();

        System.out.println(given);

        for(int i=0; i<4;i++){
            if(!given.isEmpty()){
                stack.push(given.remove());
            }

          }
        System.out.println(stack);

        while (!stack.empty()) {
            given.add(stack.peek());
            stack.pop();
        }
        System.out.println(given);

        for (int i = 0; i < given.size() - 4; i++) {
            given.add(given.peek());
            given.remove();
        }
        System.out.println(given);
        }



    }


