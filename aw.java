public final class aw {
   private int a;
   private int b;
   private int c;
   private int d;
   private String[] a = new String[5];
   private int e = 0;

   public aw(db var1) {
      if (db.a != null) {
         this.a[0] = at.a.a(270) + ": " + db.a.a();
         ++this.e;
      }

      if (bl.a().a()) {
         this.a[1] = at.a.a(271);
         ++this.e;
      }

      this.a[2] = bl.a().a() + " " + at.a.a(40);
      ++this.e;
      this.a[3] = at.a.a(273);
      ++this.e;
      if (var1.a().a() != null && !var1.a().a().b().m) {
         this.a[4] = at.a.a(294);
         ++this.e;
      }

      this.d = 0;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         int var2;
         if (this.a[var3] != null && (var2 = q.a(this.a[var3], 0)) + 19 > this.d) {
            this.d = var2 + 19;
         }
      }

      this.b = (at.f - this.d) / 2;
      this.c = (at.g - (this.e * 10 + 12)) / 2;

      while(this.a[this.a] == null) {
         this.b();
      }

   }

   public final int a() {
      return this.a;
   }

   public final void a() {
      if (this.a > 0) {
         --this.a;
      } else {
         this.a = 4;
      }

      if (this.a[this.a] == null) {
         this.a();
      }

   }

   public final void b() {
      if (this.a < 4) {
         ++this.a;
      } else {
         this.a = 0;
      }

      if (this.a[this.a] == null) {
         this.b();
      }

   }

   public final void c() {
      a.a(at.a.a(293), this.b, this.c, this.d, 12 + (this.e + 1) * 12 - 5);
      int var1 = 0;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null) {
            a.a(this.a[var2], this.b, this.c + 14 + var1++ * 12, this.d, this.a == var2);
         }
      }

   }
}
