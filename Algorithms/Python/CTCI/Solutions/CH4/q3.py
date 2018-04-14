import queue
from DataStructures.BinaryTree import *

def listOfDepth(graph, item):
    a = dict()
    return __dfsListOfDepth(graph.getRoot(), 1, a)

def __dfsListOfDepth(node, level, map):
    if level in map:
        map[level].append(node.get_value())
    else:
        newList = []
        newList.append(node.get_value())
        map[level] = newList
    if node == None:
        return
    __dfsListOfDepth(node.get_left(),level+1)
    __dfsListOfDepth(node.get_right(), level+1)