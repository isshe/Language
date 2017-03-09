#!/usr/bin/python
# -*- coding:utf-8 -*-

' a test module ' #被视为文档注释

__author__ = 'isshe'

import sys

def test():
    args = sys.argv
    
    if len(args) == 1:
        print('hello world')
    elif len(args) == 2:
        print('hello %s!' % args[1])
    else:
        print('Too many arguments!')
        
if __name__=='__main__':
    test()
