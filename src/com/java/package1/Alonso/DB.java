package com.java.package1.Alonso;

import java.sql.*;


public class DB{
	
    // PARTE I Atributos
	private static DB DB = new DB();  
	private Connection conn = null; 
	private Statement stmt = null; 
	private PreparedStatement pstmt =null;  
	private ResultSet rs = null;  
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Register";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "28536894";

    //PARTE II Constructor
    private DB(){
    try {
    Class.forName(driverDB);
    this.conn = DriverManager.getConnection(urlDB, userDB, passDB);
    //System.out.println("Conexion establecida");
     } catch (ClassNotFoundException | SQLException e) {
     e.printStackTrace();
     }
     } 

     //PARTE III Obtener una instancia de la propia clase
     public static DB getInstances() {
     return DB;
     } 

     //PARTE IV Metodo dbStatement
     public ResultSet dbStatement(String query) {
     try {
     this.stmt = this.conn.createStatement();
      this.rs = this.stmt.executeQuery(query);
     while(rs.next()) {
    System.out.println(rs.getString("username"));
    }
    } catch (SQLException e) {
        e.printStackTrace();
        }finally {
            try {
                this.stmt.close();
                this.rs.close();
            } catch (SQLException e) {
            	e.printStackTrace();
            }
        }
     return rs;
     } 
     
     

     	// PARTE V Metodo dbPrepareStatement
     public void dbPrepareStatement(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setString(1, (String) obj[0]);
    		 this.pstmt.setString(2, (String) obj[1]);
    		 this.pstmt.setString(3, (String) obj[2]);
    		 this.pstmt.setInt(4, (int) obj[3]);
    		 this.pstmt.setDouble(5, (double) obj[4]);
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //preparedstament para cocodrilo
     public void dbPrepareStatementcoc(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setInt(1, (int) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 this.pstmt.setBoolean(3, (boolean) obj[2]);
    		 this.pstmt.setDouble(4, (double) obj[3]);
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
   //preparedstament para serpiente
     public void dbPrepareStatementste(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setInt(1, (int) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 this.pstmt.setBoolean(3, (boolean) obj[2]);
    		 this.pstmt.setDouble(4, (double) obj[3]);
    		 this.pstmt.setBoolean(5, (boolean) obj[4]);
    		 this.pstmt.setString(6, (String) obj[5]);
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
   //preparedstament para rana
     public void dbPrepareStatementrann(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setString(1, (String) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 this.pstmt.setString(3, (String) obj[2]);
    		 
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //preparedstament para salamandra
     public void dbPrepareStatementsala(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setString(1, (String) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 
    		 
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 

     
     //preparedstament para orangutan
     public void dbPrepareStatementgut(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setString(1, (String) obj[0]);
    		 this.pstmt.setInt(2, (int) obj[1]);
    		 this.pstmt.setBoolean(3, (boolean) obj[2]);
    		 this.pstmt.setInt(4, (int) obj[3]);
    		 this.pstmt.setBoolean(5, (boolean) obj[4]);
    		
    		 
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //preparedstament para jaguar
     public void dbPrepareStatementgur(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
    		 this.pstmt.setString(1, (String) obj[0]);
    		 this.pstmt.setInt(2, (int) obj[1]);
    		 this.pstmt.setBoolean(3, (boolean) obj[2]);
    		 this.pstmt.setInt(4, (int) obj[3]);
    		 this.pstmt.setInt(5, (int) obj[4]);
    		 
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //preparedstament para flamenco
     public void dbPrepareStatementflamo(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
      		 this.pstmt.setInt(1, (int) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 this.pstmt.setInt(3, (int) obj[2]);
    		
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //preparedstament para avestruz
     public void dbPrepareStatementtz(String query, Object[] obj) {
    	 try {
    		 this.pstmt = this.conn.prepareStatement(query);
      		 this.pstmt.setInt(1, (int) obj[0]);
    		 this.pstmt.setBoolean(2, (boolean) obj[1]);
    		 this.pstmt.setDouble(3, (double) obj[2]);
    		
    		 this.pstmt.executeUpdate();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 } finally {
    		 try {
    			 this.pstmt.close();
    		 } catch (SQLException e) {
    			 e.printStackTrace();
    		 }
    	 }
     } 
     
     //obtener id
     public int dbStatementid(String query) {
    	 int a = 0;
         try {
         this.stmt = this.conn.createStatement();
          this.rs = this.stmt.executeQuery(query);
         while(rs.next()) {
          a = rs.getInt("id");
        }
        } catch (SQLException e) {
            e.printStackTrace();
            }finally {
                try {
                    this.stmt.close();
                    this.rs.close();
                } catch (SQLException e) {
                	e.printStackTrace();
                }
            }
         return a;
         } 
     
     //metodo para imprimir
     public ResultSet dbStatementimp(String query) {
         try {
         this.stmt = this.conn.createStatement();
          this.rs = this.stmt.executeQuery(query);
         
        } catch (SQLException e) {
            e.printStackTrace();
            }
         
         return rs;
         } 

     		//Metodo dbClose:
     public void dbClose() {
    	 try {
    		 this.conn.close();
    		 System.out.println("Conexion cerrada");
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 }
	
     }
	}