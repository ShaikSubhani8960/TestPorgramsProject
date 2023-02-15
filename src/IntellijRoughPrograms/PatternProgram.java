package IntellijRoughPrograms;
class TestPattern {
    void patternDemo(char ch) {
        int k=4;
    for (int i = 0; i <= 4; i++) {
        char ch1=ch;
            for (int j =0; j <=k; j++) {
                System.out.print(ch1+" ");
                ch1++;
            }
        k--;
        System.out.println();
        }
    }
}

public class PatternProgram {
    public static void main(String[] args) {
        TestPattern obj = new TestPattern();
        obj.patternDemo('A');
    }
}
