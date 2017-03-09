class Student(object):
    
    def __init__(self):
        self.name = 'isshe'
        
    def __getattr__(self, attr):
        if attr == 'score':
            return 99
            
s = Student()
print s.name
print s.score
