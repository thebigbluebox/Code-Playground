from DataStructures.LinkedList import *
def partitionLinkedList(linkedlist, partition):

    new_list = UnorderedList()
    new_list.add(linkedlist.head.getData())
    middle_pointer = new_list.head

    while last_pointer.getNext() is not None:
        last_pointer = last_pointer.getNext()

    partition_pointer = linkedlist.head
    current_pointer = linkedlist.head
    if current_pointer.getData() > partition:
        current_pointer.next = None
        last_pointer.next = current_pointer