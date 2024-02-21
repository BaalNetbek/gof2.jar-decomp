package Main;

import javax.microedition.lcdui.Image;

public final class f extends .as {
   private Image a;
   private Image b;
   private boolean a;
   private long a;
   private int a;
   private int b;

   public final void b() {
      try {
         String var1 = "/data/interface/fishlabs.png";
         this.a = .ai.a("/data/interface/fishlabs.png", true);
         var1 = "/data/interface/abyss.png";
         this.b = .ai.a("/data/interface/abyss.png", true);
         var1 = "/data/interface/ocean.png";
         .ai.a("/data/interface/ocean.png", true);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.a = System.currentTimeMillis();
      this.a = 0;
      this.a = true;
      this.b = 0;
      System.gc();
   }

   public final void a() {
      this.a = null;
      this.b = null;
      this.a = false;
   }

   public final boolean a() {
      return this.a;
   }

   public final void b(int var1) {
      if (this.a == 0) {
         if (var1 == 2 && this.b == 1) {
            --this.b;
         }

         if (var1 == 64 && this.b == 0) {
            ++this.b;
         }

         if (var1 == 256 || var1 == 16384) {
            .at.a = this.b == 0;
            .at.b = this.b == 0;
            if (this.b == 1) {
               .at.a = 3;
               .at.b = 3;
            } else {
               .at.a = 1;
               .at.b = 1;
            }

            .at.a.a(100);
            .at.a.b(100);
            .at.a.c(0);
            this.a = System.currentTimeMillis();
            this.a = 1;
         }
      }

   }

   public final void a(int var1) {
      .a.d();
      if (this.a == 0) {
         .at.a.drawImage(.ao.a(), .at.f >> 1, 10, 17);
         .a.a(.at.a.a(6) + " " + .at.a.a(15), 0, .at.g >> 1, .at.f, this.b == 0);
         .a.a(.at.a.a(6) + " " + .at.a.a(16), 0, (.at.g >> 1) + .q.a(), .at.f, this.b == 1);
         .a.a(.at.a.a(253), "", false);
      } else {
         if (this.a == 1) {
            .at.a.drawImage(this.a, .at.f / 2, .at.g / 2, 3);
            if (System.currentTimeMillis() - this.a > 3000L) {
               ++this.a;
               return;
            }
         } else if (this.a == 2) {
            .at.a.drawImage(this.b, .at.f / 2, .at.g / 2, 3);
            if (System.currentTimeMillis() - this.a > 6000L) {
               ++this.a;
               return;
            }
         } else {
            .at.a.a(.at.a[0]);
         }

      }
   }
}
