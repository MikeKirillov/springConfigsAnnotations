package ru.project.enums;

public enum Genres {
    CLASSICAL("classicalMusic"),
    ROCK("rockMusic");

    private String genre;

    Genres(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
