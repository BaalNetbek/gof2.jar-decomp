import javax.microedition.lcdui.Image;

public final class al {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private float a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private float h;
   private int g;
   private int h;
   private float i;
   private float j;
   private Image a;
   private Image b;
   private Image c;
   private Image d;
   private Image e;
   private Image f;
   private x a;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private boolean a;
   private int[] a = new int[]{44, 39, 34, 29, 23, 18, 13};

   public al(int var1, int var2, x var3) {
      if (this.a == null) {
         String var4 = "/data/interface/mining_background.png";
         this.a = ai.a("/data/interface/mining_background.png", true);
         var4 = "/data/interface/mining_cursor.png";
         this.b = ai.a("/data/interface/mining_cursor.png", true);
         var4 = "/data/interface/mining_green_complete.png";
         this.c = ai.a("/data/interface/mining_green_complete.png", true);
         var4 = "/data/interface/mining_green_empty.png";
         this.d = ai.a("/data/interface/mining_green_empty.png", true);
         var4 = "/data/interface/mining_redarea.png";
         this.e = ai.a("/data/interface/mining_redarea.png", true);
      }

      this.a = var3;
      this.f = var3.a;
      this.j = at.f / 2 - this.a.getWidth() / 2;
      this.k = at.g / 2 + this.a.getHeight() / 2;
      this.l = this.a.getWidth();
      this.m = 2;
      this.f = -1;
      this.b = 1.0F;
      this.a = false;
      this.i = var2;
      this.b = var1;
      v var5 = bl.a().a(19);
      this.a = 6000;
      if (var5 != null) {
         float var6 = (float)var5.a(30) / 100.0F;
         this.c = 25.0F + var6 * 55.0F;
         this.j = 50.0F + var6 * 200.0F;
         this.i = (float)var5.a(31) / 100.0F;
      }

      this.g = 400;
   }

   public final boolean a() {
      return this.f >= 2500.0F;
   }

   public final int a() {
      return (int)this.g;
   }

   public final boolean b() {
      return this.a && this.b == 7;
   }

   public final boolean a(int var1, int var2) {
      if (this.c >= this.b) {
         return false;
      } else {
         this.h = var1;
         int var3;
         int var4 = -(var3 = (2 * this.m + 3 * this.a[this.c]) / 2);
         this.e += var1;
         if (g.e((int)this.e) > this.a[this.c] / 2) {
            this.f += (float)var1;
            if (this.f > 2500.0F) {
               this.f = 2500.0F;
               this.g = 0.0F;
               return false;
            }
         } else {
            this.d += var1;
            float var5 = (var5 = 0.15F + (float)(this.c + 1) / 7.0F * 2.35F) * this.i;
            this.g += var5 / 1000.0F * (float)var1;
         }

         if (this.d > this.a) {
            this.d = 0;
            ++this.c;
            this.a = (int)((float)this.a * 0.83F);
            if (this.c >= this.b) {
               this.a = true;
               return false;
            }

            this.e = this.f + 1;
            this.e *= 0.88F;
         }

         if (this.e > this.f) {
            this.e = 0;
            this.f = 500 + (int)((float)at.a.nextInt(100) / 100.0F * 2000.0F);
            this.a = at.a.nextInt(2) == 0 ? -1.0F : 1.0F;
            this.b = 0.0F;
            this.d /= 2.0F;
         }

         this.b = (float)var1 / this.c * this.a;
         if ((var2 & 32) != 0) {
            this.d -= (float)var1 / this.j;
         } else if ((var2 & 4) != 0) {
            this.d += (float)var1 / this.j;
         } else {
            this.d = 0.0F;
         }

         this.e += this.b - this.d;
         if (this.e > (float)var3) {
            this.e = (float)var3;
         } else if (this.e < (float)var4) {
            this.e = (float)var4;
         }

         return true;
      }
   }

   public final void a() {
      at.a.drawImage(this.a, this.j, this.k, 36);
      int var1 = this.b * 7;
      int var2 = (this.c + 1) * 7;
      at.a.setClip(0, this.k - var1, at.f, var1);
      at.a.drawImage(this.d, this.j + 50, this.k, 36);
      if (this.c > 0) {
         var1 = this.c * 7;
         at.a.setClip(0, this.k - var1, at.f, var1);
         at.a.drawImage(this.c, this.j + 50, this.k, 36);
      }

      var1 = this.a[this.c];
      int var3 = (int)((float)this.d / (float)this.a * (float)var1);
      at.a.setClip((at.f >> 1) - (var3 >> 1), this.k - var2, var3, 7);
      at.a.drawImage(this.c, this.j + 50, this.k, 36);
      var2 = this.k - this.c * 7;
      var3 = this.j + (this.l - 2 * this.m - var1 * 3) / 2;
      int var4 = (int)(this.f / 2500.0F * (float)(var1 + 5));
      at.a.setClip(var3 + var1 - var4, var2 - 5, var4, 5);
      at.a.drawImage(this.e, this.j, this.k, 36);
      at.a.setClip(var3 + var1 * 2 + 2 * this.m, var2 - 5, var4, 5);
      at.a.drawImage(this.e, this.j, this.k, 36);
      at.a.setClip(0, 0, at.f, at.g);
      var1 = (at.f >> 1) + (int)this.e;
      at.a.drawImage(this.b, var1, var2 + 2, 33);
      var1 = this.k - this.a.getHeight();
      if (this.b == 7) {
         e.a(this.i - 154 + 165, this.f, (at.f >> 1) - 1, var1 + 10, 3);
      }

      if ((int)this.g > (int)this.h) {
         this.h = this.g;
         this.g = 0;
      }

      boolean var5 = this.g < 400;
      String var6;
      q.a((String)(var6 = "    t " + at.a.a(569 + this.i)), at.f >> 1, this.k + q.a(), 2, 24);
      if (var5) {
         this.a.a((int)this.g, (at.f >> 1) - (q.a(var6, 0) >> 1) - 16, this.k + q.a() - 2, false);
         this.g += this.h;
      } else {
         String var10000 = (int)this.g + "";
         int var10001 = (at.f >> 1) - (q.a(var6, 0) >> 1);
         String var7 = "   ";
         q.a((String)var10000, var10001 + q.a("   ", 0), this.k + q.a(), 2, 18);
      }
   }
}
