package com.interviewCamp.problems.graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public Graph(List<Node> nodes){
        super();
        this.nodes = nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes(){
        return nodes;
    }

}
