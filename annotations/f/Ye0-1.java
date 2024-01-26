/*  1 */ package f;public final class Ye0 { public static boolean lf0(cx0 paramcx0) { paramcx0.dA = Math.round(paramcx0.dA); paramcx0.zA0 = Math.round(paramcx0.zA0); paramcx0.af = Math.round(paramcx0.af); float f1 = Math.round(paramcx0.sf0); float f2; if ((f2 = paramcx0.af) < 0.0F) { paramcx0.af = f2 = -f2; paramcx0.dA -= f2; }  if (f1 < 0.0F) { paramcx0.sf0 = f1 = -f1; paramcx0.zA0 -= f1; }
/*  2 */      fQ fQ1; int k; if ((k = (fQ1 = qg).Z8) == 0) { if (paramcx0.af < 1.0F || paramcx0.sf0 < 1.0F) return false;  UB0.go.glEnable(3089); } else { cx0 cx01; float f4 = Math.max((cx01 = (cx0)fQ1.get(k - 1)).dA, paramcx0.dA); float f5; if ((f5 = Math.min(((cx0)fQ1.get(k - 1)).dA + cx01.af, paramcx0.dA + paramcx0.af) - f4) < 1.0F) return false;  float f6 = Math.max(cx01.zA0, paramcx0.zA0); float f3; if ((f3 = Math.min(cx01.zA0 + cx01.sf0, paramcx0.zA0 + paramcx0.sf0) - f6) < 1.0F) return false;  paramcx0.dA = f4; paramcx0.zA0 = f6; paramcx0.af = f5; paramcx0.sf0 = Math.max(1.0F, f3); }  qg.Com3(paramcx0); int i = (int)paramcx0.dA, j = (int)paramcx0.zA0; k = (int)paramcx0.af; int m = (int)paramcx0.sf0;
/*  3 */     if (ou0.G90 == nQ.xf0 && (UB0.M60.fG0() != UB0.M60
/*  4 */       .sL || 
/*  5 */       UB0.M60.dL() != UB0.M60
/*  6 */       .kL))
/*    */     
/*    */     { 
/*    */       
/* 10 */       i = (int)((i * UB0.M60.sL) / UB0.M60.fG0());
/*    */ 
/*    */       
/* 13 */       j = (int)((j * UB0.M60.kL) / UB0.M60.dL());
/*    */ 
/*    */       
/* 16 */       k = (int)((k * UB0.M60.sL) / UB0.M60.fG0());
/*    */ 
/*    */       
/* 19 */       m = (int)((m * UB0.M60.kL) / UB0.M60.dL());
/* 20 */       UB0.go.glScissor(i, j, k, m); } else { UB0.go.glScissor(i, j, k, m); }  return true; }
/*    */ 
/*    */   
/*    */   public static fQ qg = new fQ();
/*    */   public static eo WD0 = new eo();
/*    */   
/*    */   public static cx0 Kw0() {
/*    */     cx0 cx0 = (cx0)qg.pop();
/*    */     fQ fQ1;
/*    */     if ((fQ1 = qg).Z8 == 0) {
/*    */       UB0.go.glDisable(3089);
/*    */     } else {
/*    */       int i = (int)((cx0)fQ1.peek()).dA, j = (int)((cx0)fQ1.peek()).zA0, k = (int)((cx0)fQ1.peek()).af, m = (int)((cx0)fQ1.peek()).sf0;
/*    */       if (ou0.G90 == nQ.xf0 && (UB0.M60.fG0() != UB0.M60.sL || UB0.M60.dL() != UB0.M60.kL)) {
/*    */         i = (int)((i * UB0.M60.sL) / UB0.M60.fG0());
/*    */         j = (int)((j * UB0.M60.kL) / UB0.M60.dL());
/*    */         k = (int)((k * UB0.M60.sL) / UB0.M60.fG0());
/*    */         m = (int)((m * UB0.M60.kL) / UB0.M60.dL());
/*    */         UB0.go.glScissor(i, j, k, m);
/*    */       } else {
/*    */         UB0.go.glScissor(i, j, k, m);
/*    */       } 
/*    */     } 
/*    */     return cx0;
/*    */   }
/*    */   
/*    */   public static void V5(ny paramny, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Matrix4 paramMatrix4, cx0 paramcx01, cx0 paramcx02) {
/*    */     float f = paramcx01.dA;
/*    */     WD0.TG0(f, paramcx01.zA0, 0.0F);
/*    */     WD0.eM(paramMatrix4);
/*    */     paramny.jf0(WD0, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */     paramcx02.dA = eo1.x;
/*    */     paramcx02.zA0 = eo1.y;
/*    */     eo eo1;
/*    */     (eo1 = WD0).TG0(paramcx01.dA + paramcx01.af, paramcx01.zA0 + paramcx01.sf0, 0.0F);
/*    */     WD0.eM(paramMatrix4);
/*    */     paramny.jf0(WD0, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */     paramcx02.af = (eo1 = WD0).x - paramcx02.dA;
/*    */     paramcx02.sf0 = eo1.y - paramcx02.zA0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ye0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */