# what the hell is the subproblem in this question
# and the subproblem is that we know what values have been accessed
__hasharray = {}

def get_hasharray():
    return __hasharray

def search_memoized(sorted_array):
    return search_memoized_rec(0, len(sorted_array), sorted_array)

def search_memoized_rec(start, finish, sorted_array):
    search_length = finish - start
    if search_length > 1:
        remainder = search_length % 2
        mid = search_length / 2
        if remainder > 0:
            mid = int(search_length / 2) + 1
        mid = int(start + mid)

        value = sorted_array[mid]
        left,right = False,False

        hasharray = get_hasharray()

        if sorted_array[mid] in hasharray :
            if value > hasharray[value] and value < mid:
                search_memoized_rec(start, mid, sorted_array)
            # we now know its a repeating series
        else:
            hasharray[value] = mid

        if sorted_array[mid] == mid:
            return mid
        left = search_memoized_rec(start, mid, sorted_array)
        right = search_memoized_rec(mid, finish, sorted_array)
        if left > -1:
            return left
        if right > -1:
            return right
        return -1
    else:
        if sorted_array[start] == start:
            return start
        else:
            return -1



# This below is an implementation of binarySearch but cuts off half of the
# computation through exclusions based off the indexes

# def binarySearchmk2(sorted_array):
#     return binarySearch_recmk2(0, len(sorted_array), sorted_array)
#
# def binarySearch_recmk2(start, finish, sorted_array):
#     search_length = finish - start
#     if search_length > 1:
#         remainder = search_length % 2
#         mid = search_length / 2
#         if remainder > 0:
#             mid = int(search_length / 2) + 1
#         mid = int(start + mid)
#
#         value = sorted_array[mid]
#         left,right = False,False
#
#         if sorted_array[mid] == mid:
#             return True
#         if value > mid:
#             left = binarySearch_recmk2(start, mid, sorted_array)
#         if value < mid:
#             right = binarySearch_recmk2(mid, finish, sorted_array)
#
#         if left or right:
#             return True
#         return False
#     else:
#         if sorted_array[start] == start:
#             return True
#         else:
#             return False

#This below is a pure binarySearch of the array indexes
# def binarySearch(sorted_array):
#     return binarySearch_rec(0, len(sorted_array), sorted_array)
#
#
# def binarySearch_rec(start, finish, sorted_array):
#     search_length = finish - start
#     if search_length > 1:
#         remainder = search_length % 2
#         mid = search_length / 2
#         if remainder > 0:
#             mid = int(search_length / 2) + 1
#         mid = int(start + mid)
#
#         left = binarySearch_rec(start, mid, sorted_array)
#         right = binarySearch_rec(mid, finish, sorted_array)
#
#         if left or right:
#             return True
#         return False
#     else:
#         if sorted_array[start] == start:
#             return True
#         else:
#             return False
test = [-5, -2, 2, 5, 5, 5,5,5,5,5,5, 6, 7]
print(search_memoized(test))
