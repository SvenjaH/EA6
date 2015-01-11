/* Ich habe meinen Code aus der vorigen Aufgabe gecleaned */ 

package test.pmd;

    /* Einbinden der benötigten Daten */
    import java.applet.*;
    import java.awt.event.*;
    import java.awt.*;
   
    
    /* Klasse Labyrinth, in der sich alle Anweisungen befinden */
    public class Labyrinth extends Applet implements Runnable, KeyListener {
    /* Definition der nötigen Variablen */
    int x_achse=52;
    int y_achse=0;
    int gedrückteTaste; 
    int breiteApplet;
    int hoeheApplet;
    boolean bool;
    Thread thread; 
    Image imageApplet; 
    Graphics graphicApplet;
     
    /* Zeichnen der benötigten Elemente für das Labyrinth */
    public void paint(Graphics g) {
     
    g.setColor(Color.red);    
    g.fillOval(x_achse, y_achse, 16, 16);
    
    g.setColor(Color.black);
    g.drawLine(50,0,50,200);
    g.drawLine(70, 0, 70, 180);
    g.drawLine(50, 200, 150, 200);
    g.drawLine(70, 180, 170, 180);
    g.drawLine(150,200, 150, 330);
    g.drawLine(170, 180, 170, 350);
    g.drawLine(150, 330, 120, 330);
    g.drawLine(170, 350, 100, 350);
    g.drawLine(120, 330, 120, 260);
    g.drawLine(100, 350, 100, 280);
    g.drawLine(100, 280, 50, 280);
    g.drawLine(120, 260, 30, 260);
    g.drawLine(30, 260, 30, 400);
    g.drawLine(50, 280, 50, 380);
    g.drawLine(30, 400, 170, 400);
    g.drawLine(50, 380, 190, 380);
    g.drawLine(170, 400, 170, 460);
    g.drawLine(190, 380, 190, 440);
    g.drawLine(190, 440, 250, 440);
    g.drawLine(170, 460, 270, 460);
    g.drawLine(250, 440, 250, 330);
    g.drawLine(270, 460, 270, 310);
    g.drawLine(250, 330, 200, 330);
    g.drawLine(270, 310, 220, 310);
    g.drawLine(220, 310, 220, 250);
    g.drawLine(200, 330, 200, 230);
    g.drawLine(200, 230, 400, 230);
    g.drawLine(220, 250, 380, 250);
    g.drawLine(380, 250, 380, 270);
    g.drawLine(400, 230, 400, 290);
    g.drawLine(380, 270, 290, 270);
    g.drawLine(400, 290, 310, 290);
    g.drawLine(290, 270, 290, 450);
    g.drawLine(310, 290, 310, 430);
    g.drawLine(290, 450, 470, 450);
    g.drawLine(310, 430, 450, 430);
    g.drawLine(450, 430, 450, 390);
    g.drawLine(470, 450, 470, 370);
    g.drawLine(450, 390, 350, 390);
    g.drawLine(470, 370, 370, 370);
    g.drawLine(350, 390, 350, 310);
    g.drawLine(370, 370, 370, 330);
    g.drawLine(370, 330, 460, 330);
    g.drawLine(350, 310, 440, 310);
    g.drawLine(460, 330, 460, 180);
    g.drawLine(440, 310, 440, 200);
    g.drawLine(440, 200, 200, 200);
    g.drawLine(460, 180, 220, 180);
    g.drawLine(200, 200, 200, 150);
    g.drawLine(220, 180, 220, 130);
    g.drawLine(200, 150, 100, 150);
    g.drawLine(220, 130, 120, 130);
    g.drawLine(100, 150, 100, 50);
    g.drawLine(120, 130, 120, 70);
    g.drawLine(100, 50, 180, 50);
    g.drawLine(120, 70, 160, 70);
    g.drawLine(180, 50, 180, 100);
    g.drawLine(160, 70, 160, 120);
    g.drawLine(180, 100, 260, 100);
    g.drawLine(160, 120, 240, 120);
    g.drawLine(260, 100, 260, 150);
    g.drawLine(240, 120, 240, 170);
    g.drawLine(260, 150, 280, 150);
    g.drawLine(240, 170, 300, 170);
    g.drawLine(280, 150, 280, 0);
    g.drawLine(300, 170, 300, 0);
           
    g.fillRect(0, 260, 30, 140);
    g.fillRect(120, 260, 30, 70);
    g.fillRect(0, 200, 150, 60);
    g.fillRect(0, 0, 50, 200);
    g.fillRect(0, 400, 170, 100);
    g.fillRect(170, 460, 100, 45);
    g.fillRect(270, 450, 225, 60);
    g.fillRect(70, 0, 210, 51);
    g.fillRect(70, 50, 31, 130);
    g.fillRect(91, 150, 110, 31);
    g.fillRect(170, 180, 31, 201);
    g.fillRect(180, 50, 100, 51);
    g.fillRect(120, 70, 41, 61);
    g.fillRect(160, 120, 80, 11);
    g.fillRect(220, 130, 21, 51);
    g.fillRect(240, 170, 252, 11);
    g.fillRect(50, 280, 51, 100);
    g.fillRect(100, 350, 71, 31);
    g.fillRect(300, 0, 200, 181);
    g.fillRect(460, 180, 40, 191);
    g.fillRect(470, 370, 31, 131);
    g.fillRect(260, 100, 20, 51);
    g.fillRect(200, 200, 240, 31);
    g.fillRect(400, 230, 41, 81);
    g.fillRect(220, 250, 71, 61);
    g.fillRect(290, 250, 90, 21);
    g.fillRect(270, 310, 21, 141);
    g.fillRect(200, 330, 51, 51);
    g.fillRect(190, 380, 61, 61);
    g.fillRect(310, 290, 41, 101);
    g.fillRect(310, 390, 141, 41);
    g.fillRect(350, 290, 51, 21);
    g.fillRect(370, 330, 91, 41);
    }
     
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
     
    /* Definition der Ereignisse bei Tastendruck */
    public void keyPressed(KeyEvent e) { 
        gedrückteTaste=e.getKeyCode(); 
        if (gedrückteTaste == KeyEvent.VK_RIGHT){ 
            x_achse = x_achse+1;
        }
         if (gedrückteTaste == KeyEvent.VK_LEFT){ 
            x_achse = x_achse-1;
        }
          if (gedrückteTaste == KeyEvent.VK_DOWN){ 
            y_achse = y_achse+1;
        }
           if (gedrückteTaste == KeyEvent.VK_UP){ 
           y_achse = y_achse-1;
        }
    }
    
    /* bool wird auf false gesetzt und Größe des Applets gesetzt */
    public void start() { 
        bool=false; 
        thread.start(); 
        resize(new Dimension(500,500));
    }
    
    /* Schleife: So lange bool true ist wird die repaint Methode aufgerufen */
    public void run() { 
        while(!bool) { 
            repaint(); 
        } 
    }
     
    /* Initialisierung des Applets */
    public void init() { 
        addKeyListener(this); 
        breiteApplet=500; 
        hoeheApplet=500; 
        thread=new Thread(this);
        imageApplet=createImage(breiteApplet,hoeheApplet); 
        graphicApplet=imageApplet.getGraphics();
    }
    
    /* Zeichnen des Applets */
    public void update(Graphics g) { 
       paint(graphicApplet); 
       g.drawImage(imageApplet,0,0,this); 
    }
    
    /* Exception zum Abfangen von Fehlern */
    public static void main(String[] args)
    {  	
      try
      {
        Thread.sleep(2000);
      }
      catch(InterruptedException e)
      {
        System.out.print("Fehler aufgetreten!");
      }		
    }
    
}