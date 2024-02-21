import com.mascotcapsule.micro3d.v3.FigureLayout;

public final class j extends ap {
   private FigureLayout a;

   public j(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.a == null) {
         this.a = new FigureLayout();
      }

      int var4 = (int)((long)(var1 = (int)(8192L * (long)var2 * (long)g.a(var1 >> 1) / (long)g.b(var1 >> 1))) * (long)this.a / (long)this.d);
      this.a.setPerspective(var2, var3, var4, var1);
      this.a.setCenter(this.a >> 1, this.d >> 1);
   }

   public final FigureLayout a() {
      return this.a;
   }
}
