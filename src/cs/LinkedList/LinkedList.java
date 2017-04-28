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
public class LinkedList {
  public Node rootNode;
  public int numberOfNodes;
  
  public LinkedList() {
    rootNode = null;
    numberOfNodes = 0;
  }
  
  public Node addNode(Node newNode) {
    if (null == rootNode) {
      rootNode = newNode;
      numberOfNodes++;
      return newNode;
    }
    
    Node node = rootNode;
    while (null != node.next) {
      node = node.next;
    }    
    node.next = newNode;
    numberOfNodes++;
    
    return newNode;
  }
  
  public Node removeNode() {
    Node node = rootNode;
    if (null == node) {
      return node;
    }
    
    if (null == node.next) {
      node = null;
      numberOfNodes--;
      return node;
    }
    
    while (null != node.next.next) {
      node = node.next;
    }
    
    Node removedNode = node.next.next;
    node.next = null;
    numberOfNodes--;
    return removedNode;
  }
  
  public Node insertNode(Node newNode, Node compare) {
    if (null == rootNode) {
      rootNode = newNode;
      numberOfNodes++;
      return newNode;
    }

    Node node = rootNode;
    // If root node, insert and make new root
    if (null == node.next) {
      newNode.next = node;
      rootNode = newNode;
      numberOfNodes++;
      return newNode;
    }

    // Not root, compare and if located insert before 
    while (null != node.next) {
      if (compare.data.equalsIgnoreCase(node.next.data)) {
        // Matches, insert before next node!
        newNode.next = node.next;
        node.next = newNode;
        numberOfNodes++;
        return newNode;
      }
      else {
        node = node.next;
      }
    }
    
    // Compare node not found, don't insert new node and return null
    return null;
  }
  
  public Node search(String data) {
    if ((null == data) || (null == rootNode)) {
      return null;
    }

    Node node = rootNode;

    // Not root, compare and if located return node 
    while (null != node) {
      if (data.equalsIgnoreCase(node.data)) {
        // Matches, insert before next node!
        return node;
      }
      else {
        node = node.next;
      }
    }
    
    // Not found, return null
    return null;
  }
}

