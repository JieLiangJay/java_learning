package com.study.code.design_pattern.patterns.state;

/**
 * 奖品发放完毕状态
 * 说明 当我们activity 改变成DispenseOutState 抽奖活动结束
 */
public class DispenseOutState extends State {

    // 初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了，请下次参加");
    }
}
