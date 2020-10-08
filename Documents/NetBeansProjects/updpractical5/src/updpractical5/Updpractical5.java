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
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author HP PC
 */
public class Updpractical5 {

   
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("*****UDP CLIENT SIDE***********");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("Name : Sarvesh Solanke Section/Roll no : b-55");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        DatagramSocket ds=new DatagramSocket();
        int i=6;
        System.out.println("***MENU**");
        System.out.println("1.Addition of nums");
        System.out.println("2.Subtraction of nums");
        System.out.println("3.Multiplication of nums");
        System.out.println("4.Divition of nums");
        int ch=sc.nextInt();
          System.out.println("Enter two numbers");
          int num1=sc.nextInt();
       
        int num2=sc.nextInt();
        
        
        byte[] bch=String.valueOf(ch).getBytes();
        byte[] bnum1=String.valueOf(num1).getBytes();
        byte[] bnum2=String.valueOf(num2).getBytes();
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(bch,bch.length,ia,9999);
        DatagramPacket dp1n=new DatagramPacket(bnum1,bnum1.length,ia,9999);
        DatagramPacket dp2n=new DatagramPacket(bnum2,bnum2.length,ia,9999);
        ds.send(dp);
          ds.send(dp1n);
            ds.send(dp2n);
       
        
        
         byte[] b1=new byte[1024];
         byte[] b2=new byte[1024];
      //  InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp1=new DatagramPacket(b1,b1.length,ia,9999);
        ds.receive(dp1);
       DatagramPacket dpflag=new DatagramPacket(b2,b2.length,ia,9999);
        ds.receive(dpflag);
        String str=new String(dp1.getData());
        
        
        String flagst=new String(dpflag.getData());
           int nums=Integer.parseInt(flagst.trim());
      //   System.out.println("flag="+flagst);
           
         System.out.println("Result Value from Server......");
         System.out.println("  ");
         if(nums==1){System.out.println(num1+"+"+num2+"="+str);}
         else if(nums==2){System.out.println(num1+"-"+num2+"="+str);}
         else if(nums==3){System.out.println(num1+"*"+num2+"="+str);}
         else if(nums==4){System.out.println(num1+"/"+num2+"="+str);}
         else{System.out.println("someting went wrong retatagramPacket ");}
     //   System.out.println("num1"+"*"+"numm2"+"="+str);
        
    }
    
}
