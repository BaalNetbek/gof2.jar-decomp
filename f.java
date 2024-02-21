import com.mascotcapsule.micro3d.v3.Vector3D;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class f {
   private final int[] a = new int[]{-4616, -10639, -13667, -2949, -17362, 7030, -398, -7882, 15401, 7177, 3255, -16472, 12676, 6461, -10634, -10046, 12526, -7558, -10697, -13537, -5158, 18625, 4517, -684, -10685, -11195, 8126, 5693, -4063, 16472, 3209, 11007, 13435, 9044, -11172, 10999, 1211, -19330, 1470, -9770, 4503, 16022, -7591, 6356, -16362, 5962, 16281, -9492, 11976, -9221, -8374, 11035, 9992, 9033, -16959, -5712, -3570, -12936, 12109, 3078};
   private final int[] b = new int[]{5, 1, 2, 3, 0, 2, 4, 5, 4, 4, 1, 5, 2, 3, 2, 3, 2, 2, 2, 5};
   private ag[] a;
   private aj a = new aj();
   private cc a;
   private cv a;
   private Sprite a;
   private Sprite b;
   private Image[] a;
   private p[] a;
   private ag[] b;
   private Image[] b;
   private boolean[] a;
   private boolean[] b;
   public static int a;
   private boolean a = bl.a() == null;

   public f() {
      Object var1 = null;
      Image var2;
      int var4;
      int var13;
      if (!this.a) {
         int[] var8 = bl.a().a();
         this.a = new ag[var8.length + 1];
         this.a = new p[var8.length];
         var2 = ai.a("/data/interface/planet_" + bl.a().c() + ".png", true);
         this.b = new Sprite(var2);
         this.b.defineReferencePixel(this.b.getWidth() / 2, this.b.getHeight() / 2);
         at.a.setSeed((long)(bl.a().b() * 300));
         boolean[] var10 = new boolean[24];
         int var3 = 0;
         var4 = 0;
         boolean var5 = false;

         for(var13 = 0; var13 < this.a.length; ++var13) {
            this.a[var13] = bo.a(6781);
            this.a[var13].a(1);
            if (var13 == 0) {
               this.a[var13].a((byte)1);
               this.a[var13].f(64, 64, 64);
               var4 = var3 = at.a.nextInt(24);
            } else {
               boolean var6;
               if (var8[var13 - 1] == bl.a().b()) {
                  this.a[var13].a(false);
                  var6 = false;
                  int var7;
                  if ((var7 = bl.a().c()) != 17 && var7 != 18) {
                     while(true) {
                        if (var6) {
                           if (g.e(var3 - var4) < 12) {
                              this.b.setTransform(2);
                           }
                           break;
                        }

                        var6 = g.e((var3 = at.a.nextInt(24)) - var4) > 3 && !var10[var3];
                     }
                  } else {
                     var3 = var4;
                  }

                  a = var13;
               } else {
                  this.a[var13 - 1] = new u(0, this.a[var13], 0, 0, 0);
                  this.a[var13].a(false);

                  for(var6 = false; !var6; var6 = g.e((var3 = 7 + at.a.nextInt(11)) - var4) > 2 && !var10[var3]) {
                  }
               }
            }

            var10[var3] = true;
            if (var3 == var4 && var13 != 0) {
               this.a[var13].e(0, var3 * 170 + 128, 0);
            } else if (var13 > 0 && var8[var13 - 1] == bl.a().b()) {
               this.a[var13].e(0, var3 * 170, 0);
            } else {
               this.a[var13].e(-128 + at.a.nextInt(256), var3 * 170, 0);
            }

            this.a[var13].b(-20000);
            this.a[var13].b(true);
            this.a[var13].a(1L);
            this.a.a(this.a[var13]);
         }

         if ((var13 = at.a.nextInt(8)) > 0) {
            this.b = new ag[var13];
            this.a = new boolean[8];
            this.b = new boolean[this.a.length / 3];
            this.b = new Image[this.b.length];

            for(int var14 = 0; var14 < this.b.length; ++var14) {
               this.b[var14] = bo.a(6781);
               this.b[var14].a(1);
               this.b[var14].a(false);
               boolean var15 = false;
               int var9 = 0;

               while(!var15) {
                  var9 = at.a.nextInt(this.a.length / 3);
                  if (var15 = !this.b[var9]) {
                     this.b[var9] = true;
                  }
               }

               this.b[var14].c(this.a[var9], this.a[var9 + 1], this.a[var9 + 2]);
               var15 = false;
               var9 = 0;

               while(!var15) {
                  var9 = at.a.nextInt(8);
                  if (var15 = !this.a[var9]) {
                     this.a[var9] = true;
                  }
               }

               this.b[var14] = ai.a("/data/interface/nebula" + var9 + ".png", true);
               this.a.a(this.b[var14]);
            }
         }
      }

      at.a.setSeed(System.currentTimeMillis());
      this.a = new cc();
      this.a = new cv();
      var2 = ai.a("/data/interface/sun_" + (this.a ? 0 : bl.a().g()) + ".png", true);
      this.a = new Sprite(var2);
      this.a.defineReferencePixel(this.a.getWidth(), this.a.getHeight());
      if (!this.a) {
         Image[] var11 = new Image[6];
         int[] var12 = bl.a();
         this.a = new Image[var12.length];

         for(var4 = 0; var4 < var12.length; ++var4) {
            var13 = this.b[var12[var4]];
            if (var11[var13] == null) {
               var11[var13] = ai.a("/data/interface/star_" + var13 + ".png", true);
            }

            this.a[var4] = var11[var13];
         }
      }

   }

   public final ag[] a() {
      return this.a;
   }

   public final p[] a() {
      return this.a;
   }

   public final void a() {
      if (this.a) {
         this.a.a = 0;
         this.a.b = 0;
         this.a.c = -4096;
      } else {
         this.a = this.a[0].d(this.a);
      }

      this.a.a = -this.a.a;
      this.a.b = -this.a.b;
      this.a.c = -this.a.c;
      this.a.a();
      this.a = at.a.a().b().g(this.a);
      this.a.a = -this.a.a;
      bg.a.setDirection(new Vector3D(this.a.a, this.a.b, this.a.c));
      this.a = at.a.a().b(this.a);
      this.a.b(this.a);
      this.a.b(true);
      if (this.a) {
         this.a.a = 0;
         this.a.b = 0;
         this.a.c = 20000;
      } else {
         this.a = this.a[0].b(this.a);
      }

      this.a.c(at.a.a().b());
      this.a.a();
      cc var1;
      (var1 = new cc(at.a.a().d())).a();
      this.a.c(var1);
      float var2 = (float)this.a.a() / 8192.0F;
      db.g = 0;
      db.h = 0;
      db.i = 0;
      db.g = g.b(db.d, (int)(db.a * var2));
      db.h = g.b(db.e, (int)(db.b * var2));
      db.i = g.b(db.f, (int)(db.c * var2));
   }

   public final void b() {
      this.a.b(at.a.a().b(this.a));
      this.a.b(true);
      int var1;
      if (this.b != null) {
         for(var1 = 0; var1 < this.b.length; ++var1) {
            at.a.a().a(this.b[var1].b(this.a));
            if (this.a.c < 0) {
               at.a.drawImage(this.b[var1], this.a.a, this.a.b, 3);
            }
         }
      }

      for(var1 = 0; var1 < (this.a ? 1 : this.a.length); ++var1) {
         if (this.a) {
            this.a.a = 0;
            this.a.b = 0;
            this.a.c = 0;
            at.a.a().a(this.a);
         } else {
            at.a.a().a(this.a[var1].b(this.a));
         }

         if (this.a.c < 0) {
            if (var1 == 0) {
               this.a.setTransform(0);
               this.a.setRefPixelPosition(this.a.a, this.a.b);
               this.a.paint(at.a);
               this.a.setTransform(5);
               this.a.setRefPixelPosition(this.a.a - 1, this.a.b);
               this.a.paint(at.a);
               this.a.setTransform(3);
               this.a.setRefPixelPosition(this.a.a - 1, this.a.b - 1);
               this.a.paint(at.a);
               this.a.setTransform(6);
               this.a.setRefPixelPosition(this.a.a, this.a.b - 1);
               this.a.paint(at.a);
            } else if (var1 == a) {
               this.b.setRefPixelPosition(this.a.a, this.a.b);
               this.b.paint(at.a);
            } else {
               at.a.drawImage(this.a[var1 - 1], this.a.a, this.a.b, 3);
            }
         }
      }

   }

   public final void c() {
      if (this.a) {
         this.a.a = 0;
         this.a.b = 0;
         this.a.c = 0;
         at.a.a().a(this.a);
         this.a.setTransform(0);
         this.a.setRefPixelPosition(this.a.a, this.a.b);
         this.a.paint(at.a);
         this.a.setTransform(5);
         this.a.setRefPixelPosition(this.a.a - 1, this.a.b);
         this.a.paint(at.a);
         this.a.setTransform(3);
         this.a.setRefPixelPosition(this.a.a - 1, this.a.b - 1);
         this.a.paint(at.a);
         this.a.setTransform(6);
         this.a.setRefPixelPosition(this.a.a, this.a.b - 1);
         this.a.paint(at.a);
      } else {
         at.a.a().a(this.a[0].b(this.a));
      }

      this.a.a(this.a);
   }
}
