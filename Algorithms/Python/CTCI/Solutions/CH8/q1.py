def getStairsCombination(n):
    if n < 1:
        return 0
    memo = {}
    #     Setting the basic denominators
    memo[1] = 1
    memo[2] = 2
    memo[3] = 4

    if (n < 4) & (n > 0):
        return memo[n]
    else:
        for x in range(4, n + 1):
            current_memo = 0
            for step in [1, 2, 3]:
                remainder = x - step
                # We really don't have to check because the loop invariant is held here
                # for the value that will be checked the memo will have that value ready
                if remainder in memo:
                    current_memo += memo[remainder]
            memo[x] = current_memo
        return memo[n]


print(getStairsCombination(7))
