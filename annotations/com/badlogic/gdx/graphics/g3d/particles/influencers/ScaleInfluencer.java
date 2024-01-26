/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class ScaleInfluencer extends SimpleInfluencer { public void activateParticles(int paramInt1, int paramInt2) { if (this.value.isRelative()) { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.value.newLowValue() * this.controller.scale.x, f2 = this.value.newHighValue() * this.controller.scale.x; this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; this.valueChannel.data[paramInt2] = oh.Zn(this.value, 0.0F, f2, f1); paramInt2 += 
/* 2 */           ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }  } else { int i; for (paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.valueChannel).strideSize), i = paramInt1 * ((ParallelArray.Channel)this.interpolationChannel).strideSize, paramInt1 = paramInt2 * paramInt1 + paramInt2; paramInt2 < paramInt1; ) { float f1 = this.value.newLowValue() * this.controller.scale.x, f2 = this.value.newHighValue() * this.controller.scale.x - f1; this.interpolationChannel.data[i + 0] = f1; this.interpolationChannel.data[i + 1] = f2; this.valueChannel.data[paramInt2] = 
/* 3 */           oh.Zn(this.value, 0.0F, f2, f1);
/* 4 */         paramInt2 += ((ParallelArray.Channel)this.valueChannel).strideSize; i += ((ParallelArray.Channel)this.interpolationChannel).strideSize; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public ScaleInfluencer() {
/*   */     this.valueChannelDescriptor = ParticleChannels.Scale;
/*   */   }
/*   */   
/*   */   public ScaleInfluencer(ScaleInfluencer paramScaleInfluencer) {
/*   */     super(paramScaleInfluencer);
/*   */   }
/*   */   
/*   */   public ParticleControllerComponent copy() {
/*   */     return new ScaleInfluencer(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ScaleInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */