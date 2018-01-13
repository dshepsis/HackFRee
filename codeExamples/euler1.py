COUNT_TO = 1000

# A method arising from a literal interpretation of the question:
sum1 = 0
for i in range(1, COUNT_TO):
    if ((i % 3 == 0) or (i % 5 == 0)):
        sum1 += i
print(sum1)

# Another method arising from insight into the particular question
sum2 = 0
for i in range(3, COUNT_TO, 3):
    sum2 += i
for i in range(5, COUNT_TO, 5):
    sum2 += i
for i in range(15, COUNT_TO, 15):
    sum2 -= i
print(sum2)

# Yet another method, further abstracting the problem using functions:
sum3 = 0
def triangleNumber(upperBound):
    return int((upperBound+1)/2*upperBound)
def sumOfMultiples(upperBound, base):
    return base*triangleNumber(upperBound//base)
sum3 = (
    sumOfMultiples(COUNT_TO-1, 3) +
    sumOfMultiples(COUNT_TO-1, 5) -
    sumOfMultiples(COUNT_TO-1, 15)
)
print(sum3)
