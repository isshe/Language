
class Runnable(object):
    def run(self):
        print ('Running...')
        
        
        
class Flyable(object):
    def fly(self):
        print ('Flying...')
        
        
class Bird(Runnable, Flyable):
    def say(self):
        print ('Bird saying...')
        
bird = Bird()
bird.run()
bird.fly()
bird.say()
#__len__(bird)
