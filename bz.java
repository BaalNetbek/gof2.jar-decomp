public final class bz {
   private int[] a = new int[12];
   private int[] b = new int[20];
   private int[] c = new int[20];
   private int[] d = new int[8];
   private cc a = new cc();
   private cc b = new cc();
   private w a;
   private ag[] a;
   private int a;

   public bz() {
      this.d[0] = 1;
      this.d[1] = 48;
      this.d[2] = 14;
      this.d[3] = 48;
      this.d[4] = 14;
      this.d[5] = 63;
      this.d[6] = 1;
      this.d[7] = 63;
      this.a[0] = -100;
      this.a[1] = 0;
      this.a[2] = 0;
      this.a[3] = 100;
      this.a[4] = 0;
      this.a[5] = 0;
      this.a[6] = 100;
      this.a[7] = 0;
      this.a[8] = 1000;
      this.a[9] = -100;
      this.a[10] = 0;
      this.a[11] = 1000;
      this.a = new ag[20];

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = ag.a(0, 1, (byte)2);
         this.a[var1].a(bo.a(0));
         this.a[var1].a(2);
         ((k)this.a[var1]).a(this.a, this.d);
         this.a[var1].c(100000, 100000, 100000);
      }

      this.a = new w();
   }

   public final void a() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].a();
      }

      this.a = null;
      this.a = null;
      this.d = null;
   }

   public final void a(long var1, cm var3) {
      boolean var4 = false;
      this.a = (int)((long)this.a + var1);

      for(int var5 = 0; var5 < 20; ++var5) {
         if (this.a > 400 && this.b[var5] <= 0 && !var4) {
            this.a = 0;
            int var7 = at.a.nextInt(18000) - 9000;
            int var6 = at.a.nextInt(18000) - 9000;
            this.b.a(var7, var6, 20000);
            this.a = var3.b(this.b, this.a);
            this.a = var3.a(this.a);
            this.a[var5].b(this.a);
            this.a[var5].a(this.a);
            this.b[var5] = 4000;
            this.c[var5] = 300 + at.a.nextInt(300);
            var4 = true;
         } else {
            int[] var10000 = this.b;
            var10000[var5] = (int)((long)var10000[var5] - var1);
            this.a[var5].b(-this.c[var5]);
         }
      }

   }

   public final void b() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         at.a.a((ah)this.a[var1]);
      }

   }
}
