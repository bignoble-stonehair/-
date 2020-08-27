def is_similary(str1, str2):
    flag = False
    if abs(len(str1) - len(str2)) == 1:
        if len(str1) < len(str2):
            tmp_str = str1
            str1 = str2
            str2 = tmp_str
        i = 0
        for c in str1:
            if len(str2) > i:
                if str2[i] == c:
                    i += 1
                elif str2[i] != c and flag == False:
                    flag = True
                elif str2[i] != c and flag == True:
                    return False
        return True
    elif len(str1) == len(str2):
        i = 0
        for c in str1:
            if str2[i] == c:
                i += 1
            elif str2[i] != c and flag == False:
                flag = True
                i += 1
            elif str2[i] != c and flag == True:
                return False
        return True
    else:
        return False

if is_similary("pale", "bake"):
    print("True")
else:
    print("False")
