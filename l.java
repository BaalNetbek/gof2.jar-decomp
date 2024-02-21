public final class l extends n {
   private t a = new t(1);
   private static cc b;
   private static cc c;
   private static cc d = new cc();
   private static int d;
   private static int f;
   private static int g;
   private boolean d;
   private bw a;

   public l(az var1, ag var2, boolean var3) {
      super(var1, (ag)null);
      this.a.a(100);
      this.a = var2;
      this.d = var3;
      b = new cc();
   }

   public final void a() {
      super.a();
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
   }

   public final void b() {
      this.a.c();
      if (this.a.b) {
         this.a.b();
         this.a.b(true);
         at.a.a((ah)this.a);
      }

   }

   public final void c() {
      if (this.a.b) {
         at.a.a().a(this.a.b(b));
      }

   }

   public final void a(bw var1) {
      this.a = var1;
   }

   public final void a(long var1) {
      this.a.a(var1);
      b.a(this.a.a[0]);
      if (this.a.a) {
         this.a.b(b);
         this.a.a = false;
      }

      this.a.b(b);
      a.a(this.a.b[0]);
      a.a();
      this.a.a().c(a);
      if (this.a.b) {
         if (this.d && this.a.a[0] < this.a.b - 1500) {
            int var2 = (int)var1;
            l var8 = this;
            aa[] var3;
            if ((var3 = this.a.a()) != null) {
               label74: {
                  if (this.a == null) {
                     int var4 = -1;
                     int var5 = Integer.MAX_VALUE;

                     for(int var6 = 0; var6 < var3.length; ++var6) {
                        if (var3[var6].d() && !var3[var6].e() && !var3[var6].a()) {
                           c = var8.a.a[0];
                           b = var3[var6].a(b);
                           d = c.a - b.a;
                           f = c.b - b.b;
                           g = c.c - b.c;
                           int var7;
                           if (d < 15000 && d > -15000 && f < 15000 && f > -15000 && g < 15000 && g > -15000 && (var7 = d * d + f * f + g * g) < var5) {
                              var4 = var6;
                              var5 = var7;
                           }
                        }
                     }

                     if (var4 < 0) {
                        break label74;
                     }

                     b = var3[var4].a(b);
                  } else if (this.a.b() != null) {
                     b = this.a.b().a(b);
                  }

                  a.a = b.a - var8.a.a[0].a;
                  a.b = b.b - var8.a.a[0].b;
                  a.c = b.c - var8.a.a[0].c;
                  d.a(var8.a.b[0]);
                  a.c(d);
                  a.a(var2);
                  var8.a.b[0] = d.b(a, var8.a.b[0]);
                  var8.a.b[0].a();
                  var8.a.b[0].a((int)(var8.a.a * (float)var2) << 12);
                  cc var10000 = var8.a.b[0];
                  var10000.a >>= 12;
                  var10000 = var8.a.b[0];
                  var10000.b >>= 12;
                  var10000 = var8.a.b[0];
                  var10000.c >>= 12;
               }
            }
         }

         b.a(this.a.a[0]);
         this.a.a(b);
         if (b.c == 50000) {
            this.a.b = false;
         }
      }

   }
}
