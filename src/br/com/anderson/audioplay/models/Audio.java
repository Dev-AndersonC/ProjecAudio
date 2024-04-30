package br.com.anderson.audioplay.models;

public abstract class Audio {
    private String title;
    private double duration;
    private int fullReproduction;
    private float likes;
    private int classified;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getFullReproduction() {
        return fullReproduction;
    }

    public void setFullReproduction(int fullReproduction) {
        this.fullReproduction = fullReproduction;
    }

    public float getLikes() {
        return likes;
    }

    public void setLikes(float likes) {
        this.likes = likes;
    }

    public int getClassified() {
        return classified;
    }

    public void setClassified(int classified) {
        this.classified = classified;
    }

    public void Likes() {
//        Metodo adicionas curtidas no audio
        this.likes++;
    }

    public void Reproducing(){
        System.out.println("Audio playing...");
    }




}
