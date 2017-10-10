list = [0,199]
head = 0
total = 0
left = 0
rght = 0
total2=0

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

head = list[len(list)-1]
left = len(list)-2

while(left>=rght):
    total += abs(head-list[left])
    head = list[left]
    left -= 1

print(total)
