package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentdao {

	public ArrayList<Student> read(){
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		String line=scan.next();
		while(line.equals("end")) {
			String arr[]=line.split(",|*");
		}
		return list;
	}
	
	public int count(ArrayList<Student> list) {
		int num=0;
		num=list.size();
		return num;
	}
	
	public int countByGender(ArrayList<Student> list,String gender) {
		int num=0;
		for(Student student : list) {
			if(student.getGender().equals(gender)) {
				num++;
			}
		}
		return num;
	}
	
	public ArrayList<Result> statis(ArrayList<Student> list){
		ArrayList<Result> listResult =new ArrayList<Result>();
		for(Student student:list) {
			//1.ȡѧ����ʡ��
			String province=student.getGender();
			//2.��ѯʡ���Ƿ����
			int index=query(listResult,province);
			//3.���ڣ����Ҹ�ʡ�ݵ����꣬�޸����ݣ�����+1������׷�ӵ�details��
			
			if(index==-1) {
				Result resultTemp = listResult.get(index);
				resultTemp.setCount(resultTemp.getCount()+1);
				resultTemp.setDetails(resultTemp.getDetails()+","+student.getName());
				listResult.set(index,resultTemp);
			}
			
			
			//4.�����ڣ���ʡ����ӵ������У�����=1��details��ʼ��Ϊѧ����
			else {
				Result result=new Result();
				result.setProvince(province);
				result.setCount(1);
				result.setDetails(student.getName());
				listResult.add(result);
			}
		}
		return listResult;
	}
	
	private int query(ArrayList<Result> listResult,String province) {
		
		int ret=0;
		
		for(int i=0;i<listResult.size();i++) {
			Result result=listResult.get(i);
			if(result.getProvince().equals(province)) {
				ret=i;
				break;
			}
			
		}
		return ret;
	}
}
