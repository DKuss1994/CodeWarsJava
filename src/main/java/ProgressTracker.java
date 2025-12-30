// Mit KI gebaut.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProgressTracker {

    private static final int WEEKLY_GOAL = 3;

    public static void main(String[] args) throws IOException {

        Path basePath = Path.of("src/main/java");
        Path progressFile = Path.of("progress/weekly_progress.txt");

        Map<String, Integer> progress = new HashMap<>();

        Files.walk(basePath)
                .filter(Files::isDirectory)
                .forEach(path -> {
                    Path parent = path.getParent();
                    if (parent == null) return;

                    String parentName = parent.getFileName().toString();
                    if (parentName.startsWith("kyu")) {
                        progress.put(parentName,
                                progress.getOrDefault(parentName, 0) + 1);
                    }
                });

        int totalKatas = progress.values().stream().mapToInt(Integer::intValue).sum();

        int lastTotal = readLastTotal(progressFile);
        int weeklyDone = totalKatas - lastTotal;

        writeNewTotal(progressFile, totalKatas);

        writeReadme(progress, totalKatas, weeklyDone);
    }

    private static int readLastTotal(Path file) throws IOException {
        if (!Files.exists(file)) {
            Files.createDirectories(file.getParent());
            Files.write(file, List.of("lastTotal=0"));
            return 0;
        }

        String line = Files.readAllLines(file).get(0);
        return Integer.parseInt(line.split("=")[1]);
    }

    private static void writeNewTotal(Path file, int total) throws IOException {
        Files.write(file, List.of("lastTotal=" + total));
    }

    private static void writeReadme(Map<String, Integer> progress,
                                    int total,
                                    int weeklyDone) throws IOException {

        Path readmePath = Path.of("README.md");
        String content = Files.exists(readmePath)
                ? Files.readString(readmePath)
                : "";

        StringBuilder progressBlock = new StringBuilder();

        progressBlock.append("<!-- PROGRESS_START -->\n");
        progressBlock.append("## Codewars Fortschritt\n\n");

        progressBlock.append("### Wöchentlicher Fortschritt\n");
        progressBlock.append("Gelöste Katas diese Woche: ").append(weeklyDone).append("\n");
        progressBlock.append("Wochenziel: 3 Katas\n");

        if (weeklyDone >= 3) {
            progressBlock.append("Status: Ziel erreicht 🎉\n\n");
        } else {
            progressBlock.append("Status: Noch ").append(3 - weeklyDone)
                    .append(" bis zum Ziel\n\n");
        }

        progressBlock.append("### Gesamtübersicht\n");

        new TreeMap<>(progress).forEach((kyu, count) ->
                progressBlock.append(kyu.replace("kyu", "")).append(" kyu: ")
                        .append(count).append(" gelöst\n")
        );

        progressBlock.append("\nGesamt gelöst: ").append(total).append("\n");
        progressBlock.append("<!-- PROGRESS_END -->");

        if (content.contains("<!-- PROGRESS_START -->")) {
            content = content.replaceAll(
                    "<!-- PROGRESS_START -->[\\s\\S]*?<!-- PROGRESS_END -->",
                    progressBlock.toString()
            );
        } else {
            content += "\n\n" + progressBlock;
        }

        Files.writeString(readmePath, content);
    }

}
