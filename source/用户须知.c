#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<time.h>

void gtxy(int x,int y);     //����ƶ�
void HideCursor();           //���ع��
void screensize();         //���ƴ��ڴ�С
void HideCursor();           //���ع��
void Frame();               //��ӡ������
void SideScreen();
void ColorChoose(int color); 


int main(){
	SetConsoleTitle("Ƥ������_�û���֪");
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
 		printf("�����Ϲ�԰_Ӱ������>>NoEvaa");
		time (&timep);
		p=gmtime(&timep);
		gtxy(10,41); 
		ColorChoose(2); 
		printf("%d ",p->tm_sec);
		Sleep(1000);
	}

	return 0;
}

void gtxy(int x,int y)  //����ƶ�������X��ʾ�����꣬Y��ʾ�����ꡣ
{
	COORD  coord;         //ʹ��ͷ�ļ��Դ�������ṹ
	coord.X=x;            //���ｫint����ֵ����short,�����������漰������ֵ�����ᳬ��short��Χ
	coord.Y=y;
	HANDLE a=GetStdHandle(STD_OUTPUT_HANDLE);  //��ñ�׼������
	SetConsoleCursorPosition(a,coord);         //�Ա�׼����ľ��Ϊ�������ÿ���̨�������
}
void HideCursor()  //���ع��
{                  
	CONSOLE_CURSOR_INFO cursor_info={1,0};
	SetConsoleCursorInfo(GetStdHandle(STD_OUTPUT_HANDLE),&cursor_info); 
}
void Frame()                  //��ӡ������
{   
 	gtxy(28,1);
 	ColorChoose(5);
	printf("Ƥ������");
	ColorChoose(1);
	printf("_�û���֪V1.0.13.82");
    gtxy(0,3); 
	ColorChoose(3);                         

	printf("  �x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x�x  \n");
	int i;
	for( i=0;i<36;i++)
	{
	    printf("��                                                                                    ��\n");

	}
	printf(" |�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T| \n");
	printf("��                                                                                    ��\n");
	printf("  ������������������������������������������������������������������������������������  ");

	SideScreen ();  
}
void SideScreen()  
{                   
	gtxy(5,5);
	ColorChoose(6); 
	printf("1-1.���Բ���������.");
	gtxy(5,7);
	ColorChoose(3);
	printf("2.��ȫ����");
	gtxy(5,8);
	ColorChoose(6);
	printf(" 2-1.����Ʒ��������ʹ�ã���ֹ����Υ����Ϊ.");
	gtxy(5,9);
	printf(" 2-2.���ڲ�Ʒ������ѣ�����������ҵ��;.");
	gtxy(5,10);
	printf(" 2-3.����Ʒ���޹�棬���й�棬���ǵ��棬����ร��~");
	gtxy(5,11);
	printf(" 2-4.�ٷ��������صı���Ʒ���᳢�Ի��������ȡ�û��κθ�����Ϣ�������ʹ��.");
	gtxy(5,12);
	printf(" 2-5.����Ʒ����freepiano_2.2.2.1����������������ʹ�ã��������������߱��˱�д,");
	gtxy(5,13);
	printf("�������롢�޸ĵ���Ϊ��������������ԭװƤ�����ӣ�Ҳ��ӭ�����������߽���."); 
	gtxy(5,15);
	ColorChoose(3);
	printf("3.ʹ�ù淶");
	gtxy(5,16);
	ColorChoose(6);
	printf(" 3-1.����Ʒ������windows����ϵͳ�Ͽ���,����ϵͳ��װJVMҲû��������..");
	gtxy(5,17);
	ColorChoose(4);
	printf(" 3-2.������'pianobox.exe'ʱ����'freepiano'����������ٲ�������ֱ�������������");
	gtxy(5,18);
	printf("��������ʾ��!!!");
	gtxy(5,19);
	ColorChoose(6);
	printf(" 3-3.�뾡��ʹ��IE�������'���׸�ʽת����.html'��������ű���ActiveX�ؼ����У�");
	gtxy(5,20);
	printf("������ܻ����ĳЩ�����޷�ʹ��.");
	gtxy(5,21);
	printf(" 3-4.�����ƶ��ļ���'jre/freepiano'�����ڲ��ļ����ı��ĵ���NoEv/recor����Ӧ�ó�");
	gtxy(5,22);
	printf("��'pianobox/���׽���'��λ�ã���������޷�����ʹ��.");
	gtxy(5,23);
	printf(" 3-5.������δ����ı��ĵ���NoEv/recor�����ݵ�����������޸�������,or����Ը�.");
	gtxy(5,24);
	printf(" 3-6.����Ʒ����'freepiano_2.2.2.1'�������ÿ��޸ģ����밴��ʹ�ý̳��޸�.");
	gtxy(5,26);
	ColorChoose(3);
	printf("4.Ʋ���ϵ");
	gtxy(5,27);
	ColorChoose(6);
	printf(" 4-1.�û����ñ������������κβ���������û����ˣ��뱾���޹�.");
	gtxy(5,28);
	printf(" 4-2.�û���ʹ�ñ������������δ���淶ʹ�ö������Ĳ���������û��Լ��е�.");
	gtxy(5,29);
	printf(" 4-3.�û���ʹ�ñ�����������������κ��������ѡ���������ߣ�Ҳ���Ա��ֳ�Ĭ.");
	gtxy(5,30);
	printf("PS�����ģ����߿�����Ҳ��װ��û������..");
	gtxy(5,31);
	printf(" 4-4.�û��ڱ��������������������ܷ������κ����������ϵ��˺��;����ϵ���ʧ��");
	gtxy(5,32);
	printf("���������е��κ�����.");
	gtxy(5,33);
	printf(" 4-5.����Ʒ���ս���Ȩ�����߲���Ҫ�����Լ�ȥ���Ͱ�..");
	gtxy(5,35);
	printf("5-1.��������ϸ�Ķ���Ʒ���ס�ʹ�ý̡̳�.");
	gtxy(5,37);
	ColorChoose(1);
	printf("At last��лл��ϣ���л����֧�֣�ף��ʹ�����~");

}
void ColorChoose(int color)   //��ɫѡ����
{
	switch(color)
	{
	   	case 1:               //����ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_GREEN|FOREGROUND_BLUE);
			break;
		case 2:               //��ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_GREEN);	
			break;
		case 3:               //��ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_GREEN);
			break;
		case 4:               //��ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED);
			break;
		case 5:               //��ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_BLUE);
			break;
		case 6:               //��ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_RED|FOREGROUND_BLUE|FOREGROUND_GREEN);
			break;
		case 7:               //����ɫ
			SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),FOREGROUND_INTENSITY|FOREGROUND_BLUE);
			break;
	}
}

