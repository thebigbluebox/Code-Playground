from DataStructures.GenerateDataStructures import bfs
class Graph:
    def __init__(self, vertex):
        self.__rootNode = Node(vertex)

    def addNode(self, which, x):
        found = bfs(self, which)
        found.addAdjacent(x)

    def getRoot(self):
        return self.__rootNode

    def getNodes(self):
        return self.vertices

class Node:
    def __init__(self, vertex):
        self.__adjacent = []
        self.__vertex = vertex
        self.__visited = False

    def addAdjacent(self, x):
        self.__adjacent.append(x)

    def getAdjacent(self):
        return self.__adjacent

    def getVertex(self):
        return self.__vertex

    def getVisited(self):
        return self.__visited

    def setVisited(self):
        self.__visited = True