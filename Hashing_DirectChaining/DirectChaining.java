package Hashing_DirectChaining;

import java.util.LinkedList;
public class DirectChaining {
    LinkedList<String>[] hashTable;
    int max = 5;

    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i;
        int sum;
        for(sum=0, i=0; i<word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if(hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
    }

    public void displayHashTable() {
        if(hashTable == null) {
            System.out.println("Hash Table dne.");
        } else {
            System.out.println("\nHash Table");
            for(int i=0; i<hashTable.length; i++) {
                System.out.println("Index " + i + ", Key " + hashTable[i]);
            }
        }
    }

    public boolean search(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + " found in Hashtable at location: " + newIndex);
            return true;
        } else {
            System.out.println("\n" + "\"" + word + "\"" + " is not found in Hashtable.");
            return false;
        }
    }

    public void deleteKeyHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        boolean result = search(word);
        if(result) {
            hashTable[newIndex].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + " is deleted from Hashable.");
        }
    }
}
