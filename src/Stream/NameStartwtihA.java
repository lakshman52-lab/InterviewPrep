package test;

public class NameStartwthihA {
    public static void main(String[] args) {
        List<String> l1=Arrays.asList("ALakshman","ASwetha","cKarthikeya");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();

        System.out.println(result);
    }
}