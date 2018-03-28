class TreeNode:
    def __init__(self, initdata):
        self.data = initdata
        self.children = []
    def getChildren(self):
        return self.children

    def addChildren(self, children):
        self.children.append(children)

    def setData(self, data):
        self.data = data

    def getData(self):
        return self.data

class Tree:
    def __init__(self):
        self.root = None

    def isEmpty(self):
        return self.root == None

    def add(self,data):
        temp = TreeNode(data)
        self.root.addChildren(temp)

    def getHead(self):
        return self.root