import com.mascotcapsule.micro3d.v3.AffineTrans;
import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.FigureLayout;
import com.mascotcapsule.micro3d.v3.Light;
import com.mascotcapsule.micro3d.v3.Texture;

public final class ac extends ag {
   private FigureLayout a;
   private static Effect3D a = new Effect3D((Light)null, 0, true, (Texture)null);
   private static AffineTrans a = new AffineTrans();
   private static int[] a = new int[12];
   private Texture a;
   private int[] b;
   private int[] c;
   private static int[] d;
   private int d;
   private int[] e;
   private int f;

   public ac(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      this.c = new int[8];
      this.c[0] = this.c[1] = var5;
      this.c[2] = 0;
      this.c[3] = var1;
      this.c[4] = var2;
      this.c[5] = var3;
      this.c[6] = var4;
      this.c[7] = 0;
      this.d = var6;
      this.b = new int[var6 * 3];
      if (d == null) {
         d = new int[1];
      }

      this.a = null;
      this.e = var5 << 1;
      this.e = null;
      switch(var7) {
      case 0:
         this.f = 0;
         return;
      case 1:
         this.f = 16;
         return;
      case 2:
         this.f = 64;
         return;
      case 3:
         this.f = 96;
      default:
      }
   }

   private ac(ac var1) {
      this.c = var1.c;
      this.d = var1.d;
      this.b = new int[3 * this.d];
      System.arraycopy(var1.b, 0, this.b, 0, this.b.length);
      this.a = null;
      this.e = var1.e;
      this.a = var1.a;
      if (var1.e != null) {
         this.e = new int[this.d];
         System.arraycopy(var1.e, 0, this.e, 0, this.e.length);
      }

   }

   public final ah a() {
      return new ac(this);
   }

   public final void a() {
      this.b = null;
      this.c = null;
      this.a = null;
   }

   public final void a(ap var1, af var2) {
      if (this.a) {
         this.a = var1.c.a(this.a);
         this.a.b(this.c);
         var2.a(this.a, this);
         this.a = ((j)var1).a();
      }

   }

   public final void b(ap var1, af var2) {
      this.a(var1, var2);
   }

   public final void b() {
      this.a.a(a);
      a.set(a);
      this.a.setAffineTrans(a);
      if (this.e == null) {
         cg.a.renderPrimitives(this.a, 0, 0, this.a, a, 83886080 | this.f | 4096, this.d, this.b, d, this.c, d);
      } else {
         int var1 = 0;

         for(int var2 = 0; var2 < this.d; var1 += 8) {
            this.c[var1] = this.c[var1 + 1] = this.e[var2];
            ++var2;
         }

         cg.a.renderPrimitives(this.a, 0, 0, this.a, a, 83886080 | this.f | 8192, this.d, this.b, d, this.c, d);
      }
   }

   public final void a(aq var1) {
      cj var2;
      this.a = (var2 = (cj)var1).a[0];
   }

   public final int[] a() {
      return this.b;
   }

   public final int[] b() {
      if (this.e == null) {
         this.e = new int[this.d];

         for(int var1 = 0; var1 < this.e.length; ++var1) {
            this.e[var1] = this.c[0];
         }

         int[] var3 = new int[8 * this.d];

         for(int var2 = 0; var2 < var3.length; var2 += 8) {
            var3[var2] = var3[var2 + 1] = this.c[0];
            var3[var2 + 2] = 0;
            var3[var2 + 3] = this.c[3];
            var3[var2 + 4] = this.c[4];
            var3[var2 + 5] = this.c[5];
            var3[var2 + 6] = this.c[6];
            var3[var2 + 7] = 0;
         }

         this.c = var3;
      }

      return this.e;
   }
}
