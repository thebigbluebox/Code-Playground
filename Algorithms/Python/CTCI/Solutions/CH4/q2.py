import math
from DataStructures import BinaryTree

result = BinaryTree.Tree()

def generateMinHeightTree(sortedArray):
    #compute midpoint
    if(sortedArray.length == 1):
        result.add(sortedArray[0])
        return
    midpoint = math.ceil(sortedArray.length / 2) - 1
    result.add(sortedArray[midpoint])
    generateMinHeightTree(sortedArray[0:midpoint-1])
    generateMinHeightTree(sortedArray[midpoint:sortedArray.length])