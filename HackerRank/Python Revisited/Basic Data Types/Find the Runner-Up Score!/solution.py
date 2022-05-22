# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem

n = int(input())
input_set = set(list(map(int, input().split())))
print(list(sorted(input_set))[-2])
