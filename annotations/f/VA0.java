/* 1 */ package f;public abstract class VA0 { public static boolean Rz(JG0 paramJG0) { if (paramJG0 instanceof AD0 || paramJG0 instanceof M60 || paramJG0 instanceof h70)
/* 2 */       return true;  if ((paramJG0 = paramJG0.fr0) == null) return false;  return Rz(paramJG0); }
/*   */ 
/*   */   
/*   */   public static CopyOnWriteArrayList Ga = new CopyOnWriteArrayList();
/*   */   public static JG0 q10 = null;
/*   */   
/*   */   public static boolean c90(JG0 paramJG0) {
/*   */     if (paramJG0 == null)
/*   */       return false; 
/*   */     if (Ga.contains(paramJG0)) {
/*   */       paramJG0.BA();
/*   */       return true;
/*   */     } 
/*   */     if (!Rz(q10 = paramJG0)) {
/*   */       Iterator<JG0> iterator = Ga.iterator();
/*   */       while (iterator.hasNext()) {
/*   */         JG0 jG0;
/*   */         if ((jG0 = iterator.next()).p3() && !paramJG0.Ji0(jG0)) {
/*   */           if (Bz.mr0)
/*   */             System.out.println("ignore list focus " + paramJG0); 
/*   */           return false;
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     paramJG0.BA();
/*   */     return true;
/*   */   }
/*   */   
/*   */   public static void ae0(JG0 paramJG0) {
/*   */     Ga.add(paramJG0);
/*   */   }
/*   */   
/*   */   public static void nR(JG0 paramJG0, boolean paramBoolean) {
/*   */     if (paramJG0 == null)
/*   */       return; 
/*   */     Ga.remove(paramJG0);
/*   */     if (paramBoolean) {
/*   */       paramBoolean = false;
/*   */       try {
/*   */         while (paramBoolean < paramJG0.Ub()) {
/*   */           nR(paramJG0.lPt3(paramBoolean), true);
/*   */           paramBoolean++;
/*   */         } 
/*   */       } catch (Exception exception) {
/*   */         null.printStackTrace();
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */