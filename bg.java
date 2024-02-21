import com.mascotcapsule.micro3d.v3.ActionTable;
import com.mascotcapsule.micro3d.v3.AffineTrans;
import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.Figure;
import com.mascotcapsule.micro3d.v3.FigureLayout;
import com.mascotcapsule.micro3d.v3.Light;
import com.mascotcapsule.micro3d.v3.Texture;
import com.mascotcapsule.micro3d.v3.Vector3D;
import java.io.IOException;

public final class bg extends ag {
   public static Texture a;
   public static Light a = new Light(new Vector3D(1134, 3929, 0), 4096, 1700);
   public static Effect3D a = null;
   public Effect3D b = null;
   private static AffineTrans a = new AffineTrans();
   private static int[] a = new int[12];
   private Figure a;
   private ActionTable a;
   private int d;
   private int f;
   private int g;
   private int h;
   private long a;
   private boolean d;
   private byte a;
   private FigureLayout a;

   public bg(int var1, String var2, int var3) {
      if (a == null) {
         try {
            a = new Texture("/data/textures/spec.bmp", false);
            a = new Effect3D(a, 0, true, a);
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

      this.c = var1;
      this.e = var3;

      try {
         this.a = new Figure(var2 + ".mbac");
      } catch (Exception var6) {
         this.a = null;
      }

      try {
         this.a = new ActionTable(var2 + ".mtra");
         this.d = true;
         this.a = 2;
         this.d = this.a.getNumFrames(0) >> 16;
         this.f = this.h = 0;
         this.g = this.d;
         this.a = -1L;
      } catch (Exception var5) {
         this.a = null;
         this.d = false;
      }

      this.a = null;
   }

   public final void a(String var1) {
      try {
         this.a = new ActionTable(var1);
         this.d = true;
         this.a = 2;
         this.d = this.a.getNumFrames(0) >> 16;
         this.f = this.h = 0;
         this.g = this.d;
         this.a = -1L;
      } catch (Exception var2) {
         this.a = null;
         this.d = false;
      }
   }

   private bg(bg var1) {
      this.e = var1.e;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = null;
      this.d = var1.d;
      this.a = var1.a;
      this.d = var1.d;
      this.f = var1.f;
      this.g = var1.g;
      this.a = var1.a;
      this.c = var1.c;
   }

   public final ah a() {
      return new bg(this);
   }

   public final void a(ap var1, af var2) {
      if (this.a && var1.a(this.a) != 0) {
         this.a = var1.c.a(this.a);
         this.a.b(this.c);
         var2.a(this.a, this);
         this.a = ((j)var1).a();
      }

   }

   public final void b(ap var1, af var2) {
      if (this.a) {
         this.a = var1.c.a(this.a);
         this.a.b(this.c);
         var2.a(this.a, this);
         this.a = ((j)var1).a();
      }

   }

   public final void b() {
      this.a.a(a);
      a.set(a);
      this.a.setAffineTrans(a);
      if (this.a != null) {
         if (this.a == 3) {
            this.a.setPosture(this.a, 0, this.g - this.h << 16);
         } else {
            this.a.setPosture(this.a, 0, this.h << 16);
         }
      }

      cg.a.renderFigure(this.a, 0, 0, this.a, this.b == null ? a : this.b);
   }

   public final void a(long var1) {
      if (this.d) {
         if (this.a == -1L) {
            this.a = var1;
         }

         this.h = this.f + (int)((var1 - this.a) / (long)this.b);
         if (this.h > this.g) {
            if (this.a == 2) {
               this.h = this.f;
               this.a = var1 - (long)((this.h - this.f) * this.b);
               return;
            }

            this.d = false;
            this.h = this.g;
            this.a = -1L;
         }
      }

   }

   public final void f(int var1) {
      this.b = var1 > 0 ? var1 : 1;
   }

   public final int i() {
      return this.h;
   }

   public final void a(int var1, int var2) {
      this.f = var1 >= 0 && var1 <= this.d ? var1 : 0;
      this.g = var2 >= 0 && var2 <= this.d ? var2 : this.d;
      this.h = this.h < var1 ? var1 : (this.h > var2 ? var2 : this.h);
      this.a = -1L;
   }

   public final void a(byte var1) {
      this.a = var1;
      this.a = -1L;
      this.d = this.d > 0;
   }

   public final void e() {
      this.d = false;
   }

   public final boolean b() {
      return this.d;
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

   static {
      new cm();
      new cm();
   }
}
