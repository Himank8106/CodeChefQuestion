/* Link - https://leetcode.com/problems/design-hashmap/ */

// class MyHashMap {
//     int[] data = new int[1000001];
//     public MyHashMap() {
//         Arrays.fill(data, -1);
//     }
    
//     public void put(int key, int value) {
//         data[key] = value;
//     }
    
//     public int get(int key) {
//         return data[key];
//     }
    
//     public void remove(int key) {
//         data[key] = -1;
//     }
// }

public class ListNode {
    int key;
    int val;
    ListNode next;

    ListNode() {
        this.key = -1;
        this.val = -1;
    }

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {
    private static final int BUCKET_SIZE = 2069;
    private ListNode[] bucket;

    public MyHashMap() {
        this.bucket = new ListNode[BUCKET_SIZE];
        for(int i=0; i<BUCKET_SIZE; i++) {
            bucket[i] = new ListNode();
        }
    }

    public int getHash(int key) {
        return key % BUCKET_SIZE;
    }
    
    public void put(int key, int value) {
        int hash = getHash(key);
        ListNode sentinel = bucket[hash];

        while(sentinel.next != null) {
            if(sentinel.next.key == key) {
                sentinel.next.val = value;
                return;
            } else {
                sentinel = sentinel.next;
            }
        }

        sentinel.next = new ListNode(key, value);
    }
    
    public int get(int key) {
        int hash = getHash(key);
        ListNode head = bucket[hash].next;
        int returnVal = -1;
        while(head != null) {
            if(head.key == key) {
                return head.val;
            }
            head = head.next;
        }

        return returnVal;
    }
    
    public void remove(int key) {
        int hash = getHash(key);
        ListNode sentinel = bucket[hash];

        while(sentinel.next != null) {
            if(sentinel.next.key == key) {
                sentinel.next = sentinel.next.next;
                return;
            } else {
                sentinel = sentinel.next;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
