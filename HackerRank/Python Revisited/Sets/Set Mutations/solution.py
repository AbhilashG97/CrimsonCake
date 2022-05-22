A = int(input())

set_A = set(list(map(int, input().split())))

N = int(input())

for _ in range(2*N):
    try:
        operation_name, set_length = list(map(str, input().split()))
        set_B = set(list(map(int, input().split())))

        if operation_name == 'update':
            set_A.update(set_B)
        elif operation_name == 'intersection_update':
            set_A.intersection_update(set_B)
        elif operation_name == 'difference_update':
            set_A.difference_update(set_B)
        elif operation_name == 'symmetric_difference_update':
            set_A.symmetric_difference_update(set_B)
    except EOFError as e:
        print(end="")

print(sum(set_A))
