def product_cycle(customertype, productname, price):
    if customertype=="student":
        if productname=="apple":
            discount=10
            cost = price - price * discount/100
            print("Discount for student is:",cost)
        else:
            discount = None
            cost = price - price * discount/100
            print("Discount for emp is:", cost)

product_cycle("student", "apple", 1250.75)
product_cycle("nostd","apple",1250.75)
