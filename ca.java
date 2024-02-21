public final class ca {
   public String a;
   public String b;
   public String c;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private boolean c;
   private int i;
   private int j;
   private int k;
   public int a;
   private int l;
   private int m;
   private int n;
   private String e = "";
   private String f;
   public String d;
   private boolean d;
   private boolean e;
   private byte[] a;
   private cl a;
   public boolean a;
   public boolean b;

   public ca(int var1, String var2, int var3, int var4, int var5, boolean var6, int var7, int var8, int var9) {
      this.e = var1;
      this.a = var2;
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.c = var6;
      this.i = 0;
      this.m = var7;
      if (var7 >= 0) {
         this.k = 4;
      }

      this.n = var8;
      if (var8 >= 0) {
         this.k = 3;
      }

      this.d = var9;
      this.j = var1 >= 0 ? 0 : 1;
      this.a = 0;
      this.d = false;
      this.e = false;
      this.a = false;
      this.b = false;
   }

   public final int a() {
      return this.e;
   }

   public final String a() {
      return this.a;
   }

   public final int b() {
      return this.k;
   }

   public final int c() {
      return this.h;
   }

   public final int d() {
      return this.g;
   }

   public final int e() {
      return this.f;
   }

   public final boolean a() {
      return this.c;
   }

   public final int f() {
      return this.i;
   }

   public final void a(int var1) {
      this.i = var1;
   }

   public final boolean b() {
      return this.j == 0;
   }

   public final boolean c() {
      return this.j == 1;
   }

   public final void a(byte[] var1) {
      this.a = var1;
   }

   public final byte[] a() {
      return this.a;
   }

   public final void b(int var1) {
      this.k = var1;
   }

   public final void a(cl var1) {
      this.a = var1;
   }

   public final cl a() {
      return this.a;
   }

   public final boolean d() {
      return this.i > 0;
   }

   public final int g() {
      return this.m;
   }

   public final int h() {
      return this.n;
   }

   public final void c(int var1) {
      this.l = var1;
   }

   public final int i() {
      return this.l;
   }

   public final int j() {
      return this.a;
   }

   public final String a(int var1) {
      return this.b;
   }

   public final String[] a() {
      String[] var1;
      (var1 = new String[1 + this.a])[0] = this.a;
      if (this.a > 0) {
         var1[1] = this.b;
      }

      if (this.a > 1) {
         var1[2] = this.c;
      }

      return var1;
   }

   public final String b() {
      return this.e;
   }

   public final void a(String var1) {
      this.e = var1;
   }

   public final int k() {
      return this.b;
   }

   public final int l() {
      return this.c;
   }

   public final int m() {
      return this.d;
   }

   public final void a(int var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final boolean e() {
      return this.d;
   }

   public final void a(boolean var1) {
      this.d = var1;
   }

   public final boolean f() {
      return this.e;
   }

   public final void b(boolean var1) {
      this.e = var1;
   }

   public final String c() {
      return this.f;
   }

   public final void b(String var1) {
      this.f = var1.equals("") ? null : var1;
   }

   public final void c(String var1) {
      this.d = var1.equals("") ? null : var1;
   }
}
