from DataStructures.LinkedList import *
def is_palindrome(linkedlist):
    first_letter = linkedlist.head
    backwardsList = UnorderedList()
    counter = 0

    while first_letter.getNext() is not None:
        counter+=1
        backwardsList.add(first_letter)
        first_letter = first_letter.getNext()

    first_letter = linkedlist.head
    first_letter_copy = backwardsList.head
    while first_letter.getNext() is not None:
        if first_letter.getData() != first_letter_copy.getData():
            return False

    return True
