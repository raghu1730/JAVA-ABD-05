#class Mobile:
#    def display(self):
#        print("Displaying Details")
#    def purchase(self):
#        self.display()
#        print("Calculating price")
#Mobile().purchase()
# invoked
class Mobile:
    def __init__(self, price, brand):
        self.price=price
        self.brand=brand
    def return_purchase(self):
        print(id(self))
        print("Brand Name is",self.brand," and price is",self.price)
mob1 = Mobile(1000, "Apple")
mob2 = Mobile(1204, "Samaung")
mob2.return_purchase()
Mobile.return_purchase(mob2)




