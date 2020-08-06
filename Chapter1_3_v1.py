def change_blank_into_char(str):
    str2 = ""
    for char in str:
        if char == ' ':
            str2 += '%20'
        else:
            str2 += char
    return str2