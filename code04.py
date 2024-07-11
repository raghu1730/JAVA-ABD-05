def purchase_order(product, price, material,brand):
    if brand=="mobile":
        if product=='apple':
            discount = 10
        else:
            discount = 5
            total_cost=price + price * discount / 100
    else:
        if material=="leather":
            tax=5
        else:
            tax=2
            total_cost = price + price * tax / 100
            print(f"The cost of "+product+" is",total_cost)
purchase_order("mobile", 1202.25,"apple", None)
purchase_order("shoe",200,None,"leather")