package Main;

public final class k extends .as {
   private long a;
   private long b;
   private long c;
   private long d;
   private boolean a;
   private .aj a;
   private .ap a;
   private .ap b;
   private .bt a;
   private .b a;
   private .cp a;
   private .cr a;
   public .db a;
   private int a;
   private .ar a;
   private float a;
   private float b;
   private float c;
   private int b;
   private int c;

   public k(int var1) {
      this.a = var1;
   }

   public final void a() {
      if (this.a != null) {
         this.a.h();
      }

      this.a = null;
      this.a = null;
      if (this.a != null) {
         this.a.h();
      }

      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = false;
      System.gc();
   }

   public final void c() {
      switch(this.a) {
      case 4:
         if (this.a == null) {
            this.a = .ap.a(.at.f, .at.g, 1024, 200, 28000);
            this.a.a((short)2);
         }

         .at.a.a(this.a);
         this.a.c(920, 500, -1240);
         this.a.e(-160, 2048, 0);
         return;
      case 23:
         .at.a.a(this.b);
         .p[] var1;
         if ((var1 = this.a.a())[0].a() >= 0) {
            ((.bh)var1[0]).f(false);
            return;
         }
         break;
      default:
         if (this.a != null) {
            .at.a.a(this.a.a());
         }
      }

   }

   public final void b() {
      try {
         if (this.a == null) {
            this.a = new .db(this.a);
         }

         if (!this.a.a()) {
            return;
         }

         this.a = this.a.a();
         if (this.a != null) {
            this.a.c(false);
         }

         switch(this.a) {
         case 0:
            this.a = new .bt(1);
            .at.a.a(this.a.a());
            break;
         case 2:
            this.a = new .bt(0);
            .at.a.a(this.a.a());
            break;
         case 4:
            this.c();
            break;
         case 23:
            this.b = .ap.a(.at.f, .at.g, 900, 10, 31768);
            this.b.c(0, 1700, 1500);
            this.b.e(-256, 0, 0);
            .at.a.a(this.b);
            this.a = new .ar();
            this.a.a(this.b);
            this.a.b(0, 0, 10240);
            this.c = 1536.0F;
            this.a.b(true);
            .p[] var1;
            if ((var1 = this.a.a())[0].a() >= 0) {
               this.b = var1[0].a.c();
               this.c = var1[0].a.d();
            }
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      System.gc();
      this.d = 0L;
      this.a = System.currentTimeMillis();
      this.b = System.currentTimeMillis();
      this.a = true;
   }

   public final boolean a() {
      return this.a;
   }

   public final void a(int var1, int var2) {
      if (this.a.a() != null && this.a.a()[0] != null && this.a.a()[0].a != null) {
         .cm var3 = this.a.a()[0].a.a();
         this.a.a()[0].a(.ad.a(var1, var2), var1);
         this.a.a()[0].a.a(var3);
      }

   }

   public final void a(int var1) {
      if (this.a) {
         this.a = System.currentTimeMillis();
         this.c = this.a - this.b;
         this.b = this.a;
         this.d += this.c;
         if (this.a != null && (this.a == 2 || this.d < 10000L)) {
            this.a.a(this.c);
         }

         Main.k var2 = this;

         try {
            var2.a.c(var2.c);
            var2.a.a(var2.c);
            .at.a.a(.at.a);
            .at.a.a(System.currentTimeMillis());
            .at.a.a();
            .at.a.b(.at.a);
         } catch (Exception var4) {
            .at.a.b(.at.a);
            var4.printStackTrace();
         }

         if (this.a == 23) {
            int var6 = .g.a((int)this.d) >> 7;
            .p[] var8;
            if ((var8 = this.a.a())[0].a() >= 0) {
               var8[0].a.c(0, this.b + var6, this.c);
            }

            boolean var7 = false;
            if ((var1 & 4) != 0) {
               this.a = (float)this.c;
               var7 = true;
            } else {
               this.a *= 0.9F;
            }

            if ((var1 & 32) != 0) {
               this.b = (float)this.c;
               var7 = true;
            } else {
               this.b *= 0.9F;
            }

            this.c += this.a - this.b;
            if (!var7) {
               this.c += (float)((int)this.c / 6);
            }

            this.a.e(0, (int)this.c, 0);
            this.a.b(true);
         } else {
            if (this.a == 4) {
               if (this.d > 500L) {
                  this.d = 0L;
                  .p[] var5 = this.a.a();

                  for(int var3 = 0; var3 < .bl.a().a().length; ++var3) {
                     if (.at.a.nextInt(100) < 10 && !var5[var3].a.b()) {
                        var5[var3].a.a((byte)1);
                     }
                  }

                  return;
               }
            } else {
               this.a.e();
            }

         }
      }
   }

   public final void b(int var1) {
   }
}
