# Stair climbing robot to reach the top of the stairs

#Fibonnaci number

def fib(n):
    if n <= 1:
        return n
    return fib(n-1) + fib(n-2)

#Find number of ways to reach the top
def climb(s):
    return fib(s +1)

#Variables

s = 5

print(climb(s))




