from DataStructures.LinkedList import *
def sum_list(linkedlist_a,linkedlist_b):
    carry_over = 0
    value_a = linkedlist_a.head
    value_b = linkedlist_b.head
    result_list = UnorderedList()
    while value_a.getNext() is not None or value_b.getNext() is not None:
        if value_a.getData() + value_b.getData() + carry_over > 9:
            result = (value_a.getData() + value_b.getData()) % 10
            result_list.add(result)
            carry_over = int((value_a.getData() + value_b.getData())/10)
        else:
            result_list.add(value_a.getData() + value_b.getData() + carry_over)
        value_a = value_a.getNext()
        value_b = value_b.getNext()
    return result_list

