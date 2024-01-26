/* 1 */ package f;public abstract class U90 extends eD0 { public final ArrayList gs; public final U90 ee0(U90 paramU90) { if (paramU90 == null) return this;  Ip ip = this.nL0; if (paramU90.nL0 == ip) { if (!paramU90.r20) { paramU90
/* 2 */           .r20 = true; G90(paramU90); return this; }
/* 3 */        throw new IllegalArgumentException("Group already added to another group"); }  throw new IllegalArgumentException("Can't add group from different layout"); }
/* 4 */   public boolean r20; public U90(Ip paramIp) { ArrayList arrayList; this(); this.gs = this; } public final U90 cOM8(U90... paramVarArgs) { int i = paramVarArgs.length; for (byte b = 0; b < i; b++) ee0(paramVarArgs[b]);  return this; } public final U90 Ya(JG0 paramJG0) { if (paramJG0 == null) return this;  Ip ip; if (paramJG0.fr0 != (ip = this.nL0)) ip.si(paramJG0, ip.Ub());  Ft ft;
/* 5 */     if ((ft = (Ft)this.nL0.cK0.get(paramJG0)) != null) { G90(ft); return this; }  throw new IllegalStateException("WidgetSpring for Widget not found: " + paramJG0); }
/*   */ 
/*   */   
/*   */   public final U90 lW(et paramet, JG0 paramJG0) {
/*   */     if (paramJG0 == null)
/*   */       return this; 
/*   */     Ya(paramJG0);
/*   */     this.nL0.hJ0(paramet, paramJG0);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final U90 Mg(JG0... paramVarArgs) {
/*   */     int i = paramVarArgs.length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       Ya(paramVarArgs[b]); 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final U90 tA(int paramInt1, int paramInt2, int paramInt3) {
/*   */     G90(new rb(this.nL0, paramInt1, paramInt2, paramInt3, false));
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final U90 Aq(int paramInt) {
/*   */     if (paramInt < 1)
/*   */       return this; 
/*   */     G90(new rb(this.nL0, paramInt, paramInt, paramInt, false));
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final U90 l9(int paramInt) {
/*   */     G90(new rb(this.nL0, paramInt, paramInt, 32767, false));
/*   */     return this;
/*   */   }
/*   */   
/*   */   public U90 Em0() {
/*   */     G90(new rb(this.nL0, 0, 0, 32767, false));
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void t90() {
/*   */     int i = this.gs.size();
/*   */     while (i-- > 0) {
/*   */       eD0 eD01;
/*   */       if (eD01 = this.gs.get(i) instanceof rb) {
/*   */         if (((rb)eD01).Bm0)
/*   */           this.gs.remove(i); 
/*   */         continue;
/*   */       } 
/*   */       if (eD01 instanceof U90)
/*   */         ((U90)eD01).t90(); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public void fA0() {
/*   */     for (byte b = 0; b < this.gs.size(); b++) {
/*   */       eD0 eD01;
/*   */       if (eD01 = this.gs.get(b) instanceof U90)
/*   */         ((U90)eD01).fA0(); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Hb() {
/*   */     bk();
/*   */     this.gs.clear();
/*   */     Ip ip;
/*   */     U90 u902;
/*   */     if ((u902 = (ip = this.nL0).Xz0) != null)
/*   */       u902.UI(); 
/*   */     U90 u901;
/*   */     if ((u901 = ip.o30) != null)
/*   */       u901.UI(); 
/*   */     this.nL0.aH();
/*   */   }
/*   */   
/*   */   public final void G90(eD0 parameD0) {
/*   */     this.gs.add(parameD0);
/*   */     this.nL0.aH();
/*   */   }
/*   */   
/*   */   public final void UI() {
/*   */     int i = this.gs.size();
/*   */     while (i-- > 0) {
/*   */       eD0 eD01;
/*   */       if (eD01 = this.gs.get(i) instanceof Ft) {
/*   */         if (!this.nL0.cK0.containsKey(((Ft)eD01).DG0))
/*   */           this.gs.remove(i); 
/*   */         continue;
/*   */       } 
/*   */       if (eD01 instanceof U90)
/*   */         ((U90)eD01).UI(); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void bk() {
/*   */     int i = this.gs.size();
/*   */     while (i-- > 0) {
/*   */       eD0 eD01;
/*   */       if (eD01 = this.gs.get(i) instanceof Ft) {
/*   */         this.nL0.jB((Ft)eD01);
/*   */         continue;
/*   */       } 
/*   */       if (eD01 instanceof U90)
/*   */         ((U90)eD01).bk(); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/U90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */