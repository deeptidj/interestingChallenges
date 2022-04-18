package com.interviewCamp.problems.graphs;

public class dfs {
    public static void main(String[] args) {
        System.out.println("DFS main");
        System.out.println("First graph has one node of value 1");
        Node n =  new Node(1);
        Graph g = new Graph();
        g.addNode(n);
        int target = 1;
        boolean res = dfs(g, target);
        System.out.println("Result: Looking for " +target + " in graph with these nodes " + g.getNodes());
    }

    public static boolean dfs(Graph graph, int target) {
        //Given a graph and target , return true if the target exists in the graph

        for(Node node : graph.getNodes()) {
            if (node.state == State.UNVISITED && dfsVisit(node, target)) {
                return true;
            }
        }

        return true;
    }

    public static boolean dfsVisit(Node node, int target) {
        node.setState(State.VISITING);

        if (node.getData() == target) {
            return true;
        }

        for (Node neighbor : node.getNeighbors()) {
            if (neighbor.state == State.UNVISITED && dfsVisit(neighbor, target))
                return true;
        }

        node.setState(State.VISITED);
        return false;
    }

}
