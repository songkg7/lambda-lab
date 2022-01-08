package com.example.lab.stream;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Nested
    class Quiz1Test {

        // NOTE: resources/User.csv 을 읽어서 처리할 것!
        @Test
        @DisplayName("각 취미를 선호하는 인원이 몇 명인지 계산하라")
        void quiz_1() throws IOException, CsvException {
            //noinspection ConstantConditions
            CSVReader csvReader = new CSVReader(new FileReader(getClass().getResource("/User.csv").getFile()));
            csvReader.readNext();
            List<String[]> strings = csvReader.readAll();

            Map<String, Integer> result = new HashMap<>();
            strings.stream()
                    .map(line -> line[1].replaceAll("\\s", ""))
                    .flatMap(hobbies -> Arrays.stream(hobbies.split(":")))
                    .forEach(hobby -> result.merge(hobby, 1, Integer::sum));

            result.keySet().forEach(v -> System.out.println(v + " : " + result.get(v)));
        }

        @Test
        @DisplayName("각 취미를 선호하는 정씨성을 가진 인원이 몇 명인지 계산하라")
        void quiz_2() {

        }

        @Test
        @DisplayName("소개 내용에 '좋아'가 몇 번 등장하는지 구하여라")
        void quiz_3() {

        }

    }

    @Nested
    class Quiz2Test {

        private final List<String> WORDS = List.of("TONY", "a", "hULK", "B", "america", "X", "nebula",
                "Korea");

        @Test
        @DisplayName("List 에 저장된 단어들의 접두사가 각각 몇개씩 있는지 Map<String, Integer> 로 반환하여라")
        void test_1() {

        }

        @Test
        @DisplayName("List 에 저장된 단어들 중 길이가 2 이상인 경우에만, 모든 단어를 대문자로 변환하여 스페이스로 구분한 하나의 문자열로 합한 결과를 반환하라")
        void test_2() {

        }

    }

    @Nested
    class Quiz3Test {

        private final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        private final List<Integer> numbers2 = Arrays.asList(3, 4);

        @Test
        @DisplayName("두 리스트의 모든 숫자 조합을 출력하라")
        void quiz_1() {

        }

        @Test
        @DisplayName("모든 숫자 조합의 곱 중 가장 큰 값을 출력하라")
        void quiz_2() {

        }

    }

    @Nested
    class Quiz4Test {

        @Test
        @DisplayName("2020년에 일어난 모든 거래 내역을 찾아 거래값을 기준으로 오름차순 정렬하라.")
        void quiz_1() {

        }

        @Test
        @DisplayName("거래 내역이 있는 거래자가 근무하는 모든 도시를 중복없이 나열하라.")
        void quiz_2() {

        }

        @Test
        @DisplayName("서울에서 근무하는 모든 거래자를 찾아서 이름순서대로 정렬하라.")
        void quiz_3() {

        }

        @Test
        @DisplayName("모든 거래자의 이름을 순서대로 정렬하라.")
        void quiz_4() {

        }

        @Test
        @DisplayName("부산에 거래자가 있는지를 확인하라.")
        void quiz_5() {

        }

        @Test
        @DisplayName("서울에 거주하는 거래자의 모든 거래 내역을 구하라.")
        void quiz_6() {

        }

        @Test
        @DisplayName("모든 거래 내역 중에서 최댓값과 최솟값을 구하라.")
        void quiz_7() {

        }

    }

    @Nested
    class Quiz5Test {

        private final String[] strings = { "aaa", "bb", "c", "dddd" };

        @Test
        @DisplayName("모든 문자열의 길이를 더한 결과를 출력하라.")
        void quiz_1() {

        }

        @Test
        @DisplayName("가장 긴 것의 길이를 출력하라.")
        void quiz_2() {

        }

        @Test
        @DisplayName("중복되지 않는 임의의 로또번호(1~45) 6개를 출력하라.")
        void quiz_3() {

        }

        @Test
        @DisplayName("두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하라. 주사위는 총 20번 던진다. 이 주사위 게임을 설계하여라.")
        void quiz_4() {

        }

        @Test
        @DisplayName("special. primeNumber")
        void quiz_5() {

        }

    }

    @Nested
    class Quiz6Test {
        private final List<Student> students = List.of(
                Student.of("나자바", true, 1, 1, 300),
                Student.of("김지미", false, 1, 1, 250),
                Student.of("김자바", true, 1, 1, 200),
                Student.of("이지미", false, 1, 2, 150),
                Student.of("남자바", true, 1, 2, 100),
                Student.of("안지미", false, 1, 2, 50),
                Student.of("황지미", false, 1, 3, 100),
                Student.of("강지미", false, 1, 3, 150),
                Student.of("이자바", true, 1, 3, 200),
                Student.of("나자바", true, 2, 1, 300),
                Student.of("김지미", false, 2, 1, 250),
                Student.of("김자바", true, 2, 1, 200),
                Student.of("이지미", false, 2, 2, 150),
                Student.of("남자바", true, 2, 2, 100),
                Student.of("안지미", false, 2, 2, 50),
                Student.of("황지미", false, 2, 3, 100),
                Student.of("강지미", false, 2, 3, 150),
                Student.of("이자바", true, 2, 3, 200));

        @Test
        @DisplayName("불합격(150점 미만)한 학생의 수를 남자와 여자로 구분하라.")
        void quiz_1() {

        }

        @Test
        @DisplayName("각 반별 총점을 학년 별로 나누어 구하라.")
        void quiz_2() {

        }

    }
}
