public class Tutorial {
    private String text;
    private Category category;

    public Tutorial(String text, Category category) {
        this.text = text;
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public Category getCategory() {
        return category;
    }

}