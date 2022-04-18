package com.interviewCamp.problems.LinkedHashTable;

import java.util.HashMap;

public class LRUCache<K, V> {
    int capacity;
    HashMap<K, Node<K, V>> map;
    Node<K, V> head;
    Node<K, V> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<K, Node<K, V>>();
    }

    public void removeFromLinkedHashTable(K key) {
        //remove from map
        if (!map.containsKey(key)) return;
        Node<K, V> toRemove = map.get(key);
        //remove from the linked list
        removeFromLinkedList(toRemove);

    }
    public void removeFromLinkedList(Node<K, V> toRemove){
        if (toRemove.getPrev() != null) {
            toRemove.getPrev().setNext(toRemove.getNext());
        }
        if (toRemove.getNext() != null) {
            toRemove.getPrev().setPrev(toRemove.getPrev());
        }

        if (toRemove == head) {
            head = toRemove.getNext();
        }
        if (toRemove == tail) {
            tail = toRemove.getPrev();
        }
    }

    public void addToBackLinkedList(Node<K, V> toAppend) {
        if (head == null) {
            head = toAppend;
        } else {
            tail.setNext(toAppend);
            toAppend.setPrev(tail.getPrev());
        }
        tail = toAppend;
    }

    public V read(K key){
        // Read from the linked hash table means
        // 1. get the node from the hashmap
        // 2. evict from linked list
        // 3. Add it to the back of the linked list [what ever is used is being added to the end of the linked list which mean that least used is at the start of the linked list]

        Node<K, V> node = map.get(key);
        if (node == null) return null;
        removeFromLinkedHashTable(key);
        addToBackLinkedList(node);
        return node.getValue();
    }

    public void write(K key, V value){
        //if full then evict the head and
        if (map.size() == capacity) {
            removeFromLinkedHashTable(head.getKey());
        }
        add(key,value);
    }

    public void add(K key, V value){
        Node<K, V> node = new Node<>();
        addToBackLinkedList(node);;
        map.put(key, node);
    }

}
