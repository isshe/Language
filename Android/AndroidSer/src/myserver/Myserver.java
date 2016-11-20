/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package myserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Myserver {
    //定义保存所有的Socket的ArrayList
    public static ArrayList<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args)
        throws IOException
    {
        ServerSocket ss = new ServerSocket(9402, 100);
        while (true)
        {
            System.out.println("before accept!");               //
            Socket s = ss.accept();
            System.out.println("behind accept!");
            socketList.add(s);
            //每连接一个客户端就开一个线程为之服务
            new Thread(new ServerThread(s)).start();
        }
    }
}
