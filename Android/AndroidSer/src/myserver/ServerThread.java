/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package myserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author dell
 */
public class ServerThread implements Runnable{
    //定义当前线程处理的Socket
    Socket s = null;
    //该线程对应的输入流
    BufferedReader br = null;
    
    public ServerThread(Socket s) throws IOException
    {
        this.s = s;
        //初始化该Socket对应的输入流
        br = new BufferedReader(new InputStreamReader(s.getInputStream(), "utf-8"));
    }
    
    public void run()
    {
        try 
        {
            String content = null;
            while ((content = readFromClient()) != null)
            {
                for (Socket s : Myserver.socketList)
                {
                    OutputStream os = s.getOutputStream();
                    os.write((content + "\n").getBytes("utf-8"));
                    System.out.println("content = " + content);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    private String readFromClient()
    {
        try 
        {
            return br.readLine();
        }
        catch (IOException e)
        {
            Myserver.socketList.remove(s);
        }
        return null;
    }
}
