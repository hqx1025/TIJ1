package com.aihqx.thinkinginjava.chapter10;

/**
 * @author huqingxiang
 * @date 2018/2/15 下午1:45
 */
public class Practice1 {
    private String s;
    public Practice1(String s){
        this.s = s;
    }
    class Inner{
        public String toStrings(){
            return s;
        }

    }
    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1("1111");
        Practice1.Inner in = p.getInner();
        Practice1.Inner inner = p.new Inner();
        System.out.println(inner.toStrings());
    }
}
