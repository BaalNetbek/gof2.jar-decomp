public final class ch {
   public static final short[] a = new short[]{622, 1338, 1066, 783, 1181, 912, 939, 1471, 1199, 1192, 763, 1633, 1103, 2000, 2000, 2000, 1802, 1930, 1590, 1205, 1024, 1623, 1266, 1038, 1370, 1370, 1110, 1276, 1722, 1553, 975, 1175, 627, 1185, 916, 767, 1738};
   public static final short[] b = new short[]{24, -51, -37, 78, -197, 8, -14, 37, -104, 121, -100, -381, -132, 0, 0, 0, -520, -137, -206, 0, -182, -347, 2, -61, -116, -254, -316, -40, -182, -372, -68, -160, -142, 131, -102, -72, -402};
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int[] a;
   private float a;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private boolean a;
   private boolean b;
   private boolean c;
   private int q;
   private v[] a;
   private v[] b;

   public ch(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = 0;
      this.f = var4;
      this.c = var4;
      this.a = new int[4];
      this.a[0] = var5;
      this.a[1] = var6;
      this.a[2] = var7;
      this.a[3] = var8;
      this.a = var9 / 100.0F;
      this.a = new v[var5 + var6 + var7 + var8];
      this.b = null;
      this.q = 0;
      this.d();
   }

   public final void a(int var1) {
      this.q = var1;
   }

   public final int a() {
      return this.q;
   }

   public final int b() {
      return this.a;
   }

   public final int c() {
      return this.a == 10 && ba.a() ? '썐' : this.f;
   }

   public final float a() {
      return this.a;
   }

   public final int d() {
      return this.b;
   }

   public final int e() {
      return this.b + this.g + this.h;
   }

   public final int f() {
      return this.h;
   }

   public final int g() {
      return this.b;
   }

   public final int h() {
      return this.g;
   }

   public final int i() {
      return this.i;
   }

   public final int j() {
      return this.k;
   }

   public final int k() {
      return this.m;
   }

   public final int l() {
      return this.l;
   }

   public final int m() {
      return this.n;
   }

   public final boolean a() {
      return this.k > 0;
   }

   public final boolean b() {
      return this.b;
   }

   public final boolean c() {
      return this.c;
   }

   public final boolean d() {
      return this.a;
   }

   public final int n() {
      return this.p;
   }

   public final int o() {
      return this.d;
   }

   public final int p() {
      return this.d + this.j;
   }

   public final int q() {
      return this.e;
   }

   public final v[] a() {
      return this.a;
   }

   public final v[] b() {
      return this.b;
   }

   public final void a(v[] var1) {
      this.b = var1;
      this.e = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.e += this.b[var2].l();
      }

      this.d();
      if (bl.v < this.r()) {
         bl.v = this.r();
      }

   }

   public final v a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null && this.a[var2].d() == var1) {
            return this.a[var2];
         }
      }

      return null;
   }

   public final boolean a(int var1) {
      if (this.a == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2] != null && this.a[var2].a() == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public final boolean e() {
      if (this.b == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.b.length; ++var1) {
            if (this.b[var1] != null && this.b[var1].b() == this.a) {
               return true;
            }
         }

         return false;
      }
   }

   public final void a(v var1) {
      this.a(var1.a(), var1.l());
   }

   public final void a() {
      this.b = null;
   }

   public final boolean b(int var1) {
      return this.a(131, 9999999);
   }

   public final boolean a(int var1, int var2) {
      if (this.b == null) {
         return false;
      } else {
         boolean var3 = false;

         for(int var4 = 0; var4 < this.b.length; ++var4) {
            if (this.b[var4].a() == var1) {
               this.b[var4].c(-var2);
               if (this.b[var4].l() <= 0) {
                  var3 = true;
               }
               break;
            }
         }

         if (var3) {
            this.b(v.a(this.b, true));
         } else {
            this.b(this.b);
         }

         return var3;
      }
   }

   public final void b(v[] var1) {
      this.b = var1;
      this.e = 0;
      if (var1 != null) {
         for(int var2 = 0; var2 < this.b.length; ++var2) {
            this.e += this.b[var2].l();
         }
      }

      this.d();
      if (bl.v < this.r()) {
         bl.v = this.r();
      }

   }

   public final boolean c(int var1) {
      return this.e + var1 <= this.d + this.j;
   }

   public final int r() {
      return this.p() - this.e;
   }

   public final void b(v var1) {
      v[] var2 = new v[]{var1};
      this.b(v.b(this.b, var2));
   }

   public final void c(v[] var1) {
      this.a = var1;
      this.d();
   }

   public final void c(v var1) {
      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2] != null && this.a[var2].a(var1)) {
               this.a[var2] = null;
               return;
            }
         }

      }
   }

   public final v[] a(int var1) {
      if (var1 < this.a.length && this.a[var1] != 0) {
         v[] var2 = new v[this.a[var1]];
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < var1; ++var4) {
            var3 += this.a[var4];
         }

         var4 = 0;

         for(int var5 = var3; var5 < var3 + this.a[var1]; ++var5) {
            if (var4 < var2.length) {
               var2[var4++] = this.a[var5];
            } else {
               System.err.println("Ship.getEquipment() failed");
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public final void a(v var1, int var2) {
      var2 = var2;

      for(int var3 = 0; var3 < var1.b(); ++var3) {
         var2 += this.a[var3];
      }

      if (var2 < this.a.length) {
         this.a[var2] = var1;
         this.d();
      } else {
         System.out.println("Ship.setEquipment() Array Index out of bounds");
      }
   }

   private void d() {
      this.a = false;
      this.b = false;
      this.c = false;
      this.g = 0;
      this.i = 0;
      this.j = 0;
      this.l = 0;
      this.k = 0;
      this.m = 0;
      this.n = 0;
      this.h = 0;
      this.p = 0;
      this.o = 0;
      this.c = this.f;

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1] != null) {
            switch(this.a[var1].d()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 8:
               this.p += this.a[var1].a(9);
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            default:
               break;
            case 9:
               this.g = this.a[var1].a(16);
               this.i = this.a[var1].a(17);
               break;
            case 10:
               this.h = this.a[var1].a(18);
               break;
            case 12:
               this.j += this.a[var1].a(20);
               break;
            case 14:
               this.k = this.a[var1].a(23);
               this.m = this.a[var1].a(25);
               this.l = this.a[var1].a(24);
               break;
            case 15:
               this.a = true;
               break;
            case 16:
               this.n = this.a[var1].a(26);
               break;
            case 18:
               this.b = true;
               break;
            case 20:
               this.o += this.a[var1].a(32);
               break;
            case 21:
               this.c = true;
            }

            this.c += this.a[var1].f();
         }
      }

      this.j = (int)((float)this.d * (float)this.j / 100.0F);
      int var10001 = this.c;
      ch var4 = this;
      int var2 = 0;
      if (this.b != null) {
         for(int var3 = 0; var3 < var4.b.length; ++var3) {
            if (var4.b[var3] != null) {
               var2 += var4.b[var3].f();
            }
         }
      }

      this.c = var10001 + var2;
   }

   public final int s() {
      return this.o;
   }

   public final void b(v var1, int var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null && this.a[var3].a(var1) && var3 == var2) {
            this.a[var3] = null;
            break;
         }
      }

      this.d();
   }

   public final void d(v var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null && this.a[var2].a(var1)) {
            this.a[var2] = null;
            break;
         }
      }

      this.d();
   }

   public final int a(int var1) {
      return this.a[var1];
   }

   public final int t() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] > 0) {
            ++var1;
         }
      }

      return var1;
   }

   public final int b(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null && this.a[var3].b() == var1) {
            ++var2;
         }
      }

      return var2;
   }

   public final ch a() {
      return new ch(this.a, this.b, this.d, this.f, this.a[0], this.a[1], this.a[2], this.a[3], this.a * 100.0F);
   }

   public final void b() {
      this.f = (int)((float)ad.a()[this.a].c() / 1.25F);
   }

   public final void c() {
      if (bl.a() != null) {
         this.f = ad.a()[this.a].c() - (int)((float)bl.a().d() / 100.0F * (float)ad.a()[this.a].c());
      }

   }
}
