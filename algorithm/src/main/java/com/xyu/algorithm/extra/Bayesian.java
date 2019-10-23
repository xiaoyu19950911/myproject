package com.xyu.algorithm.extra;

/**
 * @program: 贝叶斯定理
 * @description: 最近流行起一种奇怪的流感，称作蜥蜴流感，虽不致命，但需隔离治疗。关于这种流感，我们已经通过大量统计得知以下事实：
 * <p>
 * 总人口中有1%的人患有蜥蜴流感
 * <p>
 * 若某人已患蜥蜴流感，诊断结果为阳性的概率为90%
 * <p>
 * 若某人未患蜥蜴流感，诊断结果为阳性的概率为9%
 * <p>
 * 如果现在你的诊断结果为阳性，那么你实际患病的可能性有多大？
 * @author: xyu
 * @create: 2019-08-29 17:12
 */
public class Bayesian {

    public static void main(String[] args) {
        int diseaseAndYang = 0;//患病且阳性
        int noDiseaseAndYang = 0;//不患病且阳性
        int diseaseAndNoYang = 0;//患病且非阳性
        int noDiseaseAndNoYang = 0;//不患病且非阳性
        for (int i = 0; i < 1000000; i++) {
            if (getRandom(1)) {
                if (getRandom(90)) {
                    diseaseAndYang++;
                } else {
                    diseaseAndNoYang++;
                }
            } else {
                if (getRandom(9)) {
                    noDiseaseAndYang++;
                } else {
                    noDiseaseAndNoYang++;
                }
            }
        }
        System.out.println("患病且阳性的人数:"+diseaseAndYang);
        System.out.println("不患病且阳性的人数:"+noDiseaseAndYang);
        System.out.println("患病且非阳性的人数:"+diseaseAndNoYang);
        System.out.println("不患病且非阳性的人数:"+noDiseaseAndNoYang);
        System.out.println("若诊断结果为阳性则患病的概率为："+(double)diseaseAndYang/(diseaseAndYang+noDiseaseAndYang));
    }

    private static boolean getRandom(int number) {
        double rand = Math.random() * 100;
        if (rand < number)
            return true;
        else
            return false;
    }
}
