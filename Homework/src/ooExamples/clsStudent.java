package ooExamples;

import java.text.ParseException;
/*
 * ��������ѧ�����һ��Class�������̳���clsPerson
 */
public class clsStudent extends clsPerson {
     private String studentNumber;
     private String studentName;
     private float score;
     clsStudent(String par1,String par2,String par3,double par4,double par5,String _name,String _number) throws ParseException
     {
    	 super(par1, par2, par3, par4, par5);//���ø���Ĺ��췽����super�������˼
    	 studentNumber=_number;
    	 studentName=_name;
    	 score=0;
     }
     //��Ϊ�������ˣ��������������ԣ��ֲ��������дһ���������ص�������Ͷ�
     //�����Display�����˸�д�����ֺ͸���һ�£�����ʱ��д��Ŀ�ģ���ʵ�ֶ�����ʾ��Ϣ
     //��һ���ԣ�����Ҷ�����Display����ʾ��Ϣ����Ȼ��������д����дһ���µĵķ���
     //Ҳ����
     public void Display()
     {
    	super.Display();
    	System.out.println("����һ��ѧ�����ҵ����ֽ�:"+studentName);
 		System.out.println("�ҵ�ѧ����:"+studentNumber);
 		System.out.println("�ҵķ�����:"+score);
 		System.out.println("<<<<<<<<<<����Ϊ������Ϣ>>>>>>>>>>>>>");
     }
     //�½���һ����������
     public void Exam()
     {
    	 score = (float)(Math.random()*100); 
     }
    
     
}