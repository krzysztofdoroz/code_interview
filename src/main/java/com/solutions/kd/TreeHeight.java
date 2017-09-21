package com.solutions.kd;

/**
 * Created by e-kfdz on 9/20/2017.
 */
public class TreeHeight {

    public int solution(Tree T) {

        if (T == null) {
            return -1;
        }

        if(T.l == null && T.r == null) {
            return 0;
        }

        return 1 + Math.max(solution(T.l), solution(T.r));
    }


//    private

}


class Tree {
    public int x;
    public Tree l;
    public Tree r;
}