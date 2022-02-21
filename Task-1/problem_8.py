import random

r = random.randint(1,10);
n = int(input());
i = 1;
while(r != n):
    print("Wrong guess");
    n = int(input());
    i += 1;
else:
    print("Yay you got it", i, "tries", sep = ' ');
