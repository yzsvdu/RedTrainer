/* 1 */ package com.badlogic.gdx.graphics;public class Texture extends zp { private static sz0 assetManager; public static final Map managedTextures = new HashMap<>(); public Bu0 data; public Texture(String paramString) { this((RD0)UB0.vj0.aP(paramString)); } public Texture(RD0 paramRD0) { this(paramRD0, (Uc)null, false); } public Texture(RD0 paramRD0, boolean paramBoolean) { this(paramRD0, (Uc)null, paramBoolean); } public Texture(RD0 paramRD0, Uc paramUc, boolean paramBoolean) { this(W7.xi(paramRD0, paramUc, paramBoolean)); } public static void invalidateAllTextures(x paramx) { byte b; fQ fQ; if ((fQ = (fQ)managedTextures.get(paramx)) == null) return;  sz0 sz01; if ((sz01 = assetManager) == null) { for (b = 0; b < fQ.Z8; ) { ((Texture)fQ.get(b)).reload(); b++; }  } else { fQ fQ1; b.B9(); this(fQ); for (Hc0 hc0 = (new fQ()).r30(); hc0.hasNext(); ) { Texture texture = (Texture)hc0.next(); String str; if ((str = assetManager.kF((iq0)texture)) == null) { texture.reload(); continue; }  int j = assetManager.Na0(str); assetManager.vf0(0, str); texture.glHandle = 0; this(); kd0.h30 = texture.getTextureData(); kd0.Ok0 = texture.getMinFilter(); kd0.Xd0 = texture.getMagFilter(); kd0.f9 = texture.getUWrap(); kd0.UC = texture.getVWrap(); kd0.ER = texture.data.wm0(); kd0 kd0; (kd0 = new kd0()).mJ = texture; ((wP)new kd0()).loadedCallback = (Fs0)new YH(j); assetManager.zu(str); texture.glHandle = UB0.go.glGenTexture(); assetManager.ks0(str, Texture.class, (wP)kd0); }  fQ.clear(); Object[] arrayOfObject = fQ1.Uq0; int i = fQ1.Z8; fQ.tu0(arrayOfObject, 0, i); }  } public Texture(ZH paramZH) { this(paramZH, null, false, false); AB aB; this((Bu0)this); } public Texture(ZH paramZH, boolean paramBoolean) { this(paramZH, null, paramBoolean, false); AB aB; this((Bu0)this); } public Texture(ZH paramZH, Uc paramUc, boolean paramBoolean) { this(paramZH, paramUc, paramBoolean, false); AB aB; this((Bu0)this); } public Texture(int paramInt1, int paramInt2, Uc paramUc) { this(paramInt1, paramInt2, paramUc); AB aB; ZH zH; this(zH, null, false, true); this((Bu0)this); } public Texture(Bu0 paramBu0) { this(3553, UB0.go.glGenTexture(), paramBu0); } public Texture(int paramInt1, int paramInt2, Bu0 paramBu0) { super(paramInt1, paramInt2); load(paramBu0); if (paramBu0.k50()) addManagedTexture((x)UB0.Kg0, this);  } private static void addManagedTexture(x paramx, Texture paramTexture) { Map<?, fQ> map; fQ fQ; if ((fQ = (map = managedTextures).get(paramx)) == null) this();  fQ.Com3(paramTexture); map.put(paramx, fQ); } public static void clearAllTextures(x paramx) { managedTextures.remove(paramx); } public static void setAssetManager(sz0 paramsz0) { assetManager = paramsz0; } public static String getManagedStatus() { this(); StringBuilder stringBuilder; (new StringBuilder()).append("Managed textures/app: { "); Iterator iterator = managedTextures.keySet().iterator(); while (iterator.hasNext()) { stringBuilder.append(((fQ)managedTextures.get((x)iterator.next())).Z8); stringBuilder.append(" "); }  stringBuilder.append("}"); return stringBuilder.toString(); } public static int getNumManagedTextures() { return ((fQ)managedTextures.get(UB0.Kg0)).Z8; } public void load(Bu0 paramBu0) { if (this.data == null || paramBu0.k50() == this.data.k50()) { this.data = paramBu0; if (!paramBu0.aF0()) paramBu0.zr0();  bind(); zp.uploadImageData(3553, paramBu0); cu0 cu0 = this.minFilter; unsafeSetFilter(cu0, this.magFilter, true); A00 a00 = this.uWrap; unsafeSetWrap(a00, this.vWrap, true); unsafeSetAnisotropicFilter(this.anisotropicFilterLevel, true); UB0.go.glBindTexture(this.glTarget, 0); return; }  throw new JU("New data must have the same managed status as the old data"); } public void reload() { if (isManaged()) { this.glHandle = UB0.go.glGenTexture(); load(this.data); return; }  throw new JU("Tried to reload unmanaged Texture"); } public void draw(ZH paramZH, int paramInt1, int paramInt2) { if (!this.data.k50()) { bind(); int i = this.glTarget; boolean bool = false;
/* 2 */       int j = paramZH.Con.ju;
/* 3 */       int k = paramZH.Con.Og0;
/* 4 */       int m = paramZH.qf(), n = paramZH.i5(); ByteBuffer byteBuffer = paramZH.tp0(); UB0.go.glTexSubImage2D(i, bool, paramInt1, paramInt2, j, k, m, n, byteBuffer); return; }  throw new JU("can't draw to a managed texture"); }
/*   */ 
/*   */   
/*   */   public int getWidth() {
/*   */     return this.data.Vb();
/*   */   }
/*   */   
/*   */   public int getHeight() {
/*   */     return this.data.wu0();
/*   */   }
/*   */   
/*   */   public int getDepth() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public Bu0 getTextureData() {
/*   */     return this.data;
/*   */   }
/*   */   
/*   */   public boolean isManaged() {
/*   */     return this.data.k50();
/*   */   }
/*   */   
/*   */   public void dispose() {
/*   */     if (this.glHandle == 0)
/*   */       return; 
/*   */     delete();
/*   */     Map<?, ?> map;
/*   */     if (this.data.k50() && (map = managedTextures).get(UB0.Kg0) != null)
/*   */       ((fQ)map.get(UB0.Kg0)).Ct(this, true); 
/*   */   }
/*   */   
/*   */   public String toString() {
/*   */     Bu0 bu0;
/*   */     return (bu0 = this.data instanceof f.LPt6) ? bu0.toString() : super.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/Texture.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */