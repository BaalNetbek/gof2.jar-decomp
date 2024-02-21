public final class bd {
   private String a;
   private int a;
   private int b;
   private int c;
   private int d;
   private v[] a;
   private ch[] a;
   private ca[] a;

   public bd(String var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.d = var4;
      this.c = var5;
      this.a = null;
      this.a = null;
      this.a = null;
   }

   public bd() {
      this("", -1, -1, 0, 0);
   }

   public final int a() {
      return this.b;
   }

   public final String a() {
      return this.a;
   }

   public final int b() {
      return this.a;
   }

   public final boolean a() {
      return this.a == bl.h;
   }

   public final int c() {
      return this.c;
   }

   public final boolean b() {
      return bv.a()[this.a];
   }

   public final void a() {
      if (!this.b()) {
         bl.d();
         bv.a(this.a);
      }

   }

   public final int d() {
      return this.d;
   }

   public final ch[] a() {
      return this.a;
   }

   public final v[] a() {
      return this.a;
   }

   public final void a(v[] var1) {
      this.a = var1;
   }

   public final void a(ch[] var1) {
      this.a = var1;
   }

   public final void a(ca[] var1) {
      this.a = var1;
   }

   public final void a(v var1) {
      if (this.a == null) {
         this.a = new v[]{var1};
      } else {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2].a(var1)) {
               this.a[var2].c(var1.l());
               return;
            }
         }

         v[] var3 = new v[this.a.length + 1];
         System.arraycopy(this.a, 0, var3, 0, this.a.length);
         var3[var3.length - 1] = var1;
         this.a = var3;
      }
   }

   public final ca[] a() {
      return this.a;
   }

   public final String toString() {
      return this.a;
   }

   public final boolean a(bd var1) {
      return this.a.equals(var1.a);
   }
}
