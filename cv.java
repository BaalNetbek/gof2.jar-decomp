import javax.microedition.lcdui.Image;

public final class cv {
   private Image[] a = new Image[4];
   private Image a;

   public cv() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = ai.a("/data/interface/lens" + var1 + ".png", true);
      }

      String var4 = "/data/interface/lens1.png";
      Image var5 = ai.a("/data/interface/lens1.png", true);
      int var10002 = var5.getWidth() / 4;
      int var3 = var5.getHeight() / 4;
      int var2 = var10002;
      String var6 = "/data/interface/lens1.png";
      var4 = "/data/interface/lens1.png";
      this.a = ai.a(ai.a("/data/interface/lens1.png", true), var2, var3);
   }

   public final void a(cc var1) {
      int var2 = var1.a;
      int var3 = var1.b;
      if (var1.c < 0 && var2 > -at.f && var2 < at.f << 1 && var3 > -at.g && var3 < at.g << 1) {
         int var7 = at.f >> 1;
         int var4 = at.g >> 1;
         var2 = var7 - var2;
         var3 = var4 - var3;
         int var5 = g.a((long)(var2 * var2 + var3 * var3));
         var2 = -(var2 << 12);
         var3 = -(var3 << 12);
         if (var5 > 0) {
            var2 /= var5;
            var3 /= var5;
         }

         if (this.a != null) {
            for(int var6 = 0; var6 < this.a.length; ++var6) {
               switch(var6) {
               case 0:
                  if (var5 > 2000) {
                     at.a.drawImage(this.a[var6], var7 + (var2 * var5 / 2 >> 12), var4 + (var3 * var5 / 2 >> 12), 3);
                     if (this.a != null) {
                        at.a.drawImage(this.a, var7 + (var2 * var5 / 3 >> 12), var4 + (var3 * var5 / 3 >> 12), 3);
                     }
                  }
                  break;
               case 1:
                  if (var5 > 3000) {
                     at.a.drawImage(this.a[var6], var7 + (var2 * var5 / 8 >> 12), var4 + (var3 * var5 / 8 >> 12), 3);
                     if (this.a != null) {
                        at.a.drawImage(this.a, var7 - (var2 * var5 / 2 >> 12), var4 - (var3 * var5 / 2 >> 12), 3);
                     }
                  }
                  break;
               case 2:
                  if (var5 > 4000) {
                     at.a.drawImage(this.a[var6], var7 - (var2 * var5 / 4 >> 12), var4 - (var3 * var5 / 4 >> 12), 3);
                     if (this.a != null) {
                        at.a.drawImage(this.a, var7 - (var2 * var5 / 6 >> 12), var4 - (var3 * var5 / 6 >> 12), 3);
                     }
                  }
                  break;
               case 3:
                  if (var5 > 5000) {
                     at.a.drawImage(this.a[var6], var7 - (var2 * var5 / 7 >> 12), var4 - (var3 * var5 / 7 >> 12), 3);
                     if (this.a != null) {
                        at.a.drawImage(this.a, var7 - (var2 * var5 / 10 >> 12), var4 - (var3 * var5 / 10 >> 12), 3);
                     }
                  }
               }
            }
         }
      }

   }
}
