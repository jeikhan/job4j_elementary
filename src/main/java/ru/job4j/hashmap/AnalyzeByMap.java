package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double scores = 0;
        double count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scores += subject.score();
                count++;
            }
        }
        return scores / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scores = 0;
            for (Subject subject : pupil.subjects()) {
                scores += subject.score();
            }
            result.add(new Label(pupil.name(), scores / pupils.size()));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> map = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(),
                        map.getOrDefault(subject.name(), 0.0) + subject.score());
            }
        }
        for (String element : map.keySet()) {
            result.add(new Label(element, map.get(element) / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scores = 0;
            for (Subject subject : pupil.subjects()) {
                scores += subject.score();
            }
            result.add(new Label(pupil.name(), scores));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            labels.add(new Label(element.getKey(), (double) element.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}