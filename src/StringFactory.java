import java.util.Scanner;

public class StringFactory {
	private String s;
	//第一个函数
	public  StringFactory(String s){
		this.s = s;
	}
	
	public StringFactory(){}
	//第二个函数
	public  boolean compareLargerThan( String s1){		
		/**  将字符串的每一个字符录入到数组中 */
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		
		int l = s.length();
		int l1 = s1.length(); 
		int L = Math.min(l, l1);					//去两个数组的最小长度作为循环的次数
		for (int i = 0; i < L; i++) {				//先在最小长度中比较每一个字符
			if(c[i] > c1[i]){							
				return true;
			}else if(c[i] < c1[i]){
				return false;							//在最小长度中字符都相同则不输出boolean值
			}
		}
		if(l > l1){											//在前面的字符都相同的情况下比较长度
			return true;								//（若前面的字符已有比较出大小不同，则次if结构不会执行）
		}else{	
			return false;
		}
	}
	//第三个函数
	public  int Find(String s1){
		int Index = -1,count = 0;
		int result=s.indexOf(s1), lastResult = -1;						//对字符串进行匹配
		if(result >= 0){																//字符串符合	
			String[] s2 = s.split("");												//分割字符串
			String[] s3 = s1.split("");
			for (int i = 0; i < s2.length; i++) {
				for (int j = 0; j < s3.length; j++) {							//查找初始位置下标
					if(s2[i].compareTo(s3[j]) == 0){
						 Index = i;
						 count++;
					}
				}
			}
			lastResult = Index - count + 1;
		}
		return lastResult;															//返回下标
	}
}
