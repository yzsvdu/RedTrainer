/*   */ package f;
/* 2 */ public final class private extends gT { public final int Z80() { return this.DB0.Fo0.size(); } public private(K6 paramK6) {} public final Object Kx0(int paramInt1, int paramInt2) { switch (paramInt2) { default: return "";case 3: return this.DB0.bn0[paramInt1];
/*   */       case 2:
/* 4 */         return ((Um0)this.DB0.Fo0.get(paramInt1)).Zf.replace("REASON:", "\nREASON:");case 1: (new Date())
/*   */           
/* 6 */           .setTime(((Um0)this.DB0.Fo0.get(paramInt1)).Zb0 * 1000L); return (new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")).format(new Date());
/*   */       case 0:
/* 8 */         break; }  return ((Um0)this.DB0.Fo0.get(paramInt1)).W70; }
/*   */ 
/*   */   
/*   */   public final int ED0() {
/*   */     return 4;
/*   */   }
/*   */   
/*   */   public final String zd(int paramInt) {
/*   */     switch (paramInt) {
/*   */       default:
/*   */         return "";
/*   */       case 3:
/*   */         return "Delete";
/*   */       case 2:
/*   */         return "Note";
/*   */       case 1:
/*   */         return "Date";
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     return "Staff";
/*   */   }
/*   */   
/*   */   public final Object ms(int paramInt1, int paramInt2) {
/*   */     if (paramInt2 != 0) {
/*   */       if (paramInt2 != 2)
/*   */         return ""; 
/*   */       return ((Um0)this.DB0.Fo0.get(paramInt1)).Zf.replace("REASON:", "\nREASON:");
/*   */     } 
/*   */     return ((Um0)this.DB0.Fo0.get(paramInt1)).W70;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/private.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */