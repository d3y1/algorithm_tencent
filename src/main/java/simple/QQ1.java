package simple;

/**
 * QQ1 生成格雷码
 * @author d3y1
 */
public class QQ1{
    /**
     * 模拟法
     *
     * 1位格雷码: 0 1
     * 2位格雷码: (0)0 (0)1    (1)1 (1)0
     * 3位格雷码: (0)00 (0)01 (0)11 (0)10    (1)10 (1)11 (1)01 (1)00
     * ...
     *
     * 算法:
     * n位格雷码 <== n-1位格雷码[加前缀0(顺序) + 加前缀1(逆序)]
     *
     * @param n
     * @return
     */
    public String[] getGray(int n) {
        if(n == 1){
            return new String[]{"0", "1"};
        }

        String[] preCodes = getGray(n-1);

        int size = preCodes.length;
        String[] codes = new String[size*2];

        for(int i=0; i<size; i++){
            // 加前缀0(顺序)
            codes[i] = "0"+preCodes[i];
            // 加前缀1(逆序)
            codes[size+i] = "1"+preCodes[size-i-1];
        }

        return codes;
    }
}
