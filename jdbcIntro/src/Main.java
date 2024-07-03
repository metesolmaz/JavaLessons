import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "delete from sakila.film_text where film_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,8);
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi... = "+result);
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT film_id, title, description FROM sakila.film_text");
            ArrayList<Movie> movies = new ArrayList<Movie>();
            while (resultSet.next()){
                movies.add(new Movie(resultSet.getInt("film_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")

                        ));
            }
            System.out.println(movies.size());
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }
    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = " insert into film_text (film_id, title, description) values(?,?,?) ";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 8);
            statement.setString(2, "Akil Oyunlari 2");
            statement.setString(3, "Aciklama 2");
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi... = "+result);
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "update film_text set title='New Mind Games' where film_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,8);
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi... = "+result);
        }
        catch (SQLException e){
            helper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}