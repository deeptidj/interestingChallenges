package com.interviewCamp.problems.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    List<Node> neighbors;
    State state;

    public Node(int data){
        super();
        this.data = data;
        this.state = State.UNVISITED;
        this.neighbors = new ArrayList<>();
    }

    void setData(int data) {
        this.data = data ;
    }

    int getData() {
        return this.data;
    }

    void setNeighbors(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
