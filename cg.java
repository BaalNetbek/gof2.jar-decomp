import com.mascotcapsule.micro3d.v3.Graphics3D;
import javax.microedition.lcdui.Graphics;

public final class cg extends s {
   public static Graphics3D a;

   public cg() {
      a = new Graphics3D();
   }

   public final void a(Graphics var1) {
      try {
         a.bind(var1);
      } catch (Exception var2) {
         a.release(var1);
      }
   }

   public final void a() {
      try {
         a.flush();
      } catch (Exception var1) {
      }
   }

   public final void b(Graphics var1) {
      try {
         a.release(var1);
      } catch (Exception var2) {
      }
   }
}
