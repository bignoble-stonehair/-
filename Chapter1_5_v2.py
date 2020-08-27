def is_one_edit_away(first, second):
    if abs(len(first) - len(second) > 1):
        return False
    if len(first) < len(second):
        s1 = first
        s2 = second
    else:
        s1 = second
        s2 = first
    index1 = 0
    index2 = 0
    foundDiffrence = False
    while index1 < len(s1) and index2 < len(s2):
        if s1[index1] != s2[index2]:
            if foundDiffrence:
                return False
            foundDiffrence = True
            if len(s1) == len(s2):
                index1 += 1
            index2 += 1
        else:
            index1 += 1
            index2 += 1
    return True

if is_one_edit_away("pale", "bake"):
    print("True")
else:
    print("False")

