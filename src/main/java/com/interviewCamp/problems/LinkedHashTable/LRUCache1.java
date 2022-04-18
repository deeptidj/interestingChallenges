package com.interviewCamp.problems.LinkedHashTable;
import java.util.HashMap;

public class LRUCache1<K, V> {
    // Map Key to Nodes
    HashMap<K, Node<K, V>> map;

    // Linked List
    Node<K, V> head = new Node<K, V>();
    Node<K, V> tail = new Node<K, V>();

    //Maximum cache nodes can hold
    int capacity;

    public LRUCache1(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public V read(K key) {
        Node<K, V> node = map.get(key);
        if (node ==null) {
            return null;
        }
        remove(key);//remove from LinkedHashTable
       // add(node.getKey(),node.getValue()); //add back to the front of the linked list
        return node.getValue();
    }
    public void write(K key, V value){
        if(map.size() == capacity) {
            remove(head.getKey());
        }
       // add(key, value);
    }
    public void remove(K key){
        if(!map.containsKey(key)){
            return;
        }
        Node<K, V> toRemove = map.get(key);
       // removeFromLinkedList(toRemove);
        map.remove(key);
    }
}
