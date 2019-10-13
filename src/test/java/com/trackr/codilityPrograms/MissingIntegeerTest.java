//package com.trackr.codilityPrograms;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(Parameterized.class)
//public class MissingIntegeerTest {
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {
//                {new int[] {1, 2, 3, 4}, 5},
//                {new int[] {-3, -1 }, 1},
//                {new int[] {1, 3, 6, 4}, 2},
//                {new int[] {0}, 1},
//                {new int[] {-1}, 1},
//                {new int[] {2}, 1},
//                {new int[] {2, 3, 7}, 1},
//                {new int[] {-2, -1, 0}, 1},
//                {new int[] {-1, -1, 1}, 2},
//                {new int[] {-2, -1, 2, 3}, 1}
//
//        });
//    }
//
//    private int fInput[];
//    private int fExpected;
//
//    public MissingIntegeerTest(int[] input, int expected) {
//        this.fInput = input;
//        this.fExpected = expected;
//    }
//
//    @Test
//    public void testSmallestPositiveIntMissing() {
//        Assert.assertEquals(fExpected, MissingIntegeer.solution(fInput));
//    }
//}
