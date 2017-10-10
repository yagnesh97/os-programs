print("fifo")
a=[]
n=int(input("enter a size of reference string"))
for i in range(n):
    a.append(int(input("enter number ")))
print(a)
m=int(input("size of frame"))
print(m)
page=[]

for i in range(m):
    page.append(-1)
print(page)
pagefaults=0
f=-1
for i in range(n):
    flag=0
    for j in range(m):
        if(page[j]==a[i]):
            flag=1
            break
    print(page)

    if flag==0:
        f=(f+1)%m
        page[f]=a[i]
        pagefaults+=1
        for j in range(m):
            if page[j]!=-1:
                print(page[j],end=" ")
            else:
                print("-",end=" ")
    else:
        print("no page faults for ",a[i],"\n")
print("no of pagefaults ",pagefaults)    
