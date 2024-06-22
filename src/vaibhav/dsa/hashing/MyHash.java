package vaibhav.dsa.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {
    ArrayList<LinkedList<Integer>> table = new ArrayList<>();
    int b;

    MyHash(int b) {
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    public int getHash(int x) {
        return x % b;
    }

    public boolean search(int a) {
        int hash = getHash(a);
        LinkedList<Integer> values = table.get(hash);
        return values.contains(a);
    }

    public void add(int a) {
        int hash = getHash(a);
        LinkedList<Integer> values = table.get(hash);
        values.add(a);
    }

    public void delete(int a) {
        int hash = getHash(a);
        LinkedList<Integer> values = table.get(hash);
        for (int val : values) {
            if (val == a) {
                values.remove((Integer) val);
            }
        }
    }
}

class HashFunctions {
    public static void main(String[] args) {

    }
}
