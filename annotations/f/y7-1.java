/* 1 */ package f;public final class y7 extends x60 { public final void Da0(String[] paramArrayOfString) { boolean bool2, bool1; R8 r8 = km.u4; StringBuilder stringBuilder = B40.df("Playing bgm sounds/");
/*   */     lr lr2;
/* 3 */     if ((lr2 = km.pm0.kR) != null)
/* 4 */     { bool2 = lr2.jA(); } else { bool2 = false; }
/* 5 */      stringBuilder = stringBuilder.append(bool2).append("/"); lr lr1;
/* 6 */     if ((lr1 = km.pm0.kR) != null)
/* 7 */     { bool1 = lr1.LE(); } else { bool1 = false; }
/* 8 */      oD(stringBuilder.append(bool1).toString(), ZY.ih); }
/*   */ 
/*   */   
/*   */   public y7() {
/*   */     super("/bgm");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */