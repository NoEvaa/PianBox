#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<time.h>

void gtxy(int x,int y);     //光标移动
void HideCursor();           //隐藏光标
void screensize();         //控制窗口大小
void HideCursor();           //隐藏光标
void Frame();               //打印主体框架
void SideScreen();
void ColorChoose(int color); 


int main(){
	SetConsoleTitle("皮安盒子_用户须知");
	system("mode con cols=90 lines=52");
	HideCursor();	
	Frame();
	time_t timep;
	srand(time(NULL));
	int i,j;
    struct tm *p;
	while (1){
		gtxy(57,41);
		i=rand()%7+1;
		ColorChoose(i); 
 		printf("——南公园_影子神游>>NoEvaa");
		time (&timep);
		p=gmtime(&timep);
		gtxy(10,41); 
		ColorChoose(2); 
		printf("%d ",p->tm_sec);
		Sleep(1000);
	}

	return 0;
}

void gtxy(int x,int y)  //光标移动函数，X表示横坐标，Y表示纵坐标。
{
	COORD  coord;         //使用头文件自带的坐标结构
	coord.X=x;            //这里将int类型值传给short,不过程序中涉及的坐标值均不会超过short范围
	coord.Y=y;
	HANDLE a=GetStdHandle(STD_OUTPUT_HANDLE);  //获得标准输出句柄
	SetConsoleCursorPosition(a,coord);         //以标准输出的句柄为参数设置控制台光标坐标
}
void HideCursor()  //隐藏光标
{                  
	CONSOLE_CURSOR_INFO cursor_info={1,0};
	SetConsoleCursorInfo(GetStdHandle(STD_OUTPUT_HANDLE),&cursor_info); 
}
void Frame()                  //打印主体框架
{   
 	gtxy(28,1);
 	ColorChoose(5);
	printf("皮安盒子");
	ColorChoose(1);
	printf("_用户须知V1.0.13.82");
    gtxy(0,3); 
	ColorChoose(3);                         

	printf("  ▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁  \n");
	int i;
	for( i=0;i<36;i++)
	{
	    printf("▕                                                                                    ▏\n");

	}
	printf(" |══════════════════════════════════════════| \n");
	printf("▕                                                                                    ▏\n");
	printf("  ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔  ");

	SideScreen ();  
}
void SideScreen()  
{                   
	gtxy(5,5);
	ColorChoose(6); 
	printf("1-1.绝对不意气用事.");
	gtxy(5,7);
	ColorChoose(3);
	printf("2.安全条例");
	gtxy(5,8);
	ColorChoose(6);
	printf(" 2-1.本产品仅供娱乐使用，禁止用于违法行为.");
	gtxy(5,9);
	printf(" 2-2.本期产品终生免费，请勿用于商业用途.");
	gtxy(5,10);
	printf(" 2-3.本产品内无广告，如有广告，必是盗版，自求多福吧~");
	gtxy(5,11);
	printf(" 2-4.官方渠道下载的本产品不会尝试或悄咪咪获取用户任何个人信息，请放心使用.");
	gtxy(5,12);
	printf(" 2-5.本产品内置freepiano_2.2.2.1可在网上自由下载使用，其余程序均由作者本人编写,");
	gtxy(5,13);
	printf("允许反编译、修改等行为，但将不再属于原装皮安盒子，也欢迎大神来与作者交流."); 
	gtxy(5,15);
	ColorChoose(3);
	printf("3.使用规范");
	gtxy(5,16);
	ColorChoose(6);
	printf(" 3-1.本产品仅可在windows操作系统上可用,其他系统你装JVM也没用略略略..");
	gtxy(5,17);
	ColorChoose(4);
	printf(" 3-2.在运行'pianobox.exe'时出现'freepiano'界面后请勿再操作电脑直至乐曲弹奏完毕");
	gtxy(5,18);
	printf("并弹出提示框!!!");
	gtxy(5,19);
	ColorChoose(6);
	printf(" 3-3.请尽量使用IE浏览器打开'乐谱格式转换器.html'，并允许脚本和ActiveX控件运行，");
	gtxy(5,20);
	printf("否则可能会造成某些功能无法使用.");
	gtxy(5,21);
	printf(" 3-4.请勿移动文件夹'jre/freepiano'及其内部文件、文本文档’NoEv/recor’及应用程");
	gtxy(5,22);
	printf("序'pianobox/乐谱解析'的位置，否则程序将无法正常使用.");
	gtxy(5,23);
	printf(" 3-5.请勿在未理解文本文档’NoEv/recor’内容的情况下随意修改其数据,or后果自负.");
	gtxy(5,24);
	printf(" 3-6.本产品内置'freepiano_2.2.2.1'按键设置可修改，但请按照使用教程修改.");
	gtxy(5,26);
	ColorChoose(3);
	printf("4.撇清关系");
	gtxy(5,27);
	ColorChoose(6);
	printf(" 4-1.用户利用本程序制作的任何产物仅代表用户个人，与本座无关.");
	gtxy(5,28);
	printf(" 4-2.用户在使用本程序过程中因未按规范使用而产生的不良后果由用户自己承担.");
	gtxy(5,29);
	printf(" 4-3.用户在使用本程序过程中遇到的任何问题可以选择反馈给作者，也可以保持沉默.");
	gtxy(5,30);
	printf("PS：放心，作者看到了也会装作没看到的..");
	gtxy(5,31);
	printf(" 4-4.用户在本程序过程中所发生或可能发生的任何心理、生理上的伤害和经济上的损失，");
	gtxy(5,32);
	printf("本座将不承担任何责任.");
	gtxy(5,33);
	printf(" 4-5.本产品最终解释权本作者不想要，请自己去解释吧..");
	gtxy(5,35);
	printf("5-1.请认真仔细阅读产品配套《使用教程》.");
	gtxy(5,37);
	ColorChoose(1);
	printf("At last：谢谢配合，感谢您的支持，祝您使用愉快~");

}
void ColorChoose(int color)   //颜色选择函数
{
	switch(color)
	{
	   	case 1:               //天蓝色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_GREEN|FOREGROUND_BLUE);
			break;
		case 2:               //绿色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_GREEN);	
			break;
		case 3:               //黄色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_GREEN);
			break;
		case 4:               //红色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED);
			break;
		case 5:               //紫色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_BLUE);
			break;
		case 6:               //白色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_BLUE|FOREGROUND_GREEN);
			break;
		case 7:               //深蓝色
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_BLUE);
			break;
	}
}

