import com.mascotcapsule.micro3d.v3.Texture;

public final class cj extends aq {
   public Texture[] a;

   public cj(String[] var1) {
      if (var1 != null) {
         try {
            this.a = new Texture[var1.length];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               System.out.println(var1[var2]);
               boolean var3 = var1[var2].indexOf("spec") == -1;
               this.a[var2] = new Texture(var1[var2] + ".bmp", var3);
            }

            return;
         } catch (Exception var4) {
            this.a = null;
         }
      }

   }

   public final void a() {
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].dispose();
            this.a[var1] = null;
         }

         this.a = null;
      }

   }
}
