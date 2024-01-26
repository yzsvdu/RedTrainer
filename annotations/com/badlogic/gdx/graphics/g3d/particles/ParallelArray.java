/*   */ package com.badlogic.gdx.graphics.g3d.particles;
/* 2 */ public class ParallelArray { public fQ arrays; public int capacity; public int size; public ParallelArray(int paramInt) { fQ fQ1; this(false, 2, Channel.class); this.arrays = this; this.capacity = paramInt; this.size = 0; } private Channel allocateChannel(ChannelDescriptor paramChannelDescriptor) { int j; Class<float> clazz; if ((clazz = paramChannelDescriptor.type) == float.class) { i = paramChannelDescriptor.id; j = paramChannelDescriptor.count; int n = this.capacity; return new FloatChannel(i, j, n); }  if (j == int.class) { i = i.id; j = i.count; int n = this.capacity; return new IntChannel(i, j, n); }  int i = i.id; int k = i.count; int m = this.capacity; return new ObjectChannel(i, k, m, j); } private int findIndex(int paramInt) { fQ fQ1; for (byte b = 0; b < (fQ1 = this.arrays).Z8; b++) { if ((((Channel[])fQ1.Uq0)[b]).id == paramInt) return b;  }  return -1; } public Channel addChannel(ChannelDescriptor paramChannelDescriptor) { return addChannel(paramChannelDescriptor, null); } public Channel addChannel(ChannelDescriptor paramChannelDescriptor, ChannelInitializer paramChannelInitializer) { Channel channel; if ((channel = getChannel(paramChannelDescriptor)) == null) { channel = allocateChannel(paramChannelDescriptor); if (paramChannelInitializer != null) paramChannelInitializer.init(channel);  this.arrays.Com3(channel); }  return channel; } public void removeArray(int paramInt) { this.arrays.Hc(findIndex(paramInt)); } public void addElement(Object... paramVarArgs) { if (this.size != this.capacity) { int i = 0; Hc0 hc0 = this.arrays.r30(); while (hc0.hasNext()) { ((Channel)hc0.next()).add(i, paramVarArgs); i += ((Channel)hc0.next()).strideSize; }  this.size++; return; }  throw new JU("Capacity reached, cannot add other elements"); } public void removeElement(int paramInt) { int i = this.size - 1; Hc0 hc0 = this.arrays.r30(); while (hc0.hasNext()) ((Channel)hc0.next()).swap(paramInt, i);  this.size = i; } public Channel getChannel(ChannelDescriptor paramChannelDescriptor) { Hc0 hc0 = this.arrays.r30(); while (hasNext()) { Channel channel; if ((channel = (Channel)next()).id == paramChannelDescriptor.id) return channel;  }  return null; } public void clear() { this.arrays.clear(); this.size = 0; } public void setCapacity(int paramInt) { if (this.capacity != paramInt) { Hc0 hc0 = this.arrays.r30(); while (hc0.hasNext()) ((Channel)hc0.next()).setCapacity(paramInt);  this.capacity = paramInt; }  } public class ObjectChannel extends Channel { public void setCapacity(int param1Int) { Object[] arrayOfObject = (Object[])Array.newInstance(this.componentType, this.strideSize * param1Int); param1Int = Math.min(this.data.length, this.length); System.arraycopy(this.data, 0, this, 0, param1Int); this.data = this; super.data = this; }
/*   */ 
/*   */     
/*   */     public Class componentType;
/*   */     public Object[] data;
/*   */     
/*   */     public ObjectChannel(int param1Int1, int param1Int2, int param1Int3, Class param1Class) {
/*   */       super(param1Int1, o7.JB0(param1Class, param1Int3 * param1Int2), param1Int2);
/*   */       this.componentType = param1Class;
/*   */       this.data = (Object[])super.data;
/*   */     }
/*   */     
/*   */     public void add(int param1Int, Object... param1VarArgs) {
/*   */       int i;
/*   */       param1Int = (i = (param1Int = this.strideSize) * ParallelArray.this.size) + param1Int;
/*   */       for (byte b = 0; i < param1Int; b++) {
/*   */         this.data[i] = param1VarArgs[b];
/*   */         i++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void swap(int param1Int1, int param1Int2) {
/*   */       param1Int2 = i * param1Int2;
/*   */       int i = (param1Int1 = (i = this.strideSize) * param1Int1) + i;
/*   */       while (param1Int1 < i) {
/*   */         Object object = this.data[param1Int1];
/*   */         this.data[param1Int1] = this.data[param1Int2];
/*   */         this.data[param1Int2] = object;
/*   */         param1Int1++;
/*   */         param1Int2++;
/*   */       } 
/*   */     } }
/*   */ 
/*   */   
/*   */   public class IntChannel extends Channel {
/*   */     public int[] data = (int[])super.data;
/*   */     
/*   */     public IntChannel(int param1Int1, int param1Int2, int param1Int3) {
/*   */       super(param1Int1, new int[param1Int3 * param1Int2], param1Int2);
/*   */     }
/*   */     
/*   */     public void add(int param1Int, Object... param1VarArgs) {
/*   */       int i;
/*   */       param1Int = (i = (param1Int = this.strideSize) * ParallelArray.this.size) + param1Int;
/*   */       for (byte b = 0; i < param1Int; b++) {
/*   */         this.data[i] = ((Integer)param1VarArgs[b]).intValue();
/*   */         i++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void swap(int param1Int1, int param1Int2) {
/*   */       param1Int2 = i * param1Int2;
/*   */       int i = (param1Int1 = (i = this.strideSize) * param1Int1) + i;
/*   */       while (param1Int1 < i) {
/*   */         int j = this.data[param1Int1];
/*   */         this.data[param1Int1] = this.data[param1Int2];
/*   */         this.data[param1Int2] = j;
/*   */         param1Int1++;
/*   */         param1Int2++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void setCapacity(int param1Int) {
/*   */       int i;
/*   */       int[] arrayOfInt = new int[i = this.strideSize * param1Int];
/*   */       i = Math.min(this.data.length, i);
/*   */       System.arraycopy(this.data, 0, arrayOfInt, 0, i);
/*   */       this.data = arrayOfInt;
/*   */       super.data = arrayOfInt;
/*   */     }
/*   */   }
/*   */   
/*   */   public class FloatChannel extends Channel {
/*   */     public float[] data = (float[])super.data;
/*   */     
/*   */     public FloatChannel(int param1Int1, int param1Int2, int param1Int3) {
/*   */       super(param1Int1, new float[param1Int3 * param1Int2], param1Int2);
/*   */     }
/*   */     
/*   */     public void add(int param1Int, Object... param1VarArgs) {
/*   */       int i;
/*   */       param1Int = (i = (param1Int = this.strideSize) * ParallelArray.this.size) + param1Int;
/*   */       for (byte b = 0; i < param1Int; b++) {
/*   */         this.data[i] = ((Float)param1VarArgs[b]).floatValue();
/*   */         i++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void swap(int param1Int1, int param1Int2) {
/*   */       param1Int2 = i * param1Int2;
/*   */       int i = (param1Int1 = (i = this.strideSize) * param1Int1) + i;
/*   */       while (param1Int1 < i) {
/*   */         float f = this.data[param1Int1];
/*   */         this.data[param1Int1] = this.data[param1Int2];
/*   */         this.data[param1Int2] = f;
/*   */         param1Int1++;
/*   */         param1Int2++;
/*   */       } 
/*   */     }
/*   */     
/*   */     public void setCapacity(int param1Int) {
/*   */       int i;
/*   */       float[] arrayOfFloat = new float[i = this.strideSize * param1Int];
/*   */       i = Math.min(this.data.length, i);
/*   */       System.arraycopy(this.data, 0, arrayOfFloat, 0, i);
/*   */       this.data = arrayOfFloat;
/*   */       super.data = arrayOfFloat;
/*   */     }
/*   */   }
/*   */   
/*   */   public static interface ChannelInitializer {
/*   */     void init(ParallelArray.Channel param1Channel);
/*   */   }
/*   */   
/*   */   public abstract class Channel {
/*   */     public int id;
/*   */     public Object data;
/*   */     public int strideSize;
/*   */     
/*   */     public Channel(int param1Int1, Object param1Object, int param1Int2) {
/*   */       this.id = param1Int1;
/*   */       this.strideSize = param1Int2;
/*   */       this.data = param1Object;
/*   */     }
/*   */     
/*   */     public abstract void add(int param1Int, Object... param1VarArgs);
/*   */     
/*   */     public abstract void swap(int param1Int1, int param1Int2);
/*   */     
/*   */     public abstract void setCapacity(int param1Int);
/*   */   }
/*   */   
/*   */   public static class ChannelDescriptor {
/*   */     public int id;
/*   */     public Class type;
/*   */     public int count;
/*   */     
/*   */     public ChannelDescriptor(int param1Int1, Class param1Class, int param1Int2) {
/*   */       this.id = param1Int1;
/*   */       this.type = param1Class;
/*   */       this.count = param1Int2;
/*   */     }
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/ParallelArray.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */