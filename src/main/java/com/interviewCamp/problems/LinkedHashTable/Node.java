package com.interviewCamp.problems.LinkedHashTable;

public class Node<K, V> {
Node<K, V> prev;
Node<K, V> next;

K key;
V value;

    public Node(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public Node() {
        key = null;
        value = null;
    }

    public Node<K, V> getPrev() {
        return prev;
    }

    public void setPrev(Node<K, V> prev) {
        this.prev = prev;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}