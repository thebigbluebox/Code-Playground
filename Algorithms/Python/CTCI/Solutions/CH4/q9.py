# BST Sequences: A binary search tree was created by traversing through an array from left to right
# and inserting each element. Given a binary search tree with distinct elements, print all possible
# arrays that could have led to this tree
from DataStructures.BinaryTree import *
from Solutions.CH4.q3 import listOfDepth
import itertools
import copy


def bst_sequence(node_tree):
    value = listOfDepth(node_tree)
    sequences = [[]]
    for key in value.keys():
        permutates = list(itertools.permutations(value[key]))
        temp_sequences = copy.deepcopy(sequences)
        copy_a = []
        for permutate in permutates:
            for sequence in temp_sequences:
                copy_a.append(sequence + list(permutate))
        sequences = copy_a

    return sequences


testTree = Tree()
testTree.add(20)
testTree.add(30)
testTree.add(10)
testTree.add(15)
testTree.add(5)
testTree.add(17)
testTree.add(3)
testTree.add(7)

value_a = bst_sequence(testTree)

print('done')
