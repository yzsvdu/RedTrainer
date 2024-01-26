/* 1 */ package f;public final class cOm1 implements iq0 { public cOm1(MJ0 paramMJ0, ZH paramZH, int paramInt1, int paramInt2) { this.qR = paramMJ0; Uc uc; if (paramZH.TU() == (uc = Uc.xi0)) { if ((paramZH.WD0() & paramZH.WD0() - 1) == 0) { if ((paramZH.C20() & paramZH.C20() - 1) == 0) { if (paramInt1 >= 0 && paramInt1 < paramZH.WD0()) { if (paramInt2 >= 0 && paramInt2 < paramZH.C20()) { int i = paramZH.WD0(); (this.M7 = new ZH(i, paramZH.C20(), uc)).r1(y1.Zj); this.M7.fL(paramZH, 0, 0); this.p70 = gLFWImage; GLFWImage gLFWImage; (gLFWImage = GLFWImage.malloc()).width(this.M7.WD0()); this.p70.height(this.M7.C20()); this.p70.pixels(this.M7.tp0()); this.vc0 = GLFW.glfwCreateCursor(this.p70, paramInt1, paramInt2); RO.Com3(this); return; }  throw new JU(HB0.DH0("yHotspot coordinate of ", paramInt2, " is not within image height bounds: [0, ")
/* 2 */                 .append(paramZH.C20()).append(").").toString()); }  throw new JU(
/* 3 */               HB0.DH0("xHotspot coordinate of ", paramInt1, " is not within image width bounds: [0, ")
/* 4 */               .append(paramZH.WD0()).append(").").toString()); }  throw new JU(
/* 5 */             B40.df("Cursor image pixmap height of ")
/* 6 */             .append(paramZH.C20()).append(" is not a power-of-two greater than zero.").toString()); }  throw new JU(
/* 7 */           B40.df("Cursor image pixmap width of ")
/* 8 */           .append(paramZH.WD0()).append(" is not a power-of-two greater than zero.").toString()); }  throw new JU("Cursor image pixmap is not in RGBA8888 format."); }
/*   */ 
/*   */   
/*   */   public static final fQ RO = new fQ();
/*   */   public static final HashMap tN = new HashMap<>();
/*   */   public final MJ0 qR;
/*   */   public ZH M7;
/*   */   public GLFWImage p70;
/*   */   public final long vc0;
/*   */   
/*   */   public final void dispose() {
/*   */     if (this.M7 != null) {
/*   */       RO.Ct(this, true);
/*   */       this.M7.dispose();
/*   */       this.M7 = null;
/*   */       this.p70.free();
/*   */       GLFW.glfwDestroyCursor(this.vc0);
/*   */       return;
/*   */     } 
/*   */     throw new JU("Cursor already disposed");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cOm1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */