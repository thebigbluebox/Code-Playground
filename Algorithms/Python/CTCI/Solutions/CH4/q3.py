def listOfDepth(graph):
    a = dict()
    __dfsListOfDepth(graph.getRoot(), 1, a)
    return a;

def __dfsListOfDepth(node, level, map):
    if level in map:
        if node is not None:
            map[level].append(node.get_value())
    else:
        newList = []
        if node is not None:
            newList.append(node.get_value())
        map[level] = newList
    if node == None:
        return map
    __dfsListOfDepth(node.get_left(), level+1, map)
    __dfsListOfDepth(node.get_right(), level+1, map)
