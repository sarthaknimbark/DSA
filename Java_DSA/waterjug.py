from collections import deque

def water_jug_solver(jug1_capacity, jug2_capacity, target):
    # Check if the target is achievable
    if target % gcd(jug1_capacity, jug2_capacity) != 0 or target > max(jug1_capacity, jug2_capacity):
        return "Target is not achievable."

    # BFS setup
    visited = set()
    queue = deque()
    path = []

    # Initial state
    queue.append((0, 0))  # (jug1, jug2)

    while queue:
        jug1, jug2 = queue.popleft()

        # Skip already visited states
        if (jug1, jug2) in visited:
            continue

        # Mark current state as visited
        visited.add((jug1, jug2))
        path.append((jug1, jug2))

        # Check if the target is reached
        if jug1 == target or jug2 == target:
            return path

        # Generate possible states
        next_states = [
            (jug1_capacity, jug2),          # Fill jug1
            (jug1, jug2_capacity),          # Fill jug2
            (0, jug2),                      # Empty jug1
            (jug1, 0),                      # Empty jug2
            (jug1 - min(jug1, jug2_capacity - jug2), 
             jug2 + min(jug1, jug2_capacity - jug2)),  # Pour jug1 into jug2
            (jug1 + min(jug2, jug1_capacity - jug1), 
             jug2 - min(jug2, jug1_capacity - jug1)),  # Pour jug2 into jug1
        ]

        # Add all next states to the queue
        for state in next_states:
            if state not in visited:
                queue.append(state)

    return "No solution found."

# Helper function to calculate GCD
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

# Example usage
jug1_capacity = 4
jug2_capacity = 3
target = 2
solution = water_jug_solver(jug1_capacity, jug2_capacity, target)

# Print the solution
if isinstance(solution, list):
    print("Solution path:")
    for step in solution:
        print(step)
else:
    print(solution)