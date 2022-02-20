lis = [2,5,3,4,5,2]


in2 = "".join(list(map(str, lis)))

minmum = 100000000000

for i in range(len(in2)):
    
    index = in2[i:].rfind(in2[i])
    if (index < minmum) and (index > 0):
        minmum = index
