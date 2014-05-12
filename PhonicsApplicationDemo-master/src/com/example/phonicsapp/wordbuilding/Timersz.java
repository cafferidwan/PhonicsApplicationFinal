package com.example.phonicsapp.wordbuilding;

import org.andengine.engine.handler.IUpdateHandler;
 
 
/**
 * @author Jong
 *
 */
public class Timersz implements IUpdateHandler {
        // ===========================================================
        // Constants          
        // ===========================================================
       
        // ===========================================================          
        // Fields        
        // ===========================================================
        private ITimerCallback mCallback;
        private float mInterval;
       
        private float mSecondsElapsed;
        // ===========================================================          
        // Constructors          
        // ===========================================================
        public Timersz(final float pInterval, final ITimerCallback pCallback) {
                this.mInterval = pInterval;
                this.mCallback = pCallback;
        }
        // ===========================================================          
        // Getter & Setter          
        // ===========================================================
        public void setInterval(final float pInterval) {
                this.mInterval = pInterval;
        }
        // ===========================================================          
        // Methods for/from SuperClass/Interfaces          
        // ===========================================================  
        @Override
        public void onUpdate(float pSecondsElapsed) {
                this.mSecondsElapsed += pSecondsElapsed;
                if(this.mSecondsElapsed >= this.mInterval) {
                        this.mSecondsElapsed -= this.mInterval;
                        this.mCallback.onTick();
                }
        }
        @Override
        public void reset() {
                this.mSecondsElapsed = 0;
               
        }
        // ===========================================================          
        // Methods          
        // ===========================================================  
 
        // ===========================================================          
        // Inner and Anonymous Classes          
        // ===========================================================
        public interface ITimerCallback {
                public void onTick();
        }
}
 
 

