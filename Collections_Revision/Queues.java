package Collections;

import java.util.*;

public class Queues
{

    public static void main(String[] args)
    {

        Deque<Integer> q1 = new ArrayDeque<>();
        
        q1.add(7);
        q1.add(4);
        q1.add(3);
        q1.add(6);
        q1.add(9);
        


        Deque<Character> q2 = new ArrayDeque<>();

        q2.add('u');
        q2.add('d');
        q2.add('a');
        q2.add('y');
        


        Deque<Object> result = mergeQueue(q1, q2);
        System.out.println(result);


    }

    public static Deque<Object> mergeQueue(Deque<Integer> q1, Deque<Character> q2)
    {

        Deque<Object> res = new ArrayDeque<>();


        int max;
        int min;

        if (q1.size() > q2.size())
        {
            max = q1.size();
            min = q2.size();

        }
        else
        {
            max = q2.size();
            min = q1.size();
        }

       int diff = max - min;

        int i = 0;

        while (i < min)
        {
            while (!(q1.isEmpty() || q2.isEmpty()))
            res.add(q1.poll() + "," + q2.poll());

            i++;
        }

        while (diff < max)
        {
            while (!q1.isEmpty())
                res.add(q1.poll());

            while (!q2.isEmpty())
                res.add(q2.poll());

            diff++;
        }

        return res;
    }
}