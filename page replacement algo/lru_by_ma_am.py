print("lru")
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

print("initial page is ",page)

pagefaults=0
x=0
for i in range(n):
    flag=0
    for j in range(m):
        if(page[j]==a[i]):
            flag=1
            break
    if flag == 0:
        if page[x] != -1:
            min = 999
            for k in range(m):
                flag = 0
                j =  i
                while j>=0:
                    j-=1
                    if(page[k] == a[j]):
                        flag = 1
                        break
                if (flag == 1 and min > j):
                    min = j
                    x = k

        page[x] = a[i]
        x=(x+1)%m
        pagefaults+=1
        print( "\nPage ",a[i], " : " ,end = "   ")
        for j in range(m):
            if page[j] != -1:
                print( page[j],end = "  ")
            else:
                print( "-", end = "   ")
    else:
        print ("\nNo Page Fault...." ,(a[i]))
        
print( "\n Total page faults : %d." % (pagefaults))
