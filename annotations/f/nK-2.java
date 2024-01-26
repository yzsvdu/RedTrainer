/* 1 */ package f;public final class nK implements vt0 { public final void destroy() { this.pd0.dispose(); ArrayList arrayList; if ((arrayList = this.uA) != null) { for (Iterator<g30> iterator = arrayList.iterator(); iterator.hasNext();) { if ((cOm1 = (g30 = iterator.next()).MA0) != null) { cOm1
/* 2 */             .dispose(); g30.MA0 = null; g30.RW.dispose(); g30.RW = null; }  }  this
/* 3 */         .uA.clear(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final Texture pd0;
/*   */   public final RD0 Aa0;
/*   */   public final tw Dk0;
/*   */   public final int Jd0;
/*   */   public final int SI0;
/*   */   public ArrayList uA;
/*   */   
/*   */   public nK(tw paramtw, RD0 paramRD0, String paramString) {
/*   */     Texture texture;
/*   */     this.Dk0 = paramtw;
/*   */     this.Aa0 = paramRD0;
/*   */     this(paramRD0);
/*   */     this.pd0 = new Texture();
/*   */     if (!"nearest".equalsIgnoreCase(paramString))
/*   */       texture.setFilter(cu0.IE, cu0.IE); 
/*   */     this.Jd0 = i;
/*   */     int i = texture.getHeight();
/*   */     if ((i = texture.getWidth()) > 0 && i > 0) {
/*   */       texture.getWidth();
/*   */       texture.getHeight();
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("size <= 0");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */