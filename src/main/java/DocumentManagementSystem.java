package main.java;

import java.util.ArrayList;
import java.util.*;

import static java.util.Collections.unmodifiableList;

public class DocumentManagementSystem {

    private final List<Document> documents = new ArrayList<>();
    private final List<Document> documentsView = unmodifiableList(documents);
    // tag::importer_lookup[]
    private final Map<String, Importer> extensionToImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensionToImporter.put("letter", new LetterImporter());
        extensionToImporter.put("report", new ReportImporter());
        extensionToImporter.put("jpg", new ImageImporter());
    }

    void importFile(String path) {}

    List<Document> contents() {
        return null;
    }
}
