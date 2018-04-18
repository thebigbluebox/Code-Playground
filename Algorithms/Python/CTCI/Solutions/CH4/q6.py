from DataStructures.BinaryTree import *
from DataStructures.GenerateDataStructures import geneate_bst


def successor(node):
    return __successor(node, node.get_value())

def __successor(node):
    result = None;
    if node.get_right() is not None:
        result = __leftSubTree(node.get_right())
    if result is None:
        __successor(node.get_parent())

def __leftSubTree(node):
    if node.get_left() is not None:
        __leftSubTree(node.get_left())
    else:
        return None
    if node.get_left() is None:
        return node