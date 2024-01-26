/*  1 */ package f;public final class yq0 extends UA { public final void Vt(String[] paramArrayOfString) { Exception exception; String str = ">reload <ui|commands>"; if (paramArrayOfString.length < 2) { UA.Ue(this); return; }  if (paramArrayOfString[1].equals("ui")) { if ((exception = vC0.Zy()) == null) { UA.Ue("Reloaded UI."); } else { mk.vx
/*  2 */           .r10("Error reloading UI:", "red");
/*    */         
/*  4 */         mk.vx
/*  5 */           .r10(getCause().getMessage(), "red");
/*  6 */         UA.Ue(""); }  } else if (paramArrayOfString[1].equals("commands"))
/*  7 */     { PO.mC0
/*  8 */         .kA0
/*  9 */         .clear(); PO.mC0.ir0();
/* 10 */       UA.Ue("Reloaded commands."); } else { UA.Ue((String)this); }
/*    */      }
/*    */ 
/*    */   
/*    */   public yq0() {
/*    */     super("reload");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */