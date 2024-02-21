import javax.microedition.lcdui.Image;

public final class ce {
   private ca a;
   public h a;
   public ch a;
   public v a;
   private cl a;
   public boolean a;
   public String a;
   private String b;
   public int a = -1;
   public int b = 0;
   public int c = -1;
   public Image a;
   private boolean b;
   public int d;
   public bp a;

   public ce(ce var1) {
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.a = var1.a;
      this.b = var1.b;
      this.d = var1.d;
      this.a = var1.a;
   }

   public ce(h var1) {
      this.a = var1;
      this.a = true;
   }

   public ce(ch var1) {
      this.a = var1;
      this.a = true;
   }

   public ce(v var1) {
      this.a = var1;
      this.a = true;
   }

   public ce(bp var1) {
      this.a = var1;
      this.a = true;
   }

   public ce(String var1, boolean var2, int var3) {
      this.a = var1;
      this.b = true;
      this.c = var3;
      this.a = var2;
   }

   public ce(String var1) {
      this.a = var1;
      this.a = false;
   }

   public ce(String var1, int var2) {
      this.a = var1;
      this.c = var2;
      this.a = false;
   }

   public ce(int var1) {
      this.a = var1;
      this.a = true;
   }

   public ce(int var1, int var2) {
      this.b = var1;
      this.a = var2;
      this.a = true;
   }

   public final boolean a() {
      return this.a != null;
   }

   public final boolean b() {
      return this.a != null;
   }

   private boolean j() {
      return this.a != null;
   }

   public final boolean c() {
      return !this.a && this.a != null && !this.b;
   }

   public final boolean d() {
      return this.a >= 0;
   }

   public final boolean e() {
      return this.b;
   }

   public final boolean f() {
      return this.b && this.c == 0;
   }

   public final boolean g() {
      return this.b && this.c == 1;
   }

   public final boolean h() {
      return this.a != null;
   }

   public final boolean i() {
      return this.a != null;
   }

   public final int a() {
      if (this.a()) {
         return this.a.c();
      } else if (this.b()) {
         return this.a.e();
      } else {
         return this.j() ? this.a.e() : 0;
      }
   }

   public final int b() {
      if (this.a()) {
         return this.a.b();
      } else if (this.b()) {
         return this.a.a();
      } else if (this.j()) {
         return this.a.a();
      } else if (this.h()) {
         return this.a.a;
      } else {
         return this.i() ? this.a.c : 999999;
      }
   }
}
