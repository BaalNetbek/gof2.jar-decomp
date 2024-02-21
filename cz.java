public final class cz {
   private ag[] a = null;
   private int a = 0;

   public final void a(ag var1) {
      if (this.a == null) {
         this.a = new ag[1];
         this.a[0] = var1;
         this.a = 1;
      } else if (this.a == this.a.length) {
         ag[] var2 = new ag[this.a.length + 1];
         System.arraycopy(this.a, 0, var2, 0, this.a.length);
         var2[this.a.length] = var1;
         this.a = var2;
         ++this.a;
      } else {
         this.a[this.a] = var1;
         ++this.a;
      }
   }

   public final void a() {
      this.a = 0;
   }

   public final void a(long var1) {
      for(int var3 = 0; var3 < this.a; ++var3) {
         this.a[var3].a(var1);
      }

   }

   public final void b() {
      for(int var1 = 0; var1 < this.a; ++var1) {
         this.a[var1].b();
      }

   }
}
