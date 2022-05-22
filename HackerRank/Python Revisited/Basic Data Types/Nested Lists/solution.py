# https://www.hackerrank.com/challenges/nested-list/problem
import sys

if __name__ == '__main__':
    records = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        records.append([name, score])

    records.sort(key=lambda x: x[0])  # sort the array name-wise

    min_score = sys.maxsize
    second_min_score = sys.maxsize

    # get second min-value
    for i in range(len(records)):
        if records[i][1] < min_score:
            second_min_score = min_score
            min_score = records[i][1]

        elif records[i][1] < second_min_score and records[i][1] != min_score:
            second_min_score = records[i][1]

    # print result
    for i in range(len(records)):
        if records[i][1] == second_min_score:
            print(records[i][0])
