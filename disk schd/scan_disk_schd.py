list = [0]
head = 0
total = 0
left = 0
rght = 0

num = int(input("Enter range: "))
for i in range(0, num):
    x = int(input("Enter elements of list: "))
    list.append(x)

head = int(input("Enter head: "))

list.sort()
for i in range(len(list)):
    if (head < list[i]):
        left = i-1
        rght = i
        break

while(left>=0):
        total += abs(head-list[left])
        head = list[left]
        left -= 1
while(rght<len(list)):
        total += abs(head-list[rght])
        head = list[rght]
        rght += 1

print(total)
