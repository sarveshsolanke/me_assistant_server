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
//package ComputerNetworks.multithread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
 
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                Session session = new Session(server.accept());
                session.start(); // it does not block this thread
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Session extends Thread {
    private final Socket socket;

    public Session(Socket socketForClient) {
        this.socket = socketForClient;
    }

    public void run() {   String s1;
String s2="hi";
String soh="oh";
String sok="ok";
String shi1="hello";
String s11="operating system";
String s12="OS";
String s13="Operating System";
String s22="brain";
String sfine="fine";
String sfine1="cool";
String sfine2="good";
String sangry="angry";
String sangry1="you are making me angry";
String sangry2="i am angry on you";
String ssay="you say";
String ssay1="and say";
//char q[25],q1[34],q2[23];
String sboar="boared";
String sboar1="boar";
String sboar2="boaring";
String sjee="JEE";
String sjee1="jee";
String slove="love";
String slove1="you";
String sdepress="depressed ";
String sdepress1=" depression ";
String sdepress2="depress";
String smean=" meaning";
String smean1="meant";
String smean2="mean by";
String smean3=" you mean";
String mom="mom";
String mom1="scold";
String stalk="talk";
String stalk1="can";
String stalk2="we";
String you="you";
String me="me";
String know="I know";
String know1="I know that";
String who="who is your programmer";
String who1="who";
String who2="programmed";
String who3="programing";
String sshivani="name";
String smad="mad";
String smad1="stupid";
String smad2="nonscence";
String smad3="non scence";
String sshutupp="shutupp";
String sshutupp1="shut upp";
String sshutupp2="shutup";
String sshutupp3="shut up";
String sreally="really";
String sblank="";
        try (
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            for (int i = 0; i < 5; i++) {
                String msg = input.readUTF();
                //Scanner sc= new Scanner(System.in);
        
      //  String ch=sc.nextLine();
        if(msg.contains("hi")){
            System.out.println("loop 1: \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending 'hi there' to clinet");
            System.out.println("___________________________________________");
            msg="hi there";
        }
        else if(msg.contains(sshivani))

{msg="my name is shalini, i m you new assistant";System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");

}
       // else if(msg.contains(sblank)){msg="retry";}
         else if((msg.contains(soh))||(msg.contains(sok))){msg="ya oh ,ok and this type of words destracts me but no problem case with you....whats upp";
         System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
         
         }
          else if(msg.contains(s2)||(msg.contains(shi1))){
              System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
            msg=" hi ! nice to see u actually there was none to talk with me whats upp";}
          //brain
         else if((msg.contains(s22))){
             System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
            msg=" don't ask me such silly questions what if I ask you where is your brain";}
                
        //-----
      







//operating system
else if(msg.contains(s11)||(msg.contains(s12))||(msg.contains(s13)))
  
{
    System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
            msg=" is";
}

//fine
else if(msg.contains(sfine)||(msg.contains(sfine1))||(msg.contains(sfine2)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="Thats interesting! I am also doing fine myself! And say";

}

//angry
else if(msg.contains(sangry)||(msg.contains(sangry1))||(msg.contains(sangry2)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="oh! So sorry but you can share reason with me it will feel you good";

}
//mad
else if(msg.contains(smad)||(msg.contains(smad1))||(msg.contains(smad2))||(msg.contains(smad3)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="and why you  think so......... anyways sabko mat batana ";
}
//shut upp
else if(msg.contains(sshutupp)||(msg.contains(sshutupp1))||(msg.contains(sshutupp2))||(msg.contains(sshutupp3)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg=" why should i ,you shut upp, it was your mistakes ";

}
//you say
else if(msg.contains(ssay1))

{msg=" what I say you I say and say is rubbish talk intresing";
System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}
else if(msg.contains(ssay))
 
{msg="ummmmm.......ok";

//ra=rand() % 6;
//switch(ra)
//{case '0': cout<<"\nwhat's your fovarite show";
//break;
//case '1':cout<<"\nwhat type of food you like to have in your dinner";
//break;
//case '2':cout<<"\nwhen does you have your first love";
//break;
//case '3':cout<<"\nif I gave you 3 lac rs what will you do first";
//break;
//case '4':cout<<"\nwhich type of songs you like";
//break;
//default:
//msg="\nwhat is your favorite fruit";
//}
//gets(q);System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="\nyou are quit interesting";
}

//boar
else if(msg.contains(sboar)||(msg.contains(sboar1))||(msg.contains(sboar2)))
 
{msg="oh! yaa me too\n I think we should start preparing for JEE ";
System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}

//JEE
else if(msg.contains(sjee)||(msg.contains(sjee1)))

{msg=" JEE is a entrance exam conducted every year by IIT to get top best government colleges of India ";
msg="you can find more information about it on internet";
System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}

//love
else if(msg.contains(slove)||(msg.contains(slove1)))

{msg=" I love the world and I think now we can be best friends";//PlaySound(TEXT("angry.wav"),NULL,SND_SYNC);
System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}

//depress
else if(msg.contains(sdepress)||(msg.contains(sdepress1))||(msg.contains(sdepress2)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="What makes you so sad?\n Tennyson wrote, 'The lights begin to twinkle from the rocks; the long day wanes; the slow moon climbs; the deep moans round with many voices. Come, my friends, 'tis not too late to seek a newer world.'";
}

//meaning
else if(msg.contains(smean)||(msg.contains(smean1))||(msg.contains(smean2))||(msg.contains(smean3)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="bhai maf kar mai itna padha likha Nahi hum ja Wikipedia pe search kar Aur sun aab ye mat likhna ki kya likha hai samjha Nahi";
}
//made
else if(msg.contains(mom)||(msg.contains(mom1)))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="haha bhai pehele hi kaha tha aise kam na kar, chhoad bata aab kya kiya tell na";
}



//talk
else if(msg.contains(stalk)||(msg.contains(stalk1))||(msg.contains(stalk2))||((msg.contains(stalk)&&(msg.contains(you))))||msg.contains(stalk))

{System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
msg="Do you mean you and me? Yes talking is my primary function.dear.";
}

//programmer
else if(msg.contains(who)||(msg.contains(who1))||(msg.contains(who2))||(msg.contains(who3)))

{msg=" hhaha its my great honner my program!mera is best of best Mr sarvesh solanke,the king of acting and inspiration of programming life";System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}



//know
else if(msg.contains(know)||(msg.contains(know1)))

{msg="oh! You know that very good thats my boy \n  ";System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");
}
//shivani

//really
else if(msg.contains(sreally))

{msg="i always leave in present to talk about reality and it is really really.... i mean sireously really ";System.out.println("loop "+i+": \n");
            System.out.println("Clent said :"+msg+"\n");
            System.out.println(".......sending massege to clinet");
            System.out.println("___________________________________________");

//PlaySound(TEXT("angry.wav"),NULL,SND_SYNC);
}

else
{
msg="111";

}


                
                output.writeUTF(msg);
               
                
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}