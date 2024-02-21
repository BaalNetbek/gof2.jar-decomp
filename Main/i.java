package Main;

public class i {
   protected int a;
   protected int b;
   protected int c;
   protected int d;
   protected String[] a;
   protected Object[][] a;
   protected int[] a;
   protected int e;
   protected int f;
   private int p;
   protected boolean b;
   protected int g;
   protected int h;
   protected int i;
   protected int j;
   protected int k;
   protected int l;
   protected int m = 8;
   protected int n;
   protected int o;
   private boolean a;
   protected boolean c;
   private int q;
   protected String b;

   public i(int var1, int var2, int var3, int var4, String[] var5, String var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.g = 0;
      this.a = true;
      this.c = true;
   }

   private void a(int var1, int var2, int var3, int var4, String[] var5, String var6) {
      if (var1 == 0 && var2 == 0 && var3 == .at.f && var4 == .at.g) {
         var2 = 1;
         var1 = 1;
         var3 -= 3;
         var4 = var4 - 4 - 14;
      }

      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.b = true;
      if (var5 == null) {
         var5 = new String[]{""};
         this.b = false;
      }

      this.b = var6;
      this.a = var5;
      this.a = new Object[var5.length][200];
      this.a = new int[var5.length];

      for(var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3] = 200;
      }

      this.o = 0;
      this.h = 0;
      this.g = 0;
      this.i = 0;
      this.m = this.b();
      this.n = this.c();
      this.k = var1 + 6;
      if (this.b) {
         this.l = var2 + 14 + this.n;
      } else {
         this.l = var2 + 14;
      }

