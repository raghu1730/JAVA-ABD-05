total_price_mobile=0
total_price_shoe=0
def purchase_mobile(price, brand):
    global total_price_mobile
    if brand=='apple':
        discount=10
    else:
        discount=5
    total_price_mobile = price -  price * discount / 100
    print("Total price for mobile is", total_price_mobile)

def purchase_show(price, material):
    global total_price_shoe
    if material=="leather":
        tax = 5
    else:
        tax =2
    total_price_shoe = price + price * tax / 100
    print("The price for show is", total_price_shoe)

def return_mobile():
    print("Refund price for mobile is", total_price_mobile)
def return_show():
    print("Refund price for show is",total_price_shoe)
purchase_mobile(20000, "apple")
purchase_show(200, "leather")
purchase_mobile(2000, "samsung")
return_mobile()