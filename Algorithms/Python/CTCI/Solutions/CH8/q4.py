import copy


def get_subsets(the_set):
    subsets = []
    # the og empty set
    subsets.append([])
    set_length = len(the_set)
    for index in range(set_length):
        generate_set(index, the_set, subsets)
    return subsets


def generate_set(item_index, the_set, subsets):
    # can't believe I have to do this
    copied_subsets = copy.deepcopy(subsets)

    for copied_subset in copied_subsets:
        copied_subset.append(the_set[item_index])
    subsets += copied_subsets


get_subsets([1, 2, 3, 4])
# not very efficent as there isn't array folding here