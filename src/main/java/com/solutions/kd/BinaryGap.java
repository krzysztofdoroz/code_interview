package com.solutions.kd;

import org.apache.log4j.Logger;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class BinaryGap {

    private final static Logger LOG = Logger.getLogger(BinaryGap.class);

    public int solution(int N) {
        String bin = Integer.toBinaryString(N);
        LOG.info(bin);

        int max = 0;
        int current = 0;
        boolean insideSeq = false;

        for (char c : bin.toCharArray()) {
            if (!insideSeq && c == '1') {
                insideSeq = true;
            } else if (insideSeq && c == '0') {
                current++;
            } else if(c == '1') {
                if (current > max) {
                    max = current;
                }
                current = 0;
            }
        }

        return max;
    }

}
