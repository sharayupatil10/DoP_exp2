def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y != 0:
        return x / y
    else:
        return "Error! Division by zero."

# Example usage:
print("Add: ", add(5, 3))
print("Subtract: ", subtract(5, 3))
print("Multiply: ", multiply(5, 3))
print("Divide: ", divide(5, 3))
