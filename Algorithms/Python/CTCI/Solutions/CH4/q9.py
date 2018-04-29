# BST Sequences: A binary search tree was created by traversing through an array from left to right
# and inserting each element. Given a binary search tree with distinct elements, print all possible
# arrays that could have led to this tree
from DataStructures.BinaryTree import *
from Solutions.CH4.q3 import listOfDepth
def bst_sequence(node_tree):
    value = listOfDepth(testTree)
    sequence = [];
    for key in value.keys():
        currentSequence = [];
    ## Honestly we solved this in question 3, we can just permuate each level
    ## Not going to rewrite Python's permutation class for this but we get the point



testTree = Tree()
testTree.add(20)
testTree.add(30)
testTree.add(10)
testTree.add(15)
testTree.add(5)
testTree.add(17)
testTree.add(3)
testTree.add(7)

value =listOfDepth(testTree)

print('done')