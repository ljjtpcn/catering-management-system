package cn.twopair.services;

import cn.twopair.pojo.*;

import java.util.*;

/**
 * @ClassName Services
 * @Description TODO
 * @Author ljjtpcn
 * @Date 2022/6/11 下午7:20
 * @Version 1.0
 **/


public interface Services {

    boolean login(String username, String inputpassword);

    Vector<Vector<Object>> getEmployeeData(String id, String name, String identityID);

    int addOneEmployee(Employee employee);

    int mergeOneEmployee(Employee employee);

    int deleteEmployeeById(List<Integer> selectedIds);

    Vector<Vector<Object>> getCustomerData(String id, String name, String tel);

    int addOneCustomer(Customer customer);

    int mergeOneCustomer(Customer customer);

    int deleteCustomerById(List<Integer> selectedIds);

    Vector<Vector<Object>> getDeskData(String no, Integer seating, String status);

    int addOneDesk(Desk desk);

    int deleteDeskById(List<Integer> selectedIds);

    int mergeOneDesk(Desk desk);

    int mergeOneDeskStatus(Desk desk);


    Vector<Vector<Object>> getCategoryData(String id, String name);

    int addOneCategory(Category category);

    int mergeOneCategory(Category category);

    int deleteCategoryById(List<Integer> selectedIds);

    Vector<Vector<Object>> getFoodData(String id, String name, String status);

    int addOneFood(Food food);

    int mergeOneFood(Food food);

    int deleteFoodById(List<Integer> selectedIds);

    String getFoodIconPathById(Integer id);

    String[] getEmptySeatGreaterThanNumber(Integer number);

    String[] getAllCategoryName();

    Integer getCategoryIdByName(String categoryName);

    Vector<Vector<Object>> getCustomerSelectedSearchFoodData(Food food);

    Vector<Vector<Object>> getBossRecommendFoodData();

    String getOrderNumber();

    Vector<Vector<Object>> selectOrderById(String returnOrderNumber);

    int addOneOrder(Order order);

    int insertMoreOrderItem(ArrayList<OrderItem> orderItemList);

    Vector<Vector<Object>> getOrderData(Order order);

    Vector<Vector<Object>> getOrderItemData(OrderItem orderItem);

    double getRateMoney(String cusotomerId);

    int mergeOrderStatus(Order order);

    ArrayList<Double> getStatisticsData();

}
