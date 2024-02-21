public final class b implements cu {
   private ah a;
   private ah b;
   private ah c;
   private cc a;
   private cc b;
   private cc c;
   private cc d;
   private cc e;
   private boolean a;
   private cc f;
   private cc g;
   private cp a;
   private boolean b;
   private boolean c;
   private cc h;
   private cc i;
   private cc j;
   private boolean d;
   private int a;
   private int b;
   private boolean e;

   public b(ah var1, ah var2) {
      this(var1, var2, (cc)null);
   }

   private b(ah var1, ah var2, cc var3) {
      this.f = new cc();
      this.g = new cc();
      this.b = false;
      this.h = new cc();
      this.i = new cc();
      this.j = new cc();
      this.a = var1;
      this.c = var2;
      this.a = true;
      this.e = null;
      if (this.a == null) {
         this.a = new cc();
      }

      if (this.b == null) {
         this.b = new cc();
      }

      if (this.c == null) {
         this.c = new cc();
      }

      if (this.d == null) {
         this.d = new cc();
      }

      if (var1 != null && var2 != null) {
         this.a = new cp(var1, var2);

         for(this.b = var1; this.b.a() != null; this.b = this.b.a()) {
         }

         Object var4;
         for(var4 = var2; ((ah)var4).a() != null; var4 = ((ah)var4).a()) {
         }

         if (var4 == this.b) {
            this.b = null;
         }

         this.c = var2 instanceof ap;
         this.g = var2.a().c(var1.a(), new cc());
         this.e = true;
      }
   }

   public final void a(ah var1) {
      this.a = var1;
      if (this.a == null && var1 != null) {
         this.a = new cp(var1, this.c);
      }

      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public final void b(ah var1) {
      this.c = null;
      if (this.a != null) {
         this.a.b((ah)null);
      }

      this.c = null instanceof ap;
   }

   public final ah a() {
      return this.c;
   }

   public final void a(cc var1) {
      this.c.a(var1);
   }

   public final void a() {
      this.b = true;
      this.c = this.a.b().b(this.g, this.c);
      this.c.b(this.c);
   }

   public final void b() {
      this.b = false;
   }

   public final void c() {
      if (this.e) {
         this.e = false;
         if (this.a) {
            if (this.b) {
               this.a.c();
               return;
            }

            if (this.a != null) {
               this.i.a(this.d);
               this.h.a(this.a);
               this.j.a(this.b);
               this.a = this.a.e();
               this.a.a();
               this.b = this.a.b().b(this.g, this.b);
               cc var10000 = this.c;
               var10000.a -= this.c.a - this.b.a >> 3;
               var10000 = this.c;
               var10000.b -= this.c.b - this.b.b >> 3;
               var10000 = this.c;
               var10000.c -= this.c.c - this.b.c >> 3;
               this.b = this.a.b().b(this.f, this.b);
               var10000 = this.b;
               var10000.a -= this.c.a;
               var10000 = this.b;
               var10000.b -= this.c.b;
               var10000 = this.b;
               var10000.c -= this.c.c;
               if (this.c) {
                  this.b.a = -this.b.a;
                  this.b.b = -this.b.b;
                  this.b.c = -this.b.c;
               }

               this.b.a();
               this.d = this.a.a(this.b, this.d);
               this.a = this.b.a(this.d, this.a);
               this.d.a();
               this.c.a(this.d, this.a, this.b);
               if (this.d) {
                  if (this.a > 1000) {
                     this.d = false;
                  }

                  int var1 = g.b(1, (int)((float)(this.b >> 1) * ((float)(1000 - this.a) / 1000.0F)));
                  var10000 = this.c;
                  var10000.a += -var1 + at.a.nextInt(var1 << 1);
                  var10000 = this.c;
                  var10000.b += -var1 + at.a.nextInt(var1 << 1);
                  var10000 = this.c;
                  var10000.c += -var1 + at.a.nextInt(var1 << 1);
               }

               this.c.b(this.c);
            }
         }

      }
   }

   public final void a(int var1) {
      this.b = var1;
      this.a += var1;
      this.e = true;
   }

   public final void d() {
      if (!this.d) {
         this.d = true;
         this.a = 0;
      }

   }

   public final boolean a() {
      return this.a;
   }

   public final void a(boolean var1) {
      this.a = var1;
      this.a.a(var1);
   }

   public final void b(cc var1) {
      this.c.a(var1);
   }

   public final void c(cc var1) {
      this.f.a(var1);
   }

   public final void d(cc var1) {
      this.g.a(var1);
   }
}
