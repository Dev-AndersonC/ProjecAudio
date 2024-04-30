package br.com.anderson.audioplay.models;

public class Podcast extends Audio{
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void Likes() {
        super.Likes();
    }

    @Override
    public void Reproducing() {
        super.Reproducing();
    }
}
