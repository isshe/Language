import logging 

def foo(s):
    return 10 / int(s)
    
def bar(s):
    return foo(s) * 2
    
def main():
    try:
        return bar('0')
    except Exception as e:
        logging.exception(e)

print main()
print('END')
