package com.example.phonicsapp.monkeyGame;

import org.andengine.entity.sprite.Sprite;

import com.example.phonicsapp.R;

public class LoadObject
{

	public static void LoadObjects(int i) 
	{
		// TODO Auto-generated method stub
		//Mo
		if(i == 1)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionMo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionMo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionMo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionMo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWMo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWMo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.moi;
			MonkeyGameActivity.obj2Sound = R.raw.mama;
			MonkeyGameActivity.obj3Sound = R.raw.megh;
			MonkeyGameActivity.obj4Sound = R.raw.mohis;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.tala;
			MonkeyGameActivity.wrongObj2Sound = R.raw.langol;
		}
		//Bo
		else if(i == 6)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWA1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWA2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.balish;
			MonkeyGameActivity.obj2Sound = R.raw.boi;
			MonkeyGameActivity.obj3Sound = R.raw.belun;
			MonkeyGameActivity.obj4Sound = R.raw.begun;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.taka;
			MonkeyGameActivity.wrongObj2Sound = R.raw.megh;
			
		}
		//Letter-Raw
		else if(i == 4)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionRaw1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionRaw2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionRaw3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionRaw4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWRaw1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWRaw2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Letter-Toh
		else if(i == 19)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionToh1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionToh2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionToh3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionToh4, MonkeyGameActivity.vbo);
				
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWToh1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWToh2, MonkeyGameActivity.vbo);
				
			MonkeyGameActivity.obj1Sound = R.raw.tomtom;
			MonkeyGameActivity.obj2Sound = R.raw.tomato;
			MonkeyGameActivity.obj3Sound = R.raw.tin;
			MonkeyGameActivity.obj4Sound = R.raw.taka;
					
			MonkeyGameActivity.wrongObj1Sound = R.raw.boi;
			MonkeyGameActivity.wrongObj2Sound = R.raw.rocket;
		}
		//Letter-To
		else if(i == 5)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTo4, MonkeyGameActivity.vbo);
				
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWTo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWTo2, MonkeyGameActivity.vbo);
					
			MonkeyGameActivity.obj1Sound = R.raw.moi;
			MonkeyGameActivity.obj2Sound = R.raw.mama;
			MonkeyGameActivity.obj3Sound = R.raw.megh;
			MonkeyGameActivity.obj4Sound = R.raw.mohis;
					
			MonkeyGameActivity.wrongObj1Sound = R.raw.tala;
			MonkeyGameActivity.wrongObj2Sound = R.raw.langol;
		}
	}

}
