list = [0]
def fcfs(index, length):
    total = 0
    for i in range(index,length):
        total += list[i]
    return total
    
x = int(input("Enter no. of processes: "))

for i in range(1,x+1):
    y = int(input("Enter burst time: "))
    list.append(y+list[i-1])

print("\nTotal waiting time: ",fcfs(0,x))
print("Average waiting time: ",fcfs(0,x)/x)

print("\nTurn around time: ",fcfs(1,x+1))
print("Average turn around time: ",fcfs(1,x+1)/x)
