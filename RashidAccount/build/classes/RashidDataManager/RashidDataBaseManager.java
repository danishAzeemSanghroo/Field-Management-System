/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RashidDataManager;

import RashidBeans.TractorBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Danish
 */
public class RashidDataBaseManager {
    private static Connection con;
    private static String customer_id;
	static{
		try{
			init();
		}catch(Exception e){
		}
	}
	private static void init()throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:rashidacount");
	
	}
	public static int addTractor(String customerName,String caste,String tractorWork,int paidMoney,int remainingMoney,String tractorTime,String currentDate,String totalWork,String remarks)throws Exception{
		String query="INSERT into tractor (customer_name,caste,tractor_work,paid_money,remaining_money,tractor_time,current_date,total_work,remarks) values ('"+customerName+"','"+caste+"','"+tractorWork+"',"+paidMoney+","+remainingMoney+",'"+tractorTime+"','"+currentDate+"','"+totalWork+"','"+remarks+"')";
		System.out.println(query);
		
		Statement st=null;
		try{
			st=con.createStatement();
			int rows=st.executeUpdate(query);
			return rows;
		}finally{
			if (st!=null)
			st.close();
		}
	}
        	public static int deleteTractor(int customerId)throws Exception{
		String query="DELETE from tractor where customer_id="+customerId;
		System.out.println(query);
		
		Statement st=null;
		try{
			st=con.createStatement();
			int rows=st.executeUpdate(query);
			return rows;
		}finally{
			if (st!=null)
			st.close();
		}
	}
 	public static int updateTractor(int customerId,String customerName,String caste,String tractorWork,int paidMoney,int remainingMoney,String tractorTime,String currentDate,String totalWork,String remarks)throws Exception{
		String query="UPDATE tractor set customer_name='"+customerName+"',caste='"+caste+"',tractor_work='"+tractorWork+"',paid_money="+paidMoney+",remaining_money="+remainingMoney+",tractor_time='"+tractorTime+"',current_date='"+currentDate+"',total_work='"+totalWork+"',remarks='"+remarks+"' where customer_id="+customerId;
		System.out.println(query);
		
		Statement st=null;
		try{
			st=con.createStatement();
			int rows=st.executeUpdate(query);
			return rows;
		}finally{
			if (st!=null)
			st.close();
		}
	}               
  	public static Vector getTractor()throws Exception{
		String query="select * from tractor";
		System.out.println(query);
		Statement st=null;
		ResultSet result=null;
		try{
			st=con.createStatement();
			result=st.executeQuery(query);
			Vector v=new Vector();
			while(result.next()){
				TractorBean bean=new TractorBean();	
				bean.setCustomerId( result.getInt("customer_id") );
				bean.setCustomerName( result.getString("customer_name") );
                                bean.setCaste( result.getString("caste"));
                                bean.setTractorWork( result.getString("tractor_work"));
                                bean.setPaidMoney(result.getInt("paid_money"));
                                bean.setRemainingMoney(result.getInt("remaining_money"));
                                bean.setTractorTime( result.getString("tractor_time") );
                                bean.setCurrentDate( result.getString("current_date") );
                                bean.setTotalWork( result.getString("total_work") );                   
				bean.setRemarks( result.getString("remarks") );			
				v.addElement(bean);
			}
			return v;
		}finally{
			if(result!=null)result.close();
			if(st!=null)st.close();
		}
	}              
    

}
