/*   */ package com.badlogic.gdx.graphics.g3d.particles;
/* 2 */ public class ResourceData implements dB { private f7 uniqueData; private fQ data; public fQ sharedAssets; private int currentLoadIndex; public Object resource; public ResourceData() { f7 f71; fQ fQ1; this(); this.uniqueData = this; this(true, 3, SaveData.class); this.data = this; this(); this.sharedAssets = this; this.currentLoadIndex = 0; } public ResourceData(Object paramObject) { this(); this.resource = paramObject; } public void read(It paramIt, bM0 parambM0) { oc oc; (oc = (this.uniqueData = (f7)COm9.aD0(paramIt, parambM0, "unique", f7.class, null)).sh()).getClass(); for (; oc.hasNext(); ((SaveData)((yO)oc.next()).mm).resources = this);
/* 3 */     bM0 bM02 = parambM0.Jb("data");
/* 4 */     for (Hc0 hc0 = (this.data = (fQ)paramIt.Uj0(fQ.class, SaveData.class, bM02)).r30(); hc0.hasNext(); ((SaveData)hc0.next()).resources = this);
/* 5 */     bM0 bM01 = parambM0.Jb("assets");
/* 6 */     this.sharedAssets.OG0((fQ)paramIt.Uj0(fQ.class, AssetData.class, this));
/* 7 */     bM01 = parambM0.Jb("resource");
/* 8 */     this.resource = paramIt.Uj0(null, null, this); } public int getAssetData(String paramString, Class paramClass) { byte b = 0; Hc0 hc0 = this.sharedAssets.r30(); while (hc0.hasNext()) { AssetData assetData; if ((assetData = (AssetData)hc0.next()).filename.equals(paramString) && assetData.type.equals(paramClass)) return b;  b++; }  return -1; } public fQ getAssetDescriptors() { this(); fQ fQ1; Hc0 hc0 = this.sharedAssets.r30(); while (hc0.hasNext()) { AssetData assetData = (AssetData)hc0.next(); String str = assetData.filename; Com3(new bs(str, assetData.type)); }  return this; } public fQ getAssets() { return this.sharedAssets; } public SaveData createSaveData() { this(this); this.data.Com3(saveData); SaveData saveData; return saveData = new SaveData(); } public SaveData createSaveData(String paramString) { this(this); SaveData saveData; if (!this.uniqueData.GB0(paramString)) { this.uniqueData.X00(paramString, saveData); return saveData; }  throw new RuntimeException("Key already used, data must be unique, use a different key"); } public SaveData getSaveData() { int i; this.currentLoadIndex = (i = this.currentLoadIndex) + 1; return (SaveData)this.data.get(i); } public SaveData getSaveData(String paramString) { return (SaveData)this.uniqueData.pd0(paramString); } public void write(It paramIt) { paramIt.Zg(f7.class, this.uniqueData, "unique"); paramIt.Vp0("data", this.data, fQ.class, SaveData.class); paramIt.Zg(AssetData[].class, this.sharedAssets.Ib(AssetData.class), "assets"); paramIt.Zg(null, this.resource, "resource"); } public static class AssetData implements dB { public String filename; public Class type; public AssetData() {} public AssetData(String param1String, Class param1Class) { this.filename = param1String; this.type = param1Class; } public void write(It param1It) { param1It.Jv0(this.filename, "filename"); param1It.Jv0(this.type.getName(), "type"); } public void read(It param1It, bM0 param1bM0) { String str; this.filename = (String)COm9.aD0(param1It, param1bM0, "filename", String.class, null); bM0 bM01 = param1bM0.Jb("type"); try { this.type = Class.forName(str = (String)param1It.Uj0(String.class, null, this)); return; } catch (ClassNotFoundException classNotFoundException) { throw new BC("Class not found: " + this, classNotFoundException); } catch (BC bC) {} throw new JU(
/* 9 */           m0.tF0("Class not found: ", this), bC); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static class SaveData implements dB {
/*   */     public f7 data;
/*   */     public o0 assets;
/*   */     private int loadIndex;
/*   */     public ResourceData resources;
/*   */     
/*   */     public SaveData() {
/*   */       f7 f71;
/*   */       o0 o01;
/*   */       this();
/*   */       this.data = this;
/*   */       this();
/*   */       this.assets = this;
/*   */       this.loadIndex = 0;
/*   */     }
/*   */     
/*   */     public SaveData(ResourceData param1ResourceData) {
/*   */       f7 f71;
/*   */       o0 o01;
/*   */       this();
/*   */       this.data = this;
/*   */       this();
/*   */       this.assets = this;
/*   */       this.loadIndex = 0;
/*   */       this.resources = param1ResourceData;
/*   */     }
/*   */     
/*   */     public void saveAsset(String param1String, Class param1Class) {
/*   */       int i;
/*   */       if ((i = this.resources.getAssetData(param1String, param1Class)) == -1) {
/*   */         this.resources.sharedAssets.Com3(new ResourceData.AssetData(param1String, param1Class));
/*   */         i = this.resources.sharedAssets.Z8 - 1;
/*   */       } 
/*   */       this.assets.oU(i);
/*   */     }
/*   */     
/*   */     public void save(String param1String, Object param1Object) {
/*   */       this.data.X00(param1String, param1Object);
/*   */     }
/*   */     
/*   */     public bs loadAsset() {
/*   */       int i;
/*   */       o0 o01;
/*   */       if ((i = this.loadIndex) == (o01 = this.assets).mG0)
/*   */         return null; 
/*   */       this.loadIndex = i + 1;
/*   */       ResourceData.AssetData assetData = (ResourceData.AssetData)this.resources.sharedAssets.get(o01.Vl(i));
/*   */       String str = this.filename;
/*   */       return new bs(this, this.type);
/*   */     }
/*   */     
/*   */     public Object load(String param1String) {
/*   */       return this.data.pd0(param1String);
/*   */     }
/*   */     
/*   */     public void write(It param1It) {
/*   */       param1It.Zg(f7.class, this.data, "data");
/*   */       param1It.Zg(int[].class, this.assets.zt(), "indices");
/*   */     }
/*   */     
/*   */     public void read(It param1It, bM0 param1bM0) {
/*   */       this.data = (f7)COm9.aD0(param1It, param1bM0, "data", f7.class, null);
/*   */       bM0 bM01 = param1bM0.Jb("indices");
/*   */       getClass();
/*   */       int arrayOfInt1[], i = (arrayOfInt1 = (int[])param1It.Uj0(int[].class, null, bM01)).length;
/*   */       boolean bool = false;
/*   */       o0 o01;
/*   */       int[] arrayOfInt2 = (o01 = this.assets).Ky;
/*   */       int j;
/*   */       if ((j = this.assets.mG0 + i) > arrayOfInt2.length)
/*   */         arrayOfInt2 = YK0(Math.max(Math.max(8, j), (int)(this.mG0 * 1.75F))); 
/*   */       System.arraycopy(arrayOfInt1, bool, arrayOfInt2, this.mG0, i);
/*   */       this.mG0 += i;
/*   */     }
/*   */   }
/*   */   
/*   */   public static interface Configurable {
/*   */     void save(sz0 param1sz0, ResourceData param1ResourceData);
/*   */     
/*   */     void load(sz0 param1sz0, ResourceData param1ResourceData);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ResourceData.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */