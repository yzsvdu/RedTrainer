/*  1 */ package f;public final class d50 extends UA { public final void Vt(String[] paramArrayOfString) { if (paramArrayOfString.length != 2) { String str = "red"; mk.vx
/*  2 */         .r10("timescale 1.0", this); return; }
/*  3 */      if (km.MR == null) { String str = "red";
/*  4 */       mk.vx
/*  5 */         .r10("You need to be in battle in order to use this command.", this); return; }
/*  6 */      try { float f; if ((f = Float.parseFloat(paramArrayOfString[1])) > 0.0F)
/*  7 */       { ((vH)km.wI0.K7)
/*    */           
/*  9 */           .Ge0 = f;
/* 10 */         String str = "green";
/* 11 */         mk.vx
/* 12 */           .r10("Changed timescale to " + f, this); }  return; } catch (NumberFormatException numberFormatException)
/* 13 */     { String str = "red";
/* 14 */       mk.vx
/* 15 */         .r10("Error parsing timescale check your request.", this);
/*    */       return; }
/*    */      }
/*    */ 
/*    */   
/*    */   public d50() {
/*    */     super("timescale");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/d50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */