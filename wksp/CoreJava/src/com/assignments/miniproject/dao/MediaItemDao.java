package com.assignments.miniproject.dao;

import com.assignments.miniproject.bean.Audio;
import com.assignments.miniproject.bean.Book;
import com.assignments.miniproject.bean.MediaItem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MediaItemDao {



    //Method 1: Add Item
    public void addItem(MediaItem item){
        Connection conn = MyConnection.connect();
        try {
            Statement stmt = conn.createStatement();
            String val = item.getClass().toString();
            //System.out.println(val);
            if(val.contains("Audio"))
            {
                String sql = "insert into AudioItem(aid, title, price, year, artist) values" + "('" +
                        item.getId()+"', "
                        +"'"+ item.getTitle()+"', "
                        +"'"+ item.getPrice()+"', "
                        +"'"+ item.getYear()+"', "
                        +"'"+ ((Audio)item).getArtist() + "')";
                stmt.executeUpdate(sql);
                System.out.println("Audio item inserted to DB successfully");
            }
            else{
                String sql = "insert into BookItem(bid, title, price, year, author) values" + "('" +
                        item.getId()+"', "
                        +"'"+ item.getTitle()+"', "
                        +"'"+ item.getPrice()+"', "
                        +"'"+ item.getYear()+"', "
                        +"'"+ ((Book)item).getAuthor() + "')";
                stmt.executeUpdate(sql);
                System.out.println("Book item inserted to DB successfully");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //Method 2: Search Item By ID
    public boolean searchItemById(int id){
        Connection conn = MyConnection.connect();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from audioitem where aid =" + "'" +id +"'";
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            while(rs.next()) {
                count = rs.getInt(1);
            }
            if (count > 0) {
                System.out.println("Audio item fetched successfully");
                return true;
            }
            else{
                String sql1 = "select * from bookitem where bid =" + "'" +id +"'";
                ResultSet rs1 = stmt.executeQuery(sql1);
                int count1 = 0;
                while(rs1.next()) {
                    count1 = rs1.getInt(1);
                }
                if (count1 > 0) {
                    System.out.println("Book item fetched successfully");
                    return true;
                }
                else {
                    System.out.println("No records found with the given ID "+ id);
                    return false;
                }
                }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    //Method 3: Get All Items
    public ArrayList<MediaItem> getItems(){
        ArrayList<MediaItem> myitems = new ArrayList<>();
        Connection conn = MyConnection.connect();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from audioitem";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next())
            {   MediaItem item = new Audio();
                item.setId(rs.getInt(1));
                item.setTitle(rs.getString(2));
                item.setPrice(rs.getDouble(3));
                item.setYear(rs.getInt(4));
                ((Audio)item).setArtist(rs.getString(5));
                myitems.add(item);
            }


            String sql1 = "select * from bookitem";
            ResultSet rs1 = stmt.executeQuery(sql1);

            while(rs1.next())
            {   MediaItem item1 = new Book();
                item1.setId(rs1.getInt(1));
                item1.setTitle(rs1.getString(2));
                item1.setPrice(rs1.getDouble(3));
                item1.setYear(rs1.getInt(4));
                ((Book)item1).setAuthor(rs1.getString(5));
                myitems.add(item1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return myitems;
    }

    //Method 4: Update an Item
    public void updateItem(MediaItem item){
        Connection conn = MyConnection.connect();
        try {
            Statement stmt = conn.createStatement();
            String val = item.getClass().toString();
            //System.out.println(val);
//            System.out.println("My Statement...");
//            System.out.println("update AudioItem set "
//                    +" title = "+"'"+ item.getTitle()+"', "
//                    +" price = "+"'"+ item.getPrice()+"', "
//                    +" year = "+"'"+ item.getYear()+"', "
//                    +" artist = "+"'"+ ((Audio)item).getArtist() +"' "
//                    +" where (aid = '"+ item.getId()+"')");
            if(val.contains("Audio"))
            {
                String sql = "update AudioItem set "
                +" title = "+"'"+ item.getTitle()+"', "
                +" price = "+"'"+ item.getPrice()+"', "
                +" year = "+"'"+ item.getYear()+"', "
                +" artist = "+"'"+ ((Audio)item).getArtist() +"' "
                +" where (aid = '"+ item.getId()+"')";
                stmt.executeUpdate(sql);
                System.out.println("Audio item updated successfully");
            }
            else{
                String sql1 = "update BookItem set "
                        +" title = "+"'"+ item.getTitle()+"', "
                        +" price = "+"'"+ item.getPrice()+"', "
                        +" year = "+"'"+ item.getYear()+"', "
                        +" author = "+"'"+ ((Book)item).getAuthor() +"' "
                        +" where (bid = '"+ item.getId()+"')";
                stmt.executeUpdate(sql1);
                System.out.println("Book item updated successfully");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //Method 5: Delete an Item
    public boolean deleteItemById(int id){
        Connection conn = MyConnection.connect();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select count(*) from audioitem where aid =" + "'" +id +"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            while(rs.next()) {
                count = rs.getInt(1);
            }
            System.out.println("Count is " + count);
            if (count > 0) {
                System.out.println("Audio item fetched successfully");
                String sql2 = "delete from audioitem where aid="+id;
                stmt.executeUpdate(sql2);
                System.out.println("Audio item deleted successfully!");
                return true;
            }
            else{
                String sql1 = "select count(*) from bookitem where bid =" + "'" +id +"'";
                System.out.println(sql1);
                ResultSet rs1 = stmt.executeQuery(sql1);
                int count1 = 0;
                while(rs1.next()) {
                    count1 = rs1.getInt(1);
                }

                if (count1 > 0) {
                    System.out.println("Book item fetched successfully");
                    String sql3 = "delete from bookitem where bid="+id;
                    stmt.executeUpdate(sql3);
                    System.out.println("Book item deleted successfully!");
                    return true;
                }
                else {
                    System.out.println("No records found with the given ID "+ id);
                    return false;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
