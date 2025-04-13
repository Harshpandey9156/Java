package Interfaces.Nested;

public class NextedInterface {
    public interface nested{
        boolean isOdd(int num);

    }


}

class b implements NextedInterface.nested{

    @Override
    public boolean isOdd(int num) {
        return (num &1)==1;
    }
}
