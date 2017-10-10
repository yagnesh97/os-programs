list=[]
list2=[]
pf=0

frame=int(input("Enter Frame-Size: "))
y=int(input("Enter no. of Ref-String: "))

for i in range(0,y):
    list.append(int(input("Enter Ref-String: ")))
    
for k in range(0,y):
    if(list[k] in list2):
        continue
    else:
        list2.append(list[k])
        if(len(list2)>frame):
            list2.pop(0)
        pf+=1
    print(list2)
    
print("\nPage Faults: ",pf)
