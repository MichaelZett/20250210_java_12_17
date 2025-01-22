package de.zettsystems.solution;

// TODO use new java api, make more compact
public record BookAuthorReviewCount(String title, String author, Long reviewCount) {
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Long getReviewCount() {
        return reviewCount;
    }
}
