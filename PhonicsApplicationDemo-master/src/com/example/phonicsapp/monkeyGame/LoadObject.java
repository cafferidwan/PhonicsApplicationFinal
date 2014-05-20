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
		//Aa
		else if(i == 2)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionAa1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionAa2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionAa3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionAa4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWAa1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWAa2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//E
		else if(i == 3)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionE1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionE2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionE3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionE4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWE1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWE2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Raw
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
		//Ko
		else if(i == 5)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWKo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWKo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Bo
		else if(i == 6)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionBo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWBo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWBo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.balish;
			MonkeyGameActivity.obj2Sound = R.raw.boi;
			MonkeyGameActivity.obj3Sound = R.raw.belun;
			MonkeyGameActivity.obj4Sound = R.raw.begun;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.taka;
			MonkeyGameActivity.wrongObj2Sound = R.raw.megh;
			
		}
		//TalibaSha
		else if(i == 7)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTalibasha1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTalibasha2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTalibasha3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionTalibasha4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWTalibasha1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWTalibasha2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Lo
		else if(i == 8)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionLo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionLo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionLo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionLo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWLo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWLo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Po
		else if(i == 9)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionPo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionPo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionPo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionPo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWPo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWPo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Go
		else if(i == 10)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionGo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionGo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionGo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionGo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWGo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWGo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Ho
		else if(i == 11)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionHo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionHo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionHo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionHo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWHo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWHo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Kho
		else if(i == 12)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKho1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKho2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKho3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionKho4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWKho1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWKho2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Cho
		else if(i == 13)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionCho1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionCho2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionCho3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionCho4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWCho1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWCho2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//No
		else if(i == 14)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionNo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionNo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionNo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionNo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWNo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWNo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//A
		else if(i == 15)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionA1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionA2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionA3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionA4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWA1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWA2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//Do
		else if(i == 16)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDo1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDo2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDo3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDo4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWDo1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWDo2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//
		else if(i == 17)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionU1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionU2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionU3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionU4, MonkeyGameActivity.vbo);
		
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWU1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWU2, MonkeyGameActivity.vbo);
			
			MonkeyGameActivity.obj1Sound = R.raw.robi;
			MonkeyGameActivity.obj2Sound = R.raw.rocket;
			MonkeyGameActivity.obj3Sound = R.raw.rani;
			MonkeyGameActivity.obj4Sound = R.raw.ruimach;
			
			MonkeyGameActivity.wrongObj1Sound = R.raw.mama;
			MonkeyGameActivity.wrongObj2Sound = R.raw.tebil;
		}
		//To
		else if(i == 18)
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
		//Toh
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
		//Doh
		else if(i == 20)
		{
			MonkeyGameActivity.obj1 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDoh1, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj2 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDoh2, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj3 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDoh3, MonkeyGameActivity.vbo);
			MonkeyGameActivity.obj4 = new Sprite(0, 0, MonkeyGameActivity.mFaceTextureRegionDoh4, MonkeyGameActivity.vbo);
				
			MonkeyGameActivity.wrongObj1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWDoh1, MonkeyGameActivity.vbo);	
			MonkeyGameActivity.wrongObj2 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionWDoh2, MonkeyGameActivity.vbo);
					
			MonkeyGameActivity.obj1Sound = R.raw.moi;
			MonkeyGameActivity.obj2Sound = R.raw.mama;
			MonkeyGameActivity.obj3Sound = R.raw.megh;
			MonkeyGameActivity.obj4Sound = R.raw.mohis;
					
			MonkeyGameActivity.wrongObj1Sound = R.raw.tala;
			MonkeyGameActivity.wrongObj2Sound = R.raw.langol;
		}
	}

}
