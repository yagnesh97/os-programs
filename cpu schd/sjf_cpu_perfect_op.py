list = [0]
list2=[]
def sjf(index, length):
    total = 0
    for i in range(index,length):
        total += list[i]
    return total
    
x = int(input("Enter no. of processes: "))

for i in range(1,x+1):
    y = int(input("Enter burst time: "))
    list.append(y)
    list2.append(y)

list2.sort()
list.sort()
for i in range(1,x+1):
    list[i] = list[i]+list[i-1]


print("Calculating Waiting and Average Waiting Time...")
print("Processes\tBurst Time\tWaiting Time\tTotal Waiting Time\tAverage Waiting Time\n")
for i in range(0,x):
    
    if(i==x//2):
        print("P",i+1,"\t\t",list2[i],"\t\t",list[i],"\t\t",sjf(0,x),"\t\t\t",sjf(0,x)/x)
    else:
        print("P",i+1,"\t\t",list2[i],"\t\t",list[i])

        
print("\n\nCalculating Turn Around and Average Turn Around Time...")
print("Processes\tBurst Time\tTurn Around Time\tTotal Turn Around Time\tAverage Turn Around Time\n")
for i in range(0,x):
    
    if(i==x//2):
        print("P",i+1,"\t\t",list2[i],"\t\t",list[i+1],"\t\t\t",sjf(1,x+1),"\t\t\t",sjf(1,x+1)/x)
    else:
        print("P",i+1,"\t\t",list2[i],"\t\t",list[i+1])
