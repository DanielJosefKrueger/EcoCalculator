package com.eco.graph;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class GraphUtil {
    private final Graph graph;

    private String styleSheet = ""
            + "graph {"
            + "	canvas-color: white; "
            + "	fill-color: white, #EEEEEE; "
            + "}"
            + ""
            + "node {"
            + "	fill-color: white;"
            + "	size: 20px;"
            +"  text-size: 15;"
            + "}";





    public GraphUtil(){
        System.setProperty("org.graphstream.ui", "swing");
        graph = new SingleGraph("Tutorial 1");
        graph.setStrict(false);
        graph.setAttribute( "ui.stylesheet", styleSheet );

    //    graph.setAttribute( "layout.stabilization-limit", "0" );
    //    graph.setAttribute( "layout.quality", "0" );


        graph.setAutoCreate(true); // optionally have it create nodes for you automatically
    }



    public void start(String startingNodeId, String text){
        graph.addNode(startingNodeId);
        Node start = graph.addNode(startingNodeId);
        start.setAttribute("ui.label", text);
        start.setAttribute("ui.style", "text-style: bold;");

    }

    public void addNode(String child, String parent, String text){
        graph.addEdge(child + parent, child, parent);
        Node childNode = graph.addNode(child);
        childNode.setAttribute("ui.label", text);
      //  childNode.setAttribute("size-mode: fit;",;
      //  childNode.setAttribute("text-alignment: center;");
      //  childNode.setAttribute("text-size: 100;");
    }

    public void display(){
        graph.display();
    }



}
