



fin = open('measurement.in', 'r')
times = int(fin.readline().strip())
a=[]
x=0
for i in range(times):
    measure = fin.readline().split(' ')
    if int(measure[0]) > x:
        x = int(measure[0])
    a.append([int(measure[0]), (measure[1]), int(measure[2])])
d = {
    "Bessie": 7,
    "Elsie": 7,
    "Mildred": 7
}

temp = "Bessie, Elsie, Mildred"
count = 0

for i in range(x):
    for z in a:
        if z[0] == i + 1:
            d[z[1]] += z[2]
        if d["Elsie"] > d["Bessie"] and d["Elsie"] > d["Mildred"]:
            current = "Elsie"
        if d["Bessie"] > d["Elsie"] and d["Bessie"] > d["Mildred"]:
            current = "Bessie"
        if d["Mildred"] > d["Bessie"] and d["Mildred"] > d["Elsie"]:
            current = "Mildred"
        if d["Mildred"] == d["Bessie"] and d["Mildred"] == d["Elsie"]:
            current = "Bessie, Elsie, Mildred"
        if d["Mildred"] == d["Bessie"] and d["Mildred"] > d["Elsie"]:
            current = "Bessie, Mildred"
        if d["Mildred"] == d["Elsie"] and d["Mildred"] > d["Bessie"]:
            current = "Elsie, Mildred"
        if d["Bessie"] == d["Elsie"] and d["Bessie"] > d["Mildred"]:
            current = "Bessie, Elsie"

        if current != temp:
            temp = current
            count += 1

#print(count)
fout= open('measurement.out', 'w')
fout.write(str(count))
fout.close()

