package com.yu.work02;

/**
 * Created by YuWenJing on 2017/5/4.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] worldListOne={"你","我","他"};

        String[] worldListTwo={"是","不是","可能是"};
        String[] worldListThree={"智障"};

        int rand1= (int) (Math.random()*worldListOne.length);
        int rand2= (int) (Math.random()*worldListTwo.length);
        int rand3= (int) (Math.random()*worldListThree.length);
        System.out.println(worldListOne[rand1]+worldListTwo[rand2]+worldListThree[rand3]);
    }



}
