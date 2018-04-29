# Thanks to https://stackoverflow.com/questions/2598437/how-to-implement-a-binary-tree
class Node:
    def __init__(self, val):
        self.__l = None
        self.__r = None
        self.__p = None
        self.__v = val


    def set_left(self, left):
        self.__l = left

    def get_left(self):
        return self.__l

    def set_right(self, right):
        self.__r = right

    def get_right(self):
        return self.__r

    def set_value(self, value):
        self.__v = value

    def get_value(self):
        return self.__v

    def set_parent(self, parent):
        self.__p = parent

    def get_parent(self):
        return self.__p

class Tree:
    def __init__(self):
        self.root = None

    def getRoot(self):
        return self.root

    def add(self, val):
        if(self.root == None):
            self.root = Node(val)
        else:
            self._add(val, self.root, self.root)

    def _add(self, val, node, parent):
        if(val < node.get_value()):
            if(node.get_left() != None):
                self._add(val, node.get_left(), node.get_left())
            else:
                leftVal = Node(val)
                leftVal.set_parent(parent)
                node.set_left(leftVal)
        else:
            if(node.get_right() != None):
                self._add(val, node.get_right(), node.get_right())
            else:
                rightVal = Node(val)
                rightVal.set_parent(parent)
                node.set_right(rightVal)

    def find(self, val):
        if(self.root != None):
            return self._find(val, self.root)
        else:
            return None

    def _find(self, val, node):
        if(val == node.get_value()):
            return node
        elif(val < node.get_value() and node.get_left() != None):
            self._find(val, node.get_left())
        elif(val > node.get_value() and node.get_right() != None):
            self._find(val, node.get_right())

    def deleteTree(self):
        # garbage collector will do this for us.
        self.root = None

    def printTree(self):
        if(self.root != None):
            self._printTree(self.root)

    def _printTree(self, node):
        if(node != None):
            self._printTree(node.get_left())
            print(str(node.get_value()) + ' ')
            self._printTree(node.get_right())


# tree = Tree()
# tree.add(3)
# tree.add(4)
# tree.add(0)
# tree.add(8)
# tree.add(2)
# tree.printTree()