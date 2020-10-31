def conpress_str(string):
    count_len = 1
    before_char = ""
    output_str = ""
    for char in string:
        if char == before_char:
            count_len += 1
        else:
            if before_char != "":
                output_str += before_char + str(count_len)
            before_char = char
            print(char)
            count_len = 1
    output_str += before_char + str(count_len)
    if len(output_str) < len(string):
        return output_str
    else:
        return string


if __name__ == '__main__':
    print(conpress_str("apple"))
    print(conpress_str("aaaaaaaaaabb"))