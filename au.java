import Main.GOF2MIDlet;

public final class au {
   private as a = null;
   private GOF2MIDlet a;
   private ao a;

   public au(GOF2MIDlet var1, ao var2) {
      this.a = var1;
      this.a = var2;
   }

   public final void a(as var1) {
      if (this.a != null) {
         if (this.a != null) {
            this.a.a(true);
         }

         co.a();
         this.a.a();
      }

      this.a = var1;
   }

   public final as a() {
      return this.a;
   }

   public final void a() {
      this.a.quit();
   }

   public final void a(int var1) {
      if (this.a != null) {
         this.a.b(var1);
      }

   }

   public final void b(int var1) {
      if (this.a != null) {
         if (this.a.a()) {
            this.a.a(var1);
            return;
         }

         this.a.b();
         if (this.a.a() && this.a != null) {
            this.a.b();
         }

         System.gc();
      }

   }
}
