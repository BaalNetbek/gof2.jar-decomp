import javax.microedition.lcdui.Image;

public final class bu {
   private int c;
   private int d;
   private int e;
   private int f;
   int a;
   private String[] a;
   private int g;
   private boolean a;
   private int h;
   private String a;
   private byte[] a;
   private int i;
   private boolean b;
   int b;
   private Image[] a;
   private int j;

   public bu(int var1, int var2, int var3, int var4, String var5) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.j = var4;
      this.a = 0;
      if (var5 != null) {
         this.a(var5);
      }

      this.b = false;
      this.b = 0;
   }

   public final void a() {
      this.a = 0;
   }

   public final void a(boolean var1) {
      this.b = true;
   }

   public final void a(int var1) {
      this.b = var1;
   }

   public final void a(String var1) {
      this.a = var1;
      if (this.a == null) {
         this.i = 0;
      }

      if (var1 != null) {
         if (this.a == null) {
            this.a = q.a(var1, this.e + 3);
         } else {
            this.a = q.a((String)var1, this.e + 3, 1, e.c + 3, e.d);
         }

         this.g = q.a(this.a) + this.i;
         this.f = g.c(this.j, q.a(this.a) + 13);
         if (this.a != null) {
            this.f = g.b(this.f, e.d + 10);
         }

         this.a = this.g > this.f;
         if (this.a) {
            if (this.a == null) {
               this.a = q.a(var1, this.e + 3);
            } else {
               this.a = q.a((String)var1, this.e - 3, 1, e.c + 3, e.d);
            }

            this.g = q.a(this.a) + this.i;
            this.h = (int)((float)this.f / (float)this.g * (float)this.f) - 1;
         }

      }
   }

   public final int a() {
      return this.f + q.a() + (this.a ? 6 : 0);
   }

   public final int b() {
      if (this.a == null) {
         return 0;
      } else {
         return this.a == null ? this.a.length : g.b(this.a.length, e.d / this.a.length + 1);
      }
   }

   public final void a(byte[] var1, String var2, boolean var3) {
      this.a = var1;
      q.a(var2, this.e - e.c - 2);
      this.a = e.a(var1);
      this.i = 3;
      this.a(this.a);
   }

   public final void b(int var1) {
      if (this.g > this.f) {
         this.a -= var1 / 10;
         if (this.a < -(this.g - this.f)) {
            this.a = -(this.g - this.f);
         }
      }

   }

   public final void c(int var1) {
      this.a += var1 / 10;
      if (this.a > 0) {
         this.a = 0;
      }

   }

   public final void b() {
      at.a.setColor(a.a);
      at.a.setClip(this.c - 2, this.d, this.e + 5, this.f);
      if (this.a != null) {
         e.a(this.a, this.c, this.d + this.a + 2, 0);
      }

      if (this.a != null) {
         if (this.b) {
            q.a((String[])this.a, this.c + this.e - 3, this.d + this.a + this.i, this.b, 2);
         } else if (this.a == null) {
            q.a(this.a, this.c + 2, this.d + this.a + this.i, this.b);
         } else {
            q.a(this.a, this.c + 2, this.d + this.a + this.i, this.b, e.c + 3, e.d);
         }
      }

      at.a.setClip(0, 0, at.f, at.g);
      if (this.a) {
         int var1 = this.d + 2 - (int)((float)this.a / (float)this.g * (float)(this.f - 7));
         at.a.setColor(a.a);
         at.a.drawLine(this.c + this.e, this.d + 2, this.c + this.e, this.d + this.f - 4);
         at.a.setColor(-35072);
         at.a.fillRect(this.c + this.e - 1, var1, 3, this.h);
         at.a.setColor(-4827904);
         at.a.drawLine(this.c + this.e - 1, var1 + 1, this.c + this.e - 1, var1 + this.h - 2);
         at.a.drawLine(this.c + this.e - 1, var1 + this.h - 1, this.c + this.e - 1, var1 + this.h - 1);
         at.a.setColor(-11520);
         at.a.drawLine(this.c + this.e, var1 + 1, this.c + this.e, var1 + this.h - 2);
         at.a.setColor(a.a);
      }

   }
}
