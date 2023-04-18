import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private ArrayList<Category> categories;

    public App() {
        this.categories = new ArrayList<>();
    }
    public void start() {
    loadCategories();
    boolean keepPlaying = true;
    while (keepPlaying) {
        displayCategories();
        Category selectedCategory = selectCategory();
        displayQuestions(selectedCategory);
        Question selectedQuestion = selectQuestion(selectedCategory);
        displayAnswer(selectedQuestion);
        System.out.println("\nZoek je volgende vraag!\n");
    }
}

    public ArrayList<Category> categories() {
        return categories;
    }

    private void loadCategories() {

            // Category 1: Formules
            Category formulas = new Category("Formules");
            formulas.addQuestion(new Question.BasicQuestion("Wat is de formule voor omtrek van een cirkel?", "2 * pi * r"));
            formulas.addQuestion(new Question.DetailedQuestion("Wat is de formule voor oppervlakte van een rechthoek?", "l * b", "Hier is 'l' de lengte van de rechthoek en 'b' de breedte.", "Voorbeeld: als l = 5 en b = 3, dan is de oppervlakte 15."));
            categories.add(formulas);

            // Category 2: Grafieken
            Category graphs = new Category("Grafieken");
            graphs.addQuestion(new Question.BasicQuestion("Hoe heet de grafiek die gebruikt wordt om de verandering van iets in de tijd te laten zien?", "Lijngrafiek"));
            graphs.addQuestion(new Question.DetailedQuestion("Wat is het verschil tussen een staafdiagram en een histogram?", "Een staafdiagram toont de gegevens als afzonderlijke balken, terwijl een histogram de gegevens in een bepaald aantal groepen verdeelt en de frequentie van elke groep weergeeft.", "Staafdiagrammen worden vaak gebruikt om discrete gegevens weer te geven, terwijl histogrammen worden gebruikt om continue gegevens weer te geven.", "Voorbeeld: een staafdiagram zou kunnen worden gebruikt om de verkoop van verschillende producten weer te geven, terwijl een histogram zou kunnen worden gebruikt om de lengte van een populatie van dieren weer te geven."));
            categories.add(graphs);

            // Category 3: Opmaak
            Category formatting = new Category("Opmaak");
            formatting.addQuestion(new Question.BasicQuestion("Hoe verander je de lettergrootte in Microsoft Word?", "Selecteer de tekst en klik op het lettergrootte dropdown menu in de werkbalk."));
            formatting.addQuestion(new Question.DetailedQuestion("Wat is het verschil tussen vetgedrukt en cursief?", "Vetgedrukte tekst is donkerder en dikker dan gewone tekst, terwijl cursieve tekst schuin staat.", "Vetgedrukte tekst wordt vaak gebruikt om belangrijke woorden of zinnen te benadrukken, terwijl cursieve tekst vaak wordt gebruikt om titels of citaten aan te geven.", "Voorbeeld: de titel van een boek kan cursief worden weergegeven om aan te geven dat het een titel is."));
            categories.add(formatting);

            // Category 4: Macro's
            Category macros = new Category("Macro's");
            macros.addQuestion(new Question.BasicQuestion("Wat is een macro?", "Een macro is een reeks opgeslagen acties die later kunnen worden afgespeeld om taken in een programma uit te voeren."));
            macros.addQuestion(new Question.DetailedQuestion("Hoe maak je een nieuwe macro in Microsoft Excel?", "1. Ga naar het tabblad 'Ontwikkelaars' in het lint.\n2. Klik op 'Opnemen' om de opname van de macro te starten.\n3. Voer de gewenste acties uit in het werkblad.\n4. Klik op 'Stoppen' om de opname van de macro te stoppen en op te slaan.", "Zodra de macro is opgeslagen, kan deze later worden afgespeeld door op de knop 'Macro's' te klikken en de gewenste macro te selecteren.", ""));
            categories.add(macros);
    }
        private void displayCategories() {
            System.out.println("Kies een categorie:");
            for (int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories().get(i).getName());
            }
        }

    private Category selectCategory() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt() - 1;
        return categories.get(index);
    }

    private void displayQuestions(Category category) {
        System.out.println("Kies een vraag:");
        List<Question> questions = category.getQuestions();
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i).getText());
        }
    }

    private Question selectQuestion(Category category) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt() - 1;
        return category.getQuestions().get(i);
    }

    private void displayAnswer(Question question){
        System.out.println(question.getAnswer());
    }
}
