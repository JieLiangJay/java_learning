# 锁
## 公平锁 & 非公平锁
`package: fair_lock`
```
new ReentrantLock(bool)
```
- 非公平锁
  - 线程饿死
  - 效率高
- 公平锁(访问前礼貌问一句，有人吗？有人就走,没人留下)
  - 阳光普照
  - 效率低
  
## 可重入锁(递归锁)
`package: re_lock`

可重入锁，指的是以线程为单位，当一个线程获取对象锁之后，这个线程可以再次获取本对象上的锁，而其他的线程是不可以的。·
*synchronized(隐式)和Lock(显式)都是可重入锁*
有很多层


## 死锁
`package: dead_lock`

什么是死锁？

两个或者两个以上进程在执行的过程中，因为争夺资源造成一种互相等待的现象，如果没有外力干涉，无法执行下去

产生死锁的原因:
- 系统资源不足
- 进程运行推进顺序不合适
- 资源分配不当

验证是否死锁:
- jps -l 类似于linux `ps -ef` 
- jstack jvm自带的堆栈工具

## 乐观锁 & 悲观锁

## 表锁 & 行锁
 
## 读写锁
- 读锁: 共享锁
- 写锁: 独占锁

读锁和写锁都会有死锁的产生

读写锁: 一个资源可以被多个读线程访问，或者可以被一个写线程方法，但是不能同时存在读写线程，读写互斥，读读共享。

演变过程
- 无锁: 多个线程抢夺资源 很乱
- 添加锁: 使用synchronized和ReentrantLock,都是独占锁，每次只能一个来操作不能共享
    - 读读 1个线程， 不能共享
    - 读写 1个线程
    - 写写 1个线程
- 读写锁: ReentrantReadWriteLock
    - 读读 可以共享，提升性能，多人同时读的操作
    - 写写 1个线程
    - 缺点: 
        - 造成锁饥饿,一直读,没有写的操作
        - 读的时候 不能进行写的操作，只有读完成，才可以写。写操作可以读 
        
锁降级
将写入锁降级为读锁
：遵循获取写锁、获取读锁再释放写锁的次序，写锁能够降级成为 读锁。