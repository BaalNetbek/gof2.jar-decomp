package Main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GOF2MIDlet extends MIDlet implements Runnable {
   public int state;
   public static final int RUNNING = 1;
   public static final int RESUME = 2;
   public static final int PAUSE = 3;
   public static final int PRE_PAUSE = 4;
   private Main.n a;
   private Display a;
   private boolean a = false;
   private boolean b = false;
   private Thread a;

   public GOF2MIDlet() {
      try {
         this.a = Display.getDisplay(this);
         .at.a = this.a;
         .at.a = this;
         this.a = new Main.n(this);
         this.a = new Thread(this);
         this.state = 1;
      } catch (Exception var1) {
      }
   }

   public Display getDisplay() {
      return this.a;
   }

   public void startApp() {
      try {
         this.a.setCurrent(this.a);
         this.a.setFullScreenMode(true);
         if (!this.a) {
            this.a.start();
            this.a = true;
         }

      } catch (Exception var1) {
      }
   }

   public void pauseApp() {
      this.pause();
   }

   public void resume() {
      this.state = 2;
   }

   public void pause() {
      this.state = 4;
   }

   public void destroyApp(boolean var1) {
      try {
         this.b = true;
         this.a.c();
         this.notifyDestroyed();
      } catch (Exception var2) {
      }
   }

   public void run() {
      try {
         while(true) {
            switch(this.state) {
            case 1:
               if (.at.F && !this.b && .at.e != -1) {
                  .at.a.c(.at.e);
               }

               this.a.b();
               this.a.e();
               break;
            case 2:
               if (.at.a != null && .at.a) {
                  .at.a.c();
               }

               .at.G = false;
               this.state = 1;
               break;
            case 3:
               this.a.d();
               this.a.e();
               break;
            case 4:
               this.a.a();
               this.state = 3;
            }

            try {
               Thread.sleep(2L);
            } catch (InterruptedException var2) {
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void quit() {
      this.destroyApp(false);
   }
}
