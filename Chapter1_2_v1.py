def isOrdered(str1, str2):
    ordered_list1 = sorted(str1)
    ordered_str1 = ''.join(ordered_list1)
    ordered_list2 = sorted(str2)
    ordered_str2 = ''.join(ordered_list2)
    if ordered_str1 == ordered_str2:
        return True
    else:
        return False

if isOrdered('apple', 'Apple'):
    print("一致")
else:
    print("違うよ")
