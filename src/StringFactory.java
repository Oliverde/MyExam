import java.util.Scanner;

public class StringFactory {
	private String s;
	//��һ������
	public  StringFactory(String s){
		this.s = s;
	}
	
	public StringFactory(){}
	//�ڶ�������
	public  boolean compareLargerThan( String s1){		
		/**  ���ַ�����ÿһ���ַ�¼�뵽������ */
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		
		int l = s.length();
		int l1 = s1.length(); 
		int L = Math.min(l, l1);					//ȥ�����������С������Ϊѭ���Ĵ���
		for (int i = 0; i < L; i++) {				//������С�����бȽ�ÿһ���ַ�
			if(c[i] > c1[i]){							
				return true;
			}else if(c[i] < c1[i]){
				return false;							//����С�������ַ�����ͬ�����booleanֵ
			}
		}
		if(l > l1){											//��ǰ����ַ�����ͬ������±Ƚϳ���
			return true;								//����ǰ����ַ����бȽϳ���С��ͬ�����if�ṹ����ִ�У�
		}else{	
			return false;
		}
	}
	//����������
	public  int Find(String s1){
		int Index = -1,count = 0;
		int result=s.indexOf(s1), lastResult = -1;						//���ַ�������ƥ��
		if(result >= 0){																//�ַ�������	
			String[] s2 = s.split("");												//�ָ��ַ���
			String[] s3 = s1.split("");
			for (int i = 0; i < s2.length; i++) {
				for (int j = 0; j < s3.length; j++) {							//���ҳ�ʼλ���±�
					if(s2[i].compareTo(s3[j]) == 0){
						 Index = i;
						 count++;
					}
				}
			}
			lastResult = Index - count + 1;
		}
		return lastResult;															//�����±�
	}
}
