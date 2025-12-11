package AdvancedDSA.Day7;

import java.util.ArrayList;

public class TowerOfHanoiApproach2 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        towerOfHanoi(n, 1, 2, 3, list);
        System.out.println(list);
    }
    static void towerOfHanoi(int n, int a,int b,int c, ArrayList<ArrayList<Integer>> list){
        if(n == 0) return;

        towerOfHanoi(n-1, a,c,b,list);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);
        temp.add(a);
        temp.add(c);
        list.add(temp);
        towerOfHanoi(n-1,b,a,c,list);

    }
}