from DataStructures.LinkedList import *
def is_palindrome(linkedlist):
    first_letter = linkedlist.head
    counter = 0

    while first_letter.getNext() is not None:
        counter+=1
