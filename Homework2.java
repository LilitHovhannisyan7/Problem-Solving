
      //  Write two Java classes Artist and Album
      //  Artist class having ID, Name, ArtisticName, BirthYear, Role, Country, City properties
       // Album class having ID, Title, Genre and PublishedYear properties

      //  a.
      public class Artist
{

    private String name;
    private String artisticName;
    private int birthYear;
    private String role;
    private String country;
    private String city;


    public void setRealName(String name)
    {
        this.name = name;
    }

    public void setArtisticName(String artName)
    {
        this.artisticName = artName;
    }

    public void setBirthYear(int bYear)
    {
        this.birthYear = bYear;
    }
    public void setRole(String role)
    {
        this.role = role;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return this.city;
    }


}




public class Album
{

    private String title;
    private String genre;
    private int publishedYear;

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setPublishedYear(int pYear)
    {
        this.publishedYear = pYear;
    }


}



   // Define a list of Artists
    //    Initialize it with the data read from the database created from Data Engineering homework #1
      //  Use an example from here to connect to the database from your Java code
       // Print the number of artists in the list


        import java.sql.*;
        import java.util.*;
public class Connect {

    public static void main(String[] args)
    {

        List <Artist> list = new ArrayList<Artist>();
        Connection conn = null;

        try {

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Folder\\DE\\Homework1.db","root","");
            String sql ="select * from artists";
            PreparedStatement Stmt = conn.prepareStatement(sql);
            ResultSet rs = Stmt.executeQuery();

            while(rs.next()){
                Artist artist = new Artist();
                artist.setRealName(rs.getString("real_name"));
                artist.setArtisticName(rs.getString("art_name"));
                artist.setBirthYear(rs.getInt("year_of_birthday"));
                artist.setRole(rs.getString("role"));
                artist.setCountry(rs.getString("country"));
                artist.setCity(rs.getString("city"));
                list.add(artist);
            }
            rs.close();
            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }


        System.out.println(list.size());


    }
}


  //  Define a list of Albums
  //      Initialize it with the data read from the database created from Data Engineering homework #1
    //    Use an example from here to connect to the database from your Java code
     //   Print the number of albums in the list


public static void main(String[] args)
        {


        List <Album> list = new ArrayList<Album>();
        Connection conn = null;

        try {

        conn = DriverManager.getConnection("jdbc:sqlite:C:\\Folder\\DE\\Homework1.db","root","");
        String sql ="select * from albums";
        PreparedStatement Stmt = conn.prepareStatement(sql);
        ResultSet rs = Stmt.executeQuery();

        while(rs.next()){
        Album album = new Album();
        album.setTitle(rs.getString("album_title"));
        album.setGenre(rs.getString("genre"));
        album.setPublishedYear(rs.getInt("year_of_pub"));

        list.add(album);
        }
        rs.close();
        conn.close();

        } catch (SQLException ex) {
        System.err.println(ex.getMessage());
        }


        System.out.println(list.size());


        }
        }
