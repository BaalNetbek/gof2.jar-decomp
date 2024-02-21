public final class cw {
   private String a;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int[] a;
   private int[] b;
   private boolean a;
   public int a;
   public int b;
   public int c;

   public cw(int var1, String var2, int var3, boolean var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12, int[] var13, int[] var14) {
      this.d = var1;
      this.a = var2;
      this.e = var3;
      this.a = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
      this.i = var8;
      this.j = var9;
      this.k = var10;
      this.a = var11[0];
      this.b = var11[1];
      this.c = var11[2];
      this.a = var12;
      this.b = var13;
   }

   public final int a() {
      return this.d;
   }

   public final String a() {
      return this.a;
   }

   public final int b() {
      return this.e;
   }

   public final int c() {
      return this.f;
   }

   public final int d() {
      return this.g;
   }

   public final int e() {
      return this.h;
   }

   public final int f() {
      return this.i;
   }

   public final int g() {
      return this.k;
   }

   public final int h() {
      return this.j;
   }

   public final int i() {
      return this.a(this.j);
   }

   public final int a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public final boolean a() {
      return this.j == bl.a().b();
   }

   public final boolean a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public final boolean b() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (!bv.a()[this.a[var1]]) {
            return false;
         }
      }

      return true;
   }

   public final int[] a() {
      return this.a;
   }

   public final int[] b() {
      return this.b;
   }

   public final boolean b(int var1) {
      if (var1 == this.d) {
         return true;
      } else {
         if (this.b != null) {
            for(int var2 = 0; var2 < this.b.length; ++var2) {
               if (this.b[var2] == var1) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final boolean c() {
      return this.a;
   }
}
