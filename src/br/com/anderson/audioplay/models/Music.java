package br.com.anderson.audioplay.models;

public class Music extends Audio{
    private String artist;
    private String album;
    private String gender;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void Reproducing() {
        super.Reproducing();
    }

    @Override
    public void Likes() {
        super.Likes();
    }
}
