from DataStructures.LinkedList import *


def find_intersection(list_a, list_b):
    # end of the list
    ref_a = list_a.head
    length_a = 0
    while ref_a.getNext() is not None:
        length_a += 1
        ref_a = ref_a.getNext()
    ref_b = list_b.head
    length_b = 0
    while ref_b.getNext() is not None:
        length_b += 1
        ref_b = ref_b.getNext()

    # if the end of the list are the same then we can assume that there is an intersection
    if ref_a == ref_b:
        # equal the list
        larger_list = list_a if length_a >= length_b else list_b
        smaller_list = list_a if length_a < length_b else list_b
        different_list = abs(length_a - length_b)

        alternate_ref = larger_list.head
        for x in range(different_list):
            alternate_ref = alternate_ref.getNext()
        smaller_ref = smaller_list.head

        while alternate_ref.getNext is not None:
            if alternate_ref == smaller_ref:
                return alternate_ref
            alternate_ref = alternate_ref.getNext()
            smaller_ref = smaller_ref.getNext()
    return None


myList1 = UnorderedList()
myList2 = UnorderedList()
myList = UnorderedList()
myList.add(1)
myList.add(2)
myList.add(3)
myList.add(4)
myList.add(5)

myList1.add_node(myList.head)
# myList1.add(9)
# myList1.add(10)
# myList1.add(11)
# myList1.add(12)
myList1.add(13)
myList1.add(14)

myList2.add_node(myList.head)
# myList2.add(21)
# myList2.add(22)
myList2.add(23)
myList2.add(24)
myList2.add(25)
myList2.add(26)

print(find_intersection(myList1, myList2))
