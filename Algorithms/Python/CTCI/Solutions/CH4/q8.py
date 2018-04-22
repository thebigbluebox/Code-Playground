#First Common Ancestor: Design an algorithm and write code to find the first common ancestor
# of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
# necessarily a binary search tree.
from DataStructures.BinaryTree import *

def commonAncestor(tree, node_a, node_b):
    actual_node_a = postOrderTraversal(tree.getRoot(), node_a)
    actual_node_b = postOrderTraversal(tree.getRoot(), node_b)

    if postOrderTraversal(actual_node_a, node_b) is not None:
        return node_a
    if postOrderTraversal(actual_node_b, node_a) is not None:
        return node_b

    current_node = actual_node_a
    while current_node is not None:
        current_node = current_node.get_parent()
        result = postOrderTraversal(current_node, node_b)
        if result is not None:
            return current_node.get_value()



def postOrderTraversal(rootNode, value):
    if(rootNode != None):
        if rootNode.get_value() == value:
            return rootNode
        a = postOrderTraversal(rootNode.get_left(), value)
        b = postOrderTraversal(rootNode.get_right(), value)
        if a != None:
            return a
        if b != None:
            return b


testTree = Tree()
testTree.add(20)
testTree.add(30)
testTree.add(10)
testTree.add(15)
testTree.add(5)
testTree.add(17)
testTree.add(3)
testTree.add(7)

value = commonAncestor(testTree, 7, 17)
print(value)