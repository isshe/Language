1. strlen 和sizeof的区别？
    * strlen 计算不包含终止字符，sizeof则包含。
    * strlen是一个函数，需要进行函数调用，而sizeof是在编译的时候计算缓冲区长度。
2. write函数是**不带缓冲的**, 但是标准I/O库是带缓i冲的。（apue的183也图8-1例子经典）
    * 当标准输出连接到终端设备的时候，是行缓冲。(默认是行缓冲)
    * 否则是全缓冲（例如重定向到文件）
    * ==当标准输出设置为不带缓冲时(setbuf()), 每输出一个字符都要调用以此write。==(p197)
3. 当重定向标准输出输出的时候，子进程也会被重定向！要修改一般用dup().[这个函数也可用于管道]

4. 子进程和父进程共享同一文件偏移量！(所以在读写同一个文件的时候要注意)
    * 因此，打开的文件描述符，不需要的进程要把它close掉，以免造成干扰。

5. fork()失败主要有哪些原因？
    * 系统中存在过多进程。
    * 该实际用户ID的进程总数超过了系统限制。(CHILD_MAX)

6. fork()的两种用法：
    * 父子进程执行不同的代码段。
    * 其中一个进程要执行不同的程序（exec）
    
7. 调用wait()或waitpid()可能出现的3种情况：
	* 阻塞。所有子进程都在运行。
	* 出错返回。没有子进程。
	* 取得子进程的终止状态。子进程已终止，正等待父进程获取其终止状态。
	
8. waitpid()比wait()多的几个功能：
 	* 可等待特定子进程。
 	* 可不阻塞。
 	* 通过 WUNTRACED 和WCONTINUED选项支持作业控制（具体是如何？是什么？日后了解）
 
 9. 如果要等待子进程结束，需要使用wait系列函数中的一个。不能用sleep()， 使用sleep()可能会产生难以发现的错误。
 
 10. 如果是子进程要等待父进程结束， 可以用轮询， 也可以用信号，以及其他进程间通信。「具体还需要学习」 [apue 第196页有一个互相等待的模型]
 
 11. 7个 exec函数的一些区别：
 	* 有p的代表使用filename作为参数（使用PATH环境变量找filename），有f的使用fd作为参数，否则就是路径作为参数。
 	* 有 "l" 代表使用参数列表，有"v"表示使用一个参数数组。
 	* 有"e" 表示指定新的环境，没有的表示复制当前环境。
 	
 12. 若文件描述符设置了执行时关闭(close-on-exec)标志值(FD_CLOEXEC)，则在执行exec函数时关闭该描述符。否则不关。(默认是打开，可以用fcntl关闭）
 
 
 13. 关于nice值。
 	* 用于进程调度，表示优先级，nice值越大，优先级越低(越友好)。
 	* nice值的取值范围是：0~2*NZERO-1， NZERO是系统默认值。
 	* 可以使用nice函数或setpriority函数设置nice值(优先级), getpriority获得nice值。nice函数使用时要注意。（注意errno等内容）
 	* ==不过只有特权进程能减小nice值（提高优先级)==
 	
 
 


