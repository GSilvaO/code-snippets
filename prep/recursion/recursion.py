def maxElement(list, index=0, max = float('-inf')):
    if index == len(list):
        return max, index
    if list[index] > max:
        max = list[index]
    return maxElement(list, index + 1, max)


print(maxElement([1, -5, 3, -9, -2]))