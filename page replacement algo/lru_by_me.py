list=[]
list2=[]
pf=0
list3=[]

frame=int(input("Enter Frame-Size: "))
y=int(input("Enter no. of Ref-String: "))

for i in range(0,y):
    list.append(int(input("Enter Ref-String: ")))
    
for j in range(0,y):
    if(list[j] in list2):
        continue
    else:
        if(len(list2)>=frame):
            for m in list2: 
                for k in range(j-1,-1,-1):
                    if(list[k]==m):
                        list3.append(k)
                        break
            ind=list3.index(min(list3))
            list2[ind]=list[j]
            list3=[]
        else:
            list2.append(list[j])
        pf+=1
    print(list2)
    
print("\nPage Faults: ",pf)
