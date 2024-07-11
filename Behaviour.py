#We can access an attribute in a method by using self. Value of the attribute accessed inside the method is determined by the object used to invoke the method.

#For example, in the code below when we invoke purchase using mob1, attribute values (Apple and 20000) of mob1 are accessed.

#Similarly, when mob2 is used to invoke purchase, attribute values (Samsung and 3000) of mob2 are accessed in purchase()
class Mobile:
    def __init__(self, brand, price):
        self.brand=brand
        self.price=price
        print("Inside constructor")
    def purchase(self):
        print("Purchasing a mobile")
        print("This mobile has a brand", self.brand, "and price", self.price)
print("Mobile :1")
mod1=Mobile("Apple", 1025.4)
mod1.purchase()
print("Mobile :2")
mod2=Mobile("Samsung", 8542.25)
mod2.purchase()