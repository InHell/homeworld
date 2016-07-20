package us.cybers.other;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import net.proteanit.sql.DbUtils;
import ua.cybers.graph.Display;






public class Read {

	
	
    
    public static int BKS = 0;
    public static String pc;
    public static String oc;
    public static String tc;
    public static String thc;
    public static String fhc;
    public static String  nf;
   public static String[] ms1;
   public String[][] ms2;
    
   // initializatoin of server parameters
   static Connection conn = null;
   static String dbName = "ts1";
   static String serverip="192.168.32.175";
   static String serverport="1433";
   static String url = "jdbc:sqlserver://" +serverip + "\\MSSQL:" + serverport + ";databaseName=" + dbName + "";
   static Statement stmt = null;
   static ResultSet result = null;
   static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   static String databaseUserName = "sa";
   static String databasePassword = "Zx123*123";
   
   //action for b1
	public static void rd(){
		
	


        try {
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = (Statement) conn.createStatement();
            result = null;
      
            result = ((java.sql.Statement) stmt).executeQuery("SELECT F.NameOfFill, F.NumberOfPC, F.[4stCatPC] FROM Filials as F ORDER BY IDE");

          
     //       Display.ta1.setText(null);
            
            while (result.next()) {
            	
            	
        
   //        pc=result.getString("NumberOfPC");
  //             nf = result.getString("NameOfFill");
   
 //              fhc  = result.getString("4stCatPC");
 //              
   //        Display.ta1.append(nf+"| Всего пк "  +pc+"| Из них Четвертой: "+fhc+"\n");
        
            	   Display.tab1.clearSelection();
            	   Display.tab1.setModel(DbUtils.resultSetToTableModel(result));
            }
          
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	//action for b2
	public static void rd2(){
		
		
			
			

	        try {
	            Class.forName(driver).newInstance();
	            conn = (Connection) DriverManager.getConnection(url, databaseUserName, databasePassword);
	            stmt = (Statement) conn.createStatement();
	            result = null;
	      
	            result = ((java.sql.Statement) stmt).executeQuery("SELECT F.NameOfFill,F.NumberOfPC, F.[1stCatPC] FROM Filials as F ORDER BY  IDE");

	          
	  //          Display.ta1.setText(null);
	            
	            while (result.next()) {
	  //            pc=result.getString("NumberOfPC");
	  //              nf = result.getString("NameOfFill");
	 //               oc = result.getString("1stCatPC");
	                Display.tab1.clearSelection();
	  //          Display.ta1.append(nf+" |  Всего пк  "  +pc+" |  Из них первой:   "+oc+"\n");
	            	Display.tab1.setModel(DbUtils.resultSetToTableModel(result));
	      
	            }
	          
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	// action for b3
	public static void rd3(){
		
		
		
		

        try {
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = (Statement) conn.createStatement();
            result = null;
      
            result = ((java.sql.Statement) stmt).executeQuery("SELECT F.NameOfFill,F.NumberOfPC, F.[2stCatPC] FROM Filials as F ORDER BY  IDE");

          
     //       Display.ta1.setText(null);
            
            while (result.next()) {
  //            pc=result.getString("NumberOfPC");
  //              nf = result.getString("NameOfFill");
   //             tc = result.getString("2stCatPC");
               
   //         Display.ta1.append(nf+" |  Всего пк  "  +pc+" |  Из них Второй:   "+tc+"\n");
            	 Display.tab1.clearSelection();
            	 Display.tab1.setModel(DbUtils.resultSetToTableModel(result));
         
            }
          
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
		// action for b4
public static void rd4(){
		
		
		
		

        try {
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = (Statement) conn.createStatement();
            result = null;
      
            result = ((java.sql.Statement) stmt).executeQuery("SELECT F.NameOfFill,F.NumberOfPC, F.[3stCatPC] FROM Filials as F ORDER BY  IDE");

          
       //     Display.ta1.setText(null);
            
            while (result.next()) {
      //      pc=result.getString("NumberOfPC");
     //           nf = result.getString("NameOfFill");
      //          thc  = result.getString("3stCatPC");
    
               
      //      Display.ta1.append(nf+" |  Всего пк  "  +pc+" |  Из них Третей :   "+thc+"\n");
            Display.tab1.clearSelection();
        	 Display.tab1.setModel(DbUtils.resultSetToTableModel(result));
            //   Display.tab1.setModel(DbUtils.resultSetToTableModel(result));
          
            }
          
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	}

