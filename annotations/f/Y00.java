/* 1 */ package f;public final class Y00 extends mo { public Y00() {} public Y00(wl0 paramwl0) { super(paramwl0); } public final void G60(zp paramzp) { int i = ((Texture)paramzp).getTextureObjectHandle(); UB0.re0.glFramebufferTexture2D(36160, 36064, 3553, i, 0); } public Y00(Uc paramUc, int paramInt1, int paramInt2, boolean paramBoolean) { this(paramUc, paramInt1, paramInt2, paramBoolean, false); } public Y00(Uc paramUc, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) { f50 f50; this(paramInt1, paramInt2); (new f50()).Nf0(paramUc); if (paramBoolean1) f50.Wq0();  if (paramBoolean2) f50.nC0();  this.E80 = f50; NF(); } public final void bc(zp paramzp) { ((Texture)paramzp).dispose(); } public final Texture a40(s9 params9) { int i = this.E80.rS, j = this.E80.Z, k = params9.Xe, m = params9.td, n = params9.bt; this(i, j, 0, k, m, n); k00 k00; (new Texture(k00)).setFilter(cu0.IE, cu0.IE); (new Texture(k00)).setWrap(A00.IB0, A00.IB0); return new Texture(k00); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Y00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */