/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.LinkedList;

import cs.Node;

/**
 *
 * @author leekeit
 */
public class Engine {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    LinkedList ll = new LinkedList();
    ll.addNode(new Node("This"));
    ll.addNode(new Node("is"));
    ll.addNode(new Node("a"));
    ll.addNode(new Node("test!"));
    
    System.out.println("Number of nodes: " + ll.numberOfNodes);
    Node node = ll.rootNode;
    while (null != node) {
      System.out.println("Node data: " + node.data);
      node = node.next;
    }
    
    node = ll.rootNode;
    ll.insertNode(new Node("new"), new Node("test!"));
    System.out.println("Number of nodes: " + ll.numberOfNodes);
    while (null != node) {
      System.out.println("Node data: " + node.data);
      node = node.next;
    }

    Node found = ll.search("is");
    if (null != found) {
    System.out.println("Found node: " + found);
    } else {
      System.out.println("Node not found for data: " + "is");
    }
    
    ll.removeNode();
    System.out.println("Number of nodes: " + ll.numberOfNodes);
    node = ll.rootNode;
    while (null != node) {
      System.out.println("Node data: " + node.data);
      node = node.next;
    }
  }
  
}
