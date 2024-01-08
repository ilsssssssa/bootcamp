public class DemoSwitchExpression {
    public static void main(String[] args) {

    }

    // Java 14: Switch Expression
    // 1. Return Type
    // 2. No break
    // 3. Simliar to Lambda expression
    // 4. Compiler help ensure all enum values have been handle/catered once 幫助確保所有ENUM都已處理/滿足一次
    public static int getCurrencyCode2(Currency currency) {
        return switch (currency) {
            case HKD -> 1;
            case USD -> 2;
            case CNY -> 3;
        };
    }

    // yield == return (method only in Switch Expression)
    public static int getCurrencyCode3(Currency currency) {
        return switch (currency) {
            case HKD -> {
                String x = "";
                if (x.isEmpty())
                    yield 10;
                else
                    yield 20;
            }
            case USD -> 2;
            case CNY -> 3;
        };
    }

    // NOT enum case:
    public static int getCurrencyCode4(String day) {
        return switch (day) {
            case "Monday" -> {
                String x = "";
                if (x.isEmpty())
                    yield 10;
                else
                    yield 20;
            }
            case "Tuesday" -> 50;
            default -> {
                yield 30;
            }
        };
    }


// Self Try Test:
    public static String getNickName(String nickname) {
        String x = "";
        return switch (nickname) {
            case "GDRAGON", "LOTINTING", "LINGLO", "LONGYEE" -> {
                if(x.startsWith("L")) 
                    yield "YEAH";
                else
                    yield "BYE";
            }
            default -> "WHOYOU?";
        };
    }

    public static int getCurrencyCode(Currency currency) {
        int code = -1;
        switch (currency) {
            case HKD:
                code = 1;
                break;
            case USD:
                code = 2;
                break;
            case CNY:
                code = 3;
                break;
        }
        return code;
    }
}
