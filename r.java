import com.mascotcapsule.micro3d.v3.AffineTrans;
import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.Figure;
import com.mascotcapsule.micro3d.v3.FigureLayout;
import com.mascotcapsule.micro3d.v3.Light;
import com.mascotcapsule.micro3d.v3.Texture;

public final class r extends ag {
   private static Effect3D a = new Effect3D((Light)null, 0, true, (Texture)null);
   private static AffineTrans a = new AffineTrans();
   private static int[] a = new int[12];
   private Figure a;
   private FigureLayout a;

   public r(int var1, String var2) {
      this.c = var1;
      this.e = 0;

      try {
         this.a = new Figure(var2 + ".mbac");
      } catch (Exception var3) {
         this.a = null;
      }

      this.a = null;
   }

   private r(r var1) {
      this.e = 0;
      this.a = var1.a;
      this.a = var1.a;
      this.c = var1.c;
      this.a = null;
      this.a = var1.a;
   }

   public final ah a() {
      return new r(this);
   }

   public final void a(ap var1, af var2) {
      if (this.a) {
         this.a = var1.c.a(this.a);
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
      a.m03 = a.m13 = a.m23 = 0;
      this.a.setAffineTrans(a);
      cg.a.renderFigure(this.a, 0, 0, this.a, a);
   }

   public final void a(aq var1) {
      cj var2;
      this.a.setTexture((var2 = (cj)var1).a);
   }

   public final void a() {
      if (this.a != null) {
         this.a.dispose();
      }

      this.a = null;
   }
}
