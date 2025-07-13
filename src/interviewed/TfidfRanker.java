package interviewed;

import java.util.*;
import java.util.stream.Collectors;

public class TfidfRanker {

    public static void main(String[] args) {
        List<String> documents = Arrays.asList(
            "the quick brown fox jumps over the lazy dog",
            "the quick red fox jumps over the sleepy dog",
            "the fox is quick and the dog is lazy",
            "a fast brown fox jumped over a lazy dog"
        );

        String query = "quick fox";

        List<ScoredDocument> ranked = rankDocuments(documents, query);

        System.out.println("Ranked Documents:");
        for (ScoredDocument doc : ranked) {
            System.out.printf("Score: %.4f | %s%n", doc.score, doc.text);
        }
    }

    static List<ScoredDocument> rankDocuments(List<String> docs, String query) {
        int totalDocs = docs.size();
        List<List<String>> tokenizedDocs = docs.stream()
                .map(doc -> Arrays.asList(doc.toLowerCase().split("\\W+")))
                .collect(Collectors.toList());

        Map<String, Integer> docFreq = new HashMap<>();
        for (List<String> tokens : tokenizedDocs) {
            Set<String> seen = new HashSet<>(tokens);
            for (String term : seen) {
                docFreq.put(term, docFreq.getOrDefault(term, 0) + 1);
            }
        }

        List<String> queryTerms = Arrays.asList(query.toLowerCase().split("\\W+"));

        List<ScoredDocument> results = new ArrayList<>();
        for (int i = 0; i < docs.size(); i++) {
            double score = 0.0;
            List<String> docTokens = tokenizedDocs.get(i);
            Map<String, Long> termCounts = docTokens.stream()
                    .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
            System.out.println("===="+termCounts);
            for (String term : queryTerms) {
                double tf = termCounts.getOrDefault(term, 0L) / (double) docTokens.size();
                double idf = Math.log((double) totalDocs / (1 + docFreq.getOrDefault(term, 0)));
                score += tf * idf;
            }

            results.add(new ScoredDocument(docs.get(i), score));
        }

        results.sort((a, b) -> Double.compare(b.score, a.score));
        return results;
    }

    static class ScoredDocument {
        String text;
        double score;

        ScoredDocument(String text, double score) {
            this.text = text;
            this.score = score;
        }
    }
}