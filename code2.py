def purchase_mobile(price, brand):
    if brand == "apple":
        discount = 10
    else:
        discount = 5
    total_cost = price - price * discount / 100
    print(f"The return value of {brand} is", total_cost)
purchase_mobile(1124.75, "apple")


def purchase_show(price, material):
    if material == "leather":
        tax = 5
    else:
        tax = 2
    total_cost = price - price * tax / 100
    print(f"The cost of {material} is", total_cost)
purchase_show(482.70, "leather")

