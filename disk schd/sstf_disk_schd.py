list = []
head = 0
pos = 0
total= 0

num = int(input("Enter range: "))
for i in range(0, num):
    x = int(input("Enter elements of list: "))
    list.append(x)

head = int(input("Enter head: "))

list.sort()

for i in range(len(list)):
    if (head<list[i]):
        pos = i
        break

for i in range(len(list)):
    if (pos >= len(list)):
        pos -= 1
    elif (pos-1 <= 0):
        pos += 1

    total += min(abs(head-list[pos-1]), abs(head-list[pos]))

    if (abs(head-list[pos-1]) < abs(head-list[pos])):
        print(head, list[pos-1], abs(head-list[pos-1]))
        head = list[pos-1]
        list.pop(pos-1)
    else:
        print(head, list[pos], abs(head-list[pos]))
        head = list[pos]
        list.pop(pos)

print(total)
