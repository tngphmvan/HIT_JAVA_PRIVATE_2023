 # cú pháp input 
a=input("nhap a ")
b=input("nhap b ")
# cú pháp nhập vaò 1 số nguyên
a=int(input())
# in ra a
print(a)
# cú pháp nhập vào 1 chuỗi
b=str(input())
# or
b=input()
# kiểu dữ liệu list
lst=[1,2,3,4,5,"haha",["hihi",29022004]]
print(lst)
# kiểu dữ liệu tuple
tpl=(1,2,3,4,5,"haha",["hihi",29022004])
print(tpl)
# kiểu dữ liệu dictionary
dict={
    "id":2022,
    "hovaten":"abc",
    "dtb":3.79
}
print(dict)
# Toán tử số học
x = 10
y = 3

addition_result = x + y       # Cộng hai số
subtraction_result = x - y    # Trừ hai số
multiplication_result = x * y  # Nhân hai số
division_result = x / y       # Chia hai số
modulus_result = x % y        # Lấy phần dư của phép chia
exponentiation_result = x ** y  # Lũy thừa
floor_division_result = x // y  # Chia lấy phần nguyên

# Toán tử so sánh
a = 5
b = 7

equal_result = a == b         # So sánh bằng
not_equal_result = a != b     # So sánh không bằng
greater_than_result = a > b   # So sánh lớn hơn
greater_or_equal_result = a >= b  # So sánh lớn hơn hoặc bằng
less_or_equal_result = a <= b  # So sánh nhỏ hơn hoặc bằng

# Toán tử logic
p = True
q = False

and_result = p and q         # True nếu cả hai đều đúng
or_result = p or q           # True nếu một trong hai đúng
not_result = not p           # True nếu p là sai

# Toán tử thành viên (Membership Operators)
fruits = ['apple', 'banana', 'cherry']
check_fruit = 'apple' in fruits     # Kiểm tra xem 'apple' có trong danh sách fruits hay không
check_color = 'red' not in fruits   # Kiểm tra xem 'red' không có trong danh sách fruits hay không

# Toán tử gán (Assignment Operators)
total = 0
total += 5  # total = total + 5
total -= 3  # total = total - 3
total *= 2  # total = total * 2
total /= 4  # total = total / 4
total %= 3  # total = total % 3
total **= 2  # total = total ** 2
total //= 5  # total = total // 5

# Toán tử nhận dạng (Identity Operators)
x = [1, 2, 3]
y = x  # Gán x cho y

is_result = x is y  # True nếu x và y trỏ đến cùng một đối tượng
is_not_result = x is not [1, 2, 3]  # True nếu x không trỏ đến một đối tượng khác

# Toán tử Bitwise (Bitwise Operators)
a = 12  # 00001100
b = 7   # 00000111

bitwise_and_result = a & b    # Kết quả của AND bitwise
bitwise_or_result = a | b     # Kết quả của OR bitwise
bitwise_xor_result = a ^ b    # Kết quả của XOR bitwise
bitwise_not_result = ~a       # Kết quả của NOT bitwise
left_shift_result = a << 2    # Dịch trái 2 bit
right_shift_result = a >> 2   # Dịch phải 2 bit

# In kết quả
print("Addition result:", addition_result)
print("Subtraction result:", subtraction_result)
print("Multiplication result:", multiplication_result)
print("Division result:", division_result)
print("Modulus result:", modulus_result)
print("Exponentiation result:", exponentiation_result)
print("Floor division result:", floor_division_result)

print("Equal result:", equal_result)
print("Not equal result:", not_equal_result)
print("Greater than result:", greater_than_result)
print("Greater or equal result:", greater_or_equal_result)
print("Less or equal result:", less_or_equal_result)

print("AND result:", and_result)
print("OR result:", or_result)
print("NOT result:", not_result)

print("Check 'apple' in fruits:", check_fruit)
print("Check 'red' not in fruits:", check_color)

print("Total after assignments:", total)

print("Is result:", is_result)
print("Is not result:", is_not_result)

print("Bitwise AND result:", bitwise_and_result)
print("Bitwise OR result:", bitwise_or_result)
print("Bitwise XOR result:", bitwise_xor_result)
print("Bitwise NOT result:", bitwise_not_result)
print("Left shift result:", left_shift_result)
print("Right shift result:", right_shift_result)
