package com.dzzxjl.容器;

class HashNode {
    private int key;
    private int value;
    public HashNode next;

    public HashNode() {}

    public HashNode(int k, int v) {
        this.key = k;
        this.value = v;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}

class myHashMap {

    private final int PRIME = 101;
    private final int SIZE = 10000;
    public HashNode[] hashMap = new HashNode[SIZE];

    public int getHashCode(int keyNumber) {
        return keyNumber % PRIME;
    }

    public void put(int key, int value) {
        int index = getHashCode(key);
        HashNode pNode = new HashNode(key, value);
        pNode.next = hashMap[index];
        // 更新数组中的hashnode的值
        hashMap[index] = pNode;

    }

    public int get(int key) {
        int value = -1;
        int index = getHashCode(key);
        HashNode pNode = hashMap[index];
        while (pNode != null) {
            if (pNode.getKey() == key) {
                value = pNode.getValue();
                break;
            }
            pNode = pNode.next;
        }
        return value;
    }

    public boolean containsKey(int key) {
        int index = getHashCode(key);
        HashNode pNode = hashMap[index];
        if (pNode == null) {
            return false;
        }
        return true;
    }

    public int countLength(int key) {
        int count = 0;
        if(containsKey(key)) {
            int index = getHashCode(key);
            HashNode pNode = hashMap[index];
            while (pNode != null) {
                count ++;
                pNode = pNode.next;
            }
        }
        return count;
    }
    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            if (hashMap[i] != null) {
                hashMap[i].next = null;
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        myHashMap hash = new myHashMap();
        hash.put(10, 20);
        hash.put(111, 21);
        System.out.println(hash.get(10));
        System.out.println(hash.get(111));
        System.out.println(hash.containsKey(10));
        System.out.println(hash.countLength(10));
        hash.clear();
    }
}
