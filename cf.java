public final class cf {
   private int[] a;
   private int[] b;
   private int a;
   private ag[] a;
   private ag a;

   public cf(int var1) {
      if (var1 > 1) {
         this.a = new ag[var1];
         this.a = new int[var1];

         for(var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1] = bo.a(9992);
            this.a[var1].f(100);
            this.a[var1].a(1, 20);
            this.a[var1].f(8192, 8192, 8192);
            this.a[var1].a(2);
            this.a[var1].e();
            if (var1 == 0) {
               this.a[var1] = 0;
            } else {
               this.a[var1] = this.a[var1 - 1] + at.a.nextInt(1000) + 1000;
            }
         }
      }

      this.a = bo.a(9992);
      this.a.f(100);
      this.a.a(1, 20);
      this.a.f(8192, 8192, 8192);
      this.a.a(2);
      this.a.e();
   }

   public final void a() {
      this.a = 0;
   }

   public final void b() {
      if (this.a != null) {
         this.a.f(32768, 32768, 32768);
         this.a.f(200);
      }

   }

   public final void c() {
      this.a = null;
      this.b = null;
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.a[var1] != null) {
               this.a[var1].a();
            }
         }
      }

      this.a = null;
   }

   public final void a(int var1, int var2, int var3) {
      if (this.a == null) {
         this.a.c(var1, var2, var3);
         this.a.a((byte)1);
         this.a = 0;
      } else {
         for(int var4 = 0; var4 < this.a.length; ++var4) {
            this.a[var4].c(var1, var2, var3);
         }

         this.a.c(var1, var2, var3);
      }
   }

   public final boolean a() {
      return this.a != null && this.a.b();
   }

   public final void a(long var1) {
      this.a = (int)((long)this.a + var1);
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (this.a > this.a[var3]) {
               if (var3 == this.a.length - 1) {
                  this.a.f(16384, 16384, 16384);
                  this.a.a((byte)1);
               }

               this.a[var3].a((byte)1);
            }
         }

      } else {
         at.a.a((ah)this.a);
      }
   }

   public final boolean b() {
      if (this.a != null) {
         return this.a > this.a[this.a.length - 1] + 1000;
      } else {
         return this.a > 2000;
      }
   }
}
