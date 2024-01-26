/*  1 */ package f;public final class Vu implements Runnable { public final void run() { Wx wx; A60 a60; nt nt; if ((wx = this.zr0).GE0 && (
/*    */ 
/*    */       
/*  4 */       nt = (nt)(a60 = wx.kw0.Wa0).my.c90(a60.go)) != null && nt
/*  5 */       .D8 != null) {
/*  6 */       String str = nt.sG; ArrayList<?> arrayList;
/*  7 */       for (Iterator<?> iterator = (arrayList = cl0.kt0()).iterator(); iterator.hasNext();) { if ((nt1 = (nt)iterator.next())
/*  8 */           .sG
/*  9 */           .equals(str)) { arrayList.remove(nt1); cl0.KK(arrayList); break; }  }  this
/* 10 */         .zr0.Df();
/*    */     }  }
/*    */ 
/*    */   
/*    */   public Vu(Wx paramWx) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */