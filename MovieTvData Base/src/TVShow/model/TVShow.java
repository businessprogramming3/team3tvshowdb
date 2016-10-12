/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TVShow.model;

/**
 *
 * @author jacqu_000
 */
public class TVShow {
    

    private int TVShowID;
    private String TVShowGenera;
    private String DirectorsName;
    private int Rating;
    private String Writer;

    public TVShow() {
        TVShowID = 0;
        TVShowGenera = "";
        DirectorsName = "";
        Writer = "";
        Rating = 0;
   
    }

    public TVShow(int TvShowID, String TVShowGenera, String DirectorsName, int Rating, String Writer) {
        this.TVShowID = TvShowID;
        this.TVShowGenera = TVShowGenera;
        this.DirectorsName = DirectorsName;
        this.Rating = Rating;
        this.Writer = Writer;
     
    }

    public String GetDirectorsName() {
        return DirectorsName;
    }

    public void setDirectorsName(String DirectorsName) {
        this.DirectorsName = DirectorsName;
    }

    public int getTvShowID() {
        return TVShowID;
    }

    public void setTvShowID(int TvShowID) {
        this.TVShowID = TvShowID;
    }

    public String getTVShowGenera() {
        return TVShowGenera;
    }

    public void setTVShowGenera(String TVShowGenera) {
        this.TVShowGenera = TVShowGenera;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String Writer) {
        this.Writer = Writer;
    }

     public int getRating() {
        return Rating;
    }
    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    @Override
    public String toString() {
        return String.format("%5d : %s, %s, %s, %.2f", this.TVShowID(), this.TVShowGenera(),
                this.DirectorsName(), this.Rating());
    }

    public int TVShowID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


