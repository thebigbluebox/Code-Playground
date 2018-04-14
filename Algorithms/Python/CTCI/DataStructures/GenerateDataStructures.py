from DataStructures.LinkedList import *
from DataStructures.BinaryTree import *

from random import random

import queue


def generate_symmetrical_linkedlist(length):
    linkedlist = UnorderedList()
    for index in range (1, length):
        if index > length/2:
            linkedlist.add(length-index)
        else:
            linkedlist.add(index)
    return linkedlist

def generate_random_linkedlist(length):
    linkedlist = UnorderedList()
    for index in range (1,length):
        linkedlist.add(int(random()*10))
    return linkedlist

def geneate_bst():
    tree = Tree()
    tree.add(8)
    tree.add(10)
    tree.add(4)
    tree.add(20)
    tree.add(6)
    tree.add(2)
    return tree

def inOrderTraversal(rootNode):
    if(rootNode != None):
        inOrderTraversal(rootNode.l)
        print(rootNode.v)
        inOrderTraversal(rootNode.r)

def preOrderTraversal(rootNode):
    if(rootNode != None):
        print(rootNode.v)
        preOrderTraversal(rootNode.l)
        preOrderTraversal(rootNode.r)

def postOrderTraversal(rootNode):
    if(rootNode != None):
        postOrderTraversal(rootNode.l)
        postOrderTraversal(rootNode.r)
        print(rootNode.v)

def generate_adjencylist():
    w, h = 4 , 4
    Matrix = [[0 for x in range(w)] for y in range(h)]
    Matrix[1][0] = 1 # x = 1, y = 0
    Matrix[2][1] = 1
    Matrix[0][2] = 1
    Matrix[2][3] = 1
    return Matrix

def bfs(graph, item):
    visitedQ = queue.Queue()
    root = graph.getRoot()
    root.setVisited()
    visitedQ.put(root)

    while not visitedQ.empty():
        r = visitedQ.get()
        if r.getVertex == item:
            return r
        edges = r.getAdjacent()
        for edge in edges:
            if not edge.getVisited():
                edge.setVisited()
                visitedQ.put(edge)

def dfs(graph, item):
    return __dfs(graph.getRoot(), item)

def __dfs(node, item):
    if node == None:
        return
    if node.getVertex == item:
        return node
    node.setVisited()
    for edge in node.getAdjacent():
        if not node.getVisited():
            __dfs(edge, item)