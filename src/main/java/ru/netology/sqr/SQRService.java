package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int rangeStart, int rangeEnd) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {

            if ((i * i >= rangeStart) & (i * i <= rangeEnd)) {
                //System.out.println(i);
                count = count + 1;


            }

        }
        return count;
    }
}