      for(var3 = 0; var3 < var5.length; ++var3) {
         this.g = var3;
         this.j();
      }

   }

   public final void a(int var1) {
      this.m = var1;
   }

   public int b() {
      return this.m;
   }

   public int c() {
      return 16;
   }

   public final void a(int var1, Object[] var2) {
      if (var1 > this.a.length - 1) {
         System.out.println("ERROR: Tab " + var1 + " not available!");
      } else {
         this.a[var1] = new Object[200];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            this.a[var1][var3] = var2[var3];
         }

         this.j();
      }
   }

   public final Object a() {
      if (this.h < 0) {
         this.h = 0;
         return null;
      } else {
         return this.a[this.g] == null ? null : this.a[this.g][this.h];
      }
   }

   public final int d() {
      return this.g;
   }

   public final void b(int var1) {
      if (var1 < this.a.length) {
         this.g = var1;
         this.h = 0;
         this.i = 0;
         this.j();
      }

      this.a();
      this.i();
      this.h();
   }

   public void j() {
      this.e = 0;
      this.f = 0;
      int var1;
      if (this.a[this.g] != null) {
         for(var1 = 0; var1 < this.a[this.g].length; ++var1) {
            if (this.a[this.g][var1] == null) {
               this.j = var1 - 1;
               this.a[this.g] = var1;
               break;
            }
         }
      }

      this.j = this.a[this.g] - 1;

      for(var1 = 0; var1 < this.a[this.g]; ++var1) {
         if (this.l + (var1 + 1) * this.m > this.b + this.d - 12) {
            this.j = var1 - 1;
            this.e = (int)((float)(this.d - this.l + this.b) * ((float)var1 / (float)this.a[this.g]));
            break;
         }
      }

      this.p = (int)((float)(this.d - this.l + this.b) * ((float)this.i / (float)this.a[this.g]));
      if (this.e > 0) {
         this.f = 5;
      }

   }

   public void h() {
      if (this.h > 0) {
         --this.h;
         if (this.h < this.i + 1) {
            --this.i;
         }
      }

      this.j();
   }

   public void i() {
      if (this.h != this.a[this.g].length - 1) {
         if (this.a[this.g][this.h + 1] != null) {
            ++this.h;
            if (this.h > this.i + this.j - 1 && this.h < this.a[this.g] - 1) {
               ++this.i;
            }
         }

         this.j();
      }
   }

   public void d() {
      if (this.g > 0) {
         --this.g;
         this.h = 0;
         this.i = 0;
      }

      this.j();
   }

   public void e() {
      if (this.g < this.a.length - 1) {
         ++this.g;
         this.h = 0;
         this.i = 0;
      }

      this.j();
   }

   public void a() {
      this.n();
      .a.a(this.b, this.a, this.b, this.c, this.d);
      this.k();
      this.l();
      this.m();
   }

   public void l() {
      for(int var1 = this.i; var1 < this.a[this.g].length && this.a[this.g][var1] != null && var1 < this.i + this.j + 1; ++var1) {
         .at.a.setColor(.a.a);
         if (var1 == this.h && this.c) {
            .at.a.fillRect(this.a + 1, this.l + (var1 - this.i) * this.m + 1, this.c - 5, this.m + 1);
         }

         this.a(this.a[this.g][var1], var1);
      }

   }

   protected void k() {
      if (this.b) {
         .at.a.setColor(0);
         .at.a.drawLine(this.a + (this.c >> 1), this.b + 14, this.a + (this.c >> 1), this.b + 14 + 14);
         .at.a.drawLine(this.a + this.c - (this.c >> 1) - 1, this.b + 14, this.a + this.c - (this.c >> 1) - 1, this.b + 14 + 14);
         .at.a.setColor(.a.a);
         .at.a.drawLine(this.a + (this.c >> 1) - 1, this.b + 14, this.a + (this.c >> 1) - 1, this.b + 14 + 14);
         .at.a.drawLine(this.a + (this.c >> 1) + 1, this.b + 14, this.a + (this.c >> 1) + 1, this.b + 14 + 14);
         .at.a.drawLine(this.a + this.c - (this.c >> 1) - 2, this.b + 14, this.a + this.c - (this.c >> 1) - 2, this.b + 14 + 14);
         .at.a.drawLine(this.a + this.c - (this.c >> 1), this.b + 14, this.a + this.c - (this.c >> 1), this.b + 14 + 14);
         switch(this.g) {
         case 0:
            .at.a.drawLine(this.a + (this.c >> 1) - 1, this.b + 14 + 14, this.a + this.c - 3, this.b + 14 + 14);
            .at.a.setColor(0);
            .at.a.fillRect(this.a + (this.c >> 1) + 2, this.b + 14 + 1, (this.c >> 1) - 3, this.b + 14 - 2);
            .at.a.setColor(.a.d);
            .at.a.fillRect(this.a + (this.c >> 1) + 3, this.b + 14 + 2, (this.c >> 1) - 5, this.b + 14 - 3);
            break;
         case 1:
            .at.a.drawLine(this.a + 3, this.b + 14 + 14, this.a + (this.c >> 1) + 1, this.b + 14 + 14);
            .at.a.setColor(0);
            .at.a.fillRect(this.a + 3, this.b + 14 + 1, (this.c >> 1) - 4, this.b + 14 - 2);
            .at.a.setColor(.a.d);
            .at.a.fillRect(this.a + 4, this.b + 14 + 2, (this.c >> 1) - 6, this.b + 14 - 3);
         }

         .a.a(this.a + 2, this.b + 14, this.g == 0);
         .a.a(this.a + (this.c >> 1) + 1, this.b + 14, this.g == 1);
         .q.a((String)this.a[0], this.a + this.c / 4, this.b + 14 + 1, this.g == 0 ? 2 : 1, 24);
         .q.a((String)this.a[1], this.a + this.c - this.c / 4, this.b + 14 + 1, this.g == 1 ? 2 : 1, 24);
      }

   }

   protected final void m() {
      if (this.e > 0) {
         .at.a.setColor(.a.a);
         .at.a.drawLine(this.a + this.c - 7, this.l + 2, this.a + this.c - 7, this.b + this.d - 3 - 14);
         .at.a.setColor(-35072);
         .at.a.fillRect(this.a + this.c - 8, this.l + 2 + this.p, 3, this.e - 14 - 2);
         .at.a.setColor(-4827904);
         .at.a.drawLine(this.a + this.c - 8, this.l + 3 + this.p, this.a + this.c - 8, this.l + this.p + this.e - 15);
         .at.a.drawLine(this.a + this.c - 8, this.l + this.p + this.e - 15, this.a + this.c - 8 + 1, this.l + this.p + this.e - 15);
         .at.a.setColor(-11520);
         .at.a.drawLine(this.a + this.c - 7, this.l + 2 + this.p + 1, this.a + this.c - 7, this.l + this.p + this.e - 14 - 2);
         .at.a.setColor(.a.a);
      }

   }

   protected void n() {
      if (this.a) {
         .at.a.setColor(.a.b);
         .at.a.fillRect(this.a, this.b, this.c, this.d);
      }

   }

   protected void a(Object var1, int var2) {
      .q.b(var1.toString(), this.k, this.l + (var2 - this.i) * this.m, this.q);
   }

   public final int e() {
      return this.h;
   }

   public final void b(boolean var1) {
      this.a = false;
   }

   public final void c(boolean var1) {
      this.c = true;
   }

   public final void o() {
      this.q = 1 - this.q;
   }
}
