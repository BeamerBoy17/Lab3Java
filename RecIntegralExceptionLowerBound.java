package Lab1;

public class RecIntegralExceptionLowerBound extends RecIntegralException {
    private static final String info = new String("�������� �� ����� ���� ������ "+RecIntegral.MIN);
    RecIntegralExceptionLowerBound(){
        super();
    }
    String getInfo(){
        return info;
    }
}

