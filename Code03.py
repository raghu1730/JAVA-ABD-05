
def product_buy1(productname, price):
    if productname=='apple':
        discount=10
    else:
        discount=5
    total_cost =  price + price * discount / 100
    print(f"The cost of {productname} is",+int(total_cost))
product_buy1("apple", 1253.25)

def product_buy2(material, cost):
    discount=2
    total_cost = cost + cost * discount / 100
    print(f"The product made from {material} is", total_cost)
product_buy2("shoe", 954.25)