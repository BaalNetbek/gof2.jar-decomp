import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

public final class ao implements Runnable {
   private boolean a = false;
   private GameCanvas a;
   private Thread a;
   private static Image a;
   private String[] a;
   private String a;
   private static String b = "";
   private long a;
   private long b;

   public ao() {
      String var1 = "/data/interface/logo.png";
      a = ai.a("/data/interface/logo.png", true);
   }

   public static Image a() {
      return a;
   }

   public final void a(GameCanvas var1) {
      this.a = var1;
   }

   public final void run() {
      while(this.a && !at.G) {
         a.d();
         q.b(this.a, at.f / 2 - q.a(this.a, 0) / 2, at.g / 2 - q.a() / 2 - 10, 0);
         q.b(b, at.f / 2 - q.a(this.a, 0) / 2, at.g / 2 - (q.a() << 1) - 10, 0);
         at.a.drawImage(a, at.f >> 1, 10, 17);
         if (at.a != null && at.a.a() != null && at.a.a() != at.a[3]) {
            this.a();
         }

         this.a = System.currentTimeMillis();
         bl.b += this.a - this.b;
         this.b = this.a;
         if (this.a != null) {
            this.a.flushGraphics();
         }

         try {
            Thread.sleep(10L);
         } catch (Exception var3) {
            this.a = false;
         }
      }

   }

   public final void a() {
      a.a(10, at.g - 10 * this.a.length - 32, at.f - 20, 10 * this.a.length + 20);
      a.a(at.a.a(277), 10, at.g - 10 * this.a.length - 34, at.f - 20, 10 * this.a.length + 24, false);
      q.a((String[])this.a, 17, at.g - 10 * this.a.length - 18, 1);
   }

   public final void b() {
      this.a = false;
   }

   public final void a(boolean var1) {
      this.b = System.currentTimeMillis();
      ++bl.c;
      this.a = at.a.a(var1 ? 214 : 215);
      int var2 = at.a.nextInt(co.e.length);
      this.a = q.a(at.a.a(co.e[var2]), at.f - 34);
      this.a = true;
      this.a = new Thread(this);
      this.a.start();
   }
}
