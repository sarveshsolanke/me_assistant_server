/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcn_tae_b55;

/**
 *
 * @author HP PC
 */

   
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class DCN_TAE_B55 {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 34522;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output  = new DataOutputStream(socket.getOutputStream())
        ) {
           for (int i = 0; i < 5; i++) {System.out.println("you:");
                String msg = sc.nextLine();
            
                output.writeUTF(msg);
                String receivedMsg = input.readUTF();
            if(receivedMsg.equals("111")){
               


System.out.println("\n:-0 I am slightly confused speak frankly and simply");



System.out.println("\n what does that mean ");
System.out.println("hey! One minute are you a poet?");
String st=sc.next();
System.out.println("ya but your words are real");

}

                System.out.println("server: "+receivedMsg);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    sc.close();
    }
    
}