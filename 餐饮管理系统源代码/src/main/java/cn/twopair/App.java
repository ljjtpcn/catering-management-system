package cn.twopair;

import cn.twopair.pojo.Food;
import cn.twopair.view.LoginView;

/**
 * @author ljjtpcn
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Food.class.getResource(""));
        new LoginView();
    }
}