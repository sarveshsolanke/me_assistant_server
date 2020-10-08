/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updpractical5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author HP PC
 */
public class udpserver_conn_localhost {
   
    
    public static void main(String args[]) throws SocketException, IOException
    {DatagramSocket ds=new DatagramSocket(9999);
        System.out.println("Recevied Data from Client....");
    byte[] b1ch= new byte[1024];
      byte[] b1num1= new byte[1024];
        byte[] b1num2= new byte[1024];
        
        DatagramPacket dpchoice=new DatagramPacket(b1ch,b1ch.length);
        ds.receive(dpchoice);
         String schoice=new String(dpchoice.getData(),0,dpchoice.getLength());
            
        DatagramPacket dp1n=new DatagramPacket(b1num1,b1num1.length);
        ds.receive(dp1n);
        String num1=new String(dp1n.getData(),0,dp1n.getLength());
            
        DatagramPacket dp2n=new DatagramPacket(b1num2,b1num2.length);
        ds.receive(dp2n);
        String num2=new String(dp2n.getData(),0,dp2n.getLength());
        
       // System.out.println("str"+str);
        int num=Integer.parseInt(schoice);
        int numed1=Integer.parseInt(num1);
        int numed2=Integer.parseInt(num2);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("numbers are :"+numed1+" & "+numed2);
        
        int flag=0,result=0;
        if(num==1)
        {result=numed1+numed2;
        flag=+1;}
        else if(num==2)
        { result=numed1-numed2;flag=+2;
            System.out.println("its 2 and reult"+result);
            System.out.println("its 2 and flag"+flag);
        System.out.println("its 2 and num"+numed1+numed2);}
        else if(num==3)
        { result=numed1*numed2;flag=+3;}
       else if(num==4)
        { result=numed1/numed2;flag=+4;}
       else{System.out.println("Something went wrong ...Please Retry");}
       // int result=num*num;
        System.out.println("Result Obtained is "+result);
        System.out.println("");
         System.out.println("----------------------------");
         System.out.println("");
        System.out.println("Sending Data Packet to Client.....");
         String res = Integer.toString(result); 
 
            //b1ch = res.getBytes(); 
       byte[] b2=String.valueOf(result).getBytes();
       byte[] b3=String.valueOf(flag).getBytes();
       
        System.out.println("byet"+b2+"**"+flag);
        InetAddress ia =InetAddress.getLocalHost();
        DatagramPacket dp1=new DatagramPacket(b2,b2.length,ia,dp1n.getPort());
        ds.send(dp1);
        DatagramPacket dpflag=new DatagramPacket(b3,b3.length,ia,dp1n.getPort());
        ds.send(dpflag);
        
    }
    
}
