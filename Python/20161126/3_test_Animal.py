class Animal(object):
    def __init__(self, name):
        self.name = name
        
    def run(self):
        print ('Animal is running...')
        
class Dog(Animal):
    def eat(self):
        print('dog is Eating...')
        
#dog = Dog()
#dog.run()
#dog.eat()

a = Animal('A')
a.score = 90
print a.name
print a.score

