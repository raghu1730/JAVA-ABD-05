class Mobile:
    def __init__(self,brand, price):
        self.brand=brand
        self.price=price
mob1=Mobile("Apple", 1025.25)
print("New Brand name is", mob1.brand, "and price is", mob1.price)
mob2=Mobile("Samsung", 952.25)
print("New phone is", mob2.brand, "and price is", mob2.price)
