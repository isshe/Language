from enum import Enum
isshe = Enum('Month', ('Jan', 'Feb', 'Mar', 'Apr'))

for name, member in isshe.__members__.items():
#    print(name, '->', member, ',', member.value)
    print name
    print member
    print member.value
    
    
