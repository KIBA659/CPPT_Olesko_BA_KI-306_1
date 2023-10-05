import math

def calculate(x):
    if x == 0 or x == 90 or x == 180 or x == 270 or x == 360:
        return None
    else:
        return 1 / (math.tan(x * math.pi / 180) * math.tan(x * math.pi / 180))

