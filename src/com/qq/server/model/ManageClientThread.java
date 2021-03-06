package com.qq.server.model;

import java.util.*;
public class ManageClientThread {

    public static HashMap hm = new HashMap<String,ServerConClientThread>();

    public static void addClientThread(String uid,ServerConClientThread ct)
    {
        hm.put(uid,ct);
    }

    public static ServerConClientThread getClientThread(String  uid)
    {
        return (ServerConClientThread)hm.get(uid);
    }

    //返回当前在线的人的情况
    public static String getAllOnLineUserName()
    {
        //迭代完成
        Iterator it = hm.keySet().iterator();
        String res = "";
        while(it.hasNext())
        {
            res+=it.next().toString()+" ";
        }
        return res;
    }
}
