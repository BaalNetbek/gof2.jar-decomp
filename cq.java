public final class cq extends p {
   private long a;

   public cq(int var1, aa var2, ag var3, int var4, int var5, int var6) {
      super(9996, -1, var2, var3, var4, var5, var6);
      this.a.a = var3.a();
      var1 = 4096 + at.a.nextInt(8096);
      var3.f(var1, var1, var1);
      this.c = true;
   }

   public final void a(long var1) {
      this.a = var1;
      if (this.a.e() <= 0 && this.a != 3 && this.a != 4) {
         this.a.b();
         this.a = 3;
         if (at.a.nextInt(100) < 10) {
            this.d = true;
            this.a = new int[2];
            this.a[1] = 1 + at.a.nextInt(10);
            this.a[0] = 99;
            this.b(2);
            this.d = true;
         } else {
            this.a.e(false);
            if (this.a.a().a.b == this) {
               this.a.a().a.b = null;
            }
         }

         if (this.a != null) {
            this.b = this.a.b(this.b);
            this.a.a(this.b.a, this.b.b, this.b.c);
         }
      }

      switch(this.a) {
      case 3:
         if (this.a == null || this.a.b()) {
            this.a = 4;
         }
      default:
      }
   }

   public final void a() {
      if (this.b != null) {
         at.a.a((ah)this.b);
      }

      if (this.a != 4 && this.a != 3) {
         super.a();
      }

      if (this.a == 3 && this.a != null) {
         this.a.a(this.a);
      }

   }

   public final boolean a(int var1, int var2, int var3) {
      return false;
   }
}
