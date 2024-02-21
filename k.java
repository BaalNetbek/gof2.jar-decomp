import com.mascotcapsule.micro3d.v3.AffineTrans;
import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.FigureLayout;
import com.mascotcapsule.micro3d.v3.Light;
import com.mascotcapsule.micro3d.v3.Texture;

public final class k extends ag {
   private FigureLayout a;
   private static Effect3D a = new Effect3D((Light)null, 0, true, (Texture)null);
   private static AffineTrans a = new AffineTrans();
   private static int[] a = new int[12];
   private Texture a;
   private int[] b;
   private int[] c;
   private static int[] d = new int[1];
   private int d;
   private int f;

   public k(int var1, int var2, byte var3) {
      this.c = var1;
      this.d = var2;
      this.b = new int[var2 * 12];
      this.c = new int[var2 * 8];
      switch(var3) {
      case 0:
         this.f = 0;
         return;
      case 1:
         this.f = 0;
         return;
      case 2:
         this.f = 64;
         return;
      case 3:
         this.f = 96;
      default:
      }
   }

   private k(k var1) {
      this.c = var1.c;
      this.d = var1.d;
      this.b = new int[12 * this.d];
      this.c = new int[8 * this.d];
      System.arraycopy(var1.b, 0, this.b, 0, var1.b.length);
      System.arraycopy(var1.c, 0, this.c, 0, var1.c.length);
      this.a = var1.a;
      this.a = var1.a;
      this.e = var1.e;
      this.a = var1.a;
      this.c.a(var1.c);
   }

   public final ah a() {
      return new k(this);
   }

   public final void a() {
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
      cg.a.renderPrimitives(this.a, 0, 0, this.a, a, 67121152 | this.f, this.d, this.b, d, this.c, d);
   }

   public final void a(aq var1) {
      cj var2;
      this.a = (var2 = (cj)var1).a[0];
   }

   public final void a(int[] var1, int[] var2) {
      this.b = var1;
      this.c = var2;
      this.e = 0;

      for(int var3 = 0; var3 < this.b.length; var3 += 3) {
         int var4 = this.b[var3] * this.b[var3] + this.b[var3 + 1] * this.b[var3 + 1] + this.b[var3 + 2] * this.b[var3 + 2];
         if (this.e < var4) {
            this.e = var4;
         }
      }

      this.e = g.a((long)this.e);
   }
}
