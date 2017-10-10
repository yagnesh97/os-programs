import math
list = []
head = 0
total = 0

num = int(input("Enter range: "))
for i in range(0, num):
    x = int(input("Enter elements of list: "))
    list.append(x)

head = int(input("Enter head: "))

for i in range(len(list)):
    total += abs(head-list[i])
    head = list[i]
    
print(total)
